package com.svs.behavioral.visitor.example;

class Fruit implements ItemElement {
    private int pricePerKg;
    private int weight;
    private String name;

    Fruit(int pricePerKg, int weight, String name) {
        this.pricePerKg = pricePerKg;
        this.weight = weight;
        this.name = name;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }

    int getPricePerKg() {
        return pricePerKg;
    }

    int getWeight() {
        return weight;
    }

    String getName() {
        return name;
    }
}
