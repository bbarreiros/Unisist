package com.bctec.unisist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;

public class MainActivity extends AppCompatActivity  {

    /*
    * Desenvolvido por: Bruno Cesar Pereira
    * Descrição: Activity da tela inicial do app. Recebe as redenciais do aluno e rpepara para o login
    * Implementa o caso de uso 01 Fornecer Identificação
    * Implementa o RF 14 O sistema deve permitir a identificação do usuário
    */

    private ImageView botaoLogin;
    private TextView textoEmail;
    private static final String TAG = "MainActivity";
    private static final int RC_SIGN_IN = 9000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoLogin = findViewById(R.id.botao_login_id);

        textoEmail = findViewById(R.id.caixa_login_id);

        // Configuração do sign in buscando o email a a build
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                //.requestServerAuthCode(serverClientId)
                //.profile()
                .requestEmail()
                .build();

       final GoogleSignInClient mGoogleSignInClient = GoogleSignIn.getClient(this, gso);

        botaoLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                /*Quando o botão login é clicado chama a activity painelDisciplinas passando como extra a string contendo  email digitado.
                * No futuro deve ser implementada a integração com o google para validar o login
                */

                Intent signInIntent = mGoogleSignInClient.getSignInIntent();
                startActivityForResult(signInIntent, RC_SIGN_IN);

                Intent intent = new Intent(MainActivity.this, painelDisciplinas.class);

                String email = textoEmail.getText().toString();
                intent.putExtra("email", email );
                startActivity(intent);

            }

        });

;


        // Connect our sign in, sign out and disconnect buttons.
       /* botaoLogin.setOnClickListener(this);*/
        //findViewById(R.id.sign_out_button).setOnClickListener(this);
        //findViewById(R.id.revoke_access_button).setOnClickListener(this);
        //findViewById(R.id.sign_out_button).setVisibility(View.INVISIBLE);
        //findViewById(R.id.revoke_access_button).setVisibility(View.INVISIBLE);

        // Configure the ProgressDialog that will be shown if there is a
        // delay in presenting the user with the next sign in step.
        /*mConnectionProgressDialog = new ProgressDialog(this);
        mConnectionProgressDialog.setMessage("Signing in...");*/



    }


    protected void onStart(){
        super.onStart();

        //Verifica se o usuário já fez o sign in
        GoogleSignInAccount account = GoogleSignIn.getLastSignedInAccount(this);

        // Se o sign in já foi feito, chama a Intent do Painel de Disciplinas
        if (account != null){
            iniciaActivityPainelDisciplinas(account);
        }

    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // Result returned from launching the Intent from GoogleSignInClient.getSignInIntent(...);
        if (requestCode == RC_SIGN_IN) {
            // The Task returned from this call is always completed, no need to attach
            // a listener.
            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
            //GoogleSignInAccount account = GoogleSignIn.getLastSignedInAccount(this);
            //iniciaActivityPainelDisciplinas(account);
            handleSignInResult(task);
        }
    }

    public void iniciaActivityPainelDisciplinas(GoogleSignInAccount acc){
        Intent intent = new Intent(MainActivity.this, painelDisciplinas.class);

        String email = textoEmail.getText().toString();
        intent.putExtra("email", email );
        startActivity(intent);
    }

    private void handleSignInResult(Task<GoogleSignInAccount> completedTask) {
        try {
            GoogleSignInAccount account = completedTask.getResult(ApiException.class);

            // Signed in successfully, show authenticated UI.
            String msgSucesso = "Bem vindo, ";
            msgSucesso = msgSucesso + account.getDisplayName();
            Toast.makeText(MainActivity.this,msgSucesso,  Toast.LENGTH_LONG).show();
            iniciaActivityPainelDisciplinas(account);
        } catch (ApiException e) {
            // The ApiException status code indicates the detailed failure reason.
            // Please refer to the GoogleSignInStatusCodes class reference for more information.
            Log.w(TAG, "signInResult:failed code=" + e.getStatusCode());
            Toast.makeText(MainActivity.this, "Falha no sign in",  Toast.LENGTH_LONG).show();
            //updateUI(null);
        }
    }
}
