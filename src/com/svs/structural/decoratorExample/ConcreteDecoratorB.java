package com.svs.structural.decoratorExample;

/**
 * Second concrete decorator
 * @author baike
 */
class ConcreteDecoratorB extends AbstractDecorator {
    @Override
    void doJob() {
        System.out.println("Added some shit prior");
        super.doJob();

        // add additional responsibilities
        System.out.println("New functionality from Decorator B added to Component");
        System.out.println("*** the end ***");
    }
}
