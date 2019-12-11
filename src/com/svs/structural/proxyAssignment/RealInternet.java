package com.svs.structural.proxyAssignment;

/**
 * Does the real work
 *
 * @author baike
 */
public class RealInternet implements Internet {
    @Override
    public void connectTo(String serverhost) throws Exception {
        System.out.println("Connecting to " + serverhost);
    }
}
