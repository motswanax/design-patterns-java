package com.svs.interfaceSegregationPrinciple;

public interface ShapeInterface {
    double area();
}

interface SolidShapeInterface {
    double volume();
}

interface ManageShapeInterface {
    double calculate();
}

class Cube implements ShapeInterface, SolidShapeInterface, ManageShapeInterface {
    @Override
    public double area() {
        return 1.0;
    }

    @Override
    public double volume() {
        return 0;
    }

    @Override
    public double calculate() {
        return this.area() + this.volume();
    }
}

class Square implements ShapeInterface, ManageShapeInterface {
    @Override
    public double area() {
        return 2.0;
    }

    @Override
    public double calculate() {
        return this.area();
    }
}