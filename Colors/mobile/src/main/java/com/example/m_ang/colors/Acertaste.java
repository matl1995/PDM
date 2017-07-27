package com.example.m_ang.colors;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Acertaste extends AppCompatActivity {

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
                finish();
            }
            else if(nivel.compareTo("2")==0)
            {
                Intent i = new Intent(Acertaste.this, PuntuacionesActivity.class);
                startActivity(i);
                finish();
            }
            }

        }, 2000);
    }
}
