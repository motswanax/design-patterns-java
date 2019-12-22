package com.svs.behavioral.state.example;

class Off extends RemoteController {
    @Override
    void pressSwitch(TV context) {
        System.out.println("I am already Off. Going to be On now.");
        context.setState(new On());
    }
}
