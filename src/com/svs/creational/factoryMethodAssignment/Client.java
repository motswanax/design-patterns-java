package com.svs.creational.factoryMethodAssignment;

public class Client {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

        Animal animal1 = animalFactory.getAnimalType("TIGER");
        animal1.eat();
        animal1.walk();

        Animal animal2 = animalFactory.getAnimalType("DUCK");
        animal2.eat();
        animal2.walk();
    }
}
