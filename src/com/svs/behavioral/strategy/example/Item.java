package com.svs.behavioral.strategy.example;

class Item {
    private String upcCode;
    private int price;

    Item(String upcCode, int price) {
        this.upcCode = upcCode;
        this.price = price;
    }

    String getUpcCode() {
        return upcCode;
    }

    int getPrice() {
        return price;
    }
}
