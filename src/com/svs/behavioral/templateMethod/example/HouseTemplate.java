package com.svs.behavioral.templateMethod.example;

abstract class HouseTemplate {
    // template method, final so subclasses cannot override it.
    final void buildHouse() {
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWIndows();
        System.out.println("House has been built");
    }

    // default implementation, hook method
    private void buildWIndows() {
        System.out.println("Building glass windows");
    }

    // methods to be implemented by subclasses
    abstract void buildWalls();
    abstract void buildPillars();

    private void buildFoundation() {
        System.out.println("Building foundation with cement, iron rods and sand");
    }
}
