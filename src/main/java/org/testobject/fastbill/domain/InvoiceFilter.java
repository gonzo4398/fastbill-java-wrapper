package org.testobject.fastbill.domain;

public class InvoiceFilter {

    private Long invoiceId; //  rechnungs-id
    private String invoiceNumber; //  rechnungsnummer
    private String invoiceTitle; //   rechnungstitel
    private Long customerId; //     eine bestimmte kundennummer
    private String month; //   monat
    private String year; //    year
    private String startDueDate; //  rechnungen die nach einem bestimmten datum fällig werden
    private String endDueDate; //    rechnungen die vor einem bestimmten datum fällig werden
    private InvoiceType type; //    rechnungen eines bestimmten typs: outgoing = rechnungen draft = entwürfe | credit = gutschriften 

    public Long getInvoiceId() {
        return this.invoiceId;
    }

    public void setInvoiceId(final Long invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getInvoiceNumber() {
        return this.invoiceNumber;
    }

    public void setInvoiceNumber(final String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getInvoiceTitle() {
        return this.invoiceTitle;
    }

    public void setInvoiceTitle(final String invoiceTitle) {
        this.invoiceTitle = invoiceTitle;
    }

    public Long getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(final Long customerId) {
        this.customerId = customerId;
    }

    public String getMonth() {
        return this.month;
    }

    public void setMonth(final String month) {
        this.month = month;
    }

    public String getYear() {
        return this.year;
    }

    public void setYear(final String year) {
        this.year = year;
    }

    public String getStartDueDate() {
        return this.startDueDate;
    }

    public void setStartDueDate(final String startDueDate) {
        this.startDueDate = startDueDate;
    }

    public String getEndDueDate() {
        return this.endDueDate;
    }

    public void setEndDueDate(final String endDueDate) {
        this.endDueDate = endDueDate;
    }

    public InvoiceType getType() {
        return this.type;
    }

    public void setType(final InvoiceType type) {
        this.type = type;
    }

}
