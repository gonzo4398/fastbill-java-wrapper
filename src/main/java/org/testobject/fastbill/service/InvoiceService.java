package org.testobject.fastbill.service;

import java.util.List;

import org.testobject.fastbill.domain.Invoice;
import org.testobject.fastbill.domain.InvoiceFilter;
import org.testobject.fastbill.service.ServiceBuilder.Factory;

public class InvoiceService {

    private final Factory factory;

    public InvoiceService(final ServiceBuilder.Factory factory) {
        this.factory = factory;
    }

    public List<Invoice> get(final InvoiceFilter filter) throws FastbillErrorResponse {
        return this.factory.create("invoice.get").withFilter(filter).execute(InvoicesWrapper.class).getInvoices();
    }

    public static final class InvoicesWrapper {
        private List<Invoice> invoices;

        public InvoicesWrapper() {
        }

        public List<Invoice> getInvoices() {
            return this.invoices;
        }

        public void setInvoices(final List<Invoice> invoices) {
            this.invoices = invoices;
        }
    }

    // TODO implement invoice.create, invoice.update, invoice.delete, invoice.complete
    // TODO implement item.get, item.delete, invoice.cancel, invoice.sign
    // TODO implement invoice.sendbyemail, invoice.sendbypost, invoice.setpaid, invoice.getreminders
}
