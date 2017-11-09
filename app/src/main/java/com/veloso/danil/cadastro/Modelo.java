package com.veloso.danil.cadastro;

/**
 * Created by danil on 21/09/2017.
 */

public class Modelo {
    String nome;
    String sobrenome;
    String tel;
    String email;

    public Modelo(String nome, String sobrenome, String tel, String email) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.tel = tel;
        this.email = email;
    }

    public Modelo() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String toString ()
    {
        return getNome()+";"+getSobrenome()+";"+getTel()+";"+getEmail()+"\n";
    }
}
