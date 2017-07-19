package com.example.m_ang.colors;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SolicitarNombreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solicitar_nombre);

        Button ContinuarButton = (Button) findViewById(R.id.continuar_button);
        ContinuarButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText texto=(EditText) findViewById(R.id.campo_entrada);
                String contenido=texto.getText().toString();
                if(contenido.compareTo("")==0)
                {
                    contenido="usuario_defecto";
                }
                SharedPreferences.Editor editor1 = getSharedPreferences("MisPreferencias", MODE_PRIVATE).edit();
                editor1.putString("usuario_actual", contenido);
                editor1.commit();
                SharedPreferences.Editor editor = getSharedPreferences("Puntos", MODE_PRIVATE).edit();
                editor.putString(contenido, "0");
                editor.commit();
                Intent i = new Intent(SolicitarNombreActivity.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}
