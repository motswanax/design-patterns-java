package com.svs.structural.bridgeAssignment;

class Triangle extends Shape {
    Triangle(IColor color) {
        super(color);
    }

    // Implementer specific method
    @Override
    void drawShape(int border) {
        System.out.println("This Triangle is colored with ");
        color.fillWithColor(border);
    }

    // Abstraction specific method
    @Override
    void modifyBorder(int border, int increment) {
        System.out.println("\nChanging the border length  " + increment + " times");
        border = border * increment;
        drawShape(border);
    }
}
