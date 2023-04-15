package com.example.projeto;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatalogoTest {

    @Test
    void deveRetornarKdramas() {
        Catalogo catalogo = new Catalogo();
        catalogo.cadastrar("The Glory", "Seoul", "Centro");
        catalogo.cadastrar("Crash Course In Romance", "Seoul", "Centro");
        catalogo.cadastrar("Flower of Evil", "Busan", "Campo");
        catalogo.cadastrar("Run On", "Incheon", "Praia");

        List<String> saida = Arrays.asList(
                "Kdrama{nome kdrama='The Glory', cidade='Seoul', localização='Centro'}",
                "Kdrama{nome kdrama='Crash Course In Romance', cidade='Seoul', localização='Centro'}",
                "Kdrama{nome kdrama='Flower of Evil', cidade='Busan', localização='Campo'}",
                "Kdrama{nome kdrama='Run On', cidade='Incheon', localização='Praia'}");

        assertEquals(saida, catalogo.obterKdramas());
    }

    @Test
    void deveRetornarTotalCidades() {
        Catalogo catalogo = new Catalogo();
        catalogo.cadastrar("The Glory", "Seoul", "Centro");
        catalogo.cadastrar("Crash Course In Romance", "Seoul", "Centro");
        catalogo.cadastrar("Flower of Evil", "Busan", "Campo");
        catalogo.cadastrar("Run On", "Incheon", "Praia");

        assertEquals(3, CidadeFactory.getTotalCidades());
    }
}
