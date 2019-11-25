package com.svs.creational.prototypeAssignment;

import java.util.Hashtable;

class BasicCarCache {
    private static Hashtable<String, BasicCar> carMap = new Hashtable<>();

    static BasicCar getCar(String carId) {
        BasicCar cachedCar = carMap.get(carId);

        return (BasicCar) cachedCar.clone();
    }

    static void loadCache() {
        Nano nano = new Nano();
        nano.setId("1");
        carMap.put(nano.getId(), nano);

        Ford ford = new Ford();
        ford.setId("2");
        carMap.put(ford.getId(), ford);
    }
}

