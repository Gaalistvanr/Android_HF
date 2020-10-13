package com.example.hazi1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText number1=findViewById(R.id.number1);
        final EditText number2=findViewById(R.id.number2);
        final TextView eredmeny=findViewById(R.id.eredmeny);
        Button plus=findViewById(R.id.plus);
        Button minus=findViewById(R.id.minus);
        Button multi=findViewById(R.id.multi);
        Button divide=findViewById(R.id.divide);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a=Double.parseDouble(number1.getText().toString()) + Double.parseDouble(number2.getText().toString());
                eredmeny.setText(Double.toString(a));
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a=Double.parseDouble(number1.getText().toString()) - Double.parseDouble(number2.getText().toString());
                eredmeny.setText(Double.toString(a));
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a=Double.parseDouble(number1.getText().toString()) * Double.parseDouble(number2.getText().toString());
                eredmeny.setText(Double.toString(a));
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a=Double.parseDouble(number1.getText().toString()) / Double.parseDouble(number2.getText().toString());
                eredmeny.setText(Double.toString(a));
            }
        });


    }
}