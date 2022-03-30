package com.example.a4toggleimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView i1,i2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        i1=findViewById(R.id.off);
        i2=findViewById(R.id.on);

        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i1.setVisibility(View.GONE);
                i2.setVisibility(View.VISIBLE);
                Toast.makeText(getApplicationContext(),"on",Toast.LENGTH_SHORT).show();
            }
        });

        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i1.setVisibility(View.VISIBLE);
                i2.setVisibility(View.GONE);
                Toast.makeText(getApplicationContext(),"off",Toast.LENGTH_SHORT).show();
            }
        });

    }
}