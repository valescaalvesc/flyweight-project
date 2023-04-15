package com.example.projeto;

public class Filme {

    ICritica critica;
    CriticaAdapter persistencia;

    public Filme() {
        critica = new CriticaEstrela();
        persistencia = new CriticaAdapter(critica);
    }

    public void setCritica(String estrela) {
        critica.setCritica(estrela);
        persistencia.salvarCritica();
    }

    public String getCritica() {
        return persistencia.recuperarCritica();
    }

    // Método apenas para mostrar que está convertendo estrela para nota através do adaptador
    public int getNota() {
        return persistencia.getNota();
    }
}
