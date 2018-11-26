package com.bctec.unisist;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.bumptech.glide.Glide;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

public class perfilUsuario extends AppCompatActivity {

    /*
     * Desenvolvido por: Bruno Cesar Pereira
     * Descrição: Activity da tela inicial do perfil do usuário
     * Implementa o caso de uso
     * Implementa o RF
     */

    private TextView emailUsuario, nomeUsuario;
    private ImageView imagemUsuario;
    //private String imgUsuarioURL;
    private Uri imgUsuarioURI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_usuario);

        // Cria o action Bar:
        android.support.v7.app.ActionBar ab = getSupportActionBar();
        ab.setLogo(R.drawable.botao_login);
        ab.setDisplayUseLogoEnabled(true);
        ab.setDisplayHomeAsUpEnabled(true);

        emailUsuario = findViewById(R.id.emailUsuarioId);
        nomeUsuario = findViewById(R.id.nomeUsuarioId);
        imagemUsuario = findViewById(R.id.imagemUsuarioId);

        GoogleSignInAccount acc = MainActivity.getAccount();
        if (acc != null){
            emailUsuario.setText(acc.getEmail());
            nomeUsuario.setText(acc.getDisplayName());
            //imagemUsuario.setImageBitmap(acc.getPhotoUrl());

            imgUsuarioURI = acc.getPhotoUrl();

            Log.d("teste","iniciando: " + imgUsuarioURI);

            if (imgUsuarioURI != null){
                Glide.with(this).load(imgUsuarioURI).into(imagemUsuario);
            }

            /*Glide.with(this).load(imgUsuarioURL).into(profile);
            sighIn.setVisibility(View.GONE);
            sighOut.setVisibility(View.VISIBLE);*/
        }



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
