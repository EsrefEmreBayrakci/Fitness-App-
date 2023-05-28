package com.example.fitness;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity4 extends AppCompatActivity {

    int[] array;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Toolbar toolbar=findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        array =new int[]{
                R.id.hareket1,R.id.hareket2,R.id.hareket3,R.id.hareket4,R.id.hareket5,R.id.hareket6,R.id.hareket7,R.id.hareket8,
                R.id.hareket9,R.id.hareket10,R.id.hareket11,R.id.hareket12,R.id.hareket13,R.id.hareket14,R.id.hareket15,
        };
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.gizlilk){
            return true;
        }

        if (id == R.id.sart){
            return true;
        }

        if (id == R.id.degerlendirme){
            return true;
        }

        if (id == R.id.paylas){
            return true;
        }
        return true;
    }

    public void tiklama(View view) {

        for(int i=0; i<array.length; i++){
            if (view.getId() == array[i]){
                int deger=i+1;
                Log.i("FIRST",String.valueOf(deger));

                Intent intent=new Intent(MainActivity4.this,MainActivity6.class);
                intent.putExtra("deger",String.valueOf(deger));
                startActivity(intent);
            }
        }
    }
}