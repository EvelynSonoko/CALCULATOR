package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.EditText;
import  android.widget.TextView;
import android.os.Bundle;
import android.view.View;
import java.math.*;

public class MainActivity extends AppCompatActivity {
    private EditText editText1, editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addition(View view) {
        int num1, num2, result;
        editText1 = findViewById(R.id.num1);
        editText2 = findViewById(R.id.num2);
        num1 = Integer.parseInt(editText1.getText().toString());
        num2 = Integer.parseInt(editText2.getText().toString());
        result = num1 + num2;
        /*textView.setText(Integer.toString(result));*/
        dis(result);
    }

    public void dis(int num) {
        TextView displayInteger = (TextView) findViewById(R.id.textView2);
        displayInteger.setText(""+num);
    }

    public void sub(View view) {
        int num1, num2, result;
        editText1 = findViewById(R.id.num1);
        editText2 = findViewById(R.id.num2);
        num1 = Integer.parseInt(editText1.getText().toString());
        num2 = Integer.parseInt(editText2.getText().toString());
        result = num2 - num1;
        dis(result);
    }

    public void mult(View view) {
        int num1, num2, result;
        editText1 = findViewById(R.id.num1);
        editText2 = findViewById(R.id.num2);
        num1 = Integer.parseInt(editText1.getText().toString());
        num2 = Integer.parseInt(editText2.getText().toString());
        result = num1 * num2;
        dis(result);
    }

    public void div(View view){
        int num1, num2, result;
        editText1 = findViewById(R.id.num1);
        editText2 = findViewById(R.id.num2);
        num1 = Integer.parseInt(editText1.getText().toString());
        num2 = Integer.parseInt(editText2.getText().toString());
        result = num2 / num1;
        dis(result);
    }

    public void modu(View view) {
        int num1, num2, result;
        editText1 = findViewById(R.id.num1);
        editText2 = findViewById(R.id.num2);
        num1 = Integer.parseInt(editText1.getText().toString());
        num2 = Integer.parseInt(editText2.getText().toString());
        result = num2 % num1;
        dis(result);
    }

    public void pow(View view) {
        int num1, num2, result;
        editText1 = findViewById(R.id.num1);
        editText2 = findViewById(R.id.num2);
        num1 = Integer.parseInt(editText1.getText().toString());
        num2 = Integer.parseInt(editText2.getText().toString());
        result = (int) Math.pow(num1,num2);
        dis(result);
    }
}

