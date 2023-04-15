package com.example.projeto;

public class CriticaAdapter extends CriticaNota {

    private ICritica criticaEstrela;

    public CriticaAdapter(ICritica criticaEstrela) {
        this.criticaEstrela = criticaEstrela;
    }

    public String recuperarCritica() {
        if (this.getNota() >= 9)
            criticaEstrela.setCritica("estrela, estrela, estrela, estrela, estrela");
        else
        if (this.getNota() >= 8)
            criticaEstrela.setCritica("estrela, estrela, estrela, estrela");
        else
        if (this.getNota() >= 6)
            criticaEstrela.setCritica("estrela, estrela, estrela");
        else
        if (this.getNota() >= 4)
            criticaEstrela.setCritica("estrela, estrela");
        else
            criticaEstrela.setCritica("estrela");
        return criticaEstrela.getCritica();
    }

    public void salvarCritica() {
        if (criticaEstrela.getCritica().equals("estrela, estrela, estrela, estrela, estrela"))
            this.setNota(9);
        else
        if (criticaEstrela.getCritica().equals("estrela, estrela, estrela, estrela"))
            this.setNota(8);
        else
        if (criticaEstrela.getCritica().equals("estrela, estrela, estrela"))
            this.setNota(6);
        else
        if (criticaEstrela.getCritica().equals("estrela, estrela"))
            this.setNota(4);
        else
            this.setNota(0);
    }
}
