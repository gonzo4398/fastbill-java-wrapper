/**
 * 
 */
package org.testobject.fastbill.domain;

/**
 * @author cs
 *
 */
public class UpdateCustomer extends CreateCustomer {

    private Long customerId; // required    eine von fastbill vergebene bestimmte kundennummer
    private String suppressMail; //   bestätigungsmail an kunden unterdrücken (0 = nein | 1 = ja)
    private String paymentToken; //  token des payment providers für zahlungen
    private String paymentProvider; //    integrierter payment dienstleister 

    public Long getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(final Long customerId) {
        this.customerId = customerId;
    }

    public String getSuppressMail() {
        return this.suppressMail;
    }

    public void setSuppressMail(final String suppressMail) {
        this.suppressMail = suppressMail;
    }

    @Override
    public String getPaymentToken() {
        return this.paymentToken;
    }

    @Override
    public void setPaymentToken(final String paymentToken) {
        this.paymentToken = paymentToken;
    }

    @Override
    public String getPaymentProvider() {
        return this.paymentProvider;
    }

    @Override
    public void setPaymentProvider(final String paymentProvider) {
        this.paymentProvider = paymentProvider;
    }
}
