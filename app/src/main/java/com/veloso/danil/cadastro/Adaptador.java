package com.veloso.danil.cadastro;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by danil on 19/10/2017.
 */

public class Adaptador extends ArrayAdapter<Modelo> {

    public Adaptador(ArrayList<Modelo>lista, Context contexto){
        super(contexto,0,lista);
    }


    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int posicao, View reciclado, ViewGroup pai) {
        if (reciclado == null){
            //situação em que não há celulas disponiveis

            reciclado = LayoutInflater.from(getContext()).inflate(R.layout.activit_tela_dados, pai, false);

        }

        Modelo copia = getItem(posicao);
        String teste = copia.getNome();
        TextView nome = reciclado.findViewById(R.id.txtNome);
        nome.setText(copia.getNome());
        TextView nome2 = reciclado.findViewById(R.id.txtSobrebnme);
        nome2.setText(copia.getSobrenome());
        TextView tel = reciclado.findViewById(R.id.txtTelefone);
        tel.setText(copia.getTel());
        TextView email = reciclado.findViewById(R.id.txtEmail);
        email.setText(copia.getEmail());

        return reciclado;
    }
}
