package org.testobject.fastbill.jersey;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

import org.testobject.fastbill.service.FastbillErrorResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ResponseReader {

    private final ObjectMapper objectMapper;

    public ResponseReader(final ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public <T> T readResponse(final Response response, final Class<T> clazz) throws FastbillErrorResponse {
        final Map<String, Object> responseEntity = response.readEntity(new GenericType<Map<String, Object>>() {
        });

        final Object responseMap = responseEntity.get("RESPONSE");
        if (responseMap != null) {
            if (((Map<String, Object>) responseMap).containsKey("ERRORS")) {
                throw new FastbillErrorResponse((List<String>) ((Map<String, Object>) responseMap).get("ERRORS"));
            }
        }

        try {
            final String responseString = this.objectMapper.writeValueAsString(responseEntity.get("RESPONSE"));
            return this.objectMapper.readValue(responseString, clazz);
        } catch (final IOException e) {
            throw new IllegalStateException(e);
        }
    }
}
