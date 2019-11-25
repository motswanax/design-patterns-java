package com.svs.structural.adapterAssignment;

class VlcPlayer implements AdvancedMediaPlayer {
    private String myFile;

    @Override
    public void loadFilename(String filename) {
        myFile = filename;
    }

    @Override
    public void listen() {
        System.out.println("Playing vlc file. Name: " + myFile);
    }
}
