package com.example.tipcalculator2021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView numberInPartyResult;
    EditText totalBillAmount;
    private View editTextAmount;
    private View textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editTextAmount = findViewById(R.id.editTextAmount);
        textView = findViewById(R.id.textView);
    }


    public void buttonCalculator(View view) {
        Double money = Double.parseDouble(editTextAmount.getText().toString());
        textViewResult.setText(money.toString());
    }

    }
