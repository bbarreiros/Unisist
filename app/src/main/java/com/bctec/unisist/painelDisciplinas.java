package com.bctec.unisist;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

import java.util.ArrayList;
import java.util.List;

public class painelDisciplinas extends AppCompatActivity
       // implements View.OnClickListener
{

    /*
     * Desenvolvido por: Bruno Cesar Pereira
     * Descrição: Activity da com o painel de disciplinas
     * Implementa os casos de uso:
     *  04 Visualizar Organograma de Disciplinas
     *  13 VIsualizar painel situação Aluno
     * Implementa os RF:
     *  05 O sistema deve permitir exibição do organograma público de disciplinas
     *  08 O sistema deve permitir exibição do organograma particular de disciplinas
     */

    private Button botaoDisciplinaAtual;

    private TextView emailRodape;

    public static List<disciplina> listaDisciplinas = new ArrayList<disciplina>();

    private Switch switchVerDisciplinasCursadas;

    private boolean verDisciplinasCursadas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_painel_disciplinas);

        // Cria o action Bar:
        android.support.v7.app.ActionBar ab = getSupportActionBar();
        ab.setLogo(R.drawable.botao_login);
        ab.setDisplayUseLogoEnabled(true);
        //ab.setDisplayHomeAsUpEnabled(true);

        /* Monta os botões da grade de acordo com os nomes e atributos de visibilidade*/
        preparaBotoesGrade();

        verDisciplinasCursadas = false;

        emailRodape = findViewById(R.id.emailRodapeId);

        GoogleSignInAccount acc = MainActivity.getAccount();
        if (acc != null)
            emailRodape.setText(acc.getEmail());

        /* Quando algum dos botões de disciplina é clicado, chama a função que dispara a activity visaoDisciplina passando como parametro o id da disciplina*/
        botaoDisciplinaAtual = findViewById(R.id.botao_001);
        botaoDisciplinaAtual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("1");
            }
        });

        botaoDisciplinaAtual = findViewById(R.id.botao_002);
        botaoDisciplinaAtual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("2");
            }
        });

        botaoDisciplinaAtual = findViewById(R.id.botao_003);
        botaoDisciplinaAtual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("3");
            }
        });

        botaoDisciplinaAtual = findViewById(R.id.botao_004);
        botaoDisciplinaAtual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("4");
            }
        });

  /*      botaoDisciplinaAtual = findViewById(R.id.botao_005);
        botaoDisciplinaAtual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("5");
            }
        });

        botaoDisciplinaAtual = findViewById(R.id.botao_006);
        botaoDisciplinaAtual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("6");
            }
        });

        botaoDisciplinaAtual = findViewById(R.id.botao_007);
        botaoDisciplinaAtual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("7");
            }
        });

        botaoDisciplinaAtual = findViewById(R.id.botao_008);
        botaoDisciplinaAtual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("8");
            }
        });*/

        botaoDisciplinaAtual = findViewById(R.id.botao_009);
        botaoDisciplinaAtual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("9");
            }
        });

        botaoDisciplinaAtual = findViewById(R.id.botao_010);
        botaoDisciplinaAtual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("10");
            }
        });
        botaoDisciplinaAtual = findViewById(R.id.botao_011);
        botaoDisciplinaAtual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("11");
            }
        });

        botaoDisciplinaAtual = findViewById(R.id.botao_012);
        botaoDisciplinaAtual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("12");
            }
        });

 /*       botaoDisciplinaAtual = findViewById(R.id.botao_013);
        botaoDisciplinaAtual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("13");
            }
        });

        botaoDisciplinaAtual = findViewById(R.id.botao_014);
        botaoDisciplinaAtual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("14");
            }
        });

        botaoDisciplinaAtual = findViewById(R.id.botao_015);
        botaoDisciplinaAtual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("15");
            }
        });

        botaoDisciplinaAtual = findViewById(R.id.botao_016);
        botaoDisciplinaAtual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("16");
            }
        });*/

        botaoDisciplinaAtual = findViewById(R.id.botao_017);
        botaoDisciplinaAtual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("17");
            }
        });

        botaoDisciplinaAtual = findViewById(R.id.botao_018);
        botaoDisciplinaAtual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("18");
            }
        });

        botaoDisciplinaAtual = findViewById(R.id.botao_019);
        botaoDisciplinaAtual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("19");
            }
        });

        botaoDisciplinaAtual = findViewById(R.id.botao_020);
        botaoDisciplinaAtual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("20");
            }
        });
 /*       botaoDisciplinaAtual = findViewById(R.id.botao_021);
        botaoDisciplinaAtual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("21");
            }
        });

        botaoDisciplinaAtual = findViewById(R.id.botao_022);
        botaoDisciplinaAtual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("22");
            }
        });

        botaoDisciplinaAtual = findViewById(R.id.botao_023);
        botaoDisciplinaAtual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("23");
            }
        });

        botaoDisciplinaAtual = findViewById(R.id.botao_024);
        botaoDisciplinaAtual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("24");
            }
        });*/

        botaoDisciplinaAtual = findViewById(R.id.botao_025);
        botaoDisciplinaAtual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("25");
            }
        });

        botaoDisciplinaAtual = findViewById(R.id.botao_026);
        botaoDisciplinaAtual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("26");
            }
        });

        botaoDisciplinaAtual = findViewById(R.id.botao_027);
        botaoDisciplinaAtual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("27");
            }
        });

        botaoDisciplinaAtual = findViewById(R.id.botao_028);
        botaoDisciplinaAtual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("28");
            }
        });

