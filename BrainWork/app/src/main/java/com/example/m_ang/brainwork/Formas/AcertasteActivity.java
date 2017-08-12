package com.example.m_ang.brainwork.Formas;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.m_ang.brainwork.Colores.Colores1Activity;
import com.example.m_ang.brainwork.Colores.Colores2Activity;
import com.example.m_ang.brainwork.InicioActivity;
import com.example.m_ang.brainwork.R;

public class AcertasteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acertaste2);

        SharedPreferences prefs1 = getSharedPreferences("Formas", MODE_PRIVATE);
        final String nivel=prefs1.getString("nivel","");
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {
                if(nivel.compareTo("1")==0)
                {
                    Intent i = new Intent(AcertasteActivity.this, Formas1Activity.class);
                    startActivity(i);
                    finish();
                }
                else if(nivel.compareTo("2")==0)
                {
                    Intent i = new Intent(AcertasteActivity.this, Formas2Activity.class);
                    startActivity(i);
                    finish();
                }
                else if(nivel.compareTo("3")==0)
                {
                    Intent i = new Intent(AcertasteActivity.this, InicioActivity.class);
                    startActivity(i);
                    finish();
                }
            }

        }, 2000);
    }
}
