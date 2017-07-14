package com.example.m_ang.museo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.nfc.NfcAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class FinalizarOContinuarActivity extends AppCompatActivity  implements ZXingScannerView.ResultHandler{

    private ZXingScannerView escanerView;

    Button nfcButton;
    NfcAdapter nfcAdapter;

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

        nfcAdapter= NfcAdapter.getDefaultAdapter(this);
        nfcButton=(Button) findViewById(R.id.nfc_button);

        if(nfcAdapter==null)
        {
            nfcButton.setEnabled(false);
            nfcButton.setAlpha(.7f);
        }

        nfcButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(FinalizarOContinuarActivity.this, NFCReaderActivity.class);
                startActivity(i);
                finish();
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
