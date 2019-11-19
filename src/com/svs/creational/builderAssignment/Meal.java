package com.svs.creational.builderAssignment;

import java.util.ArrayList;
import java.util.List;

class Meal {
    private List<Item> items;

    Meal() {
        items = new ArrayList<>();
    }

    void add(Item item) {
        items.add(item);
    }

    float getCost() {
        float cost = 0.0f;

        for (Item item : items) {
            cost += item.getItemPrice();
        }

        return cost;
    }

    void showItems() {
        for (Item item : items) {
            System.out.print("Item: " + item.getItemName());
            System.out.print(", Packing: " + item.getPackingObject().pack());
            System.out.print(", Price: " + String.format("%.2f", item.getItemPrice()) + "\n");
        }
    }
}
