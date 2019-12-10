package com.svs.structural.facadeAssignment;

public class Client {
    public static void main(String[] args) {
        HotelKeeper keeper = new HotelKeeper();

        VegMenu vegMenu = keeper.getVegMenu();
        NonVegMenu nonVegMenu = keeper.getNonVegMenu();
        Both both = keeper.getVegNonMenu();
    }
}
