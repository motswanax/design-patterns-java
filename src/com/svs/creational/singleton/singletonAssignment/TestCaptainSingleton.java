package com.svs.creational.singleton.singletonAssignment;

public class TestCaptainSingleton {
    public static void main(String[] args) {
        CricketCaptain captain = CricketCaptain.getInstance();

        captain.setData("Motswanax");

        System.out.println("Making a captain for the team.");
        System.out.println("Captain is: " + captain.getData());

        System.out.println("Making another captain");

        CricketCaptain captain1 = CricketCaptain.getInstance();

        if (captain == captain1) {
            System.out.println("Captain and captain1 are the same instance");
        }
    }
}
