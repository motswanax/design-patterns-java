package com.svs.creational.builderAssignment;

public class VegBurger extends Burger {
    @Override
    public float getItemPrice() {
        return 21.0f;
    }

    @Override
    public String getItemName() {
        return "Veg Burger";
    }
}
