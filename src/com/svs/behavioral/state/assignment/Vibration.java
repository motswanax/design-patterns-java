package com.svs.behavioral.state.assignment;

class Vibration implements MobileAlertState {
    @Override
    public void alert() {
        System.out.println("Vibration activated.");
    }
}
