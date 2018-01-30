package com.example.poly.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    private EditText Et1;
    private EditText Et2;
    private Button btnplus;
    private Button btnMinus;
    private Button btnMultiply;
    private Button btnDivide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Et1 = findViewById(R.id.Et1);
        Et2 = findViewById(R.id.Et2);
        btnplus = findViewById(R.id.btnplus);
        btnMinus = findViewById(R.id.btnMinus);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(Et1.getText().toString());
                int number2 = Integer.parseInt(Et2.getText().toString());
                plus(number1,number2);
                Toast.makeText(MainActivity.this,String.valueOf(plus(number1,number2)),Toast.LENGTH_SHORT).show();
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(Et1.getText().toString());
                int number2 = Integer.parseInt(Et2.getText().toString());
                Minus(number1,number2);
                Toast.makeText(MainActivity.this,String.valueOf(Minus(number1,number2)),Toast.LENGTH_SHORT).show();
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(Et1.getText().toString());
                int number2 = Integer.parseInt(Et2.getText().toString());
                Multiply(number1,number2);
                Toast.makeText(MainActivity.this,String.valueOf(Multiply(number1,number2)),Toast.LENGTH_SHORT).show();
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(Et1.getText().toString());
                int number2 = Integer.parseInt(Et2.getText().toString());
                Divide(number1,number2);
                Toast.makeText(MainActivity.this,String.valueOf(Divide(number1,number2)),Toast.LENGTH_SHORT).show();
            }
        });
    }
    private int plus (int number1,int number2){
        int sum = number1+number2;
        return sum;
    }
    private int Minus (int number1,int number2){
        int sum = number1-number2;
        return sum;
    }
    private int Multiply (int number1,int number2){
        int sum = number1*number2;
        return sum;
    }
    private int Divide (int number1,int number2){
        if (number2==0){
            return 0;
        }else
            return number1/number2;
    }
}
