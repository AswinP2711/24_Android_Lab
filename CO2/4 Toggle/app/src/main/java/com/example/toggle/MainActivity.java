package com.example.toggle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCustomToggleClick(View view) {
        Toast.makeText(this,"CustomToggle",Toast.LENGTH_SHORT).show();
    }

    public void onDefaultToggleClick(View view) {
        Toast.makeText(this,"DefaultToggle",Toast.LENGTH_SHORT).show();
    }
}