package com.example.projeto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilmeTest {

    @Test
    void deveRetornarEstrelaDoFilme() {
        Filme filme = new Filme();
        filme.setCritica("estrela, estrela, estrela, estrela, estrela");

        assertEquals("estrela, estrela, estrela, estrela, estrela", filme.getCritica());
    }

    @Test
    void deveRetornarNotaDoFilme() {
        Filme filme = new Filme();
        filme.setCritica("estrela, estrela, estrela, estrela, estrela");

        assertEquals(9, filme.getNota());
    }
}
