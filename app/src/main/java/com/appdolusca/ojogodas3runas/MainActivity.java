package com.appdolusca.ojogodas3runas;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void continuar(View view){


        Intent intent = new Intent(this, paginarunas.class);
                startActivity(intent);

    }

}

