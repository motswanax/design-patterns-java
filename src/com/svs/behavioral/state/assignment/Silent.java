package com.svs.behavioral.state.assignment;

class Silent implements MobileAlertState{
    @Override
    public void alert() {
        System.out.println("Silent mode activated");
    }
}
