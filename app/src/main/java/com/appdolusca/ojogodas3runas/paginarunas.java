package com.appdolusca.ojogodas3runas;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class paginarunas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paginarunas);
    }

    public void entrarFisicas (View view) {
        Intent intent = new Intent(this, realizacoesFisicas.class);
        startActivity(intent);
    }

    public void entrarEmocionais (View view) {
        Intent intent = new Intent (this, realizacoesEmocionais.class);
        startActivity(intent);
    }

    public void entrarEspirituais (View view) {
        Intent intent = new Intent (this, realizacoesEspirituais.class);
        startActivity(intent);

    }


}