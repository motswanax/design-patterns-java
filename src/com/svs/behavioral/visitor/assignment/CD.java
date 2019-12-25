package com.svs.behavioral.visitor.assignment;

class CD implements Visitable{
    private double price;
    private double weight;

    CD(double price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    double getPrice() {
        return price;
    }

    double getWeight() {
        return weight;
    }
}
