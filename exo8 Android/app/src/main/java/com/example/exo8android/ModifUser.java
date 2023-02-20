package com.example.exo8android;

import static com.example.exo8android.MainActivity.nomPers;
import static com.example.exo8android.MainActivity.prenomPers;
import static com.example.exo8android.MainActivity.telPers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ModifUser extends AppCompatActivity {

    private  Button retour;
    private Button annuler;
    public static TextView nom;
    public static TextView prenom;
    public static TextView tel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modif_user);
        prenom = findViewById(R.id.prenom);
        prenom.setText(prenomPers.getText());
        nom = findViewById(R.id.nom);
        nom.setText(nomPers.getText());
        tel = findViewById(R.id.tel);
        tel.setText(telPers.getText());

        retour = findViewById(R.id.retour);
        retour.setOnClickListener(view -> {
            Intent retour = new Intent(ModifUser.this, MainActivity.class);
            startActivity(retour);
        });

        annuler = findViewById(R.id.annuler);
        annuler.setOnClickListener(view -> {
            Intent annuler = new Intent(ModifUser.this, MainActivity.class);
            startActivity(annuler);
        });
    }
}