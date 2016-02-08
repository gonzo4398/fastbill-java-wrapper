package org.testobject.fastbill.domain;

import java.util.List;

public class Invoice {

    private Long invoiceId; //  rechnungs-id
    private String invoice_ext_uid; //    eine extra vergebene, externe kunden id
    private String status; // ergebnis einer aktion
    private InvoiceType type; //    rechnungen eines bestimmten typs: outgoing = rechnungen draft = entwürfe | credit = gutschriften
    private Long customerId; //   eine bestimmte kundennummer
    private String customerNumber; //   eigene kundennummer
    private String customerCostcenterId; // id der kostenstelle
    private String organization; //   firmenname [required] wenn customerType = business
    private Salutation salutation; // anrede: mr = herr | mrs = frau | family = familie | "empty" = ohne titel
    private String firstName; // vorname
    private String lastName; // nachname
    private String address; //   adresszeile 1
    private String address2; //  adresszeile 2
    private String zipcode; //    postleitzahl
    private String city; //  stadt
    private String comment; //   bemerkung
    private String paymentType; //   zahlungsart: 1 = ueberweisung | 2 = lastschrift | 3 = bar | 4 = paypal | 5 = vorkasse | 6 = kreditkarte
    private String daysForPayment; // tage bis zum zahlungsziel
    private String bankName; // bankname
    private String bankAccountNumber; //    kontonummer
    private String bankCode; //  bankleitzahl
    private String bankAccountOwner; //  kontoinhaber
    private String bankIban; //iban
    private String bankBic; //   bic
    private String affiliate; //  vertriebspartner
    private String countryCode; //   länder-code (iso 3166 alpha-2)
    private String vatId; //  ust-idnr.
    private String currencyCode; //   standardwährung
    private String templateId; //   entwurfsnummer
    private String subscriptionId; //    abonnement id
    private String subscriptionInvoiceCounter; //   wieviele rechnungen für das aufgeführte abo erstellt wurden
    private String invoiceNumber; // rechnungsnummer
    private String invoiceTitle; //   rechnungstitel
    private String introtext; // einleitungstext
    private String paidDate; // datum der zahlung
    private String isCanceled; //   flag für stonierungsstatus: 0 = nein | 1 = ja
    private String invoiceDate; //   rechnungsdatum
    private String dueDate; // fälligkeitsdatum
    private String deliveryDate; //  lieferdatum
    private String cashDiscountPercent; //   skonto in prozent
    private String cashDiscountDays; // skonto-zeitraum in tagen
    private String subTotal; // nettobetrag
    private String vatTotal; // vorsteuerbetrag
    private List<Item> vatItems; //  liste aller artikel zu einem datensatz
    private List<Item> items; //liste der artikel
    private String total; //gesamtmenge
    private String paymentInfo; //  informationen zu zahlung
    private String documentUrl; //   url eines dokuments
    // TODO implement private String shipments; // auflistung der zur rechnung gehörenden versand-ereignisse
    private String paypalUrl; // paypal-bezahllink 

    public static final class Item {

        private Long invoiceItemId;
        private String articleNumber;
        private String description;
        private String quantity;
        private String unitPrice;
        private String vatPercent;
        private String vatValue;
        private String completeNet;
        private String completeCross;
        private int sortOrder;

        public Long getInvoiceItemId() {
            return this.invoiceItemId;
        }

        public void setInvoiceItemId(final Long invoiceItemId) {
            this.invoiceItemId = invoiceItemId;
        }

        public String getArticleNumber() {
            return this.articleNumber;
        }

        public void setArticleNumber(final String articleNumber) {
            this.articleNumber = articleNumber;
        }

        public String getDescription() {
            return this.description;
        }

        public void setDescription(final String description) {
            this.description = description;
        }

        public String getQuantity() {
            return this.quantity;
        }

        public void setQuantity(final String quantity) {
            this.quantity = quantity;
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

        public String getVatValue() {
            return this.vatValue;
        }

        public void setVatValue(final String vatValue) {
            this.vatValue = vatValue;
        }

        public String getCompleteNet() {
            return this.completeNet;
        }

        public void setCompleteNet(final String completeNet) {
            this.completeNet = completeNet;
        }

        public String getCompleteCross() {
            return this.completeCross;
        }

        public void setCompleteCross(final String completeCross) {
            this.completeCross = completeCross;
        }

        public int getSortOrder() {
            return this.sortOrder;
        }

        public void setSortOrder(final int sortOrder) {
            this.sortOrder = sortOrder;
        }

    }

    public Long getInvoiceId() {
        return this.invoiceId;
    }

