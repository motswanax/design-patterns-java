package com.svs.structural.adapterAssignment;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        MediaPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "badass.mp3");

        AdvancedMediaPlayer mp4Player = new Mp4Player();
        MediaPlayer advancedMediaPlayerAdapter1 = new AdvancedMediaPlayerAdapter(mp4Player);
        advancedMediaPlayerAdapter1.play("mp4", "makaveli.mp4");

        AdvancedMediaPlayer vlcPlayer = new VlcPlayer();
        MediaPlayer advancedMediaPlayerAdapter2 = new AdvancedMediaPlayerAdapter(vlcPlayer);
        advancedMediaPlayerAdapter2.play("vlc", "unconditional love.vlc");

        audioPlayer.play("vlc", "thugz mansion.vlc");
    }
}
