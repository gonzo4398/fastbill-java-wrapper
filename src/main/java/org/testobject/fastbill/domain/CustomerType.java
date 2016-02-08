/**
 * 
 */
package org.testobject.fastbill.domain;

/**
 * @author cs
 *
 */
public enum CustomerType {

    BUSINESS("business"), CONSUMER("consumer");

    private final String value;

    private CustomerType(final String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
