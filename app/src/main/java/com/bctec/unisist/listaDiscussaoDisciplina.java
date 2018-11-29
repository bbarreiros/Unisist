package com.bctec.unisist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class listaDiscussaoDisciplina extends AppCompatActivity {


    /*
     * Desenvolvido por: Bruno Cesar Pereira
     * Descrição: Activity da visão da disciplinas
     * Implementa os casos de uso:a
     *  xx Lista de discussões
     *  xx Importar arquivo
     * Implementa os RF:
     *  xx O
     */

    private String idDisciplina, novaMensagem;
    private disciplina disciplinaAtual;
    private Button botaoNomeDisciplina, botaoEnviarMensagem;
    private EditText etNovaMensagem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_discussao_disciplina);

        // Recebe o Extra do Id da Disciplina
        Bundle extra = getIntent().getExtras();

        if (extra != null){
            idDisciplina = extra.getString("idDisciplina");

            disciplinaAtual = painelDisciplinas.encontraDisciplinaPeloID(idDisciplina);

            // Monta o botão com o respectivo nome da disciplina
            botaoNomeDisciplina = findViewById(R.id.botaoNomeDisciplinaID);
            botaoNomeDisciplina.setText(disciplinaAtual.getNome());
                    }
        botaoEnviarMensagem = findViewById(R.id.botaoEnviarMensagemId);
        botaoEnviarMensagem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                etNovaMensagem = findViewById(R.id.textoNovaMensagemId);
                novaMensagem = etNovaMensagem.getText().toString();


                if (!novaMensagem.equals("Digite nova mensagem")){
                    Toast.makeText(listaDiscussaoDisciplina.this, novaMensagem , Toast.LENGTH_LONG).show();
                    disciplinaAtual.setNovaMensagem(novaMensagem);
                }



            }
        });

    }
}
