package org.testobject.fastbill.domain;

public class SubscriptionFilter {

    private Long subscriptionId; //  eine von fastbill vergebene bestimmte abonnementnummer
    private Long customerId; //   eine von fastbill vergebene bestimmte kundennummer
    private String subscriptionExtUid; //    bestimmtes abo mit vergebener id
    private String customerExtUid; //    kunde nach der externen id 

    public Long getSubscriptionId() {
        return this.subscriptionId;
    }

    public void setSubscriptionId(final Long subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public Long getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(final Long customerId) {
        this.customerId = customerId;
    }

    public String getSubscriptionExtUid() {
        return this.subscriptionExtUid;
    }

    public void setSubscriptionExtUid(final String subscriptionExtUid) {
        this.subscriptionExtUid = subscriptionExtUid;
    }

    public String getCustomerExtUid() {
        return this.customerExtUid;
    }

    public void setCustomerExtUid(final String customerExtUid) {
        this.customerExtUid = customerExtUid;
    }

}
