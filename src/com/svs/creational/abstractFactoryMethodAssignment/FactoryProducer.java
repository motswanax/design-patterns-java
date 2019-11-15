package com.svs.creational.abstractFactoryMethodAssignment;

class FactoryProducer {
    static IMovieFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("COMEDY")) {
            return new ComedyMovieFactory();
        } else if (choice.equalsIgnoreCase("ACTION")) {
            return new ActionMovieFactory();
        }

        return null;
    }
}
