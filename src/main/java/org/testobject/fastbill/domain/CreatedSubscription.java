/**
 * 
 */
package org.testobject.fastbill.domain;

/**
 * @author cs
 *
 */
public class CreatedSubscription {

    private String status; //  status
    private Long subscriptionId; //     eine von fastbill vergebene bestimmte abonnementnummer
    private String hash; //    hash
    private Long invoiceId; //  eine von fastbill vergebene bestimmte rechnungsnummer
    private String paypalUrl; //      paypal-link zur zahlung einer rechnung 

    public String getStatus() {
        return this.status;
    }

    public void setStatus(final String status) {
        this.status = status;
    }

    public Long getSubscriptionId() {
        return this.subscriptionId;
    }

    public void setSubscriptionId(final Long subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public String getHash() {
        return this.hash;
    }

    public void setHash(final String hash) {
        this.hash = hash;
    }

    public Long getInvoiceId() {
        return this.invoiceId;
    }

    public void setInvoiceId(final Long invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getPaypalUrl() {
        return this.paypalUrl;
    }

    public void setPaypalUrl(final String paypalUrl) {
        this.paypalUrl = paypalUrl;
    }

}
