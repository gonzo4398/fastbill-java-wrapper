/**
 * 
 */
package org.testobject.fastbill.domain;

/**
 * @author cs
 *
 */
public class CreateCustomer {

    private String customerNumber; // eigene kundennummer
    private String customerExtUid; //   kunde nach der externen id
    private CustomerType customerType; //required  kundentyp: business = geschäftskunde | consumer = privatperson
    private String organization; //  firmenname [required] wenn customerType = business
    private String position; //   position in der firma
    private Salutation salutation; // anrede: mr = herr | mrs = frau | family = familie | "empty" = ohne titel
    private String titleAcademic; //akademischer titel
    private String firstName; // vorname
    private String lastName; //  nachname [required] wenn customerType = consumer
    private String address; //  adresszeile 1
    private String address2; // adresszeile 2
    private String zipcode; //  postleitzahl
    private String city; //stadt
    private String countryCode; //   länder-code (iso 3166 alpha-2)
    private String languageCode; // sprachcode z.b. de, fr etc.
    private String phone; // telefon
    private String phone2; //  telefon 2
    private String fax; //  faxnummer
    private String mobile; // mobiltelefonnummer
    private String email; // e-mailadresse
    private String accountReceivable; //  datev debitoren-kontonummer
    private String currencyCode; //   standardwährung
    private String vatId; //ust-idnr.
    private String taxId; // steuernummer
    private String paymentToken; // token des payment providers für zahlungen
    private String paymentProvider; //   integrierter payment dienstleister
    private String daysForPayment; //    tage bis zum zahlungsziel
    private PaymentType paymentType; //   zahlungsart: 1 = ueberweisung | 2 = lastschrift | 3 = bar | 4 = paypal | 5 = vorkasse | 6 = kreditkarte
    private String showPaymentNotice; //  zahlungshinweis anzeigen
    private String bankName; //bankname
    private String bankCode; //bankleitzahl
    private String bankAccountNumber; //   kontonummer
    private String bankAccountOwner; //kontoinhaber
    private String bankAccountOwnerAddress; //adresse des kontoinhabers
    private String bankAccountOwnerCity; //  stadt des kontoinhabers
    private String bankAccountOwnerZipcode; //postleitzahl des kontoinhabers
    private String bankAccountOwnerEmail; //   emailadresse des kontoinhabers
    private String bankBic; //  bic
    private String bankIban; //  iban
    private String paymillToken; //   token für kreditkartenzahlung über paymill
    private String comment; //  kommentar
    private String newsletterOptin; //  newsletteroption: 0 = nein | 1 = ja
    // TODO implement private String xAttributes; //  verwendung eigener felder (webhooks werden das übernehmen)
    private String paymillAmount; // höhe der nächsten zahlung (zum abgleich)
    private String wirecardGatewayreferencenumber; //    id für wirecard zahlungen
    private String adyenEncryptedData; // client side payment token
    private String paypalBillingagreementid; // reference transaction id
    private String affiliate; //  vertriebspartner
    private String invoiceDeliveryMethod; //   art des rechnungs-versands 

    public String getCustomerNumber() {
        return this.customerNumber;
    }

