package com.veloso.danil.cadastro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.io.IOException;

/**
 * Created by danil on 26/10/2017.
 */

public class TelaPrincipal extends AppCompatActivity {

    protected void OnCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro);
    }

    public void OnClickLerArquivo (View view) throws IOException {
        ModeloDAO modeloDAO= new ModeloDAO(this);
        Log.i("teste","teste c");
        modeloDAO.Ler();
    }
    public void OnClickListar (View v)
    {
        Intent vrIntent = new Intent(this,ListView.class);
        startActivity(vrIntent);
    }
    public void OnClickAbrirChamado (View v)
    {
        Intent vrIntent = new Intent(this,TelaCadastro.class);
        startActivity(vrIntent);
    }
}
