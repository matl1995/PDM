package com.example.m_ang.museo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Map;

public class PreguntaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta);
        SharedPreferences prefs = getSharedPreferences("MisPreferencias", MODE_PRIVATE);
        String numero_contenido = prefs.getString("numero_contenido","0");
        if(numero_contenido.compareTo("0")==0)
        {
            Intent i = new Intent(PreguntaActivity.this, FinalizarOContinuarActivity.class);
            startActivity(i);
            finish();
        }
        else if(numero_contenido.compareTo("1")==0)
        {
            EditText titulo=(EditText) findViewById(R.id.pregunta);
            Button Respuesta1Button = (Button) findViewById(R.id.respuesta1_button);
            Button Respuesta2Button = (Button) findViewById(R.id.respuesta2_button);
            Button Respuesta3Button = (Button) findViewById(R.id.respuesta3_button);

            titulo.setText("¿A que siglo pertenece el cuadro de las meninas?");
            titulo.setKeyListener(null);

            Respuesta1Button.setText("XX");
            Respuesta2Button.setText("XIX");
            Respuesta3Button.setText("XVIII");

            Respuesta1Button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent i = new Intent(PreguntaActivity.this, FinalizarOContinuarActivity.class);
                    startActivity(i);
                    finish();
                }
            });

            Respuesta2Button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
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
                    Intent i = new Intent(PreguntaActivity.this, FinalizarOContinuarActivity.class);
                    startActivity(i);
                    finish();
                }
            });

            Respuesta3Button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent i = new Intent(PreguntaActivity.this, FinalizarOContinuarActivity.class);
                    startActivity(i);
                    finish();
                }
            });

        }
        else if(numero_contenido.compareTo("2")==0)
        {
            EditText titulo=(EditText) findViewById(R.id.pregunta);
            Button Respuesta1Button = (Button) findViewById(R.id.respuesta1_button);
            Button Respuesta2Button = (Button) findViewById(R.id.respuesta2_button);
            Button Respuesta3Button = (Button) findViewById(R.id.respuesta3_button);

            titulo.setText("¿Quien es el pintor de La Monalisa?");
            titulo.setKeyListener(null);

            Respuesta1Button.setText("Picasso");
            Respuesta2Button.setText("Van Gogh");
            Respuesta3Button.setText("Da Vinci");

            Respuesta1Button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent i = new Intent(PreguntaActivity.this, FinalizarOContinuarActivity.class);
                    startActivity(i);
                    finish();
                }
            });

            Respuesta3Button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
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
                    Intent i = new Intent(PreguntaActivity.this, FinalizarOContinuarActivity.class);
                    startActivity(i);
                    finish();
                }
            });

            Respuesta2Button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent i = new Intent(PreguntaActivity.this, FinalizarOContinuarActivity.class);
                    startActivity(i);
                    finish();
                }
            });
        }
        else if(numero_contenido.compareTo("3")==0)
        {
            EditText titulo=(EditText) findViewById(R.id.pregunta);
            Button Respuesta1Button = (Button) findViewById(R.id.respuesta1_button);
            Button Respuesta2Button = (Button) findViewById(R.id.respuesta2_button);
            Button Respuesta3Button = (Button) findViewById(R.id.respuesta3_button);

            titulo.setText("¿En que año fué pintado el Guernica?");
            titulo.setKeyListener(null);

            Respuesta1Button.setText("1935");
            Respuesta2Button.setText("1937");
            Respuesta3Button.setText("1933");

            Respuesta1Button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent i = new Intent(PreguntaActivity.this, FinalizarOContinuarActivity.class);
                    startActivity(i);
                    finish();
                }
            });

            Respuesta2Button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
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
                    Intent i = new Intent(PreguntaActivity.this, FinalizarOContinuarActivity.class);
                    startActivity(i);
                    finish();
                }
            });

            Respuesta3Button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent i = new Intent(PreguntaActivity.this, FinalizarOContinuarActivity.class);
                    startActivity(i);
                    finish();
                }
            });
        }
    }
}
