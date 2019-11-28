package com.svs.structural.bridgeAssignment;

class GreenColor implements IColor {
    @Override
    public void fillWithColor(int border) {
        System.out.println("Green color with " + border + "mm border");
    }
}
