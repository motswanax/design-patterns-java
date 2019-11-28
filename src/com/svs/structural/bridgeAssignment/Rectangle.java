package com.svs.structural.bridgeAssignment;

class Rectangle extends Shape{
    Rectangle(IColor color) {
        super(color);
    }

    @Override
    void drawShape(int border) {
        System.out.println("This Rectangle is colored with ");
        color.fillWithColor(border);
    }

    @Override
    void modifyBorder(int border, int increment) {
        System.out.println("\nChanging the border length  " + increment + " times");
        border = border * increment;
        drawShape(border);
    }
}
