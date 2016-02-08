package org.testobject.fastbill.jersey;

import java.io.IOException;

import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientResponseContext;
import javax.ws.rs.client.ClientResponseFilter;

public class EnsureJsonContentTypeFilter implements ClientResponseFilter {

    @Override
    public void filter(final ClientRequestContext requestContext, final ClientResponseContext responseContext)
            throws IOException {
        final String contentType = responseContext.getHeaders().getFirst("Content-Type");
        if (contentType.startsWith("text/plain")) {
            final String newContentType = "application/json" + contentType.substring("text/plain".length());
            responseContext.getHeaders().putSingle("Content-Type", newContentType);
        }
    }
}