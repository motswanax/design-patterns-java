package com.svs.structural.facadeAssignment;

interface Hotel {
    Menus getMenus();
}

class NonVegRestaurant implements Hotel
{
    public Menus getMenus()
    {
        return new NonVegMenu();
    }
}

class VegRestaurant implements Hotel
{
    public Menus getMenus()
    {
        return new VegMenu();
    }
}

class VegNonBothRestaurant implements Hotel
{
    public Menus getMenus()
    {
        return new Both();
    }
}



