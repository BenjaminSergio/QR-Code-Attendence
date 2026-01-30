package com.example.teste;

import android.content.Intent;

//import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TelaProfessor extends AppCompatActivity {

    private TextView configuracoes;
    private TextView gerarQRcode;
    private TextView lista_presenca_prof;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_professor);
        getSupportActionBar().hide();
        InciarComponentes();

        gerarQRcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (TelaProfessor.this, GerarQRCode.class);
                startActivity(intent);
            }
        });

        lista_presenca_prof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (TelaProfessor.this, ListaPresencaProfessor.class);
                startActivity(intent);
            }
        });

        configuracoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (TelaProfessor.this, TelaDados.class);
                startActivity(intent);
            }
        });
    }

    private void InciarComponentes() {
        gerarQRcode = findViewById(R.id.gerarQRcode);
        lista_presenca_prof = findViewById(R.id.lista_presenca_prof);
        configuracoes = findViewById(R.id.configuracoes);
    }
}