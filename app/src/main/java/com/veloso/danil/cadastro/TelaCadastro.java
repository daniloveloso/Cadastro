package com.veloso.danil.cadastro;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.IOException;

public class TelaCadastro extends AppCompatActivity {

    private EditText email;
    private EditText tel;
    private EditText nome;
    private EditText nome2;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro);

        nome = ((EditText)findViewById(R.id.nome));
        nome2 = ((EditText)findViewById(R.id.nome2));
        email = ((EditText)findViewById(R.id.email));
        tel = ((EditText)findViewById(R.id.telefone));
        button=(Button) findViewById(R.id.salvar);



    }

    public void onClick(View view) throws IOException{

        Modelo modelo = new Modelo();
        modelo.setNome(nome.getText().toString());
        modelo.setSobrenome(nome2.getText().toString());
        modelo.setTel(tel.getText().toString());
        modelo.setEmail(email.getText().toString());

        ModeloDAO modeloDAO= new ModeloDAO(this);

        modeloDAO.Salvar(modelo);
//        Intent vrIntent = new Intent(this,Lista.class);
//
//        // startActivity(vrIntent); //
//        startActivity(vrIntent);

//        finish();

    }

    public void onClickListar(View view) throws IOException{

        Intent vrIntent = new Intent(this,Lista.class);

        // startActivity(vrIntent); //
        startActivity(vrIntent);



    }

    private Context getContext(){
        return this;
    }
}
