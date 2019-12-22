package com.svs.behavioral.state.example;

public class Client {
    public static void main(String[] args) {
        System.out.println("***State Pattern Demo***");

        // Initially TV is off
        Off initialState = new Off();

        TV tv = new TV(initialState);

        // first time press
        tv.pressButton();
        // second time press
        tv.pressButton();
    }
}
