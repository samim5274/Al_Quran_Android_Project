package com.example.al_quran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class sura3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sura3);
        getSupportActionBar().setTitle("সূরা আল-ইমরান");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}