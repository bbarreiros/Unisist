package com.bctec.unisist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    /*
    * Desenvolvido por: Bruno Cesar Pereira
    * Descrição: Activity da tela inicial do app. Recebe as redenciais do aluno e rpepara para o login
    * Implementa o caso de uso 01 Fornecer Identificação
    * Implementa o RF 14 O sistema deve permitir a identificação do usuário
    */

    private ImageView botaoLogin;
    private TextView textoEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoLogin = findViewById(R.id.botao_login_id);

        textoEmail = findViewById(R.id.caixa_login_id);

        botaoLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                /*Quando o botão login é clicado chama a activity painelDisciplinas passando como extra a string contendo  email digitado.
                * No futuro deve ser implementada a integração com o google para validar o login
                */
                Intent intent = new Intent(MainActivity.this, painelDisciplinas.class);

                String email = textoEmail.getText().toString();
                intent.putExtra("email", email );
                startActivity(intent);

            }
        });



    }



}
