package com.example.m_ang.colors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button puntuaciones=(Button) findViewById(R.id.button_puntuaciones);
        puntuaciones.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, PuntuacionesActivity.class);
                startActivity(i);
                finish();
            }
        });

        Button jugar=(Button) findViewById(R.id.button_jugar);
        jugar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SolicitarNombreActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}
