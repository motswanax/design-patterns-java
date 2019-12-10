package com.svs.structural.flyweightExample;

class Robot implements RobotInterface {
    private String robotType;
    private String robotColor;

    Robot(String robotType) {
        this.robotType = robotType;
    }

    @Override
    public void setColor(String robotColor) {
        this.robotColor = robotColor;
    }

    @Override
    public void print() {
        System.out.println("This is a " + robotType + " type robot with " + robotColor + " colour");
    }
}
