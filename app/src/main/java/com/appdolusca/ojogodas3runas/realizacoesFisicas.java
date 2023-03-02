package com.appdolusca.ojogodas3runas;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import org.w3c.dom.Text;

import java.util.*;

import static com.appdolusca.ojogodas3runas.significadoRunas.*;

public class realizacoesFisicas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_realizacoes_fisicas);
    }

    public void sortearRunas1(View view) {

        listRunas runas1 = new listRunas();
        runas1.getRunasAett1();
        ImageView sorteio1 = findViewById(R.id.runaFundo3);
        TextView resultado1 = findViewById(R.id.resultado1);
        TextView significado1 = findViewById(R.id.significado1);
        int numero1 = new Random().nextInt(15);
        //String[] runas1 = {"fehu", "uruz", "thurizas", "ansuz", "raido", "kenaz", "gebo", "wunjo",
                "fehuinvert", "uruzinvert", "thurizasinvert", "ansuzinvert", "raidoinvert", "kenazinvert",
                "wunjoinvert"};
        String runas = listRunas [runas1];
        Collections.shuffle(listRunas)

        switch (runas) {
            case "Fehu":
                sorteio1.setImageResource(R.drawable.fehu01);
                resultado1.setText("Fehu, o Gado");
                significado1.setText(fehu.getValue());
                break;
            case "Uruz":
                sorteio1.setImageResource(R.drawable.uruz02);
                resultado1.setText("üruz, o Touro");
                significado1.setText(uruz.getValue());
                break;
            case "Thurizas":
                sorteio1.setImageResource(R.drawable.thurizas03);
                resultado1.setText("Thurisaz, os Espinhos");
                significado1.setText(thurizas.getValue());
                break;
            case "Ansuz":
                sorteio1.setImageResource(R.drawable.ansuz04);
                resultado1.setText("Ansuz, a Voz de Odin");
                significado1.setText(ansuz.getValue());
                break;
            case "Raido":
                sorteio1.setImageResource(R.drawable.raidho05);
                resultado1.setText("Raidö, a Jornada");
                significado1.setText(raido.getValue());
                break;
            case "Kenaz":
                sorteio1.setImageResource(R.drawable.kenaz06);
                resultado1.setText("Kenaz, a Tocha");
                significado1.setText(kenaz.getValue());
                break;
            case "Gebo":
                sorteio1.setImageResource(R.drawable.gebo07);
                resultado1.setText("Gebö, a Dádiva");
                significado1.setText(gebo.getValue());
                break;
            case "Wunjo":
                sorteio1.setImageResource(R.drawable.wunjo08);
                resultado1.setText("Wunjö, a Alegria");
                significado1.setText(wunjo.getValue());
                break;
            case "fehuInvert":
                sorteio1.setImageResource(R.drawable.fehu01invert);
                resultado1.setText("Fehu Invertido");
                significado1.setText(fehuinvert.getValue());
                break;
            case "uruzInvert":
                sorteio1.setImageResource(R.drawable.uruz02invert);
                resultado1.setText("Üruz Invertido");
                significado1.setText(uruzinvert.getValue());
                break;
            case "thurizasInvert":
                sorteio1.setImageResource(R.drawable.thurizas03invert);
                resultado1.setText("Thurisaz Invertido");
                significado1.setText(thurizasinvert.getValue());
                break;
            case "ansuzInvert":
                sorteio1.setImageResource(R.drawable.ansuz04invert);
                resultado1.setText("Ansuz Invertido");
                significado1.setText(ansuzinvert.getValue());
                break;
            case "raidoInvert":
                sorteio1.setImageResource(R.drawable.raidho05invert);
                resultado1.setText("Raidö Invertido");
                significado1.setText(raidoinvert.getValue());
                break;
            case "kenazInvert":
                sorteio1.setImageResource(R.drawable.kenaz06invert);
                resultado1.setText("Kenaz Invertido");
                significado1.setText(kenazinvert.getValue());
                break;
            case "wunjoInvert":
                sorteio1.setImageResource(R.drawable.wunjo08invert);
                resultado1.setText("Wunjö Invertido");
                significado1.setText(wunjoinvert.getValue());
                break;
        }

        ImageView sorteio2 = findViewById(R.id.runaFundo2);
        TextView resultado2 = findViewById(R.id.resultado2);
        TextView significado2 = findViewById(R.id.significado2);

        int numero2 = new Random().nextInt(15);
        String[] runas2 = {"fehu", "uruz", "thurizas", "ansuz", "raido", "kenaz", "gebo", "wunjo",
                "fehuinvert", "uruzinvert", "thurizasinvert", "ansuzinvert", "raidoinvert", "kenazinvert",
                "wunjoinvert"};
        String runas2resultado = runas2[numero2];

        switch (runas2resultado) {
            case "fehu":
                sorteio2.setImageResource(R.drawable.fehu01);
                resultado2.setText("Fehu, o Gado");
                significado2.setText(fehu.getValue());
                break;
            case "uruz":
                sorteio2.setImageResource(R.drawable.uruz02);
                resultado2.setText("üruz, o Touro");
                significado2.setText(uruz.getValue());
                break;
            case "thurizas":
                sorteio2.setImageResource(R.drawable.thurizas03);
                resultado2.setText("Thurisaz, os Espinhos");
                significado2.setText(thurizas.getValue());
                break;
            case "ansuz":
                sorteio2.setImageResource(R.drawable.ansuz04);
                resultado2.setText("Ansuz, a Voz de Odin");
                significado2.setText(ansuz.getValue());
                break;
            case "raido":
                sorteio2.setImageResource(R.drawable.raidho05);
                resultado2.setText("Raidö, a Jornada");
                significado2.setText(raido.getValue());
                break;
            case "kenaz":
                sorteio2.setImageResource(R.drawable.kenaz06);
                resultado2.setText("Kenaz, a Tocha");
                significado2.setText(kenaz.getValue());
                break;
            case "gebo":
                sorteio2.setImageResource(R.drawable.gebo07);
                resultado2.setText("Gebö, a Dádiva");
                significado2.setText(gebo.getValue());
                break;
            case "wunjo":
                sorteio2.setImageResource(R.drawable.wunjo08);
                resultado2.setText("Wunjö, a Alegria");
                significado2.setText(wunjo.getValue());
                break;
            case "fehuinvert":
                sorteio2.setImageResource(R.drawable.fehu01invert);
                resultado2.setText("Fehu Invertido");
                significado2.setText(fehuinvert.getValue());
                break;
            case "uruzinvert":
                sorteio2.setImageResource(R.drawable.uruz02invert);
                resultado2.setText("Üruz Invertido");
                significado2.setText(uruzinvert.getValue());
                break;
            case "thurizasinvert":
                sorteio2.setImageResource(R.drawable.thurizas03invert);
                resultado2.setText("Thurisaz Invertido");
                significado2.setText(thurizasinvert.getValue());
                break;
            case "ansuzinvert":
                sorteio2.setImageResource(R.drawable.ansuz04invert);
                resultado2.setText("Ansuz Invertido");
                significado2.setText(ansuzinvert.getValue());
                break;
            case "raidoinvert":
                sorteio2.setImageResource(R.drawable.raidho05invert);
                resultado2.setText("Raidö Invertido");
                significado2.setText(raidoinvert.getValue());
                break;
            case "kenazinvert":
                sorteio2.setImageResource(R.drawable.kenaz06invert);
                resultado2.setText("Kenaz Invertido");
                significado2.setText(kenazinvert.getValue());
                break;
            case "wunjoinvert":
                sorteio2.setImageResource(R.drawable.wunjo08invert);
                resultado2.setText("Wunjö Invertido");
                significado2.setText(wunjoinvert.getValue());
                break;

        }

        ImageView sorteio3 = findViewById(R.id.runaFundo);
        TextView resultado3 = findViewById(R.id.resultado3);
        TextView significado3 = findViewById(R.id.significado3);

        int numero3 = new Random().nextInt(15);
        String[] runas3 = {"fehu", "uruz", "thurizas", "ansuz", "raido", "kenaz", "gebo", "wunjo",
                "fehuinvert", "uruzinvert", "thurizasinvert", "ansuzinvert", "raidoinvert",
                "kenazinvert", "wunjoinvert"};
        String runas3resultado = runas3[numero3];

        switch (runas3resultado) {
            case "fehu":
                sorteio3.setImageResource(R.drawable.fehu01);
                resultado3.setText("Fehu, o Gado");
                significado3.setText(fehu.getValue());
                break;
            case "uruz":
                sorteio3.setImageResource(R.drawable.uruz02);
                resultado3.setText("üruz, o Touro");
                significado3.setText(uruz.getValue());
                break;
            case "thurizas":
                sorteio3.setImageResource(R.drawable.thurizas03);
                resultado3.setText("Thurisaz, os Espinhos");
                significado3.setText(thurizas.getValue());
                break;
            case "ansuz":
                sorteio3.setImageResource(R.drawable.ansuz04);
                resultado3.setText("Ansuz, a Voz de Odin");
                significado3.setText(ansuz.getValue());
                break;
            case "raido":
                sorteio3.setImageResource(R.drawable.raidho05);
                resultado3.setText("Raidö, a Jornada");
                significado3.setText(raido.getValue());
                break;
            case "kenaz":
                sorteio3.setImageResource(R.drawable.kenaz06);
                resultado3.setText("Kenaz, a Tocha");
                significado3.setText(kenaz.getValue());
                break;
            case "gebo":
                sorteio3.setImageResource(R.drawable.gebo07);
                resultado3.setText("Gebö, a Dádiva");
                significado3.setText(gebo.getValue());
                break;
            case "wunjo":
                sorteio3.setImageResource(R.drawable.wunjo08);
                resultado3.setText("Wunjö, a Alegria");
                significado3.setText(wunjo.getValue());
                break;
            case "fehuinvert":
                sorteio3.setImageResource(R.drawable.fehu01invert);
                resultado3.setText("Fehu Invertido");
                significado3.setText(fehuinvert.getValue());
                break;
            case "uruzinvert":
                sorteio3.setImageResource(R.drawable.uruz02invert);
                resultado3.setText("Üruz Invertido");
                significado3.setText(uruzinvert.getValue());
                break;
            case "thurizasinvert":
                sorteio3.setImageResource(R.drawable.thurizas03invert);
                resultado3.setText("Thurisaz Invertido");
                significado3.setText(thurizasinvert.getValue());
                break;
            case "ansuzinvert":
                sorteio3.setImageResource(R.drawable.ansuz04invert);
                resultado3.setText("Ansuz Invertido");
                significado3.setText(ansuzinvert.getValue());
                break;
            case "raidoinvert":
                sorteio3.setImageResource(R.drawable.raidho05invert);
                resultado3.setText("Raidö Invertido");
                significado3.setText(raidoinvert.getValue());
                break;
            case "kenazinvert":
                sorteio3.setImageResource(R.drawable.kenaz06invert);
                resultado3.setText("Kenaz Invertido");
                significado3.setText(kenazinvert.getValue());
                break;
            case "wunjoinvert":
                sorteio3.setImageResource(R.drawable.wunjo08invert);
                resultado3.setText("Wunjö Invertido");
                significado3.setText(wunjoinvert.getValue());
                break;
        }

           /* while (runas == runas2resultado);
            {
                numero1 = (new Random().nextInt(15));
            }
            while (runas == runas3resultado)
            {
                numero1 = (new Random().nextInt(15));
            }

            numero2 = new Random().nextInt(15);

            while (runas2resultado == runas)
            {
                numero2 = (new Random().nextInt(15));
            }
            while (runas2resultado == runas3resultado)
            {
                numero2 = (new Random().nextInt(15));
            }

            numero3 = new Random().nextInt(15);

            while (runas3resultado == runas)
            {
                numero3 = (new Random().nextInt(15));
            }
            while (runas3resultado == runas2resultado)
            {
                numero3 = (new Random().nextInt(15));
            }*/

    }
}
    /* //if runas 1 == runas 2 == runas 3
        if (numero1 == numero2) {
           numero1 = new Random().nextInt(15);
        }
        if (numero1 == numero3){
            numero1 = new Random().nextInt(15);
        }
        if (runas2resultado == runas){
            numero2 = new Random().nextInt(15);
                    }
        if (runas2resultado == runas3resultado){
            numero2 = new Random().nextInt(15);
        }
        if (runas3resultado == runas){
            numero3 = new Random().nextInt(15);
        }
        if (runas3resultado == runas2resultado){
            numero3 = new Random().nextInt(15);
        }*/

