package com.svs.creational.builderAssignment;

public class VegMealBuilder implements MealBuilder {

    private Meal vegMeal = new Meal();

    @Override
    public void buildBurger() {
        vegMeal.add(new VegBurger());
    }

    @Override
    public void buildDrink() {
        vegMeal.add(new Coke());
    }

    @Override
    public Meal getMeal() {
        return vegMeal;
    }
}
