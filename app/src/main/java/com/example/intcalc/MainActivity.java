package com.example.intcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnclick(View view) {

        EditText txt1=findViewById(R.id.txt1);
        int amt=Integer.parseInt(txt1.getText().toString());

        EditText txt2=findViewById(R.id.txt2);
        int rate=Integer.parseInt(txt2.getText().toString());

        EditText txt3=findViewById(R.id.txt3);
        int d=Integer.parseInt(txt3.getText().toString());

        int i=((amt*rate)/100)*d;
        int total=amt+i;

        EditText txt4=findViewById(R.id.txt4);
        txt4.setText("" + i);

        EditText txt5=findViewById(R.id.txt5);
        txt5.setText("" + total);













    }
}