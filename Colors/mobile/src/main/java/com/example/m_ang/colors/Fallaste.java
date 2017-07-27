package com.example.m_ang.colors;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Fallaste extends AppCompatActivity {

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
                finish();
            }

        }, 2000);
    }
}
