/**
 * 
 */
package org.testobject.fastbill.domain;

/**
 * @author cs
 *
 */
public class CreatedCustomer {

    private String status; //  ergebnis einer aktion oder status einer rechnung
    private Long customerId; //     eine von fastbill vergebene bestimmte kundennummer
    private String hash; //  filtern nach hash
    private String changedataUrl; //  link um die stamm- und rechnungsdaten zu ändern
    private String dashboardUrl; // Link zum Dashboard 

    public String getStatus() {
        return this.status;
    }

    public void setStatus(final String status) {
        this.status = status;
    }

    public Long getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(final Long customerId) {
        this.customerId = customerId;
    }

    public String getHash() {
        return this.hash;
    }

    public void setHash(final String hash) {
        this.hash = hash;
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

}
