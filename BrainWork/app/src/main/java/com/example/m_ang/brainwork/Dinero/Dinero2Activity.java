package com.example.m_ang.brainwork.Dinero;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.m_ang.brainwork.InicioActivity;
import com.example.m_ang.brainwork.R;

public class Dinero2Activity extends AppCompatActivity {
    int general=0;
    int dinero1=0;
    int dinero3=0;
    int dinero4=0;
    int dinero5=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinero2);

        final Button dinero1b=(Button) findViewById(R.id.dinero1);
        final Button dinero2b=(Button) findViewById(R.id.dinero2);
        final Button dinero3b=(Button) findViewById(R.id.dinero3);
        final Button dinero4b=(Button) findViewById(R.id.dinero4);
        final Button dinero5b=(Button) findViewById(R.id.dinero5);
        final Button dinero6b=(Button) findViewById(R.id.dinero6);

        dinero1b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(general==0)
                {
                    general++;
                    dinero1=1;

                    dinero1b.setEnabled(false);
                    dinero1b.setAlpha(.5f);

                    Context context = getApplicationContext();
                    CharSequence text = "¡Acertaste!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                else if(general==1)
                {
                    general++;
                    dinero1=1;

                    dinero1b.setEnabled(false);
                    dinero1b.setAlpha(.5f);

                    Context context = getApplicationContext();
                    CharSequence text = "¡Acertaste!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                else if(general==2)
                {
                    general++;
                    dinero1=1;

                    dinero1b.setEnabled(false);
                    dinero1b.setAlpha(.5f);

                    Context context = getApplicationContext();
                    CharSequence text = "¡Acertaste!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                else if(general==3)
                {
                    general++;
                    dinero1=1;

                    dinero1b.setEnabled(false);
                    dinero1b.setAlpha(.5f);

                    Context context = getApplicationContext();
                    CharSequence text = "¡Acertaste!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    Intent intent=new Intent(Dinero2Activity.this,InicioActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });

        dinero2b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(general==0)
                {
                    dinero2b.setEnabled(false);
                    dinero2b.setAlpha(.5f);

                    Context context = getApplicationContext();
                    CharSequence text = "¡Fallaste!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {

                        @Override
                        public void run() {
                            dinero2b.setEnabled(true);
                            dinero2b.setAlpha(1f);
                        }

                    }, 1000);
                }
                else if(general==1)
                {
                    if(dinero1==1)
                    {
                        dinero2b.setEnabled(false);
                        dinero2b.setAlpha(.5f);

                        Context context = getApplicationContext();
                        CharSequence text = "¡Fallaste!";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                dinero2b.setEnabled(true);
                                dinero2b.setAlpha(1f);
                                dinero1b.setEnabled(true);
                                dinero1b.setAlpha(1f);
                            }

                        }, 1000);
                    }
                    else if(dinero3==1)
                    {
                        dinero2b.setEnabled(false);
                        dinero2b.setAlpha(.5f);

                        Context context = getApplicationContext();
                        CharSequence text = "¡Fallaste!";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                dinero2b.setEnabled(true);
                                dinero2b.setAlpha(1f);
                                dinero3b.setEnabled(true);
                                dinero3b.setAlpha(1f);
                            }

                        }, 1000);
                    }
                    else if(dinero4==1)
                    {
                        dinero2b.setEnabled(false);
                        dinero2b.setAlpha(.5f);

                        Context context = getApplicationContext();
                        CharSequence text = "¡Fallaste!";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                dinero2b.setEnabled(true);
                                dinero2b.setAlpha(1f);
                                dinero4b.setEnabled(true);
                                dinero4b.setAlpha(1f);
                            }

                        }, 1000);
                    }
                    else if(dinero5==1)
                    {
                        dinero2b.setEnabled(false);
                        dinero2b.setAlpha(.5f);

                        Context context = getApplicationContext();
                        CharSequence text = "¡Fallaste!";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                dinero2b.setEnabled(true);
                                dinero2b.setAlpha(1f);
                                dinero5b.setEnabled(true);
                                dinero5b.setAlpha(1f);
                            }

                        }, 1000);
                    }
                    general=0;
                    dinero1=0;
                    dinero3=0;
                    dinero4=0;
                    dinero5=0;
                }
                else if(general==2)
                {
                    if(dinero3==1 && dinero4==1)
                    {
                        dinero2b.setEnabled(false);
                        dinero2b.setAlpha(.5f);

                        Context context = getApplicationContext();
                        CharSequence text = "¡Fallaste!";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                dinero2b.setEnabled(true);
                                dinero2b.setAlpha(1f);
                                dinero3b.setEnabled(true);
                                dinero3b.setAlpha(1f);
                                dinero4b.setEnabled(true);
                                dinero4b.setAlpha(1f);
                            }

                        }, 1000);
                    }
                    else if(dinero3==1 && dinero5==1)
                    {
                        dinero2b.setEnabled(false);
                        dinero2b.setAlpha(.5f);

                        Context context = getApplicationContext();
                        CharSequence text = "¡Fallaste!";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                dinero2b.setEnabled(true);
                                dinero2b.setAlpha(1f);
                                dinero3b.setEnabled(true);
                                dinero3b.setAlpha(1f);
                                dinero5b.setEnabled(true);
                                dinero5b.setAlpha(1f);
                            }

                        }, 1000);
                    }
                    else if(dinero4==1 && dinero5==1)
                    {
                        dinero2b.setEnabled(false);
                        dinero2b.setAlpha(.5f);

                        Context context = getApplicationContext();
                        CharSequence text = "¡Fallaste!";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                dinero2b.setEnabled(true);
                                dinero2b.setAlpha(1f);
                                dinero4b.setEnabled(true);
                                dinero4b.setAlpha(1f);
                                dinero5b.setEnabled(true);
                                dinero5b.setAlpha(1f);
                            }

                        }, 1000);
                    }
                    else if(dinero1==1 && dinero3==1)
                    {
                        dinero2b.setEnabled(false);
                        dinero2b.setAlpha(.5f);

                        Context context = getApplicationContext();
                        CharSequence text = "¡Fallaste!";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                dinero2b.setEnabled(true);
                                dinero2b.setAlpha(1f);
                                dinero1b.setEnabled(true);
                                dinero1b.setAlpha(1f);
                                dinero3b.setEnabled(true);
                                dinero3b.setAlpha(1f);
                            }

                        }, 1000);
                    }
                    else if(dinero1==1 && dinero4==1)
                    {
                        dinero2b.setEnabled(false);
                        dinero2b.setAlpha(.5f);

                        Context context = getApplicationContext();
                        CharSequence text = "¡Fallaste!";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                dinero2b.setEnabled(true);
                                dinero2b.setAlpha(1f);
                                dinero1b.setEnabled(true);
                                dinero1b.setAlpha(1f);
                                dinero4b.setEnabled(true);
                                dinero4b.setAlpha(1f);
                            }

                        }, 1000);
                    }
                    else if(dinero1==1 && dinero5==1)
                    {
                        dinero2b.setEnabled(false);
                        dinero2b.setAlpha(.5f);

                        Context context = getApplicationContext();
                        CharSequence text = "¡Fallaste!";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                dinero2b.setEnabled(true);
                                dinero2b.setAlpha(1f);
                                dinero1b.setEnabled(true);
                                dinero1b.setAlpha(1f);
                                dinero5b.setEnabled(true);
                                dinero5b.setAlpha(1f);
                            }

                        }, 1000);
                    }

                    general=0;
                    dinero1=0;
                    dinero3=0;
                    dinero4=0;
                    dinero5=0;
                }
                else if(general==3)
                {
                    if(dinero1==1 && dinero3==1 && dinero4==1)
                    {
                        dinero2b.setEnabled(false);
                        dinero2b.setAlpha(.5f);

                        Context context = getApplicationContext();
                        CharSequence text = "¡Fallaste!";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                dinero2b.setEnabled(true);
                                dinero2b.setAlpha(1f);
                                dinero1b.setEnabled(true);
                                dinero1b.setAlpha(1f);
                                dinero3b.setEnabled(true);
                                dinero3b.setAlpha(1f);
                                dinero4b.setEnabled(true);
                                dinero4b.setAlpha(1f);
                            }

                        }, 1000);
                    }
                    else if(dinero1==1 && dinero3==1 && dinero5==1)
                    {
                        dinero2b.setEnabled(false);
                        dinero2b.setAlpha(.5f);

                        Context context = getApplicationContext();
                        CharSequence text = "¡Fallaste!";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                dinero2b.setEnabled(true);
                                dinero2b.setAlpha(1f);
                                dinero1b.setEnabled(true);
                                dinero1b.setAlpha(1f);
                                dinero3b.setEnabled(true);
                                dinero3b.setAlpha(1f);
                                dinero5b.setEnabled(true);
                                dinero5b.setAlpha(1f);
                            }

                        }, 1000);
                    }
                    else if(dinero1==1 && dinero4==1 && dinero5==1)
                    {
                        dinero2b.setEnabled(false);
                        dinero2b.setAlpha(.5f);

                        Context context = getApplicationContext();
                        CharSequence text = "¡Fallaste!";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                dinero2b.setEnabled(true);
                                dinero2b.setAlpha(1f);
                                dinero1b.setEnabled(true);
                                dinero1b.setAlpha(1f);
                                dinero4b.setEnabled(true);
                                dinero4b.setAlpha(1f);
                                dinero5b.setEnabled(true);
                                dinero5b.setAlpha(1f);
                            }

                        }, 1000);
                    }
                    else if(dinero3==1 && dinero4==1 && dinero5==1)
                    {
                        dinero2b.setEnabled(false);
                        dinero2b.setAlpha(.5f);

                        Context context = getApplicationContext();
                        CharSequence text = "¡Fallaste!";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                dinero2b.setEnabled(true);
                                dinero2b.setAlpha(1f);
                                dinero3b.setEnabled(true);
                                dinero3b.setAlpha(1f);
                                dinero4b.setEnabled(true);
                                dinero4b.setAlpha(1f);
                                dinero5b.setEnabled(true);
                                dinero5b.setAlpha(1f);
                            }

                        }, 1000);
                    }
                    general=0;
                    dinero1=0;
                    dinero3=0;
                    dinero4=0;
                    dinero5=0;
                }
            }
        });

        dinero3b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(general==0)
                {
                    general++;
                    dinero3=1;

                    dinero3b.setEnabled(false);
                    dinero3b.setAlpha(.5f);

                    Context context = getApplicationContext();
                    CharSequence text = "¡Acertaste!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                else if(general==1)
                {
                    general++;
                    dinero3=1;

                    dinero3b.setEnabled(false);
                    dinero3b.setAlpha(.5f);

                    Context context = getApplicationContext();
                    CharSequence text = "¡Acertaste!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                else if(general==2)
                {
                    general++;
                    dinero3=1;

                    dinero3b.setEnabled(false);
                    dinero3b.setAlpha(.5f);

                    Context context = getApplicationContext();
                    CharSequence text = "¡Acertaste!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                else if(general==3)
                {
                    general++;
                    dinero3=1;

                    dinero3b.setEnabled(false);
                    dinero3b.setAlpha(.5f);

                    Context context = getApplicationContext();
                    CharSequence text = "¡Acertaste!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    Intent intent=new Intent(Dinero2Activity.this,InicioActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });

        dinero4b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(general==0)
                {
                    general++;
                    dinero4=1;

                    dinero4b.setEnabled(false);
                    dinero4b.setAlpha(.5f);

                    Context context = getApplicationContext();
                    CharSequence text = "¡Acertaste!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                else if(general==1)
                {
                    general++;
                    dinero4=1;

                    dinero4b.setEnabled(false);
                    dinero4b.setAlpha(.5f);

                    Context context = getApplicationContext();
                    CharSequence text = "¡Acertaste!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                else if(general==2)
                {
                    general++;
                    dinero4=1;

                    dinero4b.setEnabled(false);
                    dinero4b.setAlpha(.5f);

                    Context context = getApplicationContext();
                    CharSequence text = "¡Acertaste!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                else if(general==3)
                {
                    general++;
                    dinero4=1;

                    dinero4b.setEnabled(false);
                    dinero4b.setAlpha(.5f);

                    Context context = getApplicationContext();
                    CharSequence text = "¡Acertaste!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    Intent intent=new Intent(Dinero2Activity.this,InicioActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });

        dinero5b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(general==0)
                {
                    general++;
                    dinero5=1;

                    dinero5b.setEnabled(false);
                    dinero5b.setAlpha(.5f);

                    Context context = getApplicationContext();
                    CharSequence text = "¡Acertaste!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                else if(general==1)
                {
                    general++;
                    dinero5=1;

                    dinero5b.setEnabled(false);
                    dinero5b.setAlpha(.5f);

                    Context context = getApplicationContext();
                    CharSequence text = "¡Acertaste!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                else if(general==2)
                {
                    general++;
                    dinero5=1;

                    dinero5b.setEnabled(false);
                    dinero5b.setAlpha(.5f);

                    Context context = getApplicationContext();
                    CharSequence text = "¡Acertaste!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                else if(general==3)
                {
                    general++;
                    dinero5=1;

                    dinero5b.setEnabled(false);
                    dinero5b.setAlpha(.5f);

                    Context context = getApplicationContext();
                    CharSequence text = "¡Acertaste!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    Intent intent=new Intent(Dinero2Activity.this,InicioActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });

        dinero6b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(general==0)
                {
                    dinero6b.setEnabled(false);
                    dinero6b.setAlpha(.5f);

                    Context context = getApplicationContext();
                    CharSequence text = "¡Fallaste!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {

                        @Override
                        public void run() {
                            dinero6b.setEnabled(true);
                            dinero6b.setAlpha(1f);
                        }

                    }, 1000);
                }
                else if(general==1)
                {
                    if(dinero1==1)
                    {
                        dinero6b.setEnabled(false);
                        dinero6b.setAlpha(.5f);

                        Context context = getApplicationContext();
                        CharSequence text = "¡Fallaste!";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                dinero6b.setEnabled(true);
                                dinero6b.setAlpha(1f);
                                dinero1b.setEnabled(true);
                                dinero1b.setAlpha(1f);
                            }

                        }, 1000);
                    }
                    else if(dinero3==1)
                    {
                        dinero6b.setEnabled(false);
                        dinero6b.setAlpha(.5f);

                        Context context = getApplicationContext();
                        CharSequence text = "¡Fallaste!";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                dinero6b.setEnabled(true);
                                dinero6b.setAlpha(1f);
                                dinero3b.setEnabled(true);
                                dinero3b.setAlpha(1f);
                            }

                        }, 1000);
                    }
                    else if(dinero4==1)
                    {
                        dinero6b.setEnabled(false);
                        dinero6b.setAlpha(.5f);

                        Context context = getApplicationContext();
                        CharSequence text = "¡Fallaste!";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                dinero6b.setEnabled(true);
                                dinero6b.setAlpha(1f);
                                dinero4b.setEnabled(true);
                                dinero4b.setAlpha(1f);
                            }

                        }, 1000);
                    }
                    else if(dinero5==1)
                    {
                        dinero6b.setEnabled(false);
                        dinero6b.setAlpha(.5f);

                        Context context = getApplicationContext();
                        CharSequence text = "¡Fallaste!";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                dinero6b.setEnabled(true);
                                dinero6b.setAlpha(1f);
                                dinero5b.setEnabled(true);
                                dinero5b.setAlpha(1f);
                            }

                        }, 1000);
                    }
                    general=0;
                    dinero1=0;
                    dinero3=0;
                    dinero4=0;
                    dinero5=0;
                }
                else if(general==2)
                {
                    if(dinero3==1 && dinero4==1)
                    {
                        dinero6b.setEnabled(false);
                        dinero6b.setAlpha(.5f);

                        Context context = getApplicationContext();
                        CharSequence text = "¡Fallaste!";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                dinero6b.setEnabled(true);
                                dinero6b.setAlpha(1f);
                                dinero3b.setEnabled(true);
                                dinero3b.setAlpha(1f);
                                dinero4b.setEnabled(true);
                                dinero4b.setAlpha(1f);
                            }

                        }, 1000);
                    }
                    else if(dinero3==1 && dinero5==1)
                    {
                        dinero6b.setEnabled(false);
                        dinero6b.setAlpha(.5f);

                        Context context = getApplicationContext();
                        CharSequence text = "¡Fallaste!";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                dinero6b.setEnabled(true);
                                dinero6b.setAlpha(1f);
                                dinero3b.setEnabled(true);
                                dinero3b.setAlpha(1f);
                                dinero5b.setEnabled(true);
                                dinero5b.setAlpha(1f);
                            }

                        }, 1000);
                    }
                    else if(dinero4==1 && dinero5==1)
                    {
                        dinero6b.setEnabled(false);
                        dinero6b.setAlpha(.5f);

                        Context context = getApplicationContext();
                        CharSequence text = "¡Fallaste!";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                dinero6b.setEnabled(true);
                                dinero6b.setAlpha(1f);
                                dinero4b.setEnabled(true);
                                dinero4b.setAlpha(1f);
                                dinero5b.setEnabled(true);
                                dinero5b.setAlpha(1f);
                            }

                        }, 1000);
                    }
                    else if(dinero1==1 && dinero3==1)
                    {
                        dinero6b.setEnabled(false);
                        dinero6b.setAlpha(.5f);

                        Context context = getApplicationContext();
                        CharSequence text = "¡Fallaste!";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                dinero6b.setEnabled(true);
                                dinero6b.setAlpha(1f);
                                dinero1b.setEnabled(true);
                                dinero1b.setAlpha(1f);
                                dinero3b.setEnabled(true);
                                dinero3b.setAlpha(1f);
                            }

                        }, 1000);
                    }
                    else if(dinero1==1 && dinero4==1)
                    {
                        dinero6b.setEnabled(false);
                        dinero6b.setAlpha(.5f);

                        Context context = getApplicationContext();
                        CharSequence text = "¡Fallaste!";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                dinero6b.setEnabled(true);
                                dinero6b.setAlpha(1f);
                                dinero1b.setEnabled(true);
                                dinero1b.setAlpha(1f);
                                dinero4b.setEnabled(true);
                                dinero4b.setAlpha(1f);
                            }

                        }, 1000);
                    }
                    else if(dinero1==1 && dinero5==1)
                    {
                        dinero6b.setEnabled(false);
                        dinero6b.setAlpha(.5f);

                        Context context = getApplicationContext();
                        CharSequence text = "¡Fallaste!";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                dinero6b.setEnabled(true);
                                dinero6b.setAlpha(1f);
                                dinero1b.setEnabled(true);
                                dinero1b.setAlpha(1f);
                                dinero5b.setEnabled(true);
                                dinero5b.setAlpha(1f);
                            }

                        }, 1000);
                    }

                    general=0;
                    dinero1=0;
                    dinero3=0;
                    dinero4=0;
                    dinero5=0;
                }
                else if(general==3)
                {
                    if(dinero1==1 && dinero3==1 && dinero4==1)
                    {
                        dinero6b.setEnabled(false);
                        dinero6b.setAlpha(.5f);

                        Context context = getApplicationContext();
                        CharSequence text = "¡Fallaste!";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                dinero6b.setEnabled(true);
                                dinero6b.setAlpha(1f);
                                dinero1b.setEnabled(true);
                                dinero1b.setAlpha(1f);
                                dinero3b.setEnabled(true);
                                dinero3b.setAlpha(1f);
                                dinero4b.setEnabled(true);
                                dinero4b.setAlpha(1f);
                            }

                        }, 1000);
                    }
                    else if(dinero1==1 && dinero3==1 && dinero5==1)
                    {
                        dinero6b.setEnabled(false);
                        dinero6b.setAlpha(.5f);

                        Context context = getApplicationContext();
                        CharSequence text = "¡Fallaste!";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                dinero6b.setEnabled(true);
                                dinero6b.setAlpha(1f);
                                dinero1b.setEnabled(true);
                                dinero1b.setAlpha(1f);
                                dinero3b.setEnabled(true);
                                dinero3b.setAlpha(1f);
                                dinero5b.setEnabled(true);
                                dinero5b.setAlpha(1f);
                            }

                        }, 1000);
                    }
                    else if(dinero1==1 && dinero4==1 && dinero5==1)
                    {
                        dinero6b.setEnabled(false);
                        dinero6b.setAlpha(.5f);

                        Context context = getApplicationContext();
                        CharSequence text = "¡Fallaste!";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                dinero6b.setEnabled(true);
                                dinero6b.setAlpha(1f);
                                dinero1b.setEnabled(true);
                                dinero1b.setAlpha(1f);
                                dinero4b.setEnabled(true);
                                dinero4b.setAlpha(1f);
                                dinero5b.setEnabled(true);
                                dinero5b.setAlpha(1f);
                            }

                        }, 1000);
                    }
                    else if(dinero3==1 && dinero4==1 && dinero5==1)
                    {
                        dinero6b.setEnabled(false);
                        dinero6b.setAlpha(.5f);

                        Context context = getApplicationContext();
                        CharSequence text = "¡Fallaste!";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();

                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                dinero6b.setEnabled(true);
                                dinero6b.setAlpha(1f);
                                dinero3b.setEnabled(true);
                                dinero3b.setAlpha(1f);
                                dinero4b.setEnabled(true);
                                dinero4b.setAlpha(1f);
                                dinero5b.setEnabled(true);
                                dinero5b.setAlpha(1f);
                            }

                        }, 1000);
                    }
                    general=0;
                    dinero1=0;
                    dinero3=0;
                    dinero4=0;
                    dinero5=0;
                }
            }
        });
    }
}
