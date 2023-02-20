package com.example.exo7android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button envoyer;
    public static EditText textInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        envoyer = findViewById(R.id.envoyer);
        textInput = findViewById(R.id.textInput);

        envoyer.setOnClickListener(view -> {
            Intent EnAttente = new Intent(MainActivity.this, Attente.class);
            startActivity(EnAttente);
        });

        
    }
}