package com.svs.creational.singleton.synchronizedApproach;

public class TestSingleton {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();

        // set the data value
        s.setData(33);

        System.out.println("First reference: " + s);
        System.out.println("Singleton data value is: " + s.getData());

        // get another reference to the singleton
        // is is the same object
        s = null;
        s = Singleton.getInstance();

        System.out.println("\nSecone reference: " + s);
        System.out.println("Singleton data value is: " + s.getData());

    }
}
