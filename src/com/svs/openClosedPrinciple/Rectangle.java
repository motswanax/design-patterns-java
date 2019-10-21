package com.svs.openClosedPrinciple;

interface Shape {
    double calculateArea();
}

public class Rectangle implements Shape {
    private double length;
    private double width;

    public double calculateArea() {
        return length * width;
    }
}

class Circle implements Shape {
    private double radius;

    @Override
    public double calculateArea() {
        return (22.0/7.0) * radius * radius;
    }
}

class AreaCalculator {
    public double calculateShapeArea(Shape shape) {
        return shape.calculateArea();
    }
}


