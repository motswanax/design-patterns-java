package com.svs.behavioral.state.example;

/**
 * This is the context class. Defines an interface of interest to the clients
 *
 * @author baike
 */
class TV {
    private RemoteController state;

    TV(RemoteController state) {
        this.state = state;
    }

    RemoteController getState() {
        return state;
    }

    void setState(RemoteController state) {
        this.state = state;
    }

    /**
     * This will polymorphically call the right object - On or Off.
     */
    void pressButton() {
        state.pressSwitch(this);
    }
}
