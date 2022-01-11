package com.example.al_quran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnAboutQuran;
    private Button btnSuralist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAboutQuran = findViewById(R.id.btn001);

        btnAboutQuran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenAboutQuran();
            }
        });

        btnSuralist = findViewById(R.id.btn002);

        btnSuralist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenSuralist();
            }
        });

    }

    public void OpenSuralist(){
        Intent intent = new Intent(this, SuraList.class);
        startActivity(intent);
    }

    public void OpenAboutQuran(){
        Intent intent = new Intent(this, About_Al_Quran.class);
        startActivity(intent);
    }

}