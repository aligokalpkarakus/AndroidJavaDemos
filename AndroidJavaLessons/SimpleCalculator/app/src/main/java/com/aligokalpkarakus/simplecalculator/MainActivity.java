package com.aligokalpkarakus.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText text1;
    EditText text2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = findViewById(R.id.text);
        text2 = findViewById(R.id.text2);
        result = findViewById(R.id.result);

    }

    public void sum(View viev){

        if(text1.getText().toString().matches("") || text2.getText().toString().matches("")){
            result.setText("Enter Number!");
        }else{
            int number1 = Integer.parseInt(text1.getText().toString());
            int number2 = Integer.parseInt(text2.getText().toString());

            int resultttt = number1 + number2;

            result.setText("Result: " + resultttt);
        }


    }

    public void deduct(View viev){
        if(text1.getText().toString().matches("") || text2.getText().toString().matches("")){
            result.setText("Enter Number!");
        }else{
            int number1 = Integer.parseInt(text1.getText().toString());
            int number2 = Integer.parseInt(text2.getText().toString());

            int resultttt = number1 - number2;

            result.setText("Result: " + resultttt);
        }
    }

    public void multiply(View viev){
        if(text1.getText().toString().matches("") || text2.getText().toString().matches("")){
            result.setText("Enter Number!");
        }else{
            int number1 = Integer.parseInt(text1.getText().toString());
            int number2 = Integer.parseInt(text2.getText().toString());

            int resultttt = number1 * number2;

            result.setText("Result: " + resultttt);
        }
    }

    public void divide(View viev){
        if(text1.getText().toString().matches("") || text2.getText().toString().matches("")){
            result.setText("Enter Number!");
        }else{
            int number1 = Integer.parseInt(text1.getText().toString());
            int number2 = Integer.parseInt(text2.getText().toString());

            int resultttt = number1 / number2;

            result.setText("Result: " + resultttt);
        }
    }




}