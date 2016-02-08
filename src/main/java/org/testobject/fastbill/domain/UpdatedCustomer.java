/**
 * 
 */
package org.testobject.fastbill.domain;

/**
 * @author cs
 *
 */
public class UpdatedCustomer {

    private String status;
    private Long customerId;

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

}
