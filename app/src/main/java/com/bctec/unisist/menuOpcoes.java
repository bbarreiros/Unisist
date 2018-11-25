package com.bctec.unisist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class menuOpcoes extends AppCompatActivity {

    private ListView listaItensMenu;
    private String[] itensMenu = {
            "Painel Disciplinas",
            "Perfil do Usuário" ,
            "Localização" ,
            "Sair"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_opcoes);

        listaItensMenu = findViewById(R.id.listViewMenuOpcoesId);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_expandable_list_item_1,
                android.R.id.text1,
                itensMenu
        );

        listaItensMenu.setAdapter( adaptador );
    }
}
