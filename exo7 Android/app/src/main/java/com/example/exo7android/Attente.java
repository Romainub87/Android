package com.example.exo7android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.text.CollationElementIterator;

public class Attente extends AppCompatActivity {

    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attente);
        text = findViewById(R.id.textEnvoye);
        text.setText("Message à envoyer : " + MainActivity.textInput.getText());
    }
}