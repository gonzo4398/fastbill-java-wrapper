package org.testobject.fastbill.domain;

/**
 * @author cs
 *
 */
public class Customer {

    private String customerId; // Eine von FastBill vergebene bestimmte Kundennummer
    private String customerNumber; // eigene kundennummer
    private String daysForPayment; //     tage bis zum zahlungsziel
    private String created; //      datum der erstellung
    private PaymentType paymentType; //     zahlungsart: 1 = ueberweisung | 2 = lastschrift | 3 = bar | 4 = paypal | 5 = vorkasse | 6 = kreditkarte
    private String bankName; //    bankname
    private String bankAccountNumber; //      kontonummer
    private String bankCode; //    bankleitzahl
    private String bankAccountOwner; //   kontoinhaber
    private String bankIban; //    iban
    private String bankBic; //    bic
    private String bankAccountOwnerAddress; //   adresse des kontoinhabers
    private String bankAccountOwnerCity; //    stadt des kontoinhabers
    private String bankAccountOwnerZipcode; //   postleitzahl des kontoinhabers
    private String bankAccountOwnerEmail; //    emailadresse des kontoinhabers
    private String bankAccountMandateReference; //  mandatsrefernznummer
    private String showPaymentNotice; //   zahlungshinweis anzeigen
    private String customerType; //  kundentyp: business = geschäftskunde | consumer = privatperson
    private Integer newsletterOptin; //   newsletteroption: 0 = nein | 1 = ja
    private String affiliate; //   vertriebspartner
    private String hash; //    filtern nach hash
    private String bankAccountMandateReferenceDate; //   erstellungsdatum des sepa-lastschriftmandats
    // TODO implement  private String xAttributes; //    verwendung eigener felder (webhooks werden das übernehmen)
    private String organization; //    firmenname [required] wenn customer_type = business
    private String titleAcademic; //   akademischer titel
    private Salutation salutation; //   anrede: mr = herr | mrs = frau | family = familie | "empty" = ohne titel
    private String firstName; //  vorname
    private String lastName; //  nachname [required] wenn customer_type = consumer
    private String address; //    adresszeile 1
    private String address2; //   adresszeile 2
    private String zipcode; //    postleitzahl
    private String city; //   stadt
    private String countryCode; //    länder-code (iso 3166 alpha-2)
    private String secondaryAddress; //  lieferadresse
    private String state; //   bundesland
    private String phone; //    telefon
    private String fax; //   faxnummer
    private String email; //   e-mailadresse
    private String emailCc; //    cc für den e-mail-versand an den kunden
    private String birthday; //    geburtstag
    private String paymentMailAddress; //    zahlungs-e-mailadresse
    private String vatId; //  ust-idnr.
    private String taxId; //  steuernummer
    private String currencyCode; //   standardwährung
    private String comment; //   kommentar
    private String lastupdate; // datum der letzten bearbeitung
    private String tags; //   tags
    private String customerExtUid; //   kunde nach der externen id
    private String languageCode; //  sprachcode z.b. de, fr etc.
    private String changedataUrl; //  link um die stamm- und rechnungsdaten zu ändern
    private String dashboardUrl; //   link zum dashboard
    private String creditBalance; //  guthaben
    private String invoiceDeliveryMethod; //    art des rechnungs-versands 

