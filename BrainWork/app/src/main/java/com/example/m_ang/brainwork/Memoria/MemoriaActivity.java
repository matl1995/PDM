package com.example.m_ang.brainwork.Memoria;

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

public class MemoriaActivity extends AppCompatActivity {
    Button actual;
    int general=0;
    int dog=0;
    int dog_final;
    int cat=0;
    int cat_final;
    int rabbit=0;
    int rabbit_final;
    int horse=0;
    int horse_final;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memoria);

        final Button dog1=(Button) findViewById(R.id.dog1);
        final Button dog2=(Button) findViewById(R.id.dog2);

        final Button cat1=(Button) findViewById(R.id.cat1);
        final Button cat2=(Button) findViewById(R.id.cat2);

        final Button rabbit1=(Button) findViewById(R.id.rabbit1);
        final Button rabbit2=(Button) findViewById(R.id.rabbit2);

        final Button horse1=(Button) findViewById(R.id.horse1);
        final Button horse2=(Button) findViewById(R.id.horse2);

        dog1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(dog==0 && general==0)
                {
                    dog++;
                    general++;
                    dog1.setBackgroundResource(R.drawable.dog);
                    dog1.setEnabled(false);
                    actual=dog1;
                }
                else if(dog==0 && general==1)
                {
                    general--;
                    dog=0;
                    cat=0;
                    rabbit=0;
                    horse=0;

                    dog1.setBackgroundResource(R.drawable.dog);

                    Context context = getApplicationContext();
                    CharSequence text = "¡Fallaste!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {

                        @Override
                        public void run() {
                            dog1.setBackgroundResource(R.drawable.card);

                            actual.setBackgroundResource(R.drawable.card);
                            actual.setEnabled(true);
                        }

                    }, 1000);
                }
                else if(dog==1 && general==1) {
                    general--;
                    dog_final=1;
                    dog1.setBackgroundResource(R.drawable.dog);

                    Context context = getApplicationContext();
                    CharSequence text = "¡Acertaste!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    dog1.setEnabled(false);

                    if(dog_final==1 && cat_final==1 && rabbit_final==1 && horse_final==1)
                    {
                        Intent intent=new Intent(MemoriaActivity.this,InicioActivity.class);
                        startActivity(intent);
                        finish();
                    }
                }
            }
        });

        dog2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(dog==0 && general==0)
                {
                    dog++;
                    general++;
                    dog2.setBackgroundResource(R.drawable.dog);
                    dog2.setEnabled(false);
                    actual=dog2;
                }
                else if(dog==0 && general==1)
                {
                    general--;
                    dog=0;
                    cat=0;
                    rabbit=0;
                    horse=0;

                    dog2.setBackgroundResource(R.drawable.dog);

                    Context context = getApplicationContext();
                    CharSequence text = "¡Fallaste!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {

                        @Override
                        public void run() {
                            dog2.setBackgroundResource(R.drawable.card);

                            actual.setBackgroundResource(R.drawable.card);
                            actual.setEnabled(true);
                        }

                    }, 1000);
                }
                else if(dog==1 && general==1) {
                    general--;
                    dog_final=1;
                    dog2.setBackgroundResource(R.drawable.dog);

                    Context context = getApplicationContext();
                    CharSequence text = "¡Acertaste!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    dog2.setEnabled(false);

                    if(dog_final==1 && cat_final==1 && rabbit_final==1 && horse_final==1)
                    {
                        Intent intent=new Intent(MemoriaActivity.this,InicioActivity.class);
                        startActivity(intent);
                        finish();
                    }
                }
            }
        });

        cat1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(cat==0 && general==0)
                {
                    cat++;
                    general++;
                    cat1.setBackgroundResource(R.drawable.cat);
                    cat1.setEnabled(false);
                    actual=cat1;
                }
                else if(cat==0 && general==1)
                {
                    general--;
                    dog=0;
                    cat=0;
                    rabbit=0;
                    horse=0;

                    cat1.setBackgroundResource(R.drawable.cat);

                    Context context = getApplicationContext();
                    CharSequence text = "¡Fallaste!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {

                        @Override
                        public void run() {
                            cat1.setBackgroundResource(R.drawable.card);

                            actual.setBackgroundResource(R.drawable.card);
                            actual.setEnabled(true);
                        }

                    }, 1000);
                }
                else if(cat==1 && general==1) {
                    general--;
                    cat_final=1;
                    cat1.setBackgroundResource(R.drawable.cat);

                    Context context = getApplicationContext();
                    CharSequence text = "¡Acertaste!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    cat1.setEnabled(false);

                    if(dog_final==1 && cat_final==1 && rabbit_final==1 && horse_final==1)
                    {
                        Intent intent=new Intent(MemoriaActivity.this,InicioActivity.class);
                        startActivity(intent);
                        finish();
                    }
                }
            }
        });

        cat2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(cat==0 && general==0)
                {
                    cat++;
                    general++;
                    cat2.setBackgroundResource(R.drawable.cat);
                    cat2.setEnabled(false);
                    actual=cat2;
                }
                else if(cat==0 && general==1)
                {
                    general--;
                    dog=0;
                    cat=0;
                    rabbit=0;
                    horse=0;

                    cat2.setBackgroundResource(R.drawable.cat);

                    Context context = getApplicationContext();
                    CharSequence text = "¡Fallaste!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {

                        @Override
                        public void run() {
                            cat2.setBackgroundResource(R.drawable.card);

                            actual.setBackgroundResource(R.drawable.card);
                            actual.setEnabled(true);
                        }

                    }, 1000);
                }
                else if(cat==1 && general==1) {
                    general--;
                    cat_final=1;
                    cat2.setBackgroundResource(R.drawable.cat);

                    Context context = getApplicationContext();
                    CharSequence text = "¡Acertaste!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    cat2.setEnabled(false);

                    if(dog_final==1 && cat_final==1 && rabbit_final==1 && horse_final==1)
                    {
                        Intent intent=new Intent(MemoriaActivity.this,InicioActivity.class);
                        startActivity(intent);
                        finish();
                    }
                }
            }
        });

        rabbit1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(rabbit==0 && general==0)
                {
                    rabbit++;
                    general++;
                    rabbit1.setBackgroundResource(R.drawable.rabbit);
                    rabbit1.setEnabled(false);
                    actual=rabbit1;
                }
                else if(rabbit==0 && general==1)
                {
                    general--;
                    dog=0;
                    cat=0;
                    rabbit=0;
                    horse=0;

                    rabbit1.setBackgroundResource(R.drawable.rabbit);

                    Context context = getApplicationContext();
                    CharSequence text = "¡Fallaste!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {

                        @Override
                        public void run() {
                            rabbit1.setBackgroundResource(R.drawable.card);

                            actual.setBackgroundResource(R.drawable.card);
                            actual.setEnabled(true);
                        }

                    }, 1000);
                }
                else if(rabbit==1 && general==1) {
                    general--;
                    rabbit_final=1;
                    rabbit1.setBackgroundResource(R.drawable.rabbit);

                    Context context = getApplicationContext();
                    CharSequence text = "¡Acertaste!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    rabbit1.setEnabled(false);

                    if(dog_final==1 && cat_final==1 && rabbit_final==1 && horse_final==1)
                    {
                        Intent intent=new Intent(MemoriaActivity.this,InicioActivity.class);
                        startActivity(intent);
                        finish();
                    }
                }
            }
        });

        rabbit2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(rabbit==0 && general==0)
                {
                    rabbit++;
                    general++;
                    rabbit2.setBackgroundResource(R.drawable.rabbit);
                    rabbit2.setEnabled(false);
                    actual=rabbit2;
                }
                else if(rabbit==0 && general==1)
                {
                    general--;
                    dog=0;
                    cat=0;
                    rabbit=0;
                    horse=0;

                    rabbit2.setBackgroundResource(R.drawable.rabbit);

                    Context context = getApplicationContext();
                    CharSequence text = "¡Fallaste!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {

                        @Override
                        public void run() {
                            rabbit2.setBackgroundResource(R.drawable.card);

                            actual.setBackgroundResource(R.drawable.card);
                            actual.setEnabled(true);
                        }

                    }, 1000);
                }
                else if(rabbit==1 && general==1) {
                    general--;
                    rabbit_final=1;
                    rabbit2.setBackgroundResource(R.drawable.rabbit);

                    Context context = getApplicationContext();
                    CharSequence text = "¡Acertaste!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    rabbit2.setEnabled(false);

                    if(dog_final==1 && cat_final==1 && rabbit_final==1 && horse_final==1)
                    {
                        Intent intent=new Intent(MemoriaActivity.this,InicioActivity.class);
                        startActivity(intent);
                        finish();
                    }
                }
            }
        });

        horse1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(horse==0 && general==0)
                {
                    horse++;
                    general++;
                    horse1.setBackgroundResource(R.drawable.horse);
                    horse1.setEnabled(false);
                    actual=horse1;
                }
                else if(horse==0 && general==1)
                {
                    general--;
                    dog=0;
                    cat=0;
                    rabbit=0;
                    horse=0;

                    horse1.setBackgroundResource(R.drawable.horse);

                    Context context = getApplicationContext();
                    CharSequence text = "¡Fallaste!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {

                        @Override
                        public void run() {
                            horse1.setBackgroundResource(R.drawable.card);

                            actual.setBackgroundResource(R.drawable.card);
                            actual.setEnabled(true);
                        }

                    }, 1000);
                }
                else if(horse==1 && general==1) {
                    general--;
                    horse_final=1;
                    horse1.setBackgroundResource(R.drawable.horse);

                    Context context = getApplicationContext();
                    CharSequence text = "¡Acertaste!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    horse1.setEnabled(false);

                    if(dog_final==1 && cat_final==1 && rabbit_final==1 && horse_final==1)
                    {
                        Intent intent=new Intent(MemoriaActivity.this,InicioActivity.class);
                        startActivity(intent);
                        finish();
                    }
                }
            }
        });

        horse2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(horse==0 && general==0)
                {
                    horse++;
                    general++;
                    horse2.setBackgroundResource(R.drawable.horse);
                    horse2.setEnabled(false);
                    actual=horse2;
                }
                else if(horse==0 && general==1)
                {
                    general--;
                    dog=0;
                    cat=0;
                    rabbit=0;
                    horse=0;

                    horse2.setBackgroundResource(R.drawable.horse);

                    Context context = getApplicationContext();
                    CharSequence text = "¡Fallaste!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {

                        @Override
                        public void run() {
                            horse2.setBackgroundResource(R.drawable.card);

                            actual.setBackgroundResource(R.drawable.card);
                            actual.setEnabled(true);
                        }

                    }, 1000);
                }
                else if(horse==1 && general==1) {
                    general--;
                    horse_final=1;
                    horse2.setBackgroundResource(R.drawable.horse);

                    Context context = getApplicationContext();
                    CharSequence text = "¡Acertaste!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    horse2.setEnabled(false);

                    if(dog_final==1 && cat_final==1 && rabbit_final==1 && horse_final==1)
                    {
                        Intent intent=new Intent(MemoriaActivity.this,InicioActivity.class);
                        startActivity(intent);
                        finish();
                    }
                }
            }
        });
    }
}
