package com.svs.structural.decoratorAssignment;

abstract class ShapeDecorator implements Shape {
    Shape decoratedShape;

    ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
