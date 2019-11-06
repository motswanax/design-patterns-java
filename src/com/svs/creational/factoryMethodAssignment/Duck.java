package com.svs.creational.factoryMethodAssignment;

public class Duck implements Animal {
    @Override
    public void walk() {
        System.out.println("Inside Duck walk() method.");
    }

    @Override
    public void eat() {
        System.out.println("Inside Duck eat() method.");
    }
}
