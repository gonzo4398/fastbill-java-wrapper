package org.testobject.fastbill.domain;

public class CancelSubscription {

    private Long subscriptionId; // required    eine von fastbill vergebene bestimmte abonnementnummer
    private String cancellationDate; //  ende des abos
    private String cancellationNote; //  grund der kündigung eines abonnements 

    public Long getSubscriptionId() {
        return this.subscriptionId;
    }

    public void setSubscriptionId(final Long subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public String getCancellationDate() {
        return this.cancellationDate;
    }

    public void setCancellationDate(final String cancellationDate) {
        this.cancellationDate = cancellationDate;
    }

    public String getCancellationNote() {
        return this.cancellationNote;
    }

    public void setCancellationNote(final String cancellationNote) {
        this.cancellationNote = cancellationNote;
    }

}
