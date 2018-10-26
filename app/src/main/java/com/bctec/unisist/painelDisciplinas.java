package com.bctec.unisist;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class painelDisciplinas extends AppCompatActivity {

    private Button botaoDisciplina001, botaoDisciplina026;

    private TextView emailRodape;

    public static List<disciplina> listaDisciplinas = new ArrayList<disciplina>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_painel_disciplinas);

        iniciaDisciplinas();

        preparaBotoesGrade();

        emailRodape = findViewById(R.id.emailRodapeId);

        Bundle extra = getIntent().getExtras();

        if (extra != null){
            String texto = extra.getString("email");
            emailRodape.setText(texto);
            //Toast.makeText(painelDisciplinas.this, texto , Toast.LENGTH_LONG).show();
        }

        botaoDisciplina001 = findViewById(R.id.botao_001);
        botaoDisciplina001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("1");
            }
        });
        botaoDisciplina026 = findViewById(R.id.botao_026);
        botaoDisciplina026.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("26");

            }
        });

    }

    private void onClickBotaoGenerico(String idBotao){
        Intent intent = new Intent(painelDisciplinas.this, visaoDisciplina.class);

        intent.putExtra("idDisciplina", idBotao );
        startActivity(intent);

    }

     private void preparaBotoesGrade(){

        int qtdDisciplinas, indice, posicaoGrid;
        String idBotaoAtual, siglaDisciplinaAtual;
        disciplina disciplinaAtual;
        boolean visivel;

        qtdDisciplinas = listaDisciplinas.size() -1;
        Button botaoAtual;


        if (qtdDisciplinas >1){
            for (indice = 1 ; indice <= qtdDisciplinas; indice++){
                disciplinaAtual = listaDisciplinas.get(indice);
                posicaoGrid =  disciplinaAtual.getPosicaoGrid();
                visivel = disciplinaAtual.isVisivel();
                siglaDisciplinaAtual = disciplinaAtual.getSigla();

                idBotaoAtual = montaIdBotaoDisciplina(posicaoGrid);

                int resID = getResources().getIdentifier(idBotaoAtual, "id", getPackageName());

                botaoAtual = (Button) findViewById(resID);

                if (visivel == false)
                    botaoAtual.setVisibility(View.INVISIBLE);
                botaoAtual.setText(siglaDisciplinaAtual);
            }
        }


    }

    private void iniciaDisciplinas(){

        disciplina disciplinaAtual, disciplinaSemRequisito;

        disciplinaAtual = new disciplina("Disciplina sem Requisitos", "DSR", 0, false);
        listaDisciplinas.add(disciplinaAtual);

        disciplinaSemRequisito = disciplinaAtual;

        disciplinaAtual = new disciplina("Fundamendos de Sistemas de Informação", "FSI", 1, true, disciplinaSemRequisito);
        listaDisciplinas.add(disciplinaAtual);

        disciplinaAtual = new disciplina("", "", 2, false, disciplinaSemRequisito);
        listaDisciplinas.add(disciplinaAtual);

        disciplinaAtual = new disciplina("", "", 3, false, disciplinaSemRequisito);
        listaDisciplinas.add(disciplinaAtual);

        disciplinaAtual = new disciplina("Análise de Sistemas", "AS", 4,  true, disciplinaSemRequisito);
        listaDisciplinas.add(disciplinaAtual);

        disciplinaAtual = new disciplina("", "", 9, false, disciplinaSemRequisito);
        listaDisciplinas.add(disciplinaAtual);

        disciplinaAtual = new disciplina("", "", 10, false, disciplinaSemRequisito);
        listaDisciplinas.add(disciplinaAtual);

        disciplinaAtual = new disciplina("", "", 11, false, disciplinaSemRequisito);
        listaDisciplinas.add(disciplinaAtual);

        disciplinaAtual = new disciplina("", "", 12, false, disciplinaSemRequisito);
        listaDisciplinas.add(disciplinaAtual);

        disciplinaAtual = new disciplina("", "", 17, false, disciplinaSemRequisito);
        listaDisciplinas.add(disciplinaAtual);

        disciplinaAtual = new disciplina("", "", 18, false, disciplinaSemRequisito);
        listaDisciplinas.add(disciplinaAtual);

        disciplinaAtual = new disciplina("Banco de Dados I", "BD I", 19,  true, disciplinaSemRequisito);
        listaDisciplinas.add(disciplinaAtual);

        disciplinaAtual = new disciplina("", "", 20, false, disciplinaSemRequisito);
        listaDisciplinas.add(disciplinaAtual);

        disciplinaAtual = new disciplina("Técnicas de Programação I", "TP I", 25,  true, disciplinaSemRequisito);
        listaDisciplinas.add(disciplinaAtual);

        disciplina requisito = disciplinaAtual;

        disciplinaAtual = new disciplina("Técnicas de Programação II", "TP II", 26,  true, requisito);
        listaDisciplinas.add(disciplinaAtual);
        //disciplinaAtual.setDisciplinaRequisito(requisito);

        requisito = disciplinaAtual;

        disciplinaAtual = new disciplina("Estrutura de Dados I", "EDD I", 27,  true, requisito);
        listaDisciplinas.add(disciplinaAtual);
        //disciplinaAtual.setDisciplinaRequisito(requisito);

        disciplinaAtual = new disciplina("Estrutura de Dados II", "EDD II", 28, true, requisito);
        listaDisciplinas.add(disciplinaAtual);
        //disciplinaAtual.setDisciplinaRequisito(requisito);

        }

    @Nullable
    public static disciplina encontraDisciplinaPeloID(String codigo){
        int qtdDisciplinas = listaDisciplinas.size()-1, indice, idAtual;
        disciplina disciplinaAtual;

        for (indice =0; indice <= qtdDisciplinas; indice++){
            disciplinaAtual = listaDisciplinas.get(indice);
            idAtual = disciplinaAtual.getId();
            //Log.d("idAtual",Integer.toString(idAtual));
            //Log.d("codigo",codigo);
            if (codigo.equals(Integer.toString(idAtual))){
                return disciplinaAtual;
            }
        }
        return null;
    }

    public String montaIdBotaoDisciplina(int id){
        return "botao_" + String.format("%03d", id);
    }

    /*public static ArrayList retornaListaDisciplinas(){
        List<disciplina> listaDisciplinasOut = listaDisciplinas;
    }*/
}
