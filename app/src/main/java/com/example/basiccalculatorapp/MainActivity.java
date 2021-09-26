package com.example.basiccalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void addFunction(View view){
        EditText firstNumField = (EditText) findViewById(R.id.editTextFirstNumber);
        Double d1 = Double.parseDouble(firstNumField.getText().toString());

        EditText secondNumField = (EditText) findViewById(R.id.editTextSecondNumber);
        Double d2 = Double.parseDouble(secondNumField.getText().toString());

        //Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();
        goToActivity2(d1 + d2);

    }
    public void subtractFunction(View view){
        EditText firstNumField = (EditText) findViewById(R.id.editTextFirstNumber);
        Double d1 = Double.parseDouble(firstNumField.getText().toString());

        EditText secondNumField = (EditText) findViewById(R.id.editTextSecondNumber);
        Double d2 = Double.parseDouble(secondNumField.getText().toString());

        //Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();
        goToActivity2(d1 - d2);

    }

    public void multiplyFunction(View view){
        EditText firstNumField = (EditText) findViewById(R.id.editTextFirstNumber);
        Double d1 = Double.parseDouble(firstNumField.getText().toString());

        EditText secondNumField = (EditText) findViewById(R.id.editTextSecondNumber);
        Double d2 = Double.parseDouble(secondNumField.getText().toString());

        //Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();
        goToActivity2(d1*d2);

    }

    public void divideFunction(View view){
        EditText firstNumField = (EditText) findViewById(R.id.editTextFirstNumber);
        Double d1 = Double.parseDouble(firstNumField.getText().toString());

        EditText secondNumField = (EditText) findViewById(R.id.editTextSecondNumber);
        Double d2 = Double.parseDouble(secondNumField.getText().toString());

        //Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();
        goToActivity2(d1/d2);

    }

    public void goToActivity2(Double i){
        Intent intent = new Intent(this, results.class);
        intent.putExtra("message",i.toString());
        startActivity(intent);

        //Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}