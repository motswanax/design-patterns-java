package com.svs.creational.prototypeAssignment;

class Nano extends BasicCar {
    Nano() {
        model = "Nano";
    }

    @Override
    void build() {
        System.out.println("Car is " + getModel() + " and its price is " + getPrice());
    }
}
