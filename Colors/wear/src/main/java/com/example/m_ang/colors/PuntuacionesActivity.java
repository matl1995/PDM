package com.example.m_ang.colors;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Map;

public class PuntuacionesActivity extends WearableActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puntuaciones);

        EditText puntuaciones=(EditText) findViewById(R.id.puntuaciones_finales);
        String texto="";

        SharedPreferences prefs = getSharedPreferences("Puntos", MODE_PRIVATE);
        Map<String, ?> allEntries = prefs.getAll();
        for (Map.Entry<String, ?> entry : allEntries.entrySet()) {
            texto=texto+entry.getKey().toString()+": "+entry.getValue().toString()+"\n";
        }

        puntuaciones.setText(texto);
        puntuaciones.setKeyListener(null);


        Button ReinicioButton =(Button) findViewById(R.id.reinicio_button);
        ReinicioButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(PuntuacionesActivity.this, MainActivity.class);
                startActivity(i);
                Handler handler=new Handler();
                handler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        finish();
                    }

                }, 1000);
            }
        });
    }
}
