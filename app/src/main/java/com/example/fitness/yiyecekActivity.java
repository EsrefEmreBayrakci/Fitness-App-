package com.example.fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class yiyecekActivity extends AppCompatActivity {

    ListView liste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yiyecek);

        liste=findViewById(R.id.liste);

        String[] yiyecek=getResources().getStringArray(R.array.yiyecek);
        final String[] dyiyecek=getResources().getStringArray(R.array.detay);


        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.sira,R.id.siratxt,yiyecek );
        liste.setAdapter(adapter);

        liste.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String t=dyiyecek[i];
                Intent intent=new Intent(yiyecekActivity.this,yiyecekdetay.class);
                intent.putExtra("yiyecek",t);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onBackPressed() {
        Intent intent=new Intent(yiyecekActivity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}