    public void setCustomerNumber(final String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCustomerExtUid() {
        return this.customerExtUid;
    }

    public void setCustomerExtUid(final String customerExtUid) {
        this.customerExtUid = customerExtUid;
    }

    public CustomerType getCustomerType() {
        return this.customerType;
    }

    public void setCustomerType(final CustomerType customerType) {
        this.customerType = customerType;
    }

    public String getOrganization() {
        return this.organization;
    }

    public void setOrganization(final String organization) {
        this.organization = organization;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(final String position) {
        this.position = position;
    }

    public Salutation getSalutation() {
        return this.salutation;
    }

    public void setSalutation(final Salutation salutation) {
        this.salutation = salutation;
    }

    public String getTitleAcademic() {
        return this.titleAcademic;
    }

    public void setTitleAcademic(final String titleAcademic) {
        this.titleAcademic = titleAcademic;
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

    public String getCountryCode() {
        return this.countryCode;
    }

    public void setCountryCode(final String countryCode) {
        this.countryCode = countryCode;
    }

    public String getLanguageCode() {
        return this.languageCode;
    }

    public void setLanguageCode(final String languageCode) {
        this.languageCode = languageCode;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(final String phone) {
        this.phone = phone;
    }

    public String getPhone2() {
        return this.phone2;
    }

    public void setPhone2(final String phone2) {
        this.phone2 = phone2;
    }

    public String getFax() {
        return this.fax;
    }

    public void setFax(final String fax) {
        this.fax = fax;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(final String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getAccountReceivable() {
        return this.accountReceivable;
    }

    public void setAccountReceivable(final String accountReceivable) {
        this.accountReceivable = accountReceivable;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public void setCurrencyCode(final String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getVatId() {
        return this.vatId;
    }

    public void setVatId(final String vatId) {
        this.vatId = vatId;
    }

    public String getTaxId() {
        return this.taxId;
    }

    public void setTaxId(final String taxId) {
        this.taxId = taxId;
    }

    public String getPaymentToken() {
        return this.paymentToken;
    }

    public void setPaymentToken(final String paymentToken) {
        this.paymentToken = paymentToken;
    }

    public String getPaymentProvider() {
        return this.paymentProvider;
    }

    public void setPaymentProvider(final String paymentProvider) {
        this.paymentProvider = paymentProvider;
    }

    public String getDaysForPayment() {
        return this.daysForPayment;
    }

    public void setDaysForPayment(final String daysForPayment) {
        this.daysForPayment = daysForPayment;
    }

    public PaymentType getPaymentType() {
        return this.paymentType;
    }

    public void setPaymentType(final PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public String getShowPaymentNotice() {
        return this.showPaymentNotice;
    }

    public void setShowPaymentNotice(final String showPaymentNotice) {
        this.showPaymentNotice = showPaymentNotice;
    }

    public String getBankName() {
        return this.bankName;
    }

    public void setBankName(final String bankName) {
        this.bankName = bankName;
    }

    public String getBankCode() {
        return this.bankCode;
    }

    public void setBankCode(final String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankAccountNumber() {
        return this.bankAccountNumber;
    }

    public void setBankAccountNumber(final String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getBankAccountOwner() {
        return this.bankAccountOwner;
    }

    public void setBankAccountOwner(final String bankAccountOwner) {
        this.bankAccountOwner = bankAccountOwner;
    }

    public String getBankAccountOwnerAddress() {
        return this.bankAccountOwnerAddress;
    }

    public void setBankAccountOwnerAddress(final String bankAccountOwnerAddress) {
        this.bankAccountOwnerAddress = bankAccountOwnerAddress;
    }

    public String getBankAccountOwnerCity() {
        return this.bankAccountOwnerCity;
    }

    public void setBankAccountOwnerCity(final String bankAccountOwnerCity) {
        this.bankAccountOwnerCity = bankAccountOwnerCity;
    }

    public String getBankAccountOwnerZipcode() {
        return this.bankAccountOwnerZipcode;
    }

    public void setBankAccountOwnerZipcode(final String bankAccountOwnerZipcode) {
        this.bankAccountOwnerZipcode = bankAccountOwnerZipcode;
    }

    public String getBankAccountOwnerEmail() {
        return this.bankAccountOwnerEmail;
    }

    public void setBankAccountOwnerEmail(final String bankAccountOwnerEmail) {
        this.bankAccountOwnerEmail = bankAccountOwnerEmail;
    }

    public String getBankBic() {
        return this.bankBic;
    }

    public void setBankBic(final String bankBic) {
        this.bankBic = bankBic;
    }

    public String getBankIban() {
        return this.bankIban;
    }

    public void setBankIban(final String bankIban) {
        this.bankIban = bankIban;
    }

    public String getPaymillToken() {
        return this.paymillToken;
    }

    public void setPaymillToken(final String paymillToken) {
        this.paymillToken = paymillToken;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(final String comment) {
        this.comment = comment;
    }

    public String getNewsletterOptin() {
        return this.newsletterOptin;
    }

    public void setNewsletterOptin(final String newsletterOptin) {
        this.newsletterOptin = newsletterOptin;
    }

    public String getPaymillAmount() {
        return this.paymillAmount;
    }

    public void setPaymillAmount(final String paymillAmount) {
        this.paymillAmount = paymillAmount;
    }

    public String getWirecardGatewayreferencenumber() {
        return this.wirecardGatewayreferencenumber;
    }

    public void setWirecardGatewayreferencenumber(final String wirecardGatewayreferencenumber) {
        this.wirecardGatewayreferencenumber = wirecardGatewayreferencenumber;
    }

    public String getAdyenEncryptedData() {
        return this.adyenEncryptedData;
    }

    public void setAdyenEncryptedData(final String adyenEncryptedData) {
        this.adyenEncryptedData = adyenEncryptedData;
    }

    public String getPaypalBillingagreementid() {
        return this.paypalBillingagreementid;
    }

    public void setPaypalBillingagreementid(final String paypalBillingagreementid) {
        this.paypalBillingagreementid = paypalBillingagreementid;
    }

    public String getAffiliate() {
        return this.affiliate;
    }

    public void setAffiliate(final String affiliate) {
        this.affiliate = affiliate;
    }

    public String getInvoiceDeliveryMethod() {
        return this.invoiceDeliveryMethod;
    }

    public void setInvoiceDeliveryMethod(final String invoiceDeliveryMethod) {
        this.invoiceDeliveryMethod = invoiceDeliveryMethod;
    }
}
