package org.testobject.fastbill.domain;

public enum PaymentType {

    //    Zahlungsart: 1 = ueberweisung | 2 = lastschrift | 3 = bar | 4 = paypal | 5 = vorkasse | 6 = kreditkarte 
    INVOICE(1), DEBIT(2), CASH(3), PAYPAL(4), ADVANCE(5), CREDIT(6);

    private final int id;

    private PaymentType(final int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "" + this.id;
    }
}