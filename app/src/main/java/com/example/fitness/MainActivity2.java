package com.example.fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    ImageView splashicon;
    TextView ad;
    Animation anim1,anim2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        splashicon=findViewById(R.id.splashicon);
        anim1= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.anim1);
        splashicon.setAnimation(anim1);


        ad=findViewById(R.id.ad);
        anim2= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.anim2);
        ad.setAnimation(anim2);





        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                finish();

            }
        },3500);


    }
}