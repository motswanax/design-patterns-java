package com.svs.structural.adapterAssignment;

class AdvancedMediaPlayerAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    AdvancedMediaPlayerAdapter(AdvancedMediaPlayer advancedMediaPlayer) {
        this.advancedMediaPlayer = advancedMediaPlayer;
    }

    @Override
    public void play(String audioType, String filename) {
        advancedMediaPlayer.loadFilename(filename);
        advancedMediaPlayer.listen();
    }
}
