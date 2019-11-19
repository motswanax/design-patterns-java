package com.svs.creational.singleton.billPughSingletonExample;

class Singleton {

    // an instance attribute
    private int data = 0;

    /**
     * The Singleton constructor
     * Note that it is private!
     * No client can instantiate a Singletono object!
     */
    private Singleton() {}

    private static class SingletonHelper {
        // Nested class is referenced after getInstance() is called
        private static final Singleton uniqueInstance = new Singleton();
    }

    static Singleton getInstance() {
        return SingletonHelper.uniqueInstance;
    }

    // add a set data here

    int getData() {
        return data;
    }

    void setData(int data) {
        this.data = data;
    }
}
