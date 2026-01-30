package com.example.teste;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class tela_selecao_aluno_professor extends AppCompatActivity {

    private TextView buttonaluno;
    private TextView buttonprofessor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_selecao_aluno_professor);
        getSupportActionBar().hide();
        InciarComponentes();


        buttonaluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (tela_selecao_aluno_professor.this, Form_Login_Aluno.class);
                startActivity(intent);
            }
        });

        buttonprofessor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (tela_selecao_aluno_professor.this, Form_Login_Professor.class);
                startActivity(intent);
            }
        });
    }

    private void InciarComponentes() {
        buttonaluno = findViewById(R.id.buttonaluno);
        buttonprofessor = findViewById(R.id.buttonprofessor);
    }

}
