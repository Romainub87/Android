package com.example.exo9android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mms;
    private Button sms;
    private Button appel;
    private Button web;
    private Button map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sms = findViewById(R.id.sms);
        sms.setOnClickListener(view -> {
            Uri uri = Uri.parse("smsto:0752642686");
            Intent SMS = new Intent(Intent.ACTION_SENDTO, uri);
            SMS.putExtra("sms body", "SMS text");
            startActivity(SMS);
            printName(sms);
        });
        mms = findViewById(R.id.mms);
        mms.setOnClickListener(view -> {
            Uri uri = Uri.parse("mmsto:0752642686");
            Intent MMS = new Intent(Intent.ACTION_SENDTO, uri);
            startActivity(MMS);
            printName(mms);
        });
        appel = findViewById(R.id.appel);
        appel.setOnClickListener(view -> {
            Uri uri = Uri.parse("tel:0752642686");
            Intent tel = new Intent(Intent.ACTION_DIAL, uri);
            startActivity(tel);
            printName(appel);
        });
        web = findViewById(R.id.web);
        web.setOnClickListener(view -> {
            Uri webpage = Uri.parse("http://romainub87.github.io/Romain");
            Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
            startActivity(webIntent);
            printName(web);
        });
        map = findViewById(R.id.map);
        map.setOnClickListener(view -> {
            Uri location = Uri.parse("geo:0,0?q=1600+Amphitheatre+Parkway,+Mountain+View,+CA+94043"); // z param is zoom level
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
            startActivity(mapIntent);
            printName(map);
        });

    }

    public void printName(Button button) {
        System.out.println(button.getText());
    }

}