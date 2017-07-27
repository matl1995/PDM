package com.example.m_ang.colors;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Map;

public class PrimerNivel extends AppCompatActivity {

    int contador=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primer_nivel);

        //Almaceno el nivel en el que estamos
        SharedPreferences.Editor editor = getSharedPreferences("MisPreferencias", MODE_PRIVATE).edit();
        editor.putString("nivel", "1");
        editor.commit();

        //Obtengo los sonidos
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.beep01);
        final MediaPlayer mp1 = MediaPlayer.create(this, R.raw.beep02);
        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.beep03);

        //Obtengo los botones del layout
        final Button boton1=(Button) findViewById(R.id.button_1);
        final Button boton2=(Button) findViewById(R.id.button_2);
        final Button boton3=(Button) findViewById(R.id.button_3);

        //Ilumino los botones
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {
                boton1.setEnabled(false);
                boton1.setAlpha(.4f);
                mp.start();
            }

        }, 1000);

        handler.postDelayed(new Runnable() {

            @Override
            public void run() {
                boton1.setEnabled(true);
                boton1.setAlpha(1f);
            }

        }, 1500);

        Handler handler1 = new Handler();
        handler1.postDelayed(new Runnable() {

            @Override
            public void run() {
                boton3.setEnabled(false);
                boton3.setAlpha(.4f);
                mp1.start();
            }

        }, 2000);

        handler1.postDelayed(new Runnable() {

            @Override
            public void run() {
                boton3.setEnabled(true);
                boton3.setAlpha(1f);
            }

        }, 2500);

        Handler handler2 = new Handler();
        handler2.postDelayed(new Runnable() {

            @Override
            public void run() {
                boton2.setEnabled(false);
                boton2.setAlpha(.4f);
                mp2.start();
            }

        }, 3000);


        handler2.postDelayed(new Runnable() {

            @Override
            public void run() {
                boton2.setEnabled(true);
                boton2.setAlpha(1f);
            }

        }, 3500);

        boton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boton1.setAlpha(.4f);
                mp.start();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        boton1.setAlpha(1f);
                    }

                }, 1000);
                if(contador==0)
                {
                    contador++;
                }
                else
                {
                    Intent i = new Intent(PrimerNivel.this, Fallaste.class);
                    startActivity(i);
                    finish();
                }
            }
        });

        boton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boton2.setAlpha(.4f);
                mp2.start();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        boton2.setAlpha(1f);
                    }

                }, 1000);
                if(contador==2)
                {
                    SharedPreferences prefs1 = getSharedPreferences("MisPreferencias", MODE_PRIVATE);
                    String usuario_actual=prefs1.getString("usuario_actual","");
                    SharedPreferences prefs = getSharedPreferences("Puntos", MODE_PRIVATE);
                    Map<String, ?> allEntries = prefs.getAll();
                    for (Map.Entry<String, ?> entry : allEntries.entrySet()) {
                        if(entry.getKey().compareTo(usuario_actual)==0)
                        {
                            int puntuacion = Integer.parseInt(entry.getValue().toString());
                            puntuacion++;
                            SharedPreferences.Editor editor = getSharedPreferences("Puntos", MODE_PRIVATE).edit();
                            editor.putString(usuario_actual, Integer.toString(puntuacion));
                            editor.commit();
                        }
                    }
                    Intent i = new Intent(PrimerNivel.this, Acertaste.class);
                    startActivity(i);
                    finish();
                }
                else
                {
                    Intent i = new Intent(PrimerNivel.this, Fallaste.class);
                    startActivity(i);
                    finish();
                }
            }
        });

        boton3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boton3.setAlpha(.4f);
                mp1.start();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        boton3.setAlpha(1f);
                    }

                }, 1000);
                if(contador==1)
                {
                    contador++;
                }
                else
                {
                    Intent i = new Intent(PrimerNivel.this, Fallaste.class);
                    startActivity(i);
                    finish();
                }
            }
        });

    }
}
