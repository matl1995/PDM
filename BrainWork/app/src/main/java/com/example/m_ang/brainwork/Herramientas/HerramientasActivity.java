package com.example.m_ang.brainwork.Herramientas;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.m_ang.brainwork.InicioActivity;
import com.example.m_ang.brainwork.Memoria.MemoriaActivity;
import com.example.m_ang.brainwork.R;

public class HerramientasActivity extends AppCompatActivity {
    Button actual;
    int general=0;
    int llave_inglesa=0;
    int llave_inglesa_final;
    int martillo=0;
    int martillo_final;
    int sierra=0;
    int sierra_final;
    int destornillador=0;
    int destornillador_final;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_herramientas);

        final Button martillob=(Button) findViewById(R.id.martillo);
        final Button clavob=(Button) findViewById(R.id.clavo);

        final Button llave_inglesab=(Button) findViewById(R.id.llave_inglesa);
        final Button grifob=(Button) findViewById(R.id.grifo);

        final Button destornilladorb=(Button) findViewById(R.id.destornillador);
        final Button tornillob=(Button) findViewById(R.id.tornillo);

        final Button sierrab=(Button) findViewById(R.id.sierra);
        final Button troncob=(Button) findViewById(R.id.tronco);

        martillob.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(martillo==0 && general==0)
                {
                    martillo++;
                    general++;
                    martillob.setEnabled(false);
                    martillob.setAlpha(.5f);
                    actual=martillob;
                }
                else if(martillo==0 && general==1)
                {
                    general--;
                    martillo=0;
                    destornillador=0;
                    sierra=0;
                    llave_inglesa=0;

                    Context context = getApplicationContext();
                    CharSequence text = "¡Fallaste!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    actual.setEnabled(true);
                    actual.setAlpha(1f);
                }
                else if(martillo==1 && general==1) {
                    general--;
                    martillo_final=1;

                    Context context = getApplicationContext();
                    CharSequence text = "¡Acertaste!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    martillob.setEnabled(false);
                    martillob.setAlpha(.5f);

                    if(martillo_final==1 && llave_inglesa_final==1 && sierra_final==1 && destornillador_final==1)
                    {
                        Intent intent=new Intent(HerramientasActivity.this,InicioActivity.class);
                        startActivity(intent);
                        finish();
                    }
                }
            }
        });

        clavob.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(martillo==0 && general==0)
                {
                    martillo++;
                    general++;
                    clavob.setEnabled(false);
                    clavob.setAlpha(.5f);
                    actual=clavob;
                }
                else if(martillo==0 && general==1)
                {
                    general--;
                    martillo=0;
                    destornillador=0;
                    sierra=0;
                    llave_inglesa=0;

                    Context context = getApplicationContext();
                    CharSequence text = "¡Fallaste!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    actual.setEnabled(true);
                    actual.setAlpha(1f);
                }
                else if(martillo==1 && general==1) {
                    general--;
                    martillo_final=1;

                    Context context = getApplicationContext();
                    CharSequence text = "¡Acertaste!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    clavob.setEnabled(false);
                    clavob.setAlpha(.5f);

                    if(martillo_final==1 && llave_inglesa_final==1 && sierra_final==1 && destornillador_final==1)
                    {
                        Intent intent=new Intent(HerramientasActivity.this,InicioActivity.class);
                        startActivity(intent);
                        finish();
                    }
                }
            }
        });

        destornilladorb.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(destornillador==0 && general==0)
                {
                    destornillador++;
                    general++;
                    destornilladorb.setEnabled(false);
                    destornilladorb.setAlpha(.5f);
                    actual=destornilladorb;
                }
                else if(destornillador==0 && general==1)
                {
                    general--;
                    martillo=0;
                    destornillador=0;
                    sierra=0;
                    llave_inglesa=0;

                    Context context = getApplicationContext();
                    CharSequence text = "¡Fallaste!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    actual.setEnabled(true);
                    actual.setAlpha(1f);
                }
                else if(destornillador==1 && general==1) {
                    general--;
                    destornillador_final=1;

                    Context context = getApplicationContext();
                    CharSequence text = "¡Acertaste!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    destornilladorb.setEnabled(false);
                    destornilladorb.setAlpha(.5f);

                    if(martillo_final==1 && llave_inglesa_final==1 && sierra_final==1 && destornillador_final==1)
                    {
                        Intent intent=new Intent(HerramientasActivity.this,InicioActivity.class);
                        startActivity(intent);
                        finish();
                    }
                }
            }
        });

        tornillob.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(destornillador==0 && general==0)
                {
                    destornillador++;
                    general++;
                    tornillob.setEnabled(false);
                    tornillob.setAlpha(.5f);
                    actual=tornillob;
                }
                else if(destornillador==0 && general==1)
                {
                    general--;
                    martillo=0;
                    destornillador=0;
                    sierra=0;
                    llave_inglesa=0;

                    Context context = getApplicationContext();
                    CharSequence text = "¡Fallaste!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    actual.setEnabled(true);
                    actual.setAlpha(1f);
                }
                else if(destornillador==1 && general==1) {
                    general--;
                    destornillador_final=1;

                    Context context = getApplicationContext();
                    CharSequence text = "¡Acertaste!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    tornillob.setEnabled(false);
                    tornillob.setAlpha(.5f);

                    if(martillo_final==1 && llave_inglesa_final==1 && sierra_final==1 && destornillador_final==1)
                    {
                        Intent intent=new Intent(HerramientasActivity.this,InicioActivity.class);
                        startActivity(intent);
                        finish();
                    }
                }
            }
        });

        llave_inglesab.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(llave_inglesa==0 && general==0)
                {
                    llave_inglesa++;
                    general++;
                    llave_inglesab.setEnabled(false);
                    llave_inglesab.setAlpha(.5f);
                    actual=llave_inglesab;
                }
                else if(llave_inglesa==0 && general==1)
                {
                    general--;
                    martillo=0;
                    destornillador=0;
                    sierra=0;
                    llave_inglesa=0;

                    Context context = getApplicationContext();
                    CharSequence text = "¡Fallaste!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    actual.setEnabled(true);
                    actual.setAlpha(1f);
                }
                else if(llave_inglesa==1 && general==1) {
                    general--;
                    llave_inglesa_final=1;

                    Context context = getApplicationContext();
                    CharSequence text = "¡Acertaste!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    llave_inglesab.setEnabled(false);
                    llave_inglesab.setAlpha(.5f);

                    if(martillo_final==1 && llave_inglesa_final==1 && sierra_final==1 && destornillador_final==1)
                    {
                        Intent intent=new Intent(HerramientasActivity.this,InicioActivity.class);
                        startActivity(intent);
                        finish();
                    }
                }
            }
        });

        grifob.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(llave_inglesa==0 && general==0)
                {
                    llave_inglesa++;
                    general++;
                    grifob.setEnabled(false);
                    grifob.setAlpha(.5f);
                    actual=grifob;
                }
                else if(llave_inglesa==0 && general==1)
                {
                    general--;
                    martillo=0;
                    destornillador=0;
                    sierra=0;
                    llave_inglesa=0;

                    Context context = getApplicationContext();
                    CharSequence text = "¡Fallaste!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    actual.setEnabled(true);
                    actual.setAlpha(1f);
                }
                else if(llave_inglesa==1 && general==1) {
                    general--;
                    llave_inglesa_final=1;

                    Context context = getApplicationContext();
                    CharSequence text = "¡Acertaste!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    grifob.setEnabled(false);
                    grifob.setAlpha(.5f);

                    if(martillo_final==1 && llave_inglesa_final==1 && sierra_final==1 && destornillador_final==1)
                    {
                        Intent intent=new Intent(HerramientasActivity.this,InicioActivity.class);
                        startActivity(intent);
                        finish();
                    }
                }
            }
        });

        sierrab.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(sierra==0 && general==0)
                {
                    sierra++;
                    general++;
                    sierrab.setEnabled(false);
                    sierrab.setAlpha(.5f);
                    actual=sierrab;
                }
                else if(sierra==0 && general==1)
                {
                    general--;
                    martillo=0;
                    destornillador=0;
                    sierra=0;
                    llave_inglesa=0;

                    Context context = getApplicationContext();
                    CharSequence text = "¡Fallaste!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    actual.setEnabled(true);
                    actual.setAlpha(1f);
                }
                else if(sierra==1 && general==1) {
                    general--;
                    sierra_final=1;

                    Context context = getApplicationContext();
                    CharSequence text = "¡Acertaste!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    sierrab.setEnabled(false);
                    sierrab.setAlpha(.5f);

                    if(martillo_final==1 && llave_inglesa_final==1 && sierra_final==1 && destornillador_final==1)
                    {
                        Intent intent=new Intent(HerramientasActivity.this,InicioActivity.class);
                        startActivity(intent);
                        finish();
                    }
                }
            }
        });

        troncob.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(sierra==0 && general==0)
                {
                    sierra++;
                    general++;
                    troncob.setEnabled(false);
                    troncob.setAlpha(.5f);
                    actual=troncob;
                }
                else if(sierra==0 && general==1)
                {
                    general--;
                    martillo=0;
                    destornillador=0;
                    sierra=0;
                    llave_inglesa=0;

                    Context context = getApplicationContext();
                    CharSequence text = "¡Fallaste!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    actual.setEnabled(true);
                    actual.setAlpha(1f);
                }
                else if(sierra==1 && general==1) {
                    general--;
                    sierra_final=1;

                    Context context = getApplicationContext();
                    CharSequence text = "¡Acertaste!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    troncob.setEnabled(false);
                    troncob.setAlpha(.5f);

                    if(martillo_final==1 && llave_inglesa_final==1 && sierra_final==1 && destornillador_final==1)
                    {
                        Intent intent=new Intent(HerramientasActivity.this,InicioActivity.class);
                        startActivity(intent);
                        finish();
                    }
                }
            }
        });
    }
}
