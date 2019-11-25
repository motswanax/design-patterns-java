package com.svs.creational.prototypeAssignment;

class Ford extends BasicCar {

    Ford() {
        model = "Ford";
    }

    @Override
    void build() {
        System.out.println("Car is " + getModel() + " and its price is " + getPrice());
    }
}
