package com.example.projeto;

public class CriticaEstrela implements ICritica {

    private String estrela;

    @Override
    public String getCritica() {
        return this.estrela;
    }

    @Override
    public void setCritica(String estrela) {
        this.estrela = estrela;
    }
}
