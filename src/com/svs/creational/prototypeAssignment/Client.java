package com.svs.creational.prototypeAssignment;

public class Client {
    public static void main(String[] args) {
        BasicCarCache.loadCache();

        BasicCar clonedCar = BasicCarCache.getCar("1");
        System.out.println("Car is " + clonedCar.getModel() + " and price is " + clonedCar.getPrice());

        BasicCar clonedCar2 = BasicCarCache.getCar("2");
        System.out.println("Car is " + clonedCar2.getModel() + " and price is " + clonedCar2.getPrice());
    }
}
