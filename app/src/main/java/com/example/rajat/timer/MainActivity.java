package com.example.rajat.timer;

import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new CountDownTimer(10000,1000){
            @Override
            public void onTick(long millisecondsUntilDone) {
                //countdown is countin down (every sec)
                Log.i("seconds left",String.valueOf(millisecondsUntilDone/1000));
            }
            public void onFinish(){
                //counter is finished   (after 10 sec)
                Log.i("Done","Countdown timer finshed");
            }
        }.start();//countdown timer is destroyed when time is up 
        /*
        final Handler handler = new Handler();//this controls the timing of certain methods
        Runnable run = new Runnable() {
            @Override
            public void run() {
                //insert code to be run every second
                Log.i("Runnable has run ", "a second passed");
                handler.postDelayed(this,1000);
            }
        };
        handler.post(run);*/
    }
}
