package com.bctec.unisist;

import android.app.ActionBar;
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

    private Button botaoDisciplina001, botaoDisciplina026;

    private TextView emailRodape;

    private View barraSuperior;

    public static List<disciplina> listaDisciplinas = new ArrayList<disciplina>();

    private Switch switchVerDisciplinasCursadas;

    private boolean verDisciplinasCursadas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_painel_disciplinas);

        android.support.v7.app.ActionBar ab = getSupportActionBar();
        ab.setLogo(R.drawable.botao_login);
        ab.setDisplayUseLogoEnabled(true);
        ab.setDisplayHomeAsUpEnabled(true);


        /* Na primeira vez que a activity é chamada, chama essa função que cria os objetos de discilpina*/
        iniciaDisciplinas();

        /* Monta os botões da grade de acordo com os nomes e atributos de visibilidade*/
        preparaBotoesGrade();

        verDisciplinasCursadas = false;

        emailRodape = findViewById(R.id.emailRodapeId);

        GoogleSignInAccount acc = MainActivity.getAccount();
        if (acc != null)
            emailRodape.setText(acc.getEmail());

       // Bundle extra = getIntent().getExtras();
        /*
         if (extra != null){

            *Recebe o extra vindo da activity Main contendo a string do email
             */
           /* String texto = extra.getString("email");
            emailRodape.setText(texto);

            //Toast.makeText(painelDisciplinas.this, texto , Toast.LENGTH_LONG).show();
        }*/

        // Ao clicar na barra superior, chama a view do menu
       /* barraSuperior = findViewById(R.id.barraSuperiorPainelDisciplinasId);
        barraSuperior.setOnClickListener(new View.OnClickListener() {
            Intent intent = new Intent(painelDisciplinas.this, menuOpcoes.class);
            startActivity(intent);
        });*/


        /* Quando algum dos botões de disciplina é clicado, chama a função que dispara a activity visaoDisciplina passando como parametro o id da disciplina*/
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

        /* botão para ligar ou desligar a visão de disciplinas cursadas/pretendidas*/
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

        /* Percorre o vetor que guarda todas as disciplinas*/
        if (qtdDisciplinas >1){
            for (indice = 1 ; indice <= qtdDisciplinas; indice++){
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

                botaoAtual = (Button) findViewById(resID);

                /* Faz as atribuições de visibilidade*/
                if (visivel == false)
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

    /*public static ArrayList retornaListaDisciplinas(){
        List<disciplina> listaDisciplinasOut = listaDisciplinas;
    }*/

  //  @Override
  //  public void onClick(View v) {
        // Ao clicar na barra superior, chama a view do menu
     /*   barraSuperior = findViewById(R.id.barraSuperiorPainelDisciplinasId);
        barraSuperior.setOnClickListener(v ){
            Intent intent = new Intent(painelDisciplinas.this, menuOpcoes.class);
            startActivity(intent);
        });*/
   // }

  /*  @Override
    public boolean onCreateOptionsMenu(Menu menu){
        super.onCreateOptionsMenu(menu);

        MenuItem m0 = menu.add(0 , 0, 0, "Painel Disciplinas");
        m0.setShowAsAction(MenuItem.SHOW_AS_ACTION_NEVER);


        MenuItem m1 = menu.add(0 , 0, 1, "Perfil do Usuário");
        m1.setShowAsAction(MenuItem.SHOW_AS_ACTION_NEVER);


        MenuItem m2 = menu.add(0 , 0, 2, "Localização");
        m2.setShowAsAction(MenuItem.SHOW_AS_ACTION_NEVER);

        MenuItem m3 = menu.add(0 , 0, 3, "Sair");
        m3.setShowAsAction(MenuItem.SHOW_AS_ACTION_NEVER);

        // getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }*/

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
          // action with ID action_refresh was selected
          case R.id.painelDisciplinasId:
              Toast.makeText(this, "Refresh selected", Toast.LENGTH_SHORT).show();
              break;
          // action with ID action_settings was selected
          case R.id.meuPerfilId:
              Toast.makeText(this, "Settings selected", Toast.LENGTH_SHORT).show();
              break;
          // action with ID action_refresh was selected
          case R.id.mapaId:
              Toast.makeText(this, "Refresh selected", Toast.LENGTH_SHORT).show();
              break;
          // action with ID action_settings was selected
          case R.id.sairId:
              Toast.makeText(this, "Settings selected", Toast.LENGTH_SHORT).show();
              break;
          default:
              break;
      }
       return true;
  }

}
