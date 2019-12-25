package com.svs.behavioral.templateMethod.assignment;

abstract class OrderProcessTemplate {
    boolean isGift;

    abstract void doSelect();
    abstract void doPayment();

    final void giftWrap() {
        System.out.println("Gift wrap was successful.");
    }

    abstract void doDelivery();

    // the actual template method
    final void processOrder(boolean isGift) {
        doSelect();
        doPayment();
        if (isGift) giftWrap();
        doDelivery();
    }
}