    public String getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(final String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerNumber() {
        return this.customerNumber;
    }

    public void setCustomerNumber(final String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getDaysForPayment() {
        return this.daysForPayment;
    }

    public void setDaysForPayment(final String daysForPayment) {
        this.daysForPayment = daysForPayment;
    }

    public String getCreated() {
        return this.created;
    }

    public void setCreated(final String created) {
        this.created = created;
    }

    public PaymentType getPaymentType() {
        return this.paymentType;
    }

    public void setPaymentType(final PaymentType paymentType) {
        this.paymentType = paymentType;
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

    public String getBankAccountMandateReference() {
        return this.bankAccountMandateReference;
    }

    public void setBankAccountMandateReference(final String bankAccountMandateReference) {
        this.bankAccountMandateReference = bankAccountMandateReference;
    }

    public String getShowPaymentNotice() {
        return this.showPaymentNotice;
    }

    public void setShowPaymentNotice(final String showPaymentNotice) {
        this.showPaymentNotice = showPaymentNotice;
    }

    public String getCustomerType() {
        return this.customerType;
    }

    public void setCustomerType(final String customerType) {
        this.customerType = customerType;
    }

    public Integer getNewsletterOptin() {
        return this.newsletterOptin;
    }

    public void setNewsletterOptin(final Integer newsletterOptin) {
        this.newsletterOptin = newsletterOptin;
    }

    public String getAffiliate() {
        return this.affiliate;
    }

    public void setAffiliate(final String affiliate) {
        this.affiliate = affiliate;
    }

    public String getHash() {
        return this.hash;
    }

    public void setHash(final String hash) {
        this.hash = hash;
    }

    public String getBankAccountMandateReferenceDate() {
        return this.bankAccountMandateReferenceDate;
    }

    public void setBankAccountMandateReferenceDate(final String bankAccountMandateReferenceDate) {
        this.bankAccountMandateReferenceDate = bankAccountMandateReferenceDate;
    }

    public String getOrganization() {
        return this.organization;
    }

    public void setOrganization(final String organization) {
        this.organization = organization;
    }

    public String getTitleAcademic() {
        return this.titleAcademic;
    }

    public void setTitleAcademic(final String titleAcademic) {
        this.titleAcademic = titleAcademic;
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

    public String getCountryCode() {
        return this.countryCode;
    }

    public void setCountryCode(final String countryCode) {
        this.countryCode = countryCode;
    }

    public String getSecondaryAddress() {
        return this.secondaryAddress;
    }

    public void setSecondaryAddress(final String secondaryAddress) {
        this.secondaryAddress = secondaryAddress;
    }

    public String getState() {
        return this.state;
    }

    public void setState(final String state) {
        this.state = state;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(final String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return this.fax;
    }

    public void setFax(final String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getEmailCc() {
        return this.emailCc;
    }

    public void setEmailCc(final String emailCc) {
        this.emailCc = emailCc;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public void setBirthday(final String birthday) {
        this.birthday = birthday;
    }

    public String getPaymentMailAddress() {
        return this.paymentMailAddress;
    }

    public void setPaymentMailAddress(final String paymentMailAddress) {
        this.paymentMailAddress = paymentMailAddress;
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

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public void setCurrencyCode(final String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(final String comment) {
        this.comment = comment;
    }

    public String getLastupdate() {
        return this.lastupdate;
    }

    public void setLastupdate(final String lastupdate) {
        this.lastupdate = lastupdate;
    }

    public String getTags() {
        return this.tags;
    }

    public void setTags(final String tags) {
        this.tags = tags;
    }

    public String getCustomerExtUid() {
        return this.customerExtUid;
    }

    public void setCustomerExtUid(final String customerExtUid) {
        this.customerExtUid = customerExtUid;
    }

    public String getLanguageCode() {
        return this.languageCode;
    }

    public void setLanguageCode(final String languageCode) {
        this.languageCode = languageCode;
    }

    public String getChangedataUrl() {
        return this.changedataUrl;
    }

    public void setChangedataUrl(final String changedataUrl) {
        this.changedataUrl = changedataUrl;
    }

    public String getDashboardUrl() {
        return this.dashboardUrl;
    }

    public void setDashboardUrl(final String dashboardUrl) {
        this.dashboardUrl = dashboardUrl;
    }

    public String getCreditBalance() {
        return this.creditBalance;
    }

    public void setCreditBalance(final String creditBalance) {
        this.creditBalance = creditBalance;
    }

    public String getInvoiceDeliveryMethod() {
        return this.invoiceDeliveryMethod;
    }

    public void setInvoiceDeliveryMethod(final String invoiceDeliveryMethod) {
        this.invoiceDeliveryMethod = invoiceDeliveryMethod;
    }

}
