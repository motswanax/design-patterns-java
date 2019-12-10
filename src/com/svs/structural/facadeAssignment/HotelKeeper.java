package com.svs.structural.facadeAssignment;

/**
 * Facade for hotel menus
 *
 * @author baike
 */
class HotelKeeper {
    VegMenu getVegMenu() {
        VegRestaurant vegRestaurant = new VegRestaurant();
        return (VegMenu) vegRestaurant.getMenus();
    }

    NonVegMenu getNonVegMenu() {
        NonVegRestaurant nonVegRestaurant = new NonVegRestaurant();
        return (NonVegMenu) nonVegRestaurant.getMenus();
    }

    Both getVegNonMenu() {
        VegNonBothRestaurant vegNonBothRestaurant= new VegNonBothRestaurant();
        return (Both) vegNonBothRestaurant.getMenus();
    }
}
