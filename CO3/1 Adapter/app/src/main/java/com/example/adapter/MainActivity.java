package com.example.adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

class EmptyListException extends Exception{
    public String toString(){

        return "Empty List Exception";
    }
}

public class MainActivity extends AppCompatActivity {
    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv=findViewById(R.id.lv1);
        String[] colors={};

        ArrayAdapter<String> colorAdapter=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,colors);
        try {
            if (colorAdapter.getCount()<=0){
                throw new EmptyListException();
            }else {
                lv.setAdapter(colorAdapter);
            }
        }catch (EmptyListException e){
            Toast.makeText(getApplicationContext(),e.toString(),Toast.LENGTH_SHORT).show();
        }
    }
}