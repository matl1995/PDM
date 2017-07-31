package com.example.m_ang.colors;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;

public class Fallaste extends WearableActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fallaste);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent i = new Intent(Fallaste.this, PuntuacionesActivity.class);
                startActivity(i);
                Handler handler2=new Handler();
                handler2.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        finish();
                    }

                }, 1000);
            }

        }, 2000);
    }
}
