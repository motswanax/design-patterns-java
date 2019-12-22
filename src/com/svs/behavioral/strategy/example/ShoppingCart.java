package com.svs.behavioral.strategy.example;

import java.util.ArrayList;
import java.util.List;

class ShoppingCart {
    private List<Item> items;

    ShoppingCart() {
        this.items = new ArrayList<>();
    }

    void addItem(Item item) {
        items.add(item);
    }

    void removeItem(Item item) {
        items.remove(item);
    }

    private int calculateTotal() {
        int sum = 0;
        for (Item item: items) {
            sum += item.getPrice();
        }

        return sum;
    }

    void pay(PaymentStrategy paymentStrategy) {
        int amount = calculateTotal();
        paymentStrategy.pay(amount);
    }
}
