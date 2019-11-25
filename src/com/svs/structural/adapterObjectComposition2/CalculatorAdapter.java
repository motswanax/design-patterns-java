package com.svs.structural.adapterObjectComposition2;

class CalculatorAdapter implements CalculatorInterface {
    private Calculator calculator;
    private Triangle triangle;

    CalculatorAdapter(Triangle triangle) {
        this.triangle = triangle;
    }

    @Override
    public double getArea(Rectangle rectangle) {
        calculator = new Calculator();

        Rectangle r = new Rectangle();

        r.length = triangle.base;
        r.width = 0.5 * triangle.height;
        return calculator.getArea(r);
    }
}
