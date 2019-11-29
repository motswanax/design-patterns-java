package com.svs.structural.decoratorExample;

/**
 * This is class to add additional funtionality to.
 * It will not be modified.
 * @author baike
 */
class ConcreteComponent extends Component {
    @Override
    void doJob() {
        System.out.println("I am from a Concrete Component - I am closed for modification.");
    }
}
