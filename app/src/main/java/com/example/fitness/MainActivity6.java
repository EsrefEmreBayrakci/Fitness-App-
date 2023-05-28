package com.example.fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {

    String deger;
    Button basla;
    private CountDownTimer zaman1;
    TextView txt;
    private boolean dkBasla;
    private long mills;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        Intent intent=getIntent();
        deger=intent.getStringExtra("deger");

        int intdeger=Integer.valueOf(deger);

        switch (intdeger){

            case 1:
                setContentView(R.layout.activity2_1);
                break;
            case 2:
                setContentView(R.layout.activity2_2);
                break;
            case 3:
                setContentView(R.layout.activity2_3);
                break;
            case 4:
                setContentView(R.layout.activity2_4);
                break;
            case 5:
                setContentView(R.layout.activity2_5);
                break;
            case 6:
                setContentView(R.layout.activity2_6);
                break;
            case 7:
                setContentView(R.layout.activity2_7);
                break;
            case 8:
                setContentView(R.layout.activity2_8);
                break;
            case 9:
                setContentView(R.layout.activity2_9);
                break;
            case 10:
                setContentView(R.layout.activity2_10);
                break;
            case 11:
                setContentView(R.layout.activity2_11);
                break;
            case 12:
                setContentView(R.layout.activity2_12);
                break;
            case 13:
                setContentView(R.layout.activity2_13);
                break;
            case 14:
                setContentView(R.layout.activity2_14);
                break;
            case 15:
                setContentView(R.layout.activity2_15);
                break;
        }

        basla=findViewById(R.id.basla);
        txt=findViewById(R.id.zaman);


        basla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (dkBasla){
                    stoptimer();

                }

                else {
                    startTimer();

                }
            }

        });

    }

    private void stoptimer(){
        zaman1.cancel();

        dkBasla=false;
        basla.setText("Başla");
    }

    private void startTimer(){

        final CharSequence deger1=txt.getText();
        String num1=deger1.toString();
        String num2=num1.substring(0,2);
        String num3=num1.substring(3,5);

        final int number = Integer.valueOf(num2) *60+ Integer.valueOf(num3);
        mills=number*1000;

        zaman1 = new CountDownTimer(mills,1000) {
            @Override
            public void onTick(long l) {

                mills = l;
                updateTimer();

            }

            @Override
            public void onFinish() {

                int yenideger = Integer.valueOf(deger)+1;
                if (yenideger<=7){

                    Intent intent = new Intent(MainActivity6.this,MainActivity6.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    intent.putExtra("deger",String.valueOf(yenideger));
                    startActivity(intent);
                }

                else {

                    yenideger=1;
                    Intent intent = new Intent(MainActivity6.this,MainActivity6.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    intent.putExtra("deger",String.valueOf(yenideger));
                    startActivity(intent);
                }


            }
        }.start();
        basla.setText("Duraklat");
        dkBasla=true;
    }

    private void updateTimer(){

        int dk = (int) mills/60000;
        int sn = (int) mills%60000/1000;

        String ktxt="";

        if (dk<10)
            ktxt="0";
        ktxt=ktxt+dk+":";

        if (sn<10)
            ktxt="0";
        ktxt+=sn;
        txt.setText(ktxt);



    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();
    }
}