package org.testobject.fastbill.domain;

public enum Salutation {

    // Anrede: mr = Herr | mrs = Frau | family = Familie | "empty" = ohne Titel 
    MR("mr"), MRS("mrs"), FAMILY("family"), EMPTY("");

    private final String id;

    private Salutation(final String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return this.id;
    }
}