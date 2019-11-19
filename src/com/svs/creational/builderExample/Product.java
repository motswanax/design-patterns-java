package com.svs.creational.builderExample;

import java.util.LinkedList;

class Product {

    private LinkedList<String> parts;

    Product() {
        parts = new LinkedList<>();
    }

    void add(String part) {
        parts.addLast(part);
    }

    void show() {
        System.out.println("\nProduct completed as below");

        for (String part : parts) {
            System.out.println(part);
        }
    }
}
