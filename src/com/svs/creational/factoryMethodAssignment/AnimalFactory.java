package com.svs.creational.factoryMethodAssignment;

public class AnimalFactory {
    Animal getAnimalType(String animalType) {
        if (animalType.equalsIgnoreCase("TIGER")) {
            return new Tiger();
        } else if (animalType.equalsIgnoreCase("DUCK")) {
            return new Duck();
        }

        return null;
    }
}
