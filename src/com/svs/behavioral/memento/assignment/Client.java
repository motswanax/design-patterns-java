package com.svs.behavioral.memento.assignment;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        // set states
        originator.setState("State #1");
        originator.setState("State #2");
        caretaker.add(originator.saveStateToMemento());

        originator.setState("State #3");
        caretaker.add(originator.saveStateToMemento());

        originator.setState("State #4");
        System.out.println("Current state: " + originator.getState());

        // restore
        originator.getStateFromMemento(caretaker.get(0));
        System.out.println("First saved sate: " + originator.getState());

        originator.getStateFromMemento(caretaker.get(1));
        System.out.println("Second saved state: " + originator.getState());
    }
}
