package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Spinner sp;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp=findViewById(R.id.sp1);
        tv=findViewById(R.id.tv1);

        String[] name={"select","Aswin","Dilshad","Vyshak"};
        String[] age={"Result","22","24","26"};

        ArrayAdapter<String> nameAdapter=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,name);
        sp.setAdapter(nameAdapter);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                switch (i){
                    case 0:
                        tv.setText(age[i]);
                        break;
                    case 1:
                        tv.setText(age[i]);
                        break;
                    case 2:
                        tv.setText(age[i]);
                        break;
                    case 3:
                        tv.setText(age[i]);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}