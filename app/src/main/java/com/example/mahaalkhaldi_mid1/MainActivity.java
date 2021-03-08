package com.example.mahaalkhaldi_mid1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends Activity {
    MediaPlayer playing ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        MediaPlayer Song = new MediaPlayer();
        Song = MediaPlayer.create(this, R.raw.azan); Song.start();
        Song.pause();
        Song.stop();
        Song.isPlaying();

switch (playing){
    case 0 :
        song.start();
        playing= 1;
        break;
    case 1 :
        song.pause();
        playing= 0;
        break;

}


}