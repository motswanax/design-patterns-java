package com.svs.structural.adapterObjectCompositionExample;

class Client {

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }

    public static void main(String[] args) {
        MallarDuck duck = new MallarDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The turkey says... ");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe duck says... ");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says... ");
        testDuck(turkeyAdapter);
    }
}
