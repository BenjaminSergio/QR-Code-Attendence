package com.example.teste;

import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TelaAluno extends AppCompatActivity {

    private TextView scanearQRcode;
    private TextView lista_presenca_aluno;
    private TextView configuracoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_aluno);
        getSupportActionBar().hide();
        InciarComponentes();


        scanearQRcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (TelaAluno.this, ScanearQRCode.class);
                startActivity(intent);
            }
        });

        lista_presenca_aluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (TelaAluno.this, ListaPresencaAluno.class);
                startActivity(intent);
            }
        });

        configuracoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (TelaAluno.this, TelaDados.class);
                startActivity(intent);
            }
        });
    }

    private void InciarComponentes() {
        scanearQRcode = findViewById(R.id.scanearQRcode);
        lista_presenca_aluno = findViewById(R.id.lista_presenca_aluno);
        configuracoes = findViewById(R.id.configuracoes);
    }
}