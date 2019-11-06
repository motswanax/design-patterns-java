package com.svs.creational.factoryMethodAssignment;

public class Tiger implements Animal {
    @Override
    public void walk() {
        System.out.println("Inside Tiger walk() method.");
    }

    @Override
    public void eat() {
        System.out.println("Inside Tiger eat() method.");
    }
}
