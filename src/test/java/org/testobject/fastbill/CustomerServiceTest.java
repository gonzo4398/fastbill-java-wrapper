package org.testobject.fastbill;

import java.util.UUID;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.testobject.fastbill.domain.CreateCustomer;
import org.testobject.fastbill.domain.CreatedCustomer;
import org.testobject.fastbill.domain.Customer;
import org.testobject.fastbill.domain.CustomerType;
import org.testobject.fastbill.domain.PaymentType;
import org.testobject.fastbill.domain.Salutation;
import org.testobject.fastbill.domain.UpdateCustomer;
import org.testobject.fastbill.domain.UpdatedCustomer;
import org.testobject.fastbill.service.CustomerService;
import org.testobject.fastbill.service.FastbillErrorResponse;

public class CustomerServiceTest {

    private final String USER = System.getenv("FASTBILL_USER");
    private final String TOKEN = System.getenv("FASTBILL_TOKEN");

    private CustomerService customerService;
    private Fastbill fastBill;

    @Before
    public void setUp() {
        this.fastBill = Fastbill.Factory.create(this.USER, this.TOKEN);
        this.customerService = this.fastBill.getCustomerService();
    }

    @Test
    public void testCreateCustomerWithErrors() {

        final CreateCustomer customer = new CreateCustomer();
        customer.setFirstName("Vorname");
        customer.setLastName("Nachname");

        try {
            final CreatedCustomer created = this.customerService.create(customer);
            Assert.fail("FastbillErrorResponse expected");
        } catch (final FastbillErrorResponse e) {
            Assert.assertEquals(1, e.getErrorMessages().size());
            Assert.assertTrue(e.getErrorMessages().get(0).contains("missing / invalid field: CUSTOMER_TYPE"));
        }
    }

    @Test
    public void testCreateDeleteCustomer() throws Exception {

        final CreateCustomer customer = new CreateCustomer();
        customer.setFirstName("Vorname");
        customer.setLastName("Nachname");
        customer.setCustomerType(CustomerType.CONSUMER);

        final CreatedCustomer created = this.customerService.create(customer);
        Assert.assertNotNull(created);
        Assert.assertNotNull(created.getCustomerId());
        Assert.assertNotNull(created.getHash());

        this.customerService.delete(created.getCustomerId());
    }

    @Test
    public void testCreateUpdateFindDeleteCustomer() throws Exception {

        final CreateCustomer customer = new CreateCustomer();
        customer.setFirstName("Vorname");
        customer.setLastName("Lastname");
        customer.setCustomerType(CustomerType.CONSUMER);

        final CreatedCustomer created = this.customerService.create(customer);
        Assert.assertNotNull(created);

        final UpdateCustomer customer1 = new UpdateCustomer();
        customer1.setCustomerId(created.getCustomerId());
        customer1.setFirstName("NeuerName");
        final UpdatedCustomer update = this.customerService.update(customer1);

        final Customer findOne = this.customerService.getOne(update.getCustomerId());
        Assert.assertEquals("NeuerName", findOne.getFirstName());

        this.customerService.delete(created.getCustomerId());
    }

    @Test
    public void testNoCustomerFoundById() throws Exception {

        final Customer customer = this.customerService.getOne(1L);
        Assert.assertNull(customer);
    }

    @Test
    public void testCreateReadDeleteCustomer() throws Exception {

        final CreateCustomer customer = new CreateCustomer();
        customer.setCustomerExtUid(UUID.randomUUID().toString());
        customer.setCustomerNumber("numer");

        customer.setSalutation(Salutation.MR);

        customer.setTitleAcademic("title");

        customer.setFirstName("Vorname");
        customer.setLastName("Nachname");
        customer.setOrganization("organisation");
        customer.setEmail("asdf");
        customer.setMobile("mobile");
        customer.setPhone("phone");

        customer.setAddress("Am Platzl");
        customer.setCity("City");
        customer.setZipcode("zip");
        customer.setCountryCode("AT");

        customer.setComment("comment");

        customer.setAccountReceivable("asdf");

        customer.setBankBic("BKAUATWW");
        customer.setBankIban("AT13 1490 0220 1001 0999");
        customer.setBankAccountOwner("Bank owner");
        customer.setBankName("Bankname");
        customer.setPaymentType(PaymentType.CREDIT);

        customer.setVatId("vatId");

        customer.setCustomerType(CustomerType.BUSINESS);

        final CreatedCustomer created = this.customerService.create(customer);
        Assert.assertNotNull(created);
        Assert.assertNotNull(created.getCustomerId());

        final Customer customer2 = this.customerService.getOne(created.getCustomerId());
        Assert.assertEquals(customer2.getFirstName(), "Vorname");
        Assert.assertEquals(customer2.getLastName(), "Nachname");
        Assert.assertEquals(customer2.getAddress(), "Am Platzl");
        //Assert.assertEquals(customer2.getAccountReceivable(), "asdf");

        Assert.assertEquals(customer2.getBankBic(), "BKAUATWW");
        Assert.assertEquals(customer2.getBankIban(), "AT131490022010010999");
        Assert.assertNotNull(customer2.getBankAccountMandateReference());
        Assert.assertNotNull(customer2.getBankAccountMandateReferenceDate());

        Assert.assertEquals(customer2.getCity(), "City");
        Assert.assertEquals(customer2.getComment(), "comment");
        Assert.assertEquals(customer2.getCountryCode(), "AT");
        //Assert.assertEquals(customer2.getCurrencyCode(), "sdf");
        Assert.assertNotNull(customer2.getCustomerExtUid());
        Assert.assertEquals(customer2.getCustomerNumber(), "numer");
        Assert.assertEquals(customer2.getEmail(), "asdf");

        Assert.assertEquals(customer2.getInvoiceDeliveryMethod(), "mail");
        Assert.assertEquals(customer2.getLanguageCode(), "de");
        //Assert.assertEquals(customer2.getMobile(), "mobile");
        Assert.assertEquals(customer2.getOrganization(), "organisation");
        Assert.assertEquals(customer2.getPaymentType(), PaymentType.CREDIT);
        Assert.assertEquals(customer2.getPhone(), "phone");
        Assert.assertEquals(customer2.getSalutation(), Salutation.MR);
        Assert.assertEquals(customer2.getTitleAcademic(), "title");
        Assert.assertEquals(customer2.getVatId(), "vatId");
        Assert.assertEquals(customer2.getZipcode(), "zip");

        this.customerService.delete(created.getCustomerId());
    }
}
