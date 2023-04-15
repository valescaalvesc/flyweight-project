package com.example.projeto;

import java.util.HashMap;
import java.util.Map;

public class CidadeFactory {

    private static Map<String, Cidade> cidades = new HashMap<>();

    public static Cidade getCidade(String nomeDrama, String localizacao) {
        Cidade cidade = cidades.get(nomeDrama);
        if (cidade == null) {
            cidade = new Cidade(nomeDrama, localizacao);
            cidades.put(nomeDrama, cidade);
        }
        return cidade;
    }

    public static int getTotalCidades() {
        return cidades.size();
    }
}
