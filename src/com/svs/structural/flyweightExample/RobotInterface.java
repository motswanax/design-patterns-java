package com.svs.structural.flyweightExample;

interface RobotInterface {
    void print();

    //extrinsic data is passed as arguments
    void setColor(String colorOfRobot);
}
