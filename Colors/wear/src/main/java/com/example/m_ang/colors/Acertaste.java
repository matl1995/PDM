package com.example.m_ang.colors;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;

public class Acertaste extends WearableActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acertaste);

        SharedPreferences prefs1 = getSharedPreferences("MisPreferencias", MODE_PRIVATE);
        final String nivel=prefs1.getString("nivel","");
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {
                if(nivel.compareTo("1")==0)
                {
                    Intent i = new Intent(Acertaste.this, SegundoNivel.class);
                    startActivity(i);
                    Handler handler2=new Handler();
                    handler2.postDelayed(new Runnable() {

                        @Override
                        public void run() {
                            finish();
                        }

                    }, 1000);
                }
                else if(nivel.compareTo("2")==0)
                {
                    Intent i = new Intent(Acertaste.this, PuntuacionesActivity.class);
                    startActivity(i);
                    Handler handler2=new Handler();
                    handler2.postDelayed(new Runnable() {

                        @Override
                        public void run() {
                            finish();
                        }

                    }, 1000);
                }
            }

        }, 2000);
    }
}
