package com.svs.structural.flyweightExample;

import java.util.HashMap;
import java.util.Map;

class RobotFactory {
    private Map<String, RobotInterface> shapes = new HashMap<>();

    int totalObjectsCreated() {
        return shapes.size();
    }

    RobotInterface getRobotFromFactory(String robotType) throws Exception {
        RobotInterface myRobot;

        if (shapes.containsKey(robotType)) {
            myRobot = shapes.get(robotType);
        } else {
            switch (robotType) {
                case "King":
                    System.out.println("\nWe do not have a King robot. So we are creating a King Robot");
                    myRobot = new Robot("King");
                    shapes.put("King", myRobot);
                    break;
                case "Queen":
                    System.out.println("\nWe do not have a Queen robot. So we are creating a Queen Robot");
                    myRobot = new Robot("Queen");
                    shapes.put("Queen", myRobot);
                    break;
                default:
                    throw new Exception("Robot Factory can only create King and Queen robots");
            }
        }

        return myRobot;
    }
}
