package com.bctec.unisist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class visaoDisciplina extends AppCompatActivity {

    private disciplina disciplinaAtual, disciplinaRequisito;
    private String idDisciplina;
    private Button botaoRequisito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visao_disciplina);




        Bundle extra = getIntent().getExtras();

        if (extra != null){
            idDisciplina = extra.getString("idDisciplina");

            //Toast.makeText(visaoDisciplina.this, idDisciplina , Toast.LENGTH_LONG).show();

            preencheViews(idDisciplina);

            //disciplinaAtual = painelDisciplinas.encontraDisciplinaPeloID(identificadorDisciplina);



            //emailRodape.setText(texto);
            //Toast.makeText(painelDisciplinas.this, texto , Toast.LENGTH_LONG).show();

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
