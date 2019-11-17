package com.svs.creational.singleton.synchronizedApproach;

class Singleton {
    // the private reference to the one and only instance
    private static Singleton uniqueInstance = null;

    // an instance attribute
    private int data = 0;

    /**
     * The Singleton constructor
     * Note that it is private!
     * No client can instantiate a Singletono object!
     */
    private Singleton() {}

    // by adding the synchronized keyword to getInstance(), we force every thread to wait its turn before it can
    // enter the method.
    static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }

        return uniqueInstance;
    }

    // add a set data here

    int getData() {
        return data;
    }

    void setData(int data) {
        this.data = data;
    }
}
