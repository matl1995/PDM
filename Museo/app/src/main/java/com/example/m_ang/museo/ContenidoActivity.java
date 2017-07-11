package com.example.m_ang.museo;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ContenidoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenido);
        SharedPreferences prefs = getSharedPreferences("MisPreferencias", MODE_PRIVATE);
        String numero_contenido = prefs.getString("numero_contenido","0");
        TextView texto = (TextView) findViewById(R.id.texto);
        texto.setText(numero_contenido);
    }
}
