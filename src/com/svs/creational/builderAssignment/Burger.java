package com.svs.creational.builderAssignment;

abstract class Burger implements Item {
    @Override
    public abstract String getItemName();

    @Override
    public abstract float getItemPrice();

    @Override
    public Packing getPackingObject() {
        return new Wrapper();
    }
}
