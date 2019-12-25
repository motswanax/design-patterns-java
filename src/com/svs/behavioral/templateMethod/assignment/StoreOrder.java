package com.svs.behavioral.templateMethod.assignment;

class StoreOrder extends OrderProcessTemplate {
    @Override
    public void doSelect() {
        System.out.println("Customer chooses the item from shelf");
    }

    @Override
    void doPayment() {
        System.out.println("Pays at the counter through cash/POS");
    }

    @Override
    void doDelivery() {
        System.out.println("Item delivered to in-delivery counter.");
    }
}
