package com.example.m_ang.museo;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.io.UnsupportedEncodingException;

public class NFCReaderActivity extends AppCompatActivity {

    ToggleButton nfcButton;
    NfcAdapter nfcAdapter;
    String tagContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nfcreader);

        nfcAdapter=NfcAdapter.getDefaultAdapter(this);
        nfcButton=(ToggleButton) findViewById(R.id.nfc_button);

        if(nfcAdapter!=null && nfcAdapter.isEnabled())
        {
            Toast.makeText(this,"NFC disponible",Toast.LENGTH_LONG).show();
        }
    }

    /************************NFC***************************/
    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);

        if(intent.hasExtra(NfcAdapter.EXTRA_TAG))
        {
            Toast.makeText(this,"NFCIntent",Toast.LENGTH_SHORT).show();

            if(nfcButton.isChecked())
            {
                Parcelable[] parcelables = intent.getParcelableArrayExtra(NfcAdapter.EXTRA_NDEF_MESSAGES);

                if(parcelables!=null && parcelables.length>0)
                {
                    readTextFromMessage((NdefMessage)parcelables[0]);

                    SharedPreferences.Editor editor = getSharedPreferences("MisPreferencias", MODE_PRIVATE).edit();
                    editor.putString("numero_contenido", tagContent);
                    editor.commit();

                    Intent i = new Intent(NFCReaderActivity.this, ContenidoActivity.class);
                    startActivity(i);
                    finish();
                }
                else
                {
                    Toast.makeText(this,"No NDEF messages found",Toast.LENGTH_SHORT).show();
                }
            }
            else
            {
                Parcelable[] parcelables = intent.getParcelableArrayExtra(NfcAdapter.EXTRA_NDEF_MESSAGES);

                if(parcelables!=null && parcelables.length>0)
                {
                    readTextFromMessage((NdefMessage)parcelables[0]);

                    SharedPreferences.Editor editor = getSharedPreferences("MisPreferencias", MODE_PRIVATE).edit();
                    editor.putString("numero_contenido", tagContent);
                    editor.commit();

                    Intent i = new Intent(NFCReaderActivity.this, ContenidoActivity.class);
                    startActivity(i);
                    finish();
                }
                else
                {
                    Toast.makeText(this,"No NDEF messages found",Toast.LENGTH_SHORT).show();
                }
            }

        }
    }

    @Override
    protected void onPause() {
        disableForegroundDispatchSystem();
        super.onPause();
    }

    private void readTextFromMessage(NdefMessage ndefMessage) {
        NdefRecord[] ndefRecords=ndefMessage.getRecords();

        if(ndefRecords!=null && ndefRecords.length>0)
        {
            NdefRecord ndefRecord=ndefRecords[0];
            tagContent=getTextFromNdefRecord(ndefRecord);
        }
        else
        {
            Toast.makeText(this,"No NDEF records found",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        enableForegroundDispatchSystem();
    }

    public String getTextFromNdefRecord(NdefRecord ndefRecord) {
        tagContent=null;
        try{
            byte[] payload=ndefRecord.getPayload();
            String textEncoding=((payload[0] & 128)==0)? "UTF-8" : "UTF-16";
            int languageSize=payload[0] & 0063;
            tagContent = new String(payload,languageSize+1,payload.length-languageSize-1,textEncoding);
        } catch (UnsupportedEncodingException e)
        {
            Log.e("getTextFromNdefRecord",e.getMessage(),e);
        }
        return tagContent;
    }


    private void disableForegroundDispatchSystem() {
        nfcAdapter.disableForegroundDispatch(this);
    }


    private void enableForegroundDispatchSystem() {
        Intent intent=new Intent(this,MainActivity.class).addFlags(Intent.FLAG_RECEIVER_REPLACE_PENDING);
        PendingIntent pendingIntent=PendingIntent.getActivity(this,0,intent,0);
        IntentFilter[] intentFilters=new IntentFilter[]{};
        nfcAdapter.enableForegroundDispatch(this,pendingIntent,intentFilters,null);
    }
}
