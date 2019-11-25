package com.svs.structural.adapterObjectCompositionExample;

class MallarDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I am flying.");
    }
}
