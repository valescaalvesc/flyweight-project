package com.example.projeto;

public class Kdrama {

    private String nomeDrama;
    private Cidade cidadeGravacao;

    public Kdrama(String nomeDrama, Cidade cidadeGravacao) {
        this.nomeDrama = nomeDrama;
        this.cidadeGravacao = cidadeGravacao;
    }

    public String obterKdrama() {
        return "Kdrama{" +
                "nome kdrama='" + this.nomeDrama + '\'' +
                ", cidade='" + cidadeGravacao.getNomeDrama() + '\'' +
                ", localização='" + cidadeGravacao.getLocalizacao() + '\'' +
                '}';
    }
}
