package com.bctec.unisist;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class painelDisciplinas extends AppCompatActivity {

    private Button botaoDisciplina001, botaoDisciplina026;

    private TextView emailRodape;

    public static List<disciplina> listaDisciplinas = new ArrayList<disciplina>();

    private Switch switchVerDisciplinasCursadas;

    private boolean verDisciplinasCursadas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_painel_disciplinas);

        iniciaDisciplinas();

        preparaBotoesGrade();

        verDisciplinasCursadas = false;

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

        botaoDisciplina001 = findViewById(R.id.botao_002);
        botaoDisciplina001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("2");
            }
        });

        botaoDisciplina001 = findViewById(R.id.botao_003);
        botaoDisciplina001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("3");
            }
        });

        botaoDisciplina001 = findViewById(R.id.botao_004);
        botaoDisciplina001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("4");
            }
        });

  /*      botaoDisciplina001 = findViewById(R.id.botao_005);
        botaoDisciplina001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("5");
            }
        });

        botaoDisciplina001 = findViewById(R.id.botao_006);
        botaoDisciplina001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("6");
            }
        });

        botaoDisciplina001 = findViewById(R.id.botao_007);
        botaoDisciplina001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("7");
            }
        });

        botaoDisciplina001 = findViewById(R.id.botao_008);
        botaoDisciplina001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("8");
            }
        });*/

        botaoDisciplina001 = findViewById(R.id.botao_009);
        botaoDisciplina001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("9");
            }
        });

        botaoDisciplina001 = findViewById(R.id.botao_010);
        botaoDisciplina001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("10");
            }
        });
        botaoDisciplina001 = findViewById(R.id.botao_011);
        botaoDisciplina001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("11");
            }
        });

        botaoDisciplina001 = findViewById(R.id.botao_012);
        botaoDisciplina001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("12");
            }
        });

 /*       botaoDisciplina001 = findViewById(R.id.botao_013);
        botaoDisciplina001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("13");
            }
        });

        botaoDisciplina001 = findViewById(R.id.botao_014);
        botaoDisciplina001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("14");
            }
        });

        botaoDisciplina001 = findViewById(R.id.botao_015);
        botaoDisciplina001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("15");
            }
        });

        botaoDisciplina001 = findViewById(R.id.botao_016);
        botaoDisciplina001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("16");
            }
        });*/

        botaoDisciplina001 = findViewById(R.id.botao_017);
        botaoDisciplina001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("17");
            }
        });

        botaoDisciplina001 = findViewById(R.id.botao_018);
        botaoDisciplina001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("18");
            }
        });

        botaoDisciplina001 = findViewById(R.id.botao_019);
        botaoDisciplina001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("19");
            }
        });

        botaoDisciplina001 = findViewById(R.id.botao_020);
        botaoDisciplina001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("20");
            }
        });
 /*       botaoDisciplina001 = findViewById(R.id.botao_021);
        botaoDisciplina001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("21");
            }
        });

        botaoDisciplina001 = findViewById(R.id.botao_022);
        botaoDisciplina001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("22");
            }
        });

        botaoDisciplina001 = findViewById(R.id.botao_023);
        botaoDisciplina001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("23");
            }
        });

        botaoDisciplina001 = findViewById(R.id.botao_024);
        botaoDisciplina001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("24");
            }
        });*/

        botaoDisciplina001 = findViewById(R.id.botao_025);
        botaoDisciplina001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("25");
            }
        });

        botaoDisciplina001 = findViewById(R.id.botao_026);
        botaoDisciplina001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("26");
            }
        });

        botaoDisciplina001 = findViewById(R.id.botao_027);
        botaoDisciplina001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("27");
            }
        });

        botaoDisciplina001 = findViewById(R.id.botao_028);
        botaoDisciplina001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("28");
            }
        });

/*        botaoDisciplina001 = findViewById(R.id.botao_029);
        botaoDisciplina001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("29");
            }
        });

        botaoDisciplina001 = findViewById(R.id.botao_030);
        botaoDisciplina001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("30");
            }
        });

        botaoDisciplina001 = findViewById(R.id.botao_031);
        botaoDisciplina001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("31");
            }
        });

        botaoDisciplina001 = findViewById(R.id.botao_032);
        botaoDisciplina001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("32");
            }
        });*/


        switchVerDisciplinasCursadas = findViewById(R.id.switchVerDisciplinasCursadas);

        switchVerDisciplinasCursadas.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (verDisciplinasCursadas){
                    verDisciplinasCursadas = false;
                }else{
                    verDisciplinasCursadas = true;
                }

                preparaBotoesGrade();
            }
        });
    }

    @Override
    protected void onResume(){
        super.onResume();

        preparaBotoesGrade();
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
        boolean visivel, jaCursou, querCursar;

        qtdDisciplinas = listaDisciplinas.size() -1;
        Button botaoAtual;


        if (qtdDisciplinas >1){
            for (indice = 1 ; indice <= qtdDisciplinas; indice++){
                disciplinaAtual = listaDisciplinas.get(indice);
                posicaoGrid =  disciplinaAtual.getPosicaoGrid();
                visivel = disciplinaAtual.isVisivel();
                siglaDisciplinaAtual = disciplinaAtual.getSigla();
                jaCursou = disciplinaAtual.isJaCursou();
                querCursar = disciplinaAtual.isQuerCursar();

                idBotaoAtual = montaIdBotaoDisciplina(posicaoGrid);

                int resID = getResources().getIdentifier(idBotaoAtual, "id", getPackageName());

                botaoAtual = (Button) findViewById(resID);

                if (visivel == false)
                    botaoAtual.setVisibility(View.INVISIBLE);
                botaoAtual.setText(siglaDisciplinaAtual);

                if(verDisciplinasCursadas){
                    if(jaCursou) {
                        PorterDuffColorFilter colorFilterJaCursou = new PorterDuffColorFilter(Color.GREEN, PorterDuff.Mode.MULTIPLY);
                        botaoAtual.getBackground().setColorFilter(colorFilterJaCursou);
                        //botaoAtual.setBackgroundResource(R.color.colorJaCursou);
                    }
                    if(querCursar) {
                        PorterDuffColorFilter colorFilterQuerCursar = new PorterDuffColorFilter(Color.YELLOW, PorterDuff.Mode.MULTIPLY);
                        botaoAtual.getBackground().setColorFilter(colorFilterQuerCursar);
                    }
                }else
                {
                    PorterDuffColorFilter colorFilterDesfaz = new PorterDuffColorFilter(Color.LTGRAY, PorterDuff.Mode.MULTIPLY);
                    botaoAtual.getBackground().setColorFilter(colorFilterDesfaz);
                }


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
