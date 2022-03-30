package com.example.calculatorgrid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText n1,n2;
    private TextView tv;
    private Button bt1,bt2,bt3,bt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1=findViewById(R.id.num1);
        n2=findViewById(R.id.num2);
        
        tv=findViewById(R.id.tevi);

        bt1=findViewById(R.id.sum);
        bt2=findViewById(R.id.sub);
        bt3=findViewById(R.id.mul);
        bt4=findViewById(R.id.div);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nu1=Integer.parseInt(n1.getText().toString());
                int nu2=Integer.parseInt(n2.getText().toString());

                int Result=nu1+nu2;
                tv.setText(Integer.toString(Result));
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nu1=Integer.parseInt(n1.getText().toString());
                int nu2=Integer.parseInt(n2.getText().toString());
                int Result=nu1-nu2;
                tv.setText(Integer.toString(Result));
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nu1=Integer.parseInt(n1.getText().toString());
                int nu2=Integer.parseInt(n2.getText().toString());
                int Result=nu1*nu2;
                tv.setText(Integer.toString(Result));
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nu1=Integer.parseInt(n1.getText().toString());
                int nu2=Integer.parseInt(n2.getText().toString());
                int Result=nu1/nu2;
                tv.setText(Integer.toString(Result));
            }
        });

    }
}