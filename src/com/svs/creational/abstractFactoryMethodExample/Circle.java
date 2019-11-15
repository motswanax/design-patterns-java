package com.svs.creational.abstractFactoryMethodExample;

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle:;draw() method.");
    }
}