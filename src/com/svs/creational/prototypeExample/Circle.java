package com.svs.creational.prototypeExample;

public class Circle extends Shape {

    Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method");
    }
}
