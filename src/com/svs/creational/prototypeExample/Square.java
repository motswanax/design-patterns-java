package com.svs.creational.prototypeExample;

class Square extends Shape {

    Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method");
    }
}
