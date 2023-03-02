package com.appdolusca.ojogodas3runas;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Random;

import static com.appdolusca.ojogodas3runas.significadoRunas.*;

public class realizacoesEmocionais extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_realizacoes_emocionais);
    }

    public void sortearRunas2 (View view){

        ImageView sorteio4 = findViewById(R.id.runaFundo4);
        TextView resultado4 = findViewById(R.id.resultado4);
        TextView significado4 = findViewById(R.id.significado4);

        int numero4 = new Random().nextInt(11);
        String[] runas4 = {"hagalaz", "naudhiz", "isaz", "jera", "eihwaz", "perdhro", "sowilo", "algiz",
                            "naudhizinvert", "perdhroinvert", "algizinvert"};
        String runas4resultado = runas4 [numero4];

        switch(runas4resultado){
            case "hagalaz":
                sorteio4.setImageResource(R.drawable.hagalaz09);
                resultado4.setText("Hagalaz, o Granizo");
                significado4.setText(hagalaz.getValue());
                break;
            case "naudhiz":
                sorteio4.setImageResource(R.drawable.naudhiz10);
                resultado4.setText("Naudhiz, a Necessidade");
                significado4.setText((naudhiz.getValue()));
                break;
            case "isaz":
                sorteio4.setImageResource(R.drawable.gelo11);
                resultado4.setText("Ïsaz, o Gelo");
                significado4.setText((isaz.getValue()));
                break;
            case "jera":
                sorteio4.setImageResource(R.drawable.jera12);
                resultado4.setText("Jëra, A Colheita do Ano");
                significado4.setText(jera.getValue());
                break;
            case "eihwaz":
                sorteio4.setImageResource(R.drawable.eihwaz13);
                resultado4.setText("Eihwaz, o Teixo");
                significado4.setText(eihwaz.getValue());
                break;
            case "perdhro":
                sorteio4.setImageResource(R.drawable.perdhro14);
                resultado4.setText("Perthrö, o Desconhecido");
                significado4.setText(perdhro.getValue());
                break;
            case "sowilo":
                sorteio4.setImageResource(R.drawable.sowilo15);
                resultado4.setText("Söwilö, o Sol");
                significado4.setText(sowilo.getValue());
                break;
            case "algiz":
                sorteio4.setImageResource(R.drawable.algiz16);
                resultado4.setText("Algiz, o Alce");
                significado4.setText(algiz.getValue());
                break;
            case "naudhizinvert":
                sorteio4.setImageResource(R.drawable.naudhiz10invert);
                resultado4.setText("Naudhiz Invertido");
                significado4.setText(naudhizinvert.getValue());
                break;
            case "perdhroinvert":
                sorteio4.setImageResource(R.drawable.perdhro14invert);
                resultado4.setText("Perthrö Invertido");
                significado4.setText(perdhroinvert.getValue());
                break;
            case "algizinvert":
                sorteio4.setImageResource(R.drawable.algiz16invert);
                resultado4.setText("Algiz Invertido");
                significado4.setText(algizinvert.getValue());
                break;
        }

        ImageView sorteio5 = findViewById(R.id.runaFundo5);
        TextView resultado5 = findViewById(R.id.resultado5);
        TextView significado5 = findViewById(R.id.significado5);

        int numero5 = new Random().nextInt(11);
        String[] runas5 = {"hagalaz", "naudhiz", "isaz", "jera", "eihwaz", "perdhro", "sowilo", "algiz",
                "naudhizinvert", "perdhroinvert", "algizinvert"};
        String runas5resultado = runas5 [numero5];

        switch (runas5resultado){
            case "hagalaz":
                sorteio5.setImageResource(R.drawable.hagalaz09);
                resultado5.setText("Hagalaz, o Granizo");
                significado5.setText(hagalaz.getValue());
                break;
            case "naudhiz":
                sorteio5.setImageResource(R.drawable.naudhiz10);
                resultado5.setText("Naudhiz, a Necessidade");
                significado5.setText((naudhiz.getValue()));
                break;
            case "isaz":
                sorteio5.setImageResource(R.drawable.gelo11);
                resultado5.setText("Ïsaz, o Gelo");
                significado5.setText((isaz.getValue()));
                break;
            case "jera":
                sorteio5.setImageResource(R.drawable.jera12);
                resultado5.setText("Jëra, A Colheita do Ano");
                significado5.setText(jera.getValue());
                break;
            case "eihwaz":
                sorteio5.setImageResource(R.drawable.eihwaz13);
                resultado5.setText("Eihwaz, o Teixo");
                significado5.setText(eihwaz.getValue());
                break;
            case "perdhro":
                sorteio5.setImageResource(R.drawable.perdhro14);
                resultado5.setText("Perthrö, o Desconhecido");
                significado5.setText(perdhro.getValue());
                break;
            case "sowilo":
                sorteio5.setImageResource(R.drawable.sowilo15);
                resultado5.setText("Söwilö, o Sol");
                significado5.setText(sowilo.getValue());
                break;
            case "algiz":
                sorteio5.setImageResource(R.drawable.algiz16);
                resultado5.setText("Algiz, o Alce");
                significado5.setText(algiz.getValue());
                break;
            case "naudhizinvert":
                sorteio5.setImageResource(R.drawable.naudhiz10invert);
                resultado5.setText("Naudhiz Invertido");
                significado5.setText(naudhizinvert.getValue());
                break;
            case "perdhroinvert":
                sorteio5.setImageResource(R.drawable.perdhro14invert);
                resultado5.setText("Perthrö Invertido");
                significado5.setText(perdhroinvert.getValue());
                break;
            case "algizinvert":
                sorteio5.setImageResource(R.drawable.algiz16invert);
                resultado5.setText("Algiz Invertido");
                significado5.setText(algizinvert.getValue());
                break;
        }

        ImageView sorteio6 = findViewById(R.id.runaFundo6);
        TextView resultado6 = findViewById(R.id.resultado6);
        TextView significado6 = findViewById(R.id.significado6);

        int numero6 = new Random().nextInt(11);
        String[] runas6 = {"hagalaz", "naudhiz", "isaz", "jera", "eihwaz", "perdhro", "sowilo", "algiz",
                "naudhizinvert", "perdhroinvert", "algizinvert"};
        String runas6resultado = runas6 [numero6];

        switch (runas6resultado){
            case "hagalaz":
                sorteio6.setImageResource(R.drawable.hagalaz09);
                resultado6.setText("Hagalaz, o Granizo");
                significado6.setText(hagalaz.getValue());
                break;
            case "naudhiz":
                sorteio6.setImageResource(R.drawable.naudhiz10);
                resultado6.setText("Naudhiz, a Necessidade");
                significado6.setText((naudhiz.getValue()));
                break;
            case "isaz":
                sorteio6.setImageResource(R.drawable.gelo11);
                resultado6.setText("Ïsaz, o Gelo");
                significado6.setText((isaz.getValue()));
                break;
            case "jera":
                sorteio6.setImageResource(R.drawable.jera12);
                resultado6.setText("Jëra, A Colheita do Ano");
                significado6.setText(jera.getValue());
                break;
            case "eihwaz":
                sorteio6.setImageResource(R.drawable.eihwaz13);
                resultado6.setText("Eihwaz, o Teixo");
                significado6.setText(eihwaz.getValue());
                break;
            case "perdhro":
                sorteio6.setImageResource(R.drawable.perdhro14);
                resultado6.setText("Perthrö, o Desconhecido");
                significado6.setText(perdhro.getValue());
                break;
            case "sowilo":
                sorteio6.setImageResource(R.drawable.sowilo15);
                resultado6.setText("Söwilö, o Sol");
                significado6.setText(sowilo.getValue());
                break;
            case "algiz":
                sorteio6.setImageResource(R.drawable.algiz16);
                resultado6.setText("Algiz, o Alce");
                significado6.setText(algiz.getValue());
                break;
            case "naudhizinvert":
                sorteio6.setImageResource(R.drawable.naudhiz10invert);
                resultado6.setText("Naudhiz Invertido");
                significado6.setText(naudhizinvert.getValue());
                break;
            case "perdhroinvert":
                sorteio6.setImageResource(R.drawable.perdhro14invert);
                resultado6.setText("Perthrö Invertido");
                significado6.setText(perdhroinvert.getValue());
                break;
            case "algizinvert":
                sorteio6.setImageResource(R.drawable.algiz16invert);
                resultado6.setText("Algiz Invertido");
                significado6.setText(algizinvert.getValue());
                break;
        }





    }
}