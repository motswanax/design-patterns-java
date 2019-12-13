package com.svs.behavioral.commandPattern.assignment;

/**
 * This is a receiver
 *
 * @author baike
 */
class Stock {
    private String name = "Google";
    private int quantity = 1000;

    void buy() {
        System.out.println("Stock name: " + name + ", Quantity: " + quantity + " bought.");
    }

    void sell() {
        System.out.println("Stock name: " + name + ", Quantity: " + quantity + " sold.");
    }
}
