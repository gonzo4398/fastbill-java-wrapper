package org.testobject.fastbill.jersey;

public class Request {

    private final String service;
    private final Object data;
    private final Object filter;

    public String getService() {
        return this.service;
    }

    public Object getData() {
        return this.data;
    }

    public Object getFilter() {
        return this.filter;
    }

    private Request(final String service, final Object data, final Object filter) {
        super();
        this.service = service;
        this.data = data;
        this.filter = filter;
    }

    public static final class Builder {

        private final String requestName;
        private Object data2;
        private Object filter2;

        public Builder(final String requestName) {
            this.requestName = requestName;
        }

        public Request buildRequest() {
            return new Request(this.requestName, this.data2, this.filter2);
        }

        public Request.Builder withData(final Object data) {
            this.data2 = data;
            return this;
        }

        public Request.Builder withFilter(final Object filter) {
            this.filter2 = filter;
            return this;
        }
    }
}
