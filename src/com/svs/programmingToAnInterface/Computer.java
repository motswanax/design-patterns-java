package com.svs.programmingToAnInterface;

interface DisplayModule {
    void display();
}

/*
Concrete classes
 */
class Monitor implements DisplayModule {
    @Override
    public void display() {
        System.out.println("Display through Monitor");
    }
}

class Projector implements DisplayModule {
    @Override
    public void display() {
        System.out.println("Display through Projector");
    }
}

/**
 * ClientClass
 */
public class Computer {
    private DisplayModule dm;

    private void setDisplayModule(DisplayModule dm) {
        this.dm = dm;
    }

    private void display() {
        dm.display();
    }

    public static void main(String[] args) {
        Computer cm = new Computer();
        DisplayModule dm = new Monitor();
        DisplayModule dm1 = new Projector();

        cm.setDisplayModule(dm);
        cm.display();
        cm.setDisplayModule(dm1);
        cm.display();
    }

}