/**
 * 
 */
package org.testobject.fastbill.domain;

/**
 * @author cs
 *
 */
public class CustomerFilter {
    private Long customerId; //    Eine von FastBill vergebene bestimmte Kundennummer
    private String customerExtUid; //    Kunde nach der externen ID
    private String customerNumber; //     Eigene Kundennummer
    private String countryCode; //    Länder-Code (ISO 3166 ALPHA-2)
    private String city; //    Stadt
    private String term; //    Sucht nach Suchterm in einem der Felder: ORGANIZATION, FIRST_NAME, LAST_NAME, ADDRESS, ADDRESS_2, ZIPCODE, EMAIL
    private String comment; //     Kommentar
    private String dashboardUrl; //   Link zum Dashboard
    private String changedataUrl; //  Link um die Stamm- und Rechnungsdaten zu ändern
    private String hash; //    Filtern nach Hash 

    public Long getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(final Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerExtUid() {
        return this.customerExtUid;
    }

    public void setCustomerExtUid(final String customerExtUid) {
        this.customerExtUid = customerExtUid;
    }

    public String getCustomerNumber() {
        return this.customerNumber;
    }

    public void setCustomerNumber(final String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public void setCountryCode(final String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    public String getTerm() {
        return this.term;
    }

    public void setTerm(final String term) {
        this.term = term;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(final String comment) {
        this.comment = comment;
    }

    public String getDashboardUrl() {
        return this.dashboardUrl;
    }

    public void setDashboardUrl(final String dashboardUrl) {
        this.dashboardUrl = dashboardUrl;
    }

    public String getChangedataUrl() {
        return this.changedataUrl;
    }

    public void setChangedataUrl(final String changedataUrl) {
        this.changedataUrl = changedataUrl;
    }

    public String getHash() {
        return this.hash;
    }

    public void setHash(final String hash) {
        this.hash = hash;
    }

}
