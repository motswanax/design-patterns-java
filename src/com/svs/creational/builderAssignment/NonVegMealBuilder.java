package com.svs.creational.builderAssignment;

public class NonVegMealBuilder implements MealBuilder {
    private Meal nonVegMeal = new Meal();

    @Override
    public void buildBurger() {
        nonVegMeal.add(new ChickenBurger());
    }

    @Override
    public void buildDrink() {
        nonVegMeal.add(new Pepsi());
    }

    @Override
    public Meal getMeal() {
        return nonVegMeal;
    }
}
