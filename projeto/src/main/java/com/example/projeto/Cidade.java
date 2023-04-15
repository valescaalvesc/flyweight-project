package com.example.projeto;

public class Cidade {

    private String nomeDrama;
    private String localizacao;

    public Cidade(String nomeDrama, String localizacao) {
        this.nomeDrama = nomeDrama;
        this.localizacao = localizacao;
    }

    public String getNomeDrama() {
        return nomeDrama;
    }

    public String getLocalizacao() {
        return localizacao;
    }
}
