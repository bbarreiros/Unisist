package com.bctec.unisist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

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


                Intent intent = new Intent(MainActivity.this, painelDisciplinas.class);
                intent.putExtra("email", textoEmail.getText());

                startActivity(intent);

            }
        });



    }



}
