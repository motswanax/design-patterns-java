package com.svs.creational.prototypeAssignment;

abstract class BasicCar implements Cloneable {

    private String id;

    String model;
    private double price = 19000;

    abstract void build();

    String getModel() {
        return model;
    }

    void setModel(String model) {
        this.model = model;
    }

    double getPrice() {
        return price;
    }

    void setPrice(double price) {
        this.price = price;
    }

    String getId() {
        return id;
    }

    void setId(String id) {
        this.id = id;
    }

    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}
