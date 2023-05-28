package com.example.fitness;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button basla1,basla2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar=findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        basla1=findViewById(R.id.basla1);
        basla2=findViewById(R.id.basla2);

        basla1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity3.class );
                startActivity(intent);

            }
        });


        basla2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity4.class );
                startActivity(intent);
            }
        });
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

    public void once(View view) {

        Intent intent = new Intent(MainActivity.this,MainActivity3.class );
        startActivity(intent);
    }

    public void sonra(View view) {

        Intent intent = new Intent(MainActivity.this,MainActivity4.class );
        startActivity(intent);
    }

    public void yiyecek(View view) {
        Intent intent = new Intent(MainActivity.this,yiyecekActivity.class );
        startActivity(intent);
    }
}