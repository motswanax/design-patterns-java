package com.svs.behavioral.visitor.assignment;

import java.util.ArrayList;
import java.util.List;

public class Client {
    // normal shopping cart stuff
    private static List<Visitable> items = new ArrayList<>();

    private static double calculatePostage(Visitor visitor) {
        // iterate through all items
        for (Visitable item: items) {
            item.accept(visitor);
        }

        return visitor.getTotalPostage();
    }

    public static void main(String[] args) {
        // create a bunch of visitors (Book, CD, and DVD)
        Visitable myBook = new Book(8.52, 1.05);
        Visitable myCd = new CD(18.52, 3.05);
        Visitable myDVD = new DVD(6.53, 4.02);

        // add each visitor to the array list
        items.add(myBook);
        items.add(myCd);
        items.add(myDVD);

        Visitor visitor = new USPostageVisitor();
        double myPostage = calculatePostage(visitor);
        System.out.println("The total postage for my US items is " + myPostage);

        visitor = new SouthAmericaPostageVisitor();
        myPostage = calculatePostage(visitor);
        System.out.println("The total postage for my South American items is " + myPostage);
    }
}
