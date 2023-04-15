package com.example.projeto;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {

    private List<Kdrama> kdramas = new ArrayList<>();

    public void cadastrar(String nomeDrama, String nomeCidade, String localizacao) {
        Cidade cidade = CidadeFactory.getCidade(nomeCidade, localizacao);
        Kdrama kdrama = new Kdrama(nomeDrama, cidade);
        kdramas.add(kdrama);
    }

    public List<String> obterKdramas() {
        List<String> saida = new ArrayList<String>();
        for (Kdrama kdrama : this.kdramas) {
            saida.add(kdrama.obterKdrama());
        }
        return saida;
    }
}
