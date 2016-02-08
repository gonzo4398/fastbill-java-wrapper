package org.testobject.fastbill;

import java.io.IOException;
import java.util.logging.Logger;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;
import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.testobject.fastbill.jersey.EnsureJsonContentTypeFilter;
import org.testobject.fastbill.jersey.ResponseReader;
import org.testobject.fastbill.service.CustomerService;
import org.testobject.fastbill.service.InvoiceService;
import org.testobject.fastbill.service.ServiceBuilder;
import org.testobject.fastbill.service.SubscriptionService;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy.LowerCaseWithUnderscoresStrategy;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;

public interface Fastbill {

    public static final String ENDPOINT = "https://automatic.fastbill.com/api/1.0/api.php";

    @Provider
    public final class ObjectMapperProvider implements ContextResolver<ObjectMapper> {

        final ObjectMapper defaultObjectMapper;

        public ObjectMapperProvider() {
            this.defaultObjectMapper = ObjectMapperProvider.createDefaultMapper();
        }

        @Override
        public ObjectMapper getContext(final Class<?> type) {
            return this.defaultObjectMapper;
        }

        public static ObjectMapper createDefaultMapper() {
            final ObjectMapper objectMapper = new ObjectMapper();
            //objectMapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
            objectMapper.setSerializationInclusion(Include.NON_NULL);
            //objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            objectMapper.enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);
            objectMapper.enable(DeserializationFeature.READ_ENUMS_USING_TO_STRING);
            objectMapper.addHandler(new DeserializationProblemHandler() {
                @Override
                public boolean handleUnknownProperty(final DeserializationContext ctxt, final JsonParser jp,
                        final JsonDeserializer<?> deserializer, final Object beanOrClass, final String propertyName)
                                throws IOException, JsonProcessingException {

                    System.out.println("Receiving unknown Property: " + propertyName + "; Value: " + beanOrClass);
                    return true;
                }

            });

            objectMapper.setPropertyNamingStrategy(new LowerCaseWithUnderscoresStrategy() {
                @Override
                public String translate(final String input) {
                    return super.translate(input).toUpperCase();
                }
            });

            return objectMapper;
        }
    }

    final class Factory {

        public static Fastbill create(final String userName, final String token) {

            final HttpAuthenticationFeature feature = HttpAuthenticationFeature//
                    .basicBuilder() //
                    .credentials(userName, token)//
                    .build();

            final Client client = ClientBuilder.newBuilder() //
                    .register(feature)//
                    .register(ObjectMapperProvider.class)//
                    .register(JacksonFeature.class)//
                    .register(EnsureJsonContentTypeFilter.class)//
                    .register(new LoggingFilter(Logger.getGlobal(), true))//
                    .build();

            final WebTarget target = client.target(Fastbill.ENDPOINT);

            final ResponseReader responseReader = new ResponseReader(ObjectMapperProvider.createDefaultMapper());
            final ServiceBuilder.Factory serviceBuilder = new ServiceBuilder.Factory(target, responseReader);

            return new Fastbill() {
                @Override
                public CustomerService getCustomerService() {
                    return new CustomerService(serviceBuilder);
                }

                @Override
                public SubscriptionService getSubscriptionService() {
                    return new SubscriptionService(serviceBuilder);
                }

                @Override
                public InvoiceService getInvoiceService() {
                    return new InvoiceService(serviceBuilder);
                }
            };
        }

    }

    public CustomerService getCustomerService();

    public SubscriptionService getSubscriptionService();

    public InvoiceService getInvoiceService();

}
