package com.svs.structural.bridgeAssignment;

class RedColor implements IColor {
    @Override
    public void fillWithColor(int border) {
        System.out.println("Red color with " + border + "mm border");
    }
}
