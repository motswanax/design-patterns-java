package com.svs.structural.decoratorExample;

/**
 * First concrete decorator
 * @author baike
 */
class ConcreteDecoratorA extends AbstractDecorator {
    void doJob() {
        super.doJob();

        // add additional responsibilities
        System.out.println("New functionality from Decorator A added to Component");
    }
}