    public void setInvoiceId(final Long invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getInvoice_ext_uid() {
        return this.invoice_ext_uid;
    }

    public void setInvoice_ext_uid(final String invoice_ext_uid) {
        this.invoice_ext_uid = invoice_ext_uid;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(final String status) {
        this.status = status;
    }

    public InvoiceType getType() {
        return this.type;
    }

    public void setType(final InvoiceType type) {
        this.type = type;
    }

    public Long getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(final Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerNumber() {
        return this.customerNumber;
    }

    public void setCustomerNumber(final String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCustomerCostcenterId() {
        return this.customerCostcenterId;
    }

    public void setCustomerCostcenterId(final String customerCostcenterId) {
        this.customerCostcenterId = customerCostcenterId;
    }

    public String getOrganization() {
        return this.organization;
    }

    public void setOrganization(final String organization) {
        this.organization = organization;
    }

    public Salutation getSalutation() {
        return this.salutation;
    }

    public void setSalutation(final Salutation salutation) {
        this.salutation = salutation;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }

    public String getAddress2() {
        return this.address2;
    }

    public void setAddress2(final String address2) {
        this.address2 = address2;
    }

    public String getZipcode() {
        return this.zipcode;
    }

    public void setZipcode(final String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(final String comment) {
        this.comment = comment;
    }

    public String getPaymentType() {
        return this.paymentType;
    }

    public void setPaymentType(final String paymentType) {
        this.paymentType = paymentType;
    }

    public String getDaysForPayment() {
        return this.daysForPayment;
    }

    public void setDaysForPayment(final String daysForPayment) {
        this.daysForPayment = daysForPayment;
    }

    public String getBankName() {
        return this.bankName;
    }

    public void setBankName(final String bankName) {
        this.bankName = bankName;
    }

    public String getBankAccountNumber() {
        return this.bankAccountNumber;
    }

    public void setBankAccountNumber(final String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getBankCode() {
        return this.bankCode;
    }

    public void setBankCode(final String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankAccountOwner() {
        return this.bankAccountOwner;
    }

    public void setBankAccountOwner(final String bankAccountOwner) {
        this.bankAccountOwner = bankAccountOwner;
    }

    public String getBankIban() {
        return this.bankIban;
    }

    public void setBankIban(final String bankIban) {
        this.bankIban = bankIban;
    }

    public String getBankBic() {
        return this.bankBic;
    }

    public void setBankBic(final String bankBic) {
        this.bankBic = bankBic;
    }

    public String getAffiliate() {
        return this.affiliate;
    }

    public void setAffiliate(final String affiliate) {
        this.affiliate = affiliate;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public void setCountryCode(final String countryCode) {
        this.countryCode = countryCode;
    }

    public String getVatId() {
        return this.vatId;
    }

    public void setVatId(final String vatId) {
        this.vatId = vatId;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public void setCurrencyCode(final String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getTemplateId() {
        return this.templateId;
    }

    public void setTemplateId(final String templateId) {
        this.templateId = templateId;
    }

    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    public void setSubscriptionId(final String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public String getSubscriptionInvoiceCounter() {
        return this.subscriptionInvoiceCounter;
    }

    public void setSubscriptionInvoiceCounter(final String subscriptionInvoiceCounter) {
        this.subscriptionInvoiceCounter = subscriptionInvoiceCounter;
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

    public String getIntrotext() {
        return this.introtext;
    }

    public void setIntrotext(final String introtext) {
        this.introtext = introtext;
    }

    public String getPaidDate() {
        return this.paidDate;
    }

    public void setPaidDate(final String paidDate) {
        this.paidDate = paidDate;
    }

    public String getIsCanceled() {
        return this.isCanceled;
    }

    public void setIsCanceled(final String isCanceled) {
        this.isCanceled = isCanceled;
    }

    public String getInvoiceDate() {
        return this.invoiceDate;
    }

    public void setInvoiceDate(final String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getDueDate() {
        return this.dueDate;
    }

    public void setDueDate(final String dueDate) {
        this.dueDate = dueDate;
    }

    public String getDeliveryDate() {
        return this.deliveryDate;
    }

    public void setDeliveryDate(final String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getCashDiscountPercent() {
        return this.cashDiscountPercent;
    }

    public void setCashDiscountPercent(final String cashDiscountPercent) {
        this.cashDiscountPercent = cashDiscountPercent;
    }

    public String getCashDiscountDays() {
        return this.cashDiscountDays;
    }

    public void setCashDiscountDays(final String cashDiscountDays) {
        this.cashDiscountDays = cashDiscountDays;
    }

    public String getSubTotal() {
        return this.subTotal;
    }

    public void setSubTotal(final String subTotal) {
        this.subTotal = subTotal;
    }

    public String getVatTotal() {
        return this.vatTotal;
    }

    public void setVatTotal(final String vatTotal) {
        this.vatTotal = vatTotal;
    }

    public List<Item> getVatItems() {
        return this.vatItems;
    }

    public void setVatItems(final List<Item> vatItems) {
        this.vatItems = vatItems;
    }

    public List<Item> getItems() {
        return this.items;
    }

    public void setItems(final List<Item> items) {
        this.items = items;
    }

    public String getTotal() {
        return this.total;
    }

    public void setTotal(final String total) {
        this.total = total;
    }

    public String getPaymentInfo() {
        return this.paymentInfo;
    }

    public void setPaymentInfo(final String paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    public String getDocumentUrl() {
        return this.documentUrl;
    }

    public void setDocumentUrl(final String documentUrl) {
        this.documentUrl = documentUrl;
    }

    public String getPaypalUrl() {
        return this.paypalUrl;
    }

    public void setPaypalUrl(final String paypalUrl) {
        this.paypalUrl = paypalUrl;
    }

}
