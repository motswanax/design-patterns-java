package com.svs.creational.prototypeExample;

class Rectangle extends Shape {

    Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method");
    }
}
