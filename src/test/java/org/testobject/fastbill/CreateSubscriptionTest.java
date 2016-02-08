package org.testobject.fastbill;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.testobject.fastbill.domain.CancelSubscription;
import org.testobject.fastbill.domain.CreateCustomer;
import org.testobject.fastbill.domain.CreateSubscription;
import org.testobject.fastbill.domain.CreatedSubscription;
import org.testobject.fastbill.domain.CustomerType;
import org.testobject.fastbill.domain.Invoice;
import org.testobject.fastbill.domain.InvoiceFilter;
import org.testobject.fastbill.domain.Subscription;
import org.testobject.fastbill.domain.SubscriptionFilter;
import org.testobject.fastbill.service.CustomerService;
import org.testobject.fastbill.service.InvoiceService;
import org.testobject.fastbill.service.SubscriptionService;

public class CreateSubscriptionTest {

    private final String USER = System.getenv("FASTBILL_USER");
    private final String TOKEN = System.getenv("FASTBILL_TOKEN");

    private CustomerService customerService;
    private SubscriptionService subscriptionService;
    private InvoiceService invoiceService;
    private Fastbill fastBill;
    private Long customerId;

    @Before
    public void setUp() throws Exception {
        this.fastBill = Fastbill.Factory.create(this.USER, this.TOKEN);
        this.customerService = this.fastBill.getCustomerService();
        this.subscriptionService = this.fastBill.getSubscriptionService();
        this.invoiceService = this.fastBill.getInvoiceService();

        final CreateCustomer customer = new CreateCustomer();
        customer.setFirstName("Christian123");
        customer.setLastName("Sokop123");
        customer.setCustomerType(CustomerType.CONSUMER);
        this.customerId = this.customerService.create(customer).getCustomerId();
    }

    @After
    public void tearDown() throws Exception {
        this.customerService.delete(this.customerId);
    }

    @Test
    public void createSubscription() throws Exception {

        final SubscriptionFilter subscriptionFilter = new SubscriptionFilter();
        subscriptionFilter.setCustomerId(this.customerId);

        List<Subscription> subscriptions = this.subscriptionService.get(subscriptionFilter);
        Assert.assertNotNull(subscriptions);
        Assert.assertTrue(subscriptions.size() == 0);

        final CreateSubscription subscription = new CreateSubscription();
        subscription.setCustomerId(this.customerId);
        subscription.setArticleNumber("1");

        final CreatedSubscription createdSubscription = this.subscriptionService.create(subscription);
        Assert.assertNotNull(createdSubscription);
        Assert.assertNotNull(createdSubscription.getSubscriptionId());
        Assert.assertNotNull(createdSubscription.getInvoiceId());

        subscriptions = this.subscriptionService.get(subscriptionFilter);
        Assert.assertNotNull(subscriptions);
        Assert.assertTrue(subscriptions.size() == 2);

        final InvoiceFilter filter = new InvoiceFilter();
        filter.setCustomerId(this.customerId);
        final List<Invoice> invoices = this.invoiceService.get(filter);

        Assert.assertNotNull(invoices);
        Assert.assertTrue(invoices.size() == 2);

        final CancelSubscription cancelSubscription = new CancelSubscription();
        cancelSubscription.setSubscriptionId(subscriptions.get(0).getSubscriptionId());
        cancelSubscription.setCancellationDate("2016-02-08");
        cancelSubscription.setCancellationNote("Kein Interesse mehr");
        this.subscriptionService.cancel(cancelSubscription);
    }
}
