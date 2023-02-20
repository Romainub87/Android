package com.example.exo9android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button mms;
    private Button sms;
    private Button appel;
    private Button web;
    private Button map;
    private EditText inputTel;
    private EditText url;
    private EditText longitude;
    private EditText latitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputTel = findViewById(R.id.inputTel);
        url = findViewById(R.id.url);
        longitude = findViewById(R.id.longitude);
        latitude = findViewById(R.id.latitude);

        sms = findViewById(R.id.sms);
        sms.setOnClickListener(view -> {
            Uri uri = Uri.parse("smsto:"+ inputTel.getText());
            Intent SMS = new Intent(Intent.ACTION_SENDTO, uri);
            SMS.putExtra("sms body", "SMS text");
            startActivity(SMS);
            printName(sms);
        });
        mms = findViewById(R.id.mms);
        mms.setOnClickListener(view -> {
            Uri uri = Uri.parse("mmsto:" + inputTel.getText());
            Intent MMS = new Intent(Intent.ACTION_SENDTO, uri);
            startActivity(MMS);
            printName(mms);
        });
        appel = findViewById(R.id.appel);
        appel.setOnClickListener(view -> {
            Uri uri = Uri.parse("tel:" + inputTel.getText());
            Intent tel = new Intent(Intent.ACTION_DIAL, uri);
            startActivity(tel);
            printName(appel);
        });
        web = findViewById(R.id.web);
        web.setOnClickListener(view -> {
            Uri webpage = Uri.parse(String.valueOf(url.getText()));
            Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
            startActivity(webIntent);
            printName(web);
        });
        map = findViewById(R.id.map);
        map.setOnClickListener(view -> {
            Uri location = Uri.parse("geo:" + latitude.getText() + "," + longitude.getText() ); // z param is zoom level
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
            startActivity(mapIntent);
            printName(map);
        });

    }

    public void printName(Button button) {
        System.out.println(button.getText());
    }

}