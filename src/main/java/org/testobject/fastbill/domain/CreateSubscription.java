/**
 * 
 */
package org.testobject.fastbill.domain;

import java.util.List;

/**
 * @author cs
 *
 */
public class CreateSubscription {

    private String subscriptionExtUid; //    bestimmtes abo mit vergebener id
    private String articleNumber; //  required     artikelnummer
    private Long customerId; //  required    eine von fastbill vergebene bestimmte kundennummer
    private String coupon; //   coupon
    private String title; //   titel
    private String unitPrice; //  einzelpreis
    private String currencyCode; //   währungscode
    private String description; //    beschreibung
    private String invoiceTitle; //   rechnungstitel
    private String startDate; //   start des abonnements (relevant für vertragslaufzeiten)
    private String nextEvent; //  nächstes zahlungsziel
    // TODO implement private String xAttributes; //    verwendung eigener felder (notifications geben die werte mit zurück)
    private String cancellationDate; //   ende des abos
    private List<Addon> addons; // zusatzprodukte
    private List<Feature> features; //   produktfeatures 

    public static final class Addon {
        private Long articleNumber;
        private String quantity;
        private String title;
        private String description;
        private String unitPrice;
        private String vatPercent;

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
    }

    public static final class Feature {
        private String code;
        private String quantity;
        private String value;

        public String getCode() {
            return this.code;
        }

        public void setCode(final String code) {
            this.code = code;
        }

        public String getQuantity() {
            return this.quantity;
        }

        public void setQuantity(final String quantity) {
            this.quantity = quantity;
        }

        public String getValue() {
            return this.value;
        }

        public void setValue(final String value) {
            this.value = value;
        }
    }

    public String getSubscriptionExtUid() {
        return this.subscriptionExtUid;
    }

    public void setSubscriptionExtUid(final String subscriptionExtUid) {
        this.subscriptionExtUid = subscriptionExtUid;
    }

    public String getArticleNumber() {
        return this.articleNumber;
    }

    public void setArticleNumber(final String articleNumber) {
        this.articleNumber = articleNumber;
    }

    public Long getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(final Long customerId) {
        this.customerId = customerId;
    }

    public String getCoupon() {
        return this.coupon;
    }

    public void setCoupon(final String coupon) {
        this.coupon = coupon;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public String getUnitPrice() {
        return this.unitPrice;
    }

    public void setUnitPrice(final String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public void setCurrencyCode(final String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public String getInvoiceTitle() {
        return this.invoiceTitle;
    }

    public void setInvoiceTitle(final String invoiceTitle) {
        this.invoiceTitle = invoiceTitle;
    }

    public String getStartDate() {
        return this.startDate;
    }

    public void setStartDate(final String startDate) {
        this.startDate = startDate;
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

    public List<Addon> getAddons() {
        return this.addons;
    }

    public void setAddons(final List<Addon> addons) {
        this.addons = addons;
    }

    public List<Feature> getFeatures() {
        return this.features;
    }

    public void setFeatures(final List<Feature> features) {
        this.features = features;
    }

}
