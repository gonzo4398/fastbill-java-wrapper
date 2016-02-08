/**
 * 
 */
package org.testobject.fastbill.service;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.testobject.fastbill.jersey.Request;
import org.testobject.fastbill.jersey.ResponseReader;

/**
 * @author cs
 *
 */
public class ServiceBuilder {

    private final Request.Builder requestBuilder;
    private final WebTarget webTarget;
    private final ResponseReader responseReader;

    public ServiceBuilder(final String serviceName, final WebTarget webTarget, final ResponseReader responseReader) {
        this.responseReader = responseReader;
        this.requestBuilder = new Request.Builder(serviceName);
        this.webTarget = webTarget;
    }

    public ServiceBuilder withData(final Object data) {
        this.requestBuilder.withData(data);
        return this;
    }

    public ServiceBuilder withFilter(final Object filter) {
        this.requestBuilder.withFilter(filter);
        return this;
    }

    public <T> T execute(final Class<T> clazz) throws FastbillErrorResponse {
        final Response response = this.webTarget.request(MediaType.APPLICATION_JSON)
                .post(Entity.json(this.requestBuilder.buildRequest()));
        return this.responseReader.readResponse(response, clazz);
    }

    public static class Factory {

        private final WebTarget webTarget;
        private final ResponseReader responseReader;

        public Factory(final WebTarget webTarget, final ResponseReader responseReader) {
            this.webTarget = webTarget;
            this.responseReader = responseReader;
        }

        public ServiceBuilder create(final String serviceName) {
            return new ServiceBuilder(serviceName, this.webTarget, this.responseReader);
        }
    }

}
