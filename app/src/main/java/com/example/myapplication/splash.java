package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class splash extends AppCompatActivity {

    private final Timer timer = new Timer();

    //
    TimerTask timerTask = new TimerTask() {
        @Override
        public void run() {
           runOnUiThread(new Runnable() {
               @Override
               public void run() {
                   gotoMainActivity();
               }
           });
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        timer.schedule(timerTask,3000);
    }

    private void gotoMainActivity()
    {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);

    }
}