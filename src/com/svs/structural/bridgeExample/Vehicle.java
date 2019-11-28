package com.svs.structural.bridgeExample;

abstract class Vehicle {
    Workshop workshop1;
    Workshop workshop2;

    Vehicle(Workshop workshop1, Workshop workshop2) {
        this.workshop1 = workshop1;
        this.workshop2 = workshop2;
    }

    abstract void manufacture();
}
