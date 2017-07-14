package com.example.m_ang.museo;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.os.Parcelable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.google.zxing.Result;

import java.io.UnsupportedEncodingException;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class MainActivity extends AppCompatActivity implements ZXingScannerView.ResultHandler{
    private ZXingScannerView escanerView;

    Button nfcButton;
    NfcAdapter nfcAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nfcAdapter=NfcAdapter.getDefaultAdapter(this);
        nfcButton=(Button) findViewById(R.id.nfc_button);

        if(nfcAdapter==null)
        {
            nfcButton.setEnabled(false);
            nfcButton.setAlpha(.7f);
            Toast.makeText(this,"NFC no disponible",Toast.LENGTH_LONG).show();
        }
        else if(nfcAdapter!=null && nfcAdapter.isEnabled())
        {
            Toast.makeText(this,"NFC disponible",Toast.LENGTH_LONG).show();
        }

        nfcButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, NFCReaderActivity.class);
                startActivity(i);
                finish();
            }
        });
    }

    /***********************QR****************************/
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
        Intent i = new Intent(MainActivity.this, ContenidoActivity.class);
        startActivity(i);
        finish();
    }
}
