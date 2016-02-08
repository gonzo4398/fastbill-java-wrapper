package org.testobject.fastbill.domain;

public class CancelledSubscription {

    private String status; //  ende des abos
    private String cancellationNote; //  grund der kündigung eines abonnements 

    public String getCancellationNote() {
        return this.cancellationNote;
    }

    public void setCancellationNote(final String cancellationNote) {
        this.cancellationNote = cancellationNote;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(final String status) {
        this.status = status;
    }

}
