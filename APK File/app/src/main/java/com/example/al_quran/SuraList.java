package com.example.al_quran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SuraList extends AppCompatActivity {

    private Button surah1;
    private Button surah2;
    private Button surah3;
    private Button surah4;
    private Button surah5;
    private Button surah6;
    private Button surah7;
    private Button surah8;
    private Button surah9;
    private Button surah10;
    private Button surah11;
    private Button surah12;
    private Button surah13;
    private Button surah14;
    private Button surah15;
    private Button surah16;
    private Button surah17;
    private Button surah18;
    private Button surah19;
    private Button surah20;
    private Button surah21;
    private Button surah22;
    private Button surah23;
    private Button surah24;
    private Button surah25;
    private Button surah26;
    private Button surah27;
    private Button surah28;
    private Button surah29;
    private Button surah30;
    private Button surah31;
    private Button surah32;
    private Button surah33;
    private Button surah34;
    private Button surah35;
    private Button surah36;
    private Button surah37;
    private Button surah38;
    private Button surah39;
    private Button surah40;
    private Button surah41;
    private Button surah42;
    private Button surah43;
    private Button surah44;
    private Button surah45;
    private Button surah46;
    private Button surah47;
    private Button surah48;
    private Button surah49;
    private Button surah50;
    private Button surah51;
    private Button surah52;
    private Button surah53;
    private Button surah54;
    private Button surah55;
    private Button surah56;
    private Button surah57;
    private Button surah58;
    private Button surah59;
    private Button surah60;
    private Button surah61;
    private Button surah62;
    private Button surah63;
    private Button surah64;
    private Button surah65;
    private Button surah66;
    private Button surah67;
    private Button surah68;
    private Button surah69;
    private Button surah70;
    private Button surah71;
    private Button surah72;
    private Button surah73;
    private Button surah74;
    private Button surah75;
    private Button surah76;
    private Button surah77;
    private Button surah78;
    private Button surah79;
    private Button surah80;
    private Button surah81;
    private Button surah82;
    private Button surah83;
    private Button surah84;
    private Button surah85;
    private Button surah86;
    private Button surah87;
    private Button surah88;
    private Button surah89;
    private Button surah90;
    private Button surah91;
    private Button surah92;
    private Button surah93;
    private Button surah94;
    private Button surah95;
    private Button surah96;
    private Button surah97;
    private Button surah98;
    private Button surah99;
    private Button surah100;
    private Button surah101;
    private Button surah102;
    private Button surah103;
    private Button surah104;
    private Button surah105;
    private Button surah106;
    private Button surah107;
    private Button surah108;
    private Button surah109;
    private Button surah110;
    private Button surah111;
    private Button surah112;
    private Button surah113;
    private Button surah114;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sura_list);
        getSupportActionBar().setTitle("About Surah");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        surah1 = findViewById(R.id.btnS001);

        surah1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenSurah1();
            }
        });

        surah2 = findViewById(R.id.btnS002);

        surah2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenSurah2();
            }
        });

        surah3 = findViewById(R.id.btnS003);

        surah3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenSurah3();
            }
        });

        surah4 = findViewById(R.id.btnS004);

        surah4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenSurah4();
            }
        });

        surah5 = findViewById(R.id.btnS005);

        surah5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenSurah5();
            }
        });

        surah6 = findViewById(R.id.btnS006);

        surah6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenSurah6();
            }
        });

        surah7 = findViewById(R.id.btnS007);

        surah7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenSurah7();
            }
        });

        surah8 = findViewById(R.id.btnS008);

        surah8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenSurah8();
            }
        });

        surah9 = findViewById(R.id.btnS009);

        surah9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenSurah9();
            }
        });

        surah10 = findViewById(R.id.btnS010);

        surah10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenSurah10();
            }
        });

    }

    public void OpenSurah10(){
        Intent intent = new Intent(this, sura10.class);
        startActivity(intent);
    }

    public void OpenSurah9(){
        Intent intent = new Intent(this, sura9.class);
        startActivity(intent);
    }

    public void OpenSurah8(){
        Intent intent = new Intent(this, sura8.class);
        startActivity(intent);
    }

    public void OpenSurah7(){
        Intent intent = new Intent(this, sura7.class);
        startActivity(intent);
    }

    public void OpenSurah6(){
        Intent intent = new Intent(this, sura6.class);
        startActivity(intent);
    }

    public void OpenSurah5(){
        Intent intent = new Intent(this, sura5.class);
        startActivity(intent);
    }

    public void  OpenSurah4(){
        Intent intent = new Intent (this, sura4.class);
        startActivity(intent);
    }

    public void OpenSurah3() {
        Intent intent = new Intent(this, sura3.class);
        startActivity(intent);
    }

    public void OpenSurah2() {
        Intent intent = new Intent(this, sura2.class);
        startActivity(intent);
    }

    public void OpenSurah1() {
        Intent intent = new Intent(this, sura1.class);
        startActivity(intent);
    }

}