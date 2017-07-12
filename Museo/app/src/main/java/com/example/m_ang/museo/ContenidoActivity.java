package com.example.m_ang.museo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ContenidoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenido);
        SharedPreferences prefs = getSharedPreferences("MisPreferencias", MODE_PRIVATE);
        String numero_contenido = prefs.getString("numero_contenido","0");
        if(numero_contenido.compareTo("0")==0)
        {
            Intent i = new Intent(ContenidoActivity.this, FinalizarOContinuarActivity.class);
            startActivity(i);
            finish();
        }
        else if(numero_contenido.compareTo("1")==0)
        {
            TextView titulo=(TextView) findViewById(R.id.titulo);
            EditText contenido=(EditText) findViewById(R.id.contenido);
            titulo.setText("Las meninas");
            contenido.setText("Las meninas (como se conoce a este cuadro desde el siglo XIX) o La familia de Felipe IV (según se describe en el inventario de 1734) se considera la obra maestra del pintor del Siglo de Oro español Diego Velázquez. Acabado en 1656 según Antonio Palomino, fecha unánimemente aceptada por la crítica, corresponde al último periodo estilístico del artista, el de plena madurez. Es una pintura realizada al óleo sobre un lienzo de grandes dimensiones formado por tres bandas de tela cosidas verticalmente, donde las figuras situadas en primer plano se representan a tamaño natural. Es una de las obras pictóricas más analizadas y comentadas en el mundo del arte.");
            contenido.setKeyListener(null);

            Button PreguntaButton = (Button) findViewById(R.id.pregunta_button);
            PreguntaButton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent i = new Intent(ContenidoActivity.this, PreguntaActivity.class);
                    startActivity(i);
                    finish();
                }
            });
        }
        else if(numero_contenido.compareTo("2")==0)
        {
            TextView titulo=(TextView) findViewById(R.id.titulo);
            EditText contenido=(EditText) findViewById(R.id.contenido);
            titulo.setText("La gioconda");
            contenido.setText("El Retrato de Lisa Gherardini, esposa de Francesco del Giocondo,1\u200B más conocido como La Gioconda (La Joconde en francés), también conocida como La Mona Lisa, es una obra pictórica del pintor renacentista italiano Leonardo da Vinci. Fue adquirida por el rey Francisco I de Francia a principios del siglo XVI y desde entonces es propiedad del Estado Francés. Se exhibe en el Museo del Louvre de París.");
            contenido.setKeyListener(null);

            Button PreguntaButton = (Button) findViewById(R.id.pregunta_button);
            PreguntaButton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent i = new Intent(ContenidoActivity.this, PreguntaActivity.class);
                    startActivity(i);
                    finish();
                }
            });
        }
        else if(numero_contenido.compareTo("3")==0)
        {
            TextView titulo=(TextView) findViewById(R.id.titulo);
            EditText contenido=(EditText) findViewById(R.id.contenido);
            titulo.setText("Guernica");
            contenido.setText("Guernica es un famoso cuadro de Pablo Picasso, pintado entre los meses de mayo y junio de 1937, cuyo título alude al bombardeo de Guernica, ocurrido el 26 de abril de dicho año, durante la Guerra Civil Española. Fue realizado por encargo del Director General de Bellas Artes, Jose Renau a petición del Gobierno de la Segunda República Española para ser expuesto en el pabellón español durante la Exposición Internacional de 1937 en París, con el fin de atraer la atención del público hacia la causa republicana en plena Guerra Civil Española.");
            contenido.setKeyListener(null);

            Button PreguntaButton = (Button) findViewById(R.id.pregunta_button);
            PreguntaButton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent i = new Intent(ContenidoActivity.this, PreguntaActivity.class);
                    startActivity(i);
                    finish();
                }
            });
        }
    }
}
