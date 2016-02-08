package org.testobject.fastbill.domain;

import java.util.List;

public class Subscription {

    private Long subscriptionId; //     eine von fastbill vergebene bestimmte abonnementnummer
    private Long customerId; //    eine von fastbill vergebene bestimmte kundennummer
    private String subscriptionTitle; //  gesetzter titel eines abonnements
    private String start; //   start des abos
    private String nextEvent; //  nächstes zahlungsziel
    private String cancellationDate; //   ende des abos
    private String status; //  status
    private String hash; //    hash
    // TODO implement private String xAttributes; //    verwendung eigener felder (notifications geben die werte mit zurück)
    private String articleNumber; //  artikelnummer
    private String quantity; //   mengenangabe
    private Plan plan; //  details zum basisprodukt
    private String subscriptionExtUid; //   bestimmtes abo mit vergebener id
    private String invoiceTitle; //   rechnungstitel
    private String lastEvent; //  letztes event
    private String cancellationNote; //  grund der kündigung eines abonnements
    private List<Plan> addons; // zusatzprodukte
    private String expirationDate; //    auslaufdatum
    private Plan planUpcoming; //   bevorstehendes downgrade des abonnements 

    public static final class Plan {
        private String activationDate;
        private Long articleNumber;
        private String quantity;
        private String title;
        private String description;
        private String unitPrice;
        private String vatPercent;
        private String features;

        public String getActivationDate() {
            return this.activationDate;
        }

        public void setActivationDate(final String activationDate) {
            this.activationDate = activationDate;
        }

        public Long getArticleNumber() {
            return this.articleNumber;
        }

        public void setArticleNumber(final Long articleNumber) {
            this.articleNumber = articleNumber;
        }

        public String getQuantity() {
            return this.quantity;
        }

        public void setQuantity(final String quantity) {
            this.quantity = quantity;
        }

        public String getTitle() {
            return this.title;
        }

        public void setTitle(final String title) {
            this.title = title;
        }

        public String getDescription() {
            return this.description;
        }

        public void setDescription(final String description) {
            this.description = description;
        }

        public String getUnitPrice() {
            return this.unitPrice;
        }

        public void setUnitPrice(final String unitPrice) {
            this.unitPrice = unitPrice;
        }

        public String getVatPercent() {
            return this.vatPercent;
        }

        public void setVatPercent(final String vatPercent) {
            this.vatPercent = vatPercent;
        }

        public String getFeatures() {
            return this.features;
        }

        public void setFeatures(final String features) {
            this.features = features;
        }
    }

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

    public String getSubscriptionTitle() {
        return this.subscriptionTitle;
    }

    public void setSubscriptionTitle(final String subscriptionTitle) {
        this.subscriptionTitle = subscriptionTitle;
    }

    public String getStart() {
        return this.start;
    }

    public void setStart(final String start) {
        this.start = start;
    }

    public String getNextEvent() {
        return this.nextEvent;
    }

    public void setNextEvent(final String nextEvent) {
        this.nextEvent = nextEvent;
    }

    public String getCancellationDate() {
        return this.cancellationDate;
    }

    public void setCancellationDate(final String cancellationDate) {
        this.cancellationDate = cancellationDate;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(final String status) {
        this.status = status;
    }

    public String getHash() {
        return this.hash;
    }

    public void setHash(final String hash) {
        this.hash = hash;
    }

    public String getArticleNumber() {
        return this.articleNumber;
    }

    public void setArticleNumber(final String articleNumber) {
        this.articleNumber = articleNumber;
    }

    public String getQuantity() {
        return this.quantity;
    }

    public void setQuantity(final String quantity) {
        this.quantity = quantity;
    }

    public Plan getPlan() {
        return this.plan;
    }

    public void setPlan(final Plan plan) {
        this.plan = plan;
    }

    public String getSubscriptionExtUid() {
        return this.subscriptionExtUid;
    }

    public void setSubscriptionExtUid(final String subscriptionExtUid) {
        this.subscriptionExtUid = subscriptionExtUid;
    }

    public String getInvoiceTitle() {
        return this.invoiceTitle;
    }

    public void setInvoiceTitle(final String invoiceTitle) {
        this.invoiceTitle = invoiceTitle;
    }

    public String getLastEvent() {
        return this.lastEvent;
    }

    public void setLastEvent(final String lastEvent) {
        this.lastEvent = lastEvent;
    }

    public String getCancellationNote() {
        return this.cancellationNote;
    }

    public void setCancellationNote(final String cancellationNote) {
        this.cancellationNote = cancellationNote;
    }

    public List<Plan> getAddons() {
        return this.addons;
    }

    public void setAddons(final List<Plan> addons) {
        this.addons = addons;
    }

    public String getExpirationDate() {
        return this.expirationDate;
    }

    public void setExpirationDate(final String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Plan getPlanUpcoming() {
        return this.planUpcoming;
    }

    public void setPlanUpcoming(final Plan planUpcoming) {
        this.planUpcoming = planUpcoming;
    }
}
