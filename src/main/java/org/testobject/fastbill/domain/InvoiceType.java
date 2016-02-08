package org.testobject.fastbill.domain;

public enum InvoiceType {

    //outgoing = rechnungen draft = entwürfe | credit = gutschriften 
    OUTGOING("outgoing"), DRAFT("draft"), CREDIT("credit");

    private final String value;

    private InvoiceType(final String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

}
