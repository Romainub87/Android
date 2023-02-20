package com.example.exo8android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button modifUser;
    private Button modifAdresse;
    private EditText nomPers;
    private EditText prenomPers;
    private EditText telPers;
    private EditText numRue;
    private EditText nomRue;
    private EditText ville;
    private EditText codePostal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Assignation des champs d'input
        nomPers = findViewById(R.id.nom);
        prenomPers = findViewById(R.id.prenom);
        telPers = findViewById(R.id.tel);
        numRue = findViewById(R.id.numRue);
        nomRue = findViewById(R.id.nomRue);
        ville = findViewById(R.id.ville);
        codePostal = findViewById(R.id.codePostal);

        // Assignation des boutons modif
        modifAdresse = findViewById(R.id.modifAdresse);
        modifUser = findViewById(R.id.modifPers);

        modifAdresse.setOnClickListener(view -> {
            Intent modifA = new Intent(MainActivity.this, ModifAdresse.class);
            startActivity(modifA);

        });

        modifUser.setOnClickListener(view -> {
            Intent modifUser = new Intent(MainActivity.this, ModifUser.class);
            startActivity(modifUser);
        });
    }
}