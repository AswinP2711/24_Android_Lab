package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText username,password;
    private TextView info;
    private Button login;
    int count=5;
    String uname,passwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username=findViewById(R.id.etuser);
        password=findViewById(R.id.etpass);
        login=findViewById(R.id.lgbtn);
        info=findViewById(R.id.logview);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uname=username.getText().toString();
                passwd=password.getText().toString();

                if (uname.equals("aswin") && passwd.equals("5102"))
                {
                    Toast.makeText(getApplicationContext(),"login Success",Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MainActivity.this,MainActivity2.class));
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Login Failed!!!",Toast.LENGTH_SHORT).show();
                    count--;
                    info.setText("Login attempts remaining : "+count);
                    if (count==0)
                    {
                        Toast.makeText(MainActivity.this,"Login Button Disabled",Toast.LENGTH_SHORT).show();
                        login.setEnabled(false);
                    }
                }
            }
        });
    }
}