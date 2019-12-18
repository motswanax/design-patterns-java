package com.svs.behavioral.iteratorPattern.assignment;

public class Client {

    private static void print(IteratorInterface iterator) {
        while (!iterator.isDone()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        System.out.println("***Iterator Pattern Demo***");
        Subject scienceSubject = new Science();
        Subject artsSubject = new Arts();

        IteratorInterface scienceIterator = scienceSubject.createIterator();
        IteratorInterface artsIterator = artsSubject.createIterator();

        System.out.println("\nScience subjects: ");
        print(scienceIterator);

        System.out.println("\nArts subjects: ");
        print(artsIterator);
    }
}
