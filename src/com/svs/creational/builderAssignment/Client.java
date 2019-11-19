package com.svs.creational.builderAssignment;

public class Client {
    public static void main(String[] args) {
        System.out.println("***Meal Pattern Demo***");

        Director director = new Director();

        MealBuilder vegMealBuilder = new VegMealBuilder();
        MealBuilder nonVegMealBuilder = new NonVegMealBuilder();

        // making veg meal
        director.construct(vegMealBuilder);
        Meal vegMeal = vegMealBuilder.getMeal();

        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + String.format("%.2f", vegMeal.getCost()));

        // making non veg meal
        director.construct(nonVegMealBuilder);
        Meal nonVegMeal = nonVegMealBuilder.getMeal();

        System.out.println("\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + String.format("%.2f", nonVegMeal.getCost()));
    }
}
