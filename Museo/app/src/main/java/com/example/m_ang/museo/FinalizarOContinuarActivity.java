package com.example.m_ang.museo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class FinalizarOContinuarActivity extends AppCompatActivity  implements ZXingScannerView.ResultHandler{

    private ZXingScannerView escanerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalizar_ocontinuar);

        Button FinalizarButton = (Button) findViewById(R.id.finalizar_button);
        FinalizarButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(FinalizarOContinuarActivity.this, PuntuacionActivity.class);
                startActivity(i);
                finish();
            }
        });

        Button NFCButton = (Button) findViewById(R.id.nfc_button);
        NFCButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Click event trigger here
            }
        });
    }

    public void EscanerQR(View view){
        escanerView=new ZXingScannerView(this);
        setContentView(escanerView);
        escanerView.setResultHandler(this);
        escanerView.startCamera();
    }

    @Override
    protected void onPause() {
        super.onPause();
        escanerView.stopCamera();
    }

    @Override
    public void handleResult(Result result) {
        SharedPreferences.Editor editor = getSharedPreferences("MisPreferencias", MODE_PRIVATE).edit();
        editor.putString("numero_contenido", result.getText());
        editor.commit();
        Intent i = new Intent(FinalizarOContinuarActivity.this, ContenidoActivity.class);
        startActivity(i);
        finish();
    }
}
