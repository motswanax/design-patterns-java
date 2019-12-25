package com.svs.behavioral.visitor.example;

class Book implements ItemElement {
    private int price;
    private String isbnNumber;

    Book(int price, String isbnNumber) {
        this.price = price;
        this.isbnNumber = isbnNumber;
    }

    int getPrice() {
        return price;
    }

    String getIsbnNumber() {
        return isbnNumber;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
