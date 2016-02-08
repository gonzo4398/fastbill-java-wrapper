/**
 * 
 */
package org.testobject.fastbill.service;

import java.util.List;

/**
 * @author cs
 *
 */
@SuppressWarnings("serial")
public class FastbillErrorResponse extends Exception {

    private final List<String> errorMessages;

    public FastbillErrorResponse(final List<String> errorMessages) {
        this.errorMessages = errorMessages;
    }

    public List<String> getErrorMessages() {
        return this.errorMessages;
    }
}
