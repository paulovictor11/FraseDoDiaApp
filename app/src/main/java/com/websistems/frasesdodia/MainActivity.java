package com.websistems.frasesdodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView txtFrase;
    private String[] frases = {
            "Sorria, só ria. Acalma, a alma. Se derrame, se der ame. Releve, se eleve. Respira, e não pira.",
            "Pra hoje: sorrisos bobos, uma mente tranquila e um coração cheio de paz.",
            "Enquanto alguns escolhem pessoas perfeitas, eu escolho as que me fazem bem.",
            "Se não der certo, a gente tenta de novo, de novo e de novo. E se não der certo a gente fica junto errado mesmo.",
            "Seja você mesmo, todos os outros já existem.",
            "Admiro pessoas simples de coração... Fortes, mas não arrogantes. Sinceras, mas não ofensivas. Corajosas, mas não inconsequentes. Que cativem uma pessoa de forma pura. Que sorriem com coração e que te olhem com carinho.",
            "Afinidade não se explica, amizade não se força, confiança não se obriga e sentimento não se controla.",
            "Saudades de quando meu único medo era o escuro. Minha única preocupação era meu brinquedo quebrado. E minha única dor era o joelho ralado.",
            "Dê um 'Play' na vida, um 'Pause' nos momentos bons, um 'Stop' nos momentos ruins e um 'Repeat' nas alegrias da vida.",
            "Uma das melhores sensações da vida é ter a certeza que você pode confiar em alguém.",
            "Confie em quem te dá confiança, ame quem te dá amor, cuide de quem cuida de você.",
            "Ontem eu era inteligente, queria mudar o mundo. Hoje eu sou sábio, estou mudando a mim mesmo.",
            "Sem pressa. Sem vírgula. Sem ponto final. Sem briga. Sem mágoa. Sem dor. Só amor, por favor."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtFrase = findViewById(R.id.txtFrase);
        findViewById(R.id.btnFrase).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Random random = new Random();
        int numero = random.nextInt(frases.length);
        txtFrase.setText(frases[numero]);
    }
}
