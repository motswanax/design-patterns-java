package com.svs.structural.flyweightAssignment;

class CounterTerrorist implements Player {

    // intrinsic attribute
    private final String TASK;

    // extrinsic attribute
    private String weapon;

    CounterTerrorist() {
        TASK = "Diffuse a bomb";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("Counter terrorist with weapon " + weapon + ". Task is " + TASK);
    }
}
