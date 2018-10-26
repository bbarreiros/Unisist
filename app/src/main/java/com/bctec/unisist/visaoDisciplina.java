package com.bctec.unisist;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class visaoDisciplina extends AppCompatActivity {

    private disciplina disciplinaAtual, disciplinaRequisito;
    private String idDisciplina;
    private Button botaoRequisito;
    private Switch switchJaCursou, switchQuerCursar;
    private boolean jaCursou, querCursar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visao_disciplina);

        Bundle extra = getIntent().getExtras();

        if (extra != null){
            idDisciplina = extra.getString("idDisciplina");

            preencheViews(idDisciplina);

            botaoRequisito = findViewById(R.id.botaoDisciplnaRequisitoId);
            botaoRequisito.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v){

                    String idDisciplinaRequisito =  Integer.toString(disciplinaRequisito.getId());

                    if (idDisciplinaRequisito.equals("0")){
                        Toast.makeText(visaoDisciplina.this, "Rien de rien" , Toast.LENGTH_LONG).show();
                    }
                    else {
                        Intent intent = new Intent(visaoDisciplina.this, visaoDisciplina.class);

                        intent.putExtra("idDisciplina", idDisciplinaRequisito);
                        startActivity(intent);
                        //Toast.makeText(visaoDisciplina.this, idDisciplinaRequisito, Toast.LENGTH_LONG).show();
                    }
                }
            });
        }
        jaCursou = disciplinaAtual.isJaCursou();
        querCursar = disciplinaAtual.isQuerCursar();

        switchJaCursou = findViewById(R.id.switchJaCursouId);
        switchJaCursou.setChecked(jaCursou);

        switchJaCursou.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (jaCursou){
                    jaCursou = false;
                }else{
                    jaCursou = true;
                }
                disciplinaAtual.setJaCursou(jaCursou);
                switchJaCursou.setChecked(jaCursou);
            }
        });

        switchQuerCursar = findViewById(R.id.switchQueroCursarId);
        switchQuerCursar.setChecked(querCursar);

        switchQuerCursar.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (querCursar){
                    querCursar = false;
                }else{
                    querCursar = true;
                }
                disciplinaAtual.setQuerCursar(querCursar);
                switchQuerCursar.setChecked(querCursar);
            }
        });

    }

    private void preencheViews(String idDisciplina){
        disciplinaAtual = painelDisciplinas.encontraDisciplinaPeloID(idDisciplina);

        TextView siglaDisciplina = findViewById(R.id.siglaDiscilpinaID);
        siglaDisciplina.setText(disciplinaAtual.getSigla());

        TextView nomeDisciplina = findViewById(R.id.nomeDisciplinaId);
        nomeDisciplina.setText(disciplinaAtual.getNome());

        TextView textoDaEmenta = findViewById(R.id.textoDaEmentaId);
        textoDaEmenta.setText(disciplinaAtual.getEmenta());

        Button botaoDisciplinaRequidito = findViewById(R.id.botaoDisciplnaRequisitoId);
        disciplinaRequisito = disciplinaAtual.getDisciplinaRequisito();
        botaoDisciplinaRequidito.setText(disciplinaRequisito.getNome());
    }
}
