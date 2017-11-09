package com.veloso.danil.cadastro;

import android.content.Context;
import android.util.Log;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by danil on 19/10/2017.
 */

public class ModeloDAO {

    String caminho;

    public ModeloDAO() {

    }
    public ModeloDAO(Context context) throws IOException{
        this.caminho=context.getFilesDir().getPath()+"Dados.txt";
    }

    public void Salvar (Modelo modelo) throws IOException{
        FileWriter writer = new FileWriter(caminho, true);

        writer.write(modelo.toString());
        writer.flush();
        writer.close();
    }

    public List<Modelo> Ler () throws IOException{
        FileReader reader = new FileReader(caminho);
        BufferedReader buffer = new BufferedReader(reader);
        String linha = null;
        List<Modelo> Lista = new ArrayList<Modelo>();
        Modelo modelo;
        while ((linha=buffer.readLine())!=null){
            String[] dados=linha.split(";");
            modelo = new Modelo();
            modelo.setNome(dados[0]);
            modelo.setSobrenome(dados[1]);
            modelo.setTel(dados[2]);
            modelo.setEmail(dados[3]);
            Lista.add(modelo);
            Log.i("INFO", linha);
        }
        return Lista;
    }
}
