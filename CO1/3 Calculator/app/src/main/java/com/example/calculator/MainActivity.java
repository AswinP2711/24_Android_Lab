package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et1;
    private EditText et2;
    private TextView tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText) findViewById(R.id.etnumone);
        et2=(EditText) findViewById(R.id.etnumtwo);
        tvResult=(TextView) findViewById(R.id.ResultView);
    }

    public void btnsum(View view) {
        int n1=Integer.parseInt(et1.getText().toString());
        int n2=Integer.parseInt(et2.getText().toString());
        int sum=n1+n2;
        tvResult.setText(String.valueOf(sum));
    }

    public void subbtn(View view) {
        int n1=Integer.parseInt(et1.getText().toString());
        int n2=Integer.parseInt(et2.getText().toString());
        int sub=n1-n2;
        tvResult.setText(String.valueOf(sub));
    }

    public void btndiv(View view) {
        int n1=Integer.parseInt(et1.getText().toString());
        int n2=Integer.parseInt(et2.getText().toString());
        int div=n1/n2;
        tvResult.setText(String.valueOf(div));
    }

    public void btnmul(View view) {
        int n1=Integer.parseInt(et1.getText().toString());
        int n2=Integer.parseInt(et2.getText().toString());
        int mul=n1*n2;
        tvResult.setText(String.valueOf(mul));
    }
}