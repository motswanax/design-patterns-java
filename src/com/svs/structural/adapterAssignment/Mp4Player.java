package com.svs.structural.adapterAssignment;

class Mp4Player implements AdvancedMediaPlayer {
    private String myFile;

    @Override
    public void loadFilename(String filename) {
        myFile = filename;
    }

    @Override
    public void listen() {
        System.out.println("Playing mp4 file. Name: " + myFile);
    }
}
