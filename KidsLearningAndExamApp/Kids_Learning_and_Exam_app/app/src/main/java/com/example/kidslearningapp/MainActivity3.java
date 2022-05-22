package com.example.kidslearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        String name = getIntent().getStringExtra("name").toLowerCase();
        ImageView img = findViewById(R.id.imageView);
        int iid = getResources().getIdentifier(name,"drawable",getPackageName());
        img.setImageResource(iid);
        int imd = getResources().getIdentifier(name,"raw",getPackageName());
        MediaPlayer mdp = MediaPlayer.create(getApplicationContext(),imd);
        mdp.start();


    }

}