package com.example.mahaalkhaldi_mid1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                finish();
                startActivity(new Intent(Splash.this,MainActivity.class));
            } };
        Timer opening = new Timer();
        opening.schedule(task,6000);

        public boolean onCreateoptionsMenu(Menu menu ){
            getMenuInflater().inflate(R.Menu.splash,menu);
            return true
        }



    }
