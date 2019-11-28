package com.svs.structural.bridgeAssignment;

public class Client {
    public static void main(String[] args) {
        System.out.println("***Bridge Pattern***");

        // Coloring Triangle green0
        System.out.println("\nColoring Triangle");
        IColor green = new GreenColor();
        Shape triangle = new Triangle(green);
        triangle.drawShape(20);
        triangle.modifyBorder(20, 3);

        // Coloring Rectangle red
        System.out.println("\nColoring Rectangle");
        IColor red = new RedColor();
        Shape rectangle = new Rectangle(red);
        rectangle.drawShape(250);
        rectangle.modifyBorder(40, 5);
    }
}
