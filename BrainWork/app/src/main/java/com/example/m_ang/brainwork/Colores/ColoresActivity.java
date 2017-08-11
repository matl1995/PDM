package com.example.m_ang.brainwork.Colores;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.m_ang.brainwork.R;

public class ColoresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colores);

        SharedPreferences.Editor editor = getSharedPreferences("Colores", MODE_PRIVATE).edit();
        editor.putString("nivel", "1");
        editor.commit();

        Button colorCorrecto=(Button) findViewById(R.id.color1_button);
        colorCorrecto.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(ColoresActivity.this,AcertasteActivity.class);
                startActivity(intent);
                finish();
            }
        });

        Button colorErroneo1=(Button) findViewById(R.id.color2_button);
        colorErroneo1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(ColoresActivity.this,FallasteActivity.class);
                startActivity(intent);
                finish();
            }
        });

        Button colorErroneo2=(Button) findViewById(R.id.color3_button);
        colorErroneo2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(ColoresActivity.this,FallasteActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
