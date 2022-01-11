package com.example.al_quran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class sura1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sura1);
        getSupportActionBar().setTitle("সূরা-ফাতেহা");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}