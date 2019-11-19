package com.svs.creational.builderAssignment;

class Director {
    private MealBuilder myBuilder;

    void construct(MealBuilder builder) {
        myBuilder = builder;
        myBuilder.buildBurger();
        myBuilder.buildDrink();
    }
}
