package com.svs.behavioral.state.example;

/**
 * This is a concrete state for On.
 *
 * @author baike
 */
class On extends RemoteController {
    @Override
    void pressSwitch(TV context) {
        System.out.println("I am already On. Going to be OFF now.");
        context.setState(new Off());
    }
}
