package com.svs.structural.adapterAssignment;

class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String audioType, String filename) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing " + audioType + " file. Name: " + filename);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported.");
        }
    }
}
