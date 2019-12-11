package com.svs.structural.proxyAssignment;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the proxy
 *
 * @author baike
 */
class ProxyInternet implements Internet {

    private Internet internet = new RealInternet();

    private static List<String> bannedSites;

    static {
        bannedSites = new ArrayList<>();
        bannedSites.add("whatever.com");
        bannedSites.add("nope.com");
        bannedSites.add("yup.com");
        bannedSites.add("hello.com");
    }

    @Override
    public void connectTo(String serverhost) throws Exception {
        if (bannedSites.contains(serverhost.toLowerCase())) {
            throw new Exception("Access Denied");
        }

        internet.connectTo(serverhost);
    }
}
