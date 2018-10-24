package com.bctec.unisist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class painelDisciplinas extends AppCompatActivity {

    private Button botaoAtual;

    public List<disciplina> listaDisciplinas = new ArrayList<disciplina>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_painel_disciplinas);

        iniciaDisciplinas();

        preparaBotoesGrade();


        View b = findViewById(R.id.botao_l3_c2);

        b.setVisibility(View.INVISIBLE);

    }

    private void preparaBotoesGrade(){

        int qtdDisciplinas, indice, posicaoLinha, posicaoColuna;
        String idBotaoAtual, siglaDisciplinaAtual;
        disciplina disciplinaAtual;
        boolean visivel;

        qtdDisciplinas = listaDisciplinas.size() -1;
        Button botaoAtual;

        String texto = Integer.toString(qtdDisciplinas);

       // Toast.makeText(painelDisciplinas.this, texto , Toast.LENGTH_LONG).show();

        if (qtdDisciplinas >0){
            for (indice = 1 ; indice <= qtdDisciplinas; indice++){
                disciplinaAtual = listaDisciplinas.get(indice);
                posicaoLinha =  disciplinaAtual.getPosicaoLinha();
                posicaoColuna = disciplinaAtual.getPosicaoColuna();
                visivel = disciplinaAtual.isVisivel();
                siglaDisciplinaAtual = disciplinaAtual.getSigla();

                idBotaoAtual = "botao_l"+Integer.toString(posicaoLinha)+"_c"+Integer.toString(posicaoColuna);

               // Toast.makeText(painelDisciplinas.this, idBotaoAtual , Toast.LENGTH_LONG);

                int resID = getResources().getIdentifier(idBotaoAtual, "id", getPackageName());
                botaoAtual = (Button) findViewById(resID);

                if (visivel == false)
                    botaoAtual.setVisibility(View.INVISIBLE);
                botaoAtual.setText(siglaDisciplinaAtual);

            }
        }


    }

    private void iniciaDisciplinas(){

        disciplina disciplinaAtual;

        disciplinaAtual = new disciplina("Fundamendos de Sstemas de Informação", "FSI", 1, 1, true);
        listaDisciplinas.add(disciplinaAtual);

        disciplinaAtual =  new disciplina("Fundamendos de Sstemas de Informação", "FSI", 1, 1, true);
        listaDisciplinas.add(disciplinaAtual);

        disciplinaAtual = new disciplina("", "", 1, 2, false);
        listaDisciplinas.add(disciplinaAtual);

        disciplinaAtual = new disciplina("", "", 1, 3, false);
        listaDisciplinas.add(disciplinaAtual);

        disciplinaAtual = new disciplina("Análise de Sistemas", "AS", 1, 4, true);
        listaDisciplinas.add(disciplinaAtual);

        disciplinaAtual = new disciplina("", "", 2, 1, false);
        listaDisciplinas.add(disciplinaAtual);

        disciplinaAtual = new disciplina("", "", 2, 2, false);
        listaDisciplinas.add(disciplinaAtual);

        disciplinaAtual = new disciplina("", "", 2, 3, false);
        listaDisciplinas.add(disciplinaAtual);

        disciplinaAtual = new disciplina("", "", 2, 4, false);
        listaDisciplinas.add(disciplinaAtual);

        disciplinaAtual = new disciplina("", "", 3, 1, false);
        listaDisciplinas.add(disciplinaAtual);

        disciplinaAtual = new disciplina("", "", 3, 2, false);
        listaDisciplinas.add(disciplinaAtual);

        disciplinaAtual = new disciplina("Banco de Dados I", "BD I", 3, 3, true);
        listaDisciplinas.add(disciplinaAtual);

        disciplinaAtual = new disciplina("", "", 3, 4, false);
        listaDisciplinas.add(disciplinaAtual);

        disciplinaAtual = new disciplina("Técnicas de Programação I", "TP I", 4, 1, true);
        listaDisciplinas.add(disciplinaAtual);

        disciplinaAtual = new disciplina("Técnicas de Programação II", "TP II", 4, 2, true);
        listaDisciplinas.add(disciplinaAtual);

        disciplinaAtual = new disciplina("Estrutura de Dados I", "EDD I", 4, 3, true);
        listaDisciplinas.add(disciplinaAtual);

        disciplinaAtual = new disciplina("Estrutura de Dados II", "EDD II", 4, 4, true);
        listaDisciplinas.add(disciplinaAtual);

        }
}
