package com.bctec.unisist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class visaoDisciplina extends AppCompatActivity {

    /*
     * Desenvolvido por: Bruno Cesar Pereira
     * Descrição: Activity da visão da disciplinas
     * Implementa os casos de uso:
     *  05 Visualizar Oferta de Disciplina
     *  15 Informar Disciplina Pretendida
     *  xx Informar Disciplina Cursada
     * Implementa os RF:
     *  xx O sistema deve permitir exibição de Disciplinas
     *  xx O sistema deve permitir informar o cumprimento da disciplina
     *  04 O sistema deve permitir informar ppretenção em disciplinas
     */

    private disciplina disciplinaAtual, disciplinaRequisito;
    private String idDisciplina;
    private Button botaoRequisito, botaoVerListaDiscussaoDisciplina;
    private Switch switchJaCursou, switchQuerCursar;
    private boolean jaCursou, querCursar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visao_disciplina);

        Bundle extra = getIntent().getExtras();

        /* Recebe como extra o id da disciplina
         * Ele seá usado para montar as views com o nome, sigla, ementa e disciplina requisito
         */

        // Cria o action Bar:
        android.support.v7.app.ActionBar ab = getSupportActionBar();
        ab.setLogo(R.drawable.botao_login);
        ab.setDisplayUseLogoEnabled(true);
        ab.setDisplayHomeAsUpEnabled(true);



        if (extra != null){
            idDisciplina = extra.getString("idDisciplina");

            /* Chama a função que monta as views*/
            preencheViews(idDisciplina);

            /* Deveria estar dentro da função preencheViews?*/
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

        botaoVerListaDiscussaoDisciplina = findViewById(R.id.botaoVerListaDiscussaoDisciplinaID);
        botaoVerListaDiscussaoDisciplina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                Intent intent = new Intent(visaoDisciplina.this, listaDiscussaoDisciplina.class);

                intent.putExtra("idDisciplina", idDisciplina);
                startActivity(intent);
            };


        });
        jaCursou = disciplinaAtual.isJaCursou();
        querCursar = disciplinaAtual.isQuerCursar();

        /* Botão para informar se o aluno já cursou a referida disciplina*/
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

        /* Botão para informar se o aluno quer cursar a referida disciplina no próximo período*/
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

        /* Chama a função que identifica as disciplinas*/
        disciplinaAtual = painelDisciplinas.encontraDisciplinaPeloID(idDisciplina);

        /* Preenche as views com os atributos da disciplina recebida acima*/
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
    // Cria o menu de opções usando as que foram listadas no menu_opcoes.xml
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_opcoes, menu);
        return true;
    }

    // Controla o que vai ser feito ao clicar em um item do menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Quando o Painel Disciplinas é selecionado
            case R.id.painelDisciplinasId:
                Toast.makeText(this, "Refresh selected", Toast.LENGTH_SHORT).show();
                break;
            // Quando o meu perfil é selecionado
            case R.id.meuPerfilId:
                Intent intentPerfil = new Intent(this, perfilUsuario.class);
                startActivity(intentPerfil);
                break;
            // Quando o mapa é selecionado
            case R.id.mapaId:
                Toast.makeText(this, "Refresh selected", Toast.LENGTH_SHORT).show();
                break;
            // Quando log out é selecionado
            case R.id.logoutID:
                Toast.makeText(this, "Até logo!", Toast.LENGTH_SHORT).show();
                MainActivity.fazerSignOut();
                finish();
                Intent intentLogout = new Intent(this, MainActivity.class);
                startActivity(intentLogout);
                break;
            default:
                break;
        }
        return true;
    }
}
