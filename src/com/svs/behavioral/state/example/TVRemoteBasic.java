package com.svs.behavioral.state.example;

/**
 * Demo of implementation without state pattern
 *
 * @author baike
 */
class TVRemoteBasic {
    private String state;

    void setState(String state) {
        this.state = state;
    }

    private void doAction() {
        if (state.equalsIgnoreCase("On")) {
            System.out.println("TV is turned On");
        } else if (state.equalsIgnoreCase("OFF")) {
            System.out.println("TV is turned OFF");
        }
    }

    public static void main(String[] args) {
        TVRemoteBasic remoteBasic = new TVRemoteBasic();

        remoteBasic.setState("On");
        remoteBasic.doAction();

        remoteBasic.setState("OFF");
        remoteBasic.doAction();
    }
}