/*        botaoDisciplinaAtual = findViewById(R.id.botao_029);
        botaoDisciplinaAtual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("29");
            }
        });

        botaoDisciplinaAtual = findViewById(R.id.botao_030);
        botaoDisciplinaAtual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("30");
            }
        });

        botaoDisciplinaAtual = findViewById(R.id.botao_031);
        botaoDisciplinaAtual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("31");
            }
        });

        botaoDisciplinaAtual = findViewById(R.id.botao_032);
        botaoDisciplinaAtual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                onClickBotaoGenerico("32");
            }
        });*/

        /* botão para ligar ou desligar a visão de disciplinas cursadas/pretendidas*/
        switchVerDisciplinasCursadas = findViewById(R.id.switchVerDisciplinasCursadas);

        switchVerDisciplinasCursadas.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                // Muda o estado do botão quando clicado
                verDisciplinasCursadas = !verDisciplinasCursadas;
                preparaBotoesGrade();
            }
        });
    }

    @Override
    protected void onResume(){
        super.onResume();
        /* Remonta os botões pois pode ter havido alteração nas disciplinas cursadas ou pretendidas*/
        preparaBotoesGrade();
    }

    private void onClickBotaoGenerico(String idBotao){

        /* Inicia a tela visaoDisciplina passando como parametro o id da disciplina*/
        Intent intent = new Intent(painelDisciplinas.this, visaoDisciplina.class);

        intent.putExtra("idDisciplina", idBotao );
        startActivity(intent);

    }

     private void preparaBotoesGrade(){

        /* Essa função preenche o texto, cores e visibilidade dos botões de acordo com os respectivos atributos dos objetos Disciplina */

        int qtdDisciplinas, indice, posicaoGrid;
        String idBotaoAtual, siglaDisciplinaAtual;
        disciplina disciplinaAtual;
        boolean visivel, jaCursou, querCursar;

        qtdDisciplinas = listaDisciplinas.size() -1;
        Button botaoAtual;

         /* Na primeira vez que a activity é chamada, chama essa função que cria os objetos de discilpina*/
         if (qtdDisciplinas == -1){
             iniciaDisciplinas();
         }

        /* Percorre o vetor que guarda todas as disciplinas*/
        if (qtdDisciplinas >1){
            for (indice = 1 ; indice <= qtdDisciplinas; indice++){

                Log.d("idAtual","iniciando: " + Integer.toString(qtdDisciplinas) + " " + Integer.toString(indice));

                disciplinaAtual = listaDisciplinas.get(indice);
                posicaoGrid =  disciplinaAtual.getPosicaoGrid();
                visivel = disciplinaAtual.isVisivel();
                siglaDisciplinaAtual = disciplinaAtual.getSigla();
                jaCursou = disciplinaAtual.isJaCursou();
                querCursar = disciplinaAtual.isQuerCursar();

                /* chama a função que monta o id dos botões a partir da sua posição no grid
                * formato do id: "botao_" + "xx" esse xx é um inteiro
                * */
                idBotaoAtual = montaIdBotaoDisciplina(posicaoGrid);

                /* com o id do botão em string, chama essa função que encontra o recurso usando essa string*/
                int resID = getResources().getIdentifier(idBotaoAtual, "id", getPackageName());

                botaoAtual = findViewById(resID);

                /* Faz as atribuições de visibilidade*/
                if (!visivel)
                    botaoAtual.setVisibility(View.INVISIBLE);
                botaoAtual.setText(siglaDisciplinaAtual);

                /* Faz as atribuições de cores para jaCursou e querCursar*/
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

        /* Função para carga inicial das disciplinas. Deve ser substituida por serviço externo*/
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

        /* Percorre o vetor das disciplinas e retorna o id da disciplina encontrada caso exista*/
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
        /* Recebe a string do codigo da disciplina e retorna a string do codigo do botao respectivo*/
        return "botao_" + String.format("%03d", id);
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
