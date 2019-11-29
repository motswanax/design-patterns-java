package com.svs.structural.decoratorExample;

public class Client {
    public static void main(String[] args) {
        System.out.println("***Decorator Pattern Demo***");
        ConcreteComponent concreteComponent = new ConcreteComponent();

        ConcreteDecoratorA cd1 = new ConcreteDecoratorA();

        // Decorating ConcreteComponent object with ConcreteDecoratorA
        cd1.setComponent(concreteComponent);
        cd1.doJob();

        ConcreteDecoratorB cd2 = new ConcreteDecoratorB();

        // Decorating ConcreteComponent object with ConcreteDecoratorA & ConcreteDecoratorB
        cd2.setComponent(cd1); // adding results from cd1
        cd2.doJob();
    }
}
