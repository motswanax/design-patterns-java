package com.svs.structural.flyweightAssignment;

import java.util.Random;

public class CounterStrike {
    // All player types and weapons (used by getRandPlayerType()
    // and getRandWeapon()
    // Utility methods to get a random player type and weapon
    private static String getRandomPlayerType() {
        Random r = new Random();

        // will return an integer between [0, 2)
        int randInt = r.nextInt(playerType.length);

        // return the player stored at index 'randInt'
        return playerType[randInt];
    }

    private static String getRandWeapon() {
        Random r = new Random();

        int randInt = r.nextInt(weapons.length);

        return weapons[randInt];
    }

    private static String[] playerType = {"Terrorist", "CounterTerrorist"};

    private static String[] weapons = {"AK-47", "Maverick", "Gut Knife", "Desert Eagle"};

    public static void main(String[] args) {
        /* Assume that we have 10 players in the game */
        for (int i = 0; i < 10; i++) {
            // getPlayer() is called simply using the class name since the method is a static one
            Player p = PlayerFactory.getPlayer(getRandomPlayerType());

            // Assign a weapon chosen randomly uniformly from the weapon array
            p.assignWeapon(getRandWeapon());

            // send this player on a mission
            p.mission();
        }
    }
}
