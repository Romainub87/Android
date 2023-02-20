package com.example.exo8android;

import static com.example.exo8android.MainActivity.codePostal;
import static com.example.exo8android.MainActivity.nomRue;
import static com.example.exo8android.MainActivity.numRue;
import static com.example.exo8android.MainActivity.ville;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ModifAdresse extends AppCompatActivity {

    private Button retour;
    private Button annuler;
    private TextView codePostP;
    private TextView nomRueP;
    private TextView numRueP;
    private TextView villeP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modif_adresse);

        villeP = findViewById(R.id.ville);
        villeP.setText(ville.getText());
        nomRueP = findViewById(R.id.nomRue);
        nomRueP.setText(nomRue.getText());
        numRueP = findViewById(R.id.numRue);
        numRueP.setText(numRue.getText());
        codePostP = findViewById(R.id.codePost);
        codePostP.setText(codePostal.getText());

        retour = findViewById(R.id.retour);
        retour.setOnClickListener(view -> {
            Intent retour = new Intent(ModifAdresse.this, MainActivity.class);
            startActivity(retour);
        });

        annuler = findViewById(R.id.annuler);
        annuler.setOnClickListener(view -> {
            Intent annuler = new Intent(ModifAdresse.this, MainActivity.class);
            startActivity(annuler);
        });
    }
}