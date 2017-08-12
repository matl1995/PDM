package com.example.m_ang.brainwork.Formas;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.m_ang.brainwork.R;

public class Formas1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formas1);

        SharedPreferences.Editor editor = getSharedPreferences("Formas", MODE_PRIVATE).edit();
        editor.putString("nivel", "2");
        editor.commit();

        Button formaCorrecta=(Button) findViewById(R.id.forma1_button);
        formaCorrecta.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(Formas1Activity.this,AcertasteActivity.class);
                startActivity(intent);
                finish();
            }
        });

        Button formaErronea1=(Button) findViewById(R.id.forma2_button);
        formaErronea1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(Formas1Activity.this,FallasteActivity.class);
                startActivity(intent);
                finish();
            }
        });

        Button formaErronea2=(Button) findViewById(R.id.forma3_button);
        formaErronea2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(Formas1Activity.this,FallasteActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
