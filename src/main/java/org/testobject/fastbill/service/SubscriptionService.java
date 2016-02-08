package org.testobject.fastbill.service;

import java.util.List;

import org.testobject.fastbill.domain.CancelSubscription;
import org.testobject.fastbill.domain.CancelledSubscription;
import org.testobject.fastbill.domain.CreateSubscription;
import org.testobject.fastbill.domain.CreatedSubscription;
import org.testobject.fastbill.domain.Subscription;
import org.testobject.fastbill.domain.SubscriptionFilter;
import org.testobject.fastbill.service.ServiceBuilder.Factory;

public class SubscriptionService {

    private final Factory factory;

    public SubscriptionService(final ServiceBuilder.Factory factory) {
        this.factory = factory;
    }

    public List<Subscription> get(final SubscriptionFilter filter) throws FastbillErrorResponse {
        return this.factory.create("subscription.get").withFilter(filter).execute(SubscriptionsWrapper.class)
                .getSubscriptions();
    }

    public CreatedSubscription create(final CreateSubscription subscription) throws FastbillErrorResponse {
        return this.factory.create("subscription.create").withData(subscription).execute(CreatedSubscription.class);
    }

    public CancelledSubscription cancel(final CancelSubscription subscription) throws FastbillErrorResponse {
        return this.factory.create("subscription.cancel").withData(subscription).execute(CancelledSubscription.class);
    }

    // TODO implement: subscription.update, subscription.changearticle, subscription.setaddon
    // TODO implement: subscription.setusagedata, subscription.getusagedata, subscription.deleteusagedata
    // TODO implement: subscription.reactivate, subscription.getupcomingamount, subscription.postpone
    // TODO implement: subscription.renew, subscription.createsecurelink

    public static final class SubscriptionsWrapper {
        private List<Subscription> subscriptions;

        public SubscriptionsWrapper() {
        }

        public List<Subscription> getSubscriptions() {
            return this.subscriptions;
        }

        public void setCustomers(final List<Subscription> subscriptions) {
            this.subscriptions = subscriptions;
        }

    }

}
