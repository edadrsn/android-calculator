package com.example.calculatorapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView resultText;
    private Button add,sub,mult,div,mod,reset;
    private EditText num1,num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        resultText=(TextView)findViewById(R.id.result);
        num1=(EditText)findViewById(R.id.input1);
        num2=(EditText)findViewById(R.id.input2);
        add=(Button)findViewById(R.id.add);
        sub=(Button)findViewById(R.id.sub);
        mult=(Button)findViewById(R.id.mult);
        div=(Button)findViewById(R.id.div);
        mod=(Button)findViewById(R.id.mod);
        reset=(Button)findViewById(R.id.reset);
    }

    public void addition(View view){
        if(num1.getText().toString().matches("")  || num2.getText().toString().matches("") ) {
            Toast.makeText(MainActivity.this,"Please Enter Numbers", Toast.LENGTH_SHORT).show();
        }
        else{
            int number1 = Integer.parseInt(num1.getText().toString());
            int number2 = Integer.parseInt(num2.getText().toString());
            int result = number1 + number2;
            resultText.setText("RESULT: " + result);
        }
    }

    public void subtruction(View view){
        if(num1.getText().toString().matches("")  || num2.getText().toString().matches("") ) {
            Toast.makeText(MainActivity.this,"Please Enter Numbers", Toast.LENGTH_SHORT).show();
        }
        else {
            int number1 = Integer.parseInt(num1.getText().toString());
            int number2 = Integer.parseInt(num2.getText().toString());
            int result = number1 - number2;
            resultText.setText("RESULT: " + result);
        }
    }

    public void multiplication(View view){
        if(num1.getText().toString().matches("") || num2.getText().toString().matches("") ) {
            Toast.makeText(MainActivity.this,"Please Enter Numbers", Toast.LENGTH_SHORT).show();
        }
        else {
            int number1 = Integer.parseInt(num1.getText().toString());
            int number2 = Integer.parseInt(num2.getText().toString());
            int result = number1 * number2;
            resultText.setText("RESULT: " + result);
        }
    }

    public void division(View view){
        if(num1.getText().toString().matches("")  || num2.getText().toString().matches("")) {
            Toast.makeText(MainActivity.this,"Please Enter Numbers", Toast.LENGTH_SHORT).show();
        }
        else if(num2.getText().toString().matches("0")){
            Toast.makeText(MainActivity.this,"Number 2 isn't allowed to be 0",Toast.LENGTH_SHORT).show();
        }
        else {
            int number1 = Integer.parseInt(num1.getText().toString());
            int number2 = Integer.parseInt(num2.getText().toString());
            int result = number1 / number2;
            resultText.setText("RESULT: " + result);
        }
    }

    public void mod(View view){
        if(num1.getText().toString().matches("")  || num2.getText().toString().matches("")) {
            Toast.makeText(MainActivity.this,"Please Enter Numbers", Toast.LENGTH_SHORT).show();
        }
        else if(num2.getText().toString().matches("0")){
            Toast.makeText(MainActivity.this,"Number 2 isn't allowed to be 0",Toast.LENGTH_SHORT).show();
        }
        else {
            int number1 = Integer.parseInt(num1.getText().toString());
            int number2 = Integer.parseInt(num2.getText().toString());
            int result = number1 % number2;
            resultText.setText("RESULT: " + result);
        }
    }

    public void resetInput(View view){
        num1.setText("");
        num2.setText("");
        resultText.setText("RESULT: ");
    }
}