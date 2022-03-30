package com.example.adapterlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView lv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv1 = findViewById(R.id.lv);

        String[] colors = {"red","green","blue"};

        ArrayAdapter<String> colorAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,colors);
         lv1.setAdapter(colorAdapter);
    }
}