package com.svs.creational.singleton.singletonAssignment;

public class CricketCaptain {
    private String data = null;

    public CricketCaptain() {
    }

    // Bill Pugh approach
    private static class CaptainHelper {
        private static final CricketCaptain uniqueCaptain = new CricketCaptain();
    }

    static CricketCaptain getInstance() {
        return CaptainHelper.uniqueCaptain;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
