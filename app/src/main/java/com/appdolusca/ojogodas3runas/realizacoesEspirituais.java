package com.appdolusca.ojogodas3runas;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Random;

import static com.appdolusca.ojogodas3runas.significadoRunas.*;

public class realizacoesEspirituais extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_realizacoes_espirituais);
    }

    public void sortearRunas3 (View view){

        ImageView sorteio7 = findViewById(R.id.runaFundo7);
        TextView resultado7 = findViewById(R.id.resultado7);
        TextView significado7 = findViewById(R.id.significado7);

        int numero7 = new Random().nextInt(14);
        String[] runas7 ={"tiwaz", "berkana", "ehwaz", "mannaz", "laguz", "ingwaz", "dagaz", "othala",
                          "tiwazinvert", "berkanainvert", "ehwazinvert", "mannazinvert", "laguzinvert",
                          "othalainvert"};
        String runas7resultado = runas7 [numero7];

        switch (runas7resultado) {

            case "tiwaz":
                sorteio7.setImageResource(R.drawable.tiwaz17);
                resultado7.setText("Tïwaz, Tyr - Deus da Justiça");
                significado7.setText(tiwaz.getValue());
                break;
            case "berkana":
                sorteio7.setImageResource(R.drawable.berkana18);
                resultado7.setText("Berkana, a Grande Mãe");
                significado7.setText(berkana.getValue());
                break;
            case "ehwaz":
                sorteio7.setImageResource(R.drawable.ehwaz19);
                resultado7.setText("Ehwaz, o Cavalo");
                significado7.setText(ehwaz.getValue());
                break;
            case "mannaz":
                sorteio7.setImageResource(R.drawable.mannaz20);
                resultado7.setText("Mannaz, o Homem");
                significado7.setText(mannaz.getValue());
                break;
            case "laguz":
                sorteio7.setImageResource(R.drawable.laguz21);
                resultado7.setText("Laguz, o Lago");
                significado7.setText(laguz.getValue());
                break;
            case "ingwaz":
                sorteio7.setImageResource(R.drawable.inguz22);
                resultado7.setText("Ingwaz, a Fertilidade");
                significado7.setText(inguz.getValue());
                break;
            case "dagaz":
                sorteio7.setImageResource(R.drawable.dagaz22);
                resultado7.setText("Dagaz, o Dia");
                significado7.setText(dagaz.getValue());
                break;
            case "othala":
                sorteio7.setImageResource(R.drawable.othala24);
                resultado7.setText("Öthala, a Herança");
                significado7.setText(othala.getValue());
                break;
            case "tiwazinvert":
                sorteio7.setImageResource(R.drawable.tiwaz17invert);
                resultado7.setText("Tïwaz Invertido");
                significado7.setText(tiwazinvert.getValue());
                break;
            case "berkanainvert":
                sorteio7.setImageResource(R.drawable.berkana18invert);
                resultado7.setText("Berkana Invertido");
                significado7.setText(berkanainvert.getValue());
                break;
            case "ehwazinvert":
                sorteio7.setImageResource(R.drawable.ehwaz19invert);
                resultado7.setText("Ehwaz Invertido");
                significado7.setText(ehwazinvert.getValue());
                break;
            case "mannazinvert":
                sorteio7.setImageResource(R.drawable.mannaz20invert);
                resultado7.setText("Mannaz Invertido");
                significado7.setText(mannazinvert.getValue());
                break;
            case "laguzinvert":
                sorteio7.setImageResource(R.drawable.laguz21invert);
                resultado7.setText("Laguz Invertido");
                significado7.setText(laguzinvert.getValue());
                break;
            case "othalainvert":
                sorteio7.setImageResource(R.drawable.othala24invert);
                resultado7.setText("Öthala Invertido");
                significado7.setText(othalainvert.getValue());
                break;
        }

        ImageView sorteio8 = findViewById(R.id.runaFundo8);
        TextView resultado8 = findViewById(R.id.resultado8);
        TextView significado8 = findViewById(R.id.significado8);

        int numero8 = new Random().nextInt(14);
        String[] runas8 ={"tiwaz", "berkana", "ehwaz", "mannaz", "laguz", "ingwaz", "dagaz", "othala",
                "tiwazinvert", "berkanainvert", "ehwazinvert", "mannazinvert", "laguzinvert",
                "othalainvert"};
        String runas8resultado = runas8 [numero8];

        switch (runas8resultado) {
            case "tiwaz":
                sorteio8.setImageResource(R.drawable.tiwaz17);
                resultado8.setText("Tïwaz, Tyr - Deus da Justiça");
                significado8.setText(tiwaz.getValue());
                break;
            case "berkana":
                sorteio8.setImageResource(R.drawable.berkana18);
                resultado8.setText("Berkana, a Grande Mãe");
                significado8.setText(berkana.getValue());
                break;
            case "ehwaz":
                sorteio8.setImageResource(R.drawable.ehwaz19);
                resultado8.setText("Ehwaz, o Cavalo");
                significado8.setText(ehwaz.getValue());
                break;
            case "mannaz":
                sorteio8.setImageResource(R.drawable.mannaz20);
                resultado8.setText("Mannaz, o Homem");
                significado8.setText(mannaz.getValue());
                break;
            case "laguz":
                sorteio8.setImageResource(R.drawable.laguz21);
                resultado8.setText("Laguz, o Lago");
                significado8.setText(laguz.getValue());
                break;
            case "ingwaz":
                sorteio8.setImageResource(R.drawable.inguz22);
                resultado8.setText("Ingwaz, a Fertilidade");
                significado8.setText(inguz.getValue());
                break;
            case "dagaz":
                sorteio8.setImageResource(R.drawable.dagaz22);
                resultado8.setText("Dagaz, o Dia");
                significado8.setText(dagaz.getValue());
                break;
            case "othala":
                sorteio8.setImageResource(R.drawable.othala24);
                resultado8.setText("Öthala, a Herança");
                significado8.setText(othala.getValue());
                break;
            case "tiwazinvert":
                sorteio8.setImageResource(R.drawable.tiwaz17invert);
                resultado8.setText("Tïwaz Invertido");
                significado8.setText(tiwazinvert.getValue());
                break;
            case "berkanainvert":
                sorteio8.setImageResource(R.drawable.berkana18invert);
                resultado8.setText("Berkana Invertido");
                significado8.setText(berkanainvert.getValue());
                break;
            case "ehwazinvert":
                sorteio8.setImageResource(R.drawable.ehwaz19invert);
                resultado8.setText("Ehwaz Invertido");
                significado8.setText(ehwazinvert.getValue());
                break;
            case "mannazinvert":
                sorteio8.setImageResource(R.drawable.mannaz20invert);
                resultado8.setText("Mannaz Invertido");
                significado8.setText(mannazinvert.getValue());
                break;
            case "laguzinvert":
                sorteio8.setImageResource(R.drawable.laguz21invert);
                resultado8.setText("Laguz Invertido");
                significado8.setText(laguzinvert.getValue());
                break;
            case "othalainvert":
                sorteio8.setImageResource(R.drawable.othala24invert);
                resultado8.setText("Öthala Invertido");
                significado8.setText(othalainvert.getValue());
                break;
        }

        ImageView sorteio9 = findViewById(R.id.runaFundo9);
        TextView resultado9 = findViewById(R.id.resultado9);
        TextView significado9 = findViewById(R.id.significado9);

        int numero9 = new Random().nextInt(14);
        String[] runas9 ={"tiwaz", "berkana", "ehwaz", "mannaz", "laguz", "ingwaz", "dagaz", "othala",
                "tiwazinvert", "berkanainvert", "ehwazinvert", "mannazinvert", "laguzinvert",
                "othalainvert"};
        String runas9resultado = runas9 [numero9];

        switch (runas9resultado) {
            case "tiwaz":
                sorteio9.setImageResource(R.drawable.tiwaz17);
                resultado9.setText("Tïwaz, Tyr - Deus da Justiça");
                significado9.setText(tiwaz.getValue());
                break;
            case "berkana":
                sorteio9.setImageResource(R.drawable.berkana18);
                resultado9.setText("Berkana, a Grande Mãe");
                significado9.setText(berkana.getValue());
                break;
            case "ehwaz":
                sorteio9.setImageResource(R.drawable.ehwaz19);
                resultado9.setText("Ehwaz, o Cavalo");
                significado9.setText(ehwaz.getValue());
                break;
            case "mannaz":
                sorteio9.setImageResource(R.drawable.mannaz20);
                resultado9.setText("Mannaz, o Homem");
                significado9.setText(mannaz.getValue());
                break;
            case "laguz":
                sorteio9.setImageResource(R.drawable.laguz21);
                resultado9.setText("Laguz, o Lago");
                significado9.setText(laguz.getValue());
                break;
            case "ingwaz":
                sorteio9.setImageResource(R.drawable.inguz22);
                resultado9.setText("Ingwaz, a Fertilidade");
                significado9.setText(inguz.getValue());
                break;
            case "dagaz":
                sorteio9.setImageResource(R.drawable.dagaz22);
                resultado9.setText("Dagaz, o Dia");
                significado9.setText(dagaz.getValue());
                break;
            case "othala":
                sorteio9.setImageResource(R.drawable.othala24);
                resultado9.setText("Öthala, a Herança");
                significado9.setText(othala.getValue());
                break;
            case "tiwazinvert":
                sorteio9.setImageResource(R.drawable.tiwaz17invert);
                resultado9.setText("Tïwaz Invertido");
                significado9.setText(tiwazinvert.getValue());
                break;
            case "berkanainvert":
                sorteio9.setImageResource(R.drawable.berkana18invert);
                resultado9.setText("Berkana Invertido");
                significado9.setText(berkanainvert.getValue());
                break;
            case "ehwazinvert":
                sorteio9.setImageResource(R.drawable.ehwaz19invert);
                resultado9.setText("Ehwaz Invertido");
                significado9.setText(ehwazinvert.getValue());
                break;
            case "mannazinvert":
                sorteio9.setImageResource(R.drawable.mannaz20invert);
                resultado9.setText("Mannaz Invertido");
                significado9.setText(mannazinvert.getValue());
                break;
            case "laguzinvert":
                sorteio9.setImageResource(R.drawable.laguz21invert);
                resultado9.setText("Laguz Invertido");
                significado9.setText(laguzinvert.getValue());
                break;
            case "othalainvert":
                sorteio9.setImageResource(R.drawable.othala24invert);
                resultado9.setText("Öthala Invertido");
                significado9.setText(othalainvert.getValue());
                break;
        }
    }
}