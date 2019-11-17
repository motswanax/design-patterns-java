package com.svs.creational.singleton.doubleCheckedLockingExample;

/**
 * This double-checked approach does not work in Java 1.4 and earlier.
 */
class Singleton {
    // the private reference to the one and only instance
    private volatile static Singleton uniqueInstance = null;

    // an instance attribute
    private int data = 0;

    /**
     * The Singleton constructor
     * Note that it is private!
     * No client can instantiate a Singletono object!
     */
    private Singleton() {}

    static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) { // we only synchronize the first time through
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
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
