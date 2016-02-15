/**
 * 
 */
package org.testobject.fastbill.domain;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author cs
 *
 */
public class Article {

    private String articleNumber;// artikelnummer
    private String title;//  titel
    private String description;//    beschreibung
    private String tags;//   artikel tags
    private BigDecimal unitPrice;// einzelpreis
    private BigDecimal setupFee;//  setup fee
    private String allowMultiple;// mehrmalsbuchung erlauben
    private String isAddon;//  produkt ist ein addon
    private String translation;//   übersetzung
    private String currencyCode;//  währungscode
    private BigDecimal vatPercent;//   mwst. satz
    private String subscriptionInterval;//  abo intervall
    private String subscriptionNumberEvents;// abo anzahl wiederholungen
    private String subscriptionTrial;// abo testzeitraum
    private String subscriptionDuration;//  abo erste vertragslaufzeit
    private String subscriptionDurationFollow;//   abo folgende vertragslaufzeit
    private String subscriptionCancellation;// abo kündigungsfrist
    private String returnUrlSuccess;//url erfolgsfall
    private String returnUrlCancel;// url abbruch
    private String checkoutUrl;// bestell-url
    private List<Feature> features;//  produktfeatures 

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

    public String getArticleNumber() {
        return this.articleNumber;
    }

    public void setArticleNumber(final String articleNumber) {
        this.articleNumber = articleNumber;
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

    public String getTags() {
        return this.tags;
    }

    public void setTags(final String tags) {
        this.tags = tags;
    }

    public BigDecimal getUnitPrice() {
        return this.unitPrice;
    }

    public void setUnitPrice(final BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getSetupFee() {
        return this.setupFee;
    }

    public void setSetupFee(final BigDecimal setupFee) {
        this.setupFee = setupFee;
    }

    public String getAllowMultiple() {
        return this.allowMultiple;
    }

    public void setAllowMultiple(final String allowMultiple) {
        this.allowMultiple = allowMultiple;
    }

    public String getIsAddon() {
        return this.isAddon;
    }

    public void setIsAddon(final String isAddon) {
        this.isAddon = isAddon;
    }

    public String getTranslation() {
        return this.translation;
    }

    public void setTranslation(final String translation) {
        this.translation = translation;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public void setCurrencyCode(final String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public BigDecimal getVatPercent() {
        return this.vatPercent;
    }

    public void setVatPercent(final BigDecimal vatPercent) {
        this.vatPercent = vatPercent;
    }

    public String getSubscriptionInterval() {
        return this.subscriptionInterval;
    }

    public void setSubscriptionInterval(final String subscriptionInterval) {
        this.subscriptionInterval = subscriptionInterval;
    }

    public String getSubscriptionNumberEvents() {
        return this.subscriptionNumberEvents;
    }

    public void setSubscriptionNumberEvents(final String subscriptionNumberEvents) {
        this.subscriptionNumberEvents = subscriptionNumberEvents;
    }

    public String getSubscriptionTrial() {
        return this.subscriptionTrial;
    }

    public void setSubscriptionTrial(final String subscriptionTrial) {
        this.subscriptionTrial = subscriptionTrial;
    }

    public String getSubscriptionDuration() {
        return this.subscriptionDuration;
    }

    public void setSubscriptionDuration(final String subscriptionDuration) {
        this.subscriptionDuration = subscriptionDuration;
    }

    public String getSubscriptionDurationFollow() {
        return this.subscriptionDurationFollow;
    }

    public void setSubscriptionDurationFollow(final String subscriptionDurationFollow) {
        this.subscriptionDurationFollow = subscriptionDurationFollow;
    }

    public String getSubscriptionCancellation() {
        return this.subscriptionCancellation;
    }

    public void setSubscriptionCancellation(final String subscriptionCancellation) {
        this.subscriptionCancellation = subscriptionCancellation;
    }

    public String getReturnUrlSuccess() {
        return this.returnUrlSuccess;
    }

    public void setReturnUrlSuccess(final String returnUrlSuccess) {
        this.returnUrlSuccess = returnUrlSuccess;
    }

    public String getReturnUrlCancel() {
        return this.returnUrlCancel;
    }

    public void setReturnUrlCancel(final String returnUrlCancel) {
        this.returnUrlCancel = returnUrlCancel;
    }

    public String getCheckoutUrl() {
        return this.checkoutUrl;
    }

    public void setCheckoutUrl(final String checkoutUrl) {
        this.checkoutUrl = checkoutUrl;
    }

    public List<Feature> getFeatures() {
        return this.features;
    }

    public void setFeatures(final List<Feature> features) {
        this.features = features;
    }

}
