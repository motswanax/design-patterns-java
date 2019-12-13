package com.svs.behavioral.commandPattern.assignment;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the invoker
 *
 * @author baike
 */
class Broker {
    private List<Order> orderList = new ArrayList<>();

    void takeOrder(Order order) {
        orderList.add(order);
    }

    void placeOrders() {
        for (Order order: orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
