package com.example.m_ang.brainwork;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.m_ang.brainwork.Colores.ColoresActivity;
import com.example.m_ang.brainwork.Dinero.DineroActivity;
import com.example.m_ang.brainwork.Formas.FormasActivity;
import com.example.m_ang.brainwork.Herramientas.HerramientasActivity;
import com.example.m_ang.brainwork.Herramientas.InstruccionesHActivity;
import com.example.m_ang.brainwork.Memoria.InstruccionesMActivity;
import com.example.m_ang.brainwork.Memoria.MemoriaActivity;

public class InicioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        Button colores=(Button) findViewById(R.id.primer_button);
        colores.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(InicioActivity.this,ColoresActivity.class);
                startActivity(intent);
                finish();
            }
        });

        Button formas=(Button) findViewById(R.id.segundo_button);
        formas.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(InicioActivity.this,FormasActivity.class);
                startActivity(intent);
                finish();
            }
        });

        Button dinero=(Button) findViewById(R.id.tercer_button);
        dinero.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(InicioActivity.this,DineroActivity.class);
                startActivity(intent);
                finish();
            }
        });

        Button herramientas=(Button) findViewById(R.id.cuarto_button);
        herramientas.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(InicioActivity.this,InstruccionesHActivity.class);
                startActivity(intent);
                finish();
            }
        });

        Button memoria=(Button) findViewById(R.id.quinto_button);
        memoria.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(InicioActivity.this,InstruccionesMActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
