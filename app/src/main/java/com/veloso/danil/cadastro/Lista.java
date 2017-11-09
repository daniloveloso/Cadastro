package com.veloso.danil.cadastro;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.io.IOException;
import java.util.ArrayList;

public class Lista extends AppCompatActivity {

    ArrayList<Modelo> modelos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        try{
            modelos = (ArrayList<Modelo>) new ModeloDAO(this).Ler();
        } catch (IOException e){
           e.printStackTrace();
        }

        ListView lista = (ListView)findViewById(R.id.listview);
        Adaptador adaptador = new Adaptador(modelos,this);
        lista.setAdapter(adaptador);

    }

    private Context getContext(){
        return this;
    }
}
