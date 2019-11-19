package com.svs.creational.builderExample;

class Director {
    BuilderInterface myBuilder;

    void construct(BuilderInterface builder) {
        myBuilder = builder;
        myBuilder.buildBody();
        myBuilder.insertWheels();
        myBuilder.addHeadlights();
    }
}
