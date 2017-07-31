package com.example.m_ang.colors;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.speech.RecognizerIntent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.support.wearable.view.drawer.WearableActionDrawer;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;

public class SolicitarNombre extends WearableActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solicitar_nombre);

        Button ContinuarButton = (Button) findViewById(R.id.continuar_button);
        ContinuarButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String contenido="usuario_wear";
                SharedPreferences.Editor editor1 = getSharedPreferences("MisPreferencias", MODE_PRIVATE).edit();
                editor1.putString("usuario_actual", contenido);
                editor1.commit();
                SharedPreferences.Editor editor = getSharedPreferences("Puntos", MODE_PRIVATE).edit();
                editor.putString(contenido, "0");
                editor.commit();
                Intent i = new Intent(SolicitarNombre.this, MainActivity.class);
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
