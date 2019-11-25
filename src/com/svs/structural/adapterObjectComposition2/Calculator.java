package com.svs.structural.adapterObjectComposition2;

class Calculator implements CalculatorInterface {
    private Rectangle rectangle;

    @Override
    public double getArea(Rectangle rectangle) {
        this.rectangle = rectangle;
        return rectangle.length * rectangle.width;
    }
}
