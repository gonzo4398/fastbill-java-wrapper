package org.testobject.fastbill.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testobject.fastbill.domain.CreateCustomer;
import org.testobject.fastbill.domain.CreatedCustomer;
import org.testobject.fastbill.domain.Customer;
import org.testobject.fastbill.domain.CustomerFilter;
import org.testobject.fastbill.domain.UpdateCustomer;
import org.testobject.fastbill.domain.UpdatedCustomer;
import org.testobject.fastbill.service.ServiceBuilder.Factory;

public class CustomerService {

    private final Factory factory;

    public CustomerService(final ServiceBuilder.Factory factory) {
        this.factory = factory;
    }

    public CreatedCustomer create(final CreateCustomer customer) throws FastbillErrorResponse {
        return this.factory.create("customer.create").withData(customer).execute(CreatedCustomer.class);
    }

    public UpdatedCustomer update(final UpdateCustomer customer) throws FastbillErrorResponse {
        return this.factory.create("customer.update").withData(customer).execute(UpdatedCustomer.class);
    }

    public void delete(final Long customerId) throws FastbillErrorResponse {
        final Map<String, Object> dataMap = new HashMap<>();
        dataMap.put("CUSTOMER_ID", customerId);
        this.factory.create("customer.delete").withData(dataMap).execute(Map.class);
    }

    public List<Customer> get(final CustomerFilter filter) throws FastbillErrorResponse {
        return this.factory.create("customer.get").withFilter(filter).execute(CustomersWrapper.class).getCustomers();
    }

    public Customer getOne(final Long customerId) throws FastbillErrorResponse {
        final CustomerFilter filter = new CustomerFilter();
        filter.setCustomerId(customerId);
        final List<Customer> customers = get(filter);

        if (customers == null || customers.size() < 1) {
            return null;
        }

        if (customers.size() > 1) {
            throw new IllegalStateException("More than one customer found by customerId");
        }
        return customers.get(0);
    }

    // TODO implement customer.createsecurelink, customer.addcredits

    public static final class CustomersWrapper {
        private List<Customer> customers;

        public CustomersWrapper() {
        }

        public List<Customer> getCustomers() {
            return this.customers;
        }

        public void setCustomers(final List<Customer> customers) {
            this.customers = customers;
        }

    }
}
