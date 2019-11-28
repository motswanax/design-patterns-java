package com.svs.structural.bridgeExample;

class Car extends Vehicle {
    Car(Workshop workshop1, Workshop workshop2) {
        super(workshop1, workshop2);
    }

    @Override
    void manufacture() {
        System.out.println("Car ");
        workshop1.work();
        workshop2.work();
    }
}
