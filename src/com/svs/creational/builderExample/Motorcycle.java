package com.svs.creational.builderExample;

public class Motorcycle implements BuilderInterface{

    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("This is a body of a motorcycle");
    }

    @Override
    public void insertWheels() {
        product.add("2 wheels are added");
    }

    @Override
    public void addHeadlights() {
        product.add("1 headlight added");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
