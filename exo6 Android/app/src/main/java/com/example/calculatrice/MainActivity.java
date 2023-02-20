package com.example.calculatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button Plus;
    Button Moins;
    Button Mult;
    Button Div;
    EditText number1;
    EditText number2;
    TextView resultat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Plus = findViewById(R.id.plus);
        Moins  =findViewById(R.id.moins);
        Mult = findViewById(R.id.multiplier);
        Div = findViewById(R.id.diviser);
        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        resultat = findViewById(R.id.Resultat);

        Div.setOnClickListener(v -> divClick());
        Mult.setOnClickListener(v -> multClick());
        Plus.setOnClickListener(v -> plusClick());
        Moins.setOnClickListener(v -> moinsClick());

        number1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                Plus.setEnabled(!s.toString().isEmpty());
                Moins.setEnabled(!s.toString().isEmpty());
                Mult.setEnabled(!s.toString().isEmpty());
                Div.setEnabled(!s.toString().isEmpty());
            }
        });

        number2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                Plus.setEnabled(!s.toString().isEmpty());
                Moins.setEnabled(!s.toString().isEmpty());
                Mult.setEnabled(!s.toString().isEmpty());
                Div.setEnabled(!s.toString().isEmpty());
            }
        });


    }

    public void divClick() {
        String s1 = number1.getText().toString();
        String s2 = number2.getText().toString();
        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);
        float result = n1 / n2;
        String resultStr = String.valueOf(result);
        System.out.println(result);
        resultat.setText(resultStr);
    };

    public void plusClick() {
        String s1 = number1.getText().toString();
        String s2 = number2.getText().toString();
        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);
        float result = n1 + n2;
        String resultStr = String.valueOf(result);
        System.out.println(result);
        resultat.setText(resultStr);
    };

    public void moinsClick() {
        String s1 = number1.getText().toString();
        String s2 = number2.getText().toString();
        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);
        float result = n1 - n2;
        String resultStr = String.valueOf(result);
        System.out.println(result);
        resultat.setText(resultStr);
    };

    public void multClick() {
        String s1 = number1.getText().toString();
        String s2 = number2.getText().toString();
        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);
        float result = n1 * n2;
        String resultStr = String.valueOf(result);
        System.out.println(result);
        resultat.setText(resultStr);
    };


}