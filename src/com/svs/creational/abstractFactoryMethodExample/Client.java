package com.svs.creational.abstractFactoryMethodExample;

public class Client {
    public static void main(String[] args) {
        // get decoratedShape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        //get an object of Shape Circle
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //call draw method of Shape Circle
        shape1.draw();

        //get an object of Shape Rectangle
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //call draw method of Shape Rectangle
        shape2.draw();

        //get an object of Shape Square
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //call draw method of Shape Square
        shape3.draw();

        // get color factory
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        // get an object of Color Red
        Color red = colorFactory.getColor("RED");

        red.fill();

        // get an object of Color Green
        Color green = colorFactory.getColor("GREEN");

        green.fill();

        // get an object of Color Blue
        Color blue = colorFactory.getColor("BLUE");

        blue.fill();

    }
}
