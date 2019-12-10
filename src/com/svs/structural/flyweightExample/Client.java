package com.svs.structural.flyweightExample;

import java.util.Random;

public class Client {

    private static String getRandomColor() {
        Random r = new Random();
        /*
        If odd use red, else green
         */
        int random = r.nextInt(20);
        return ((random % 2) == 0) ? "red" : "green";
    }

    public static void main(String[] args) throws Exception {
        RobotFactory myFactory = new RobotFactory();
        System.out.println("\n***Flyweight Pattern Example***\n");

        Robot shape;

        /*
        We are trying to get 3 king type robots
         */
        for (int i = 0; i < 3; i++) {
            shape = (Robot) myFactory.getRobotFromFactory("King");
            shape.setColor(getRandomColor());
            shape.print();
        }

        /*
        Trying to set 3 queen type robots
         */
        for (int i = 0; i < 3; i++) {
            shape = (Robot) myFactory.getRobotFromFactory("Queen");
            shape.setColor(getRandomColor());
            shape.print();
        }

        int numOfDistinctRobots = myFactory.totalObjectsCreated();
        System.out.println("\nFinally no. of distinct robot objects created: " + numOfDistinctRobots);
    }
}
