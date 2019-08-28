package com.svs.liskovSubstitution;

abstract class Vehicle {
    abstract int getSpeed();

    abstract int getCubicCapacity();
}

class Car extends Vehicle {
    @Override
    int getSpeed() {
        return 0;
    }

    @Override
    int getCubicCapacity() {
        return 0;
    }

    boolean isHatchBack() {
        return false;
    }
}

class Bus extends Vehicle {
    @Override
    int getSpeed() {
        return 0;
    }

    @Override
    int getCubicCapacity() {
        return 0;
    }

    String getEmergencyExitLocation() {
        return null;
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Bus();
        vehicle.getSpeed();
        vehicle = new Car();
        vehicle.getCubicCapacity();
    }
}


