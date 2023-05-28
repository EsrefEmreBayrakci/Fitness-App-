package com.example.fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class yiyecekdetay extends AppCompatActivity {

    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yiyecekdetay);

        txt=findViewById(R.id.txt);

        String detay=getIntent().getStringExtra("yiyecek");
        txt.setText(detay);
    }

    @Override
    public void onBackPressed() {
        Intent intent=new Intent(yiyecekdetay.this,yiyecekActivity.class);
        startActivity(intent);
        finish();
    }
}