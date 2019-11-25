package com.svs.structural.adapterObjectComposition2;

public class Client {
    public static void main(String[] args) {
        System.out.println("***Adapter Pattern Demo***");

        Triangle t = new Triangle(20, 10);

        CalculatorInterface calculatorAdaper = new CalculatorAdapter(t);

        System.out.println("Area of Triangle is: " + calculatorAdaper.getArea(null));
    }
}
