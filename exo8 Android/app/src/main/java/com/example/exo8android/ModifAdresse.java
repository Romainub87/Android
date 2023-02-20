package com.example.exo8android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ModifAdresse extends AppCompatActivity {

    private Button retour;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modif_adresse);

        retour = findViewById(R.id.retour);
        retour.setOnClickListener(view -> {
            Intent retour = new Intent(ModifAdresse.this, MainActivity.class);
            startActivity(retour);
        });
    }
}