package Facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestComputador {

    @Test
    void deveRetornarPlacaMaeComDefeito() {
        Computador computador = new Computador();
        PlacaMae.getInstancia().setItemComDefeito(true);

        assertEquals(false, computador.ligar());
    }

    @Test
    void deveRetornarProcessadorComDefeito() {
        Computador computador = new Computador();
        Processador.getInstancia().setItemComDefeito(true);

        assertEquals(false, computador.ligar());
    }

    @Test
    void deveRetornarDiscoRigidoComDefeito() {
        Computador computador = new Computador();
        Hd.getInstancia().setItemComDefeito(true);

        assertEquals(false, computador.ligar());
    }

    @Test
    void deveRetornarMemoriaComDefeito() {
        Computador computador = new Computador();
        Memoria.getInstancia().setItemComDefeito(true);

        assertEquals(false, computador.ligar());
    }

    @Test
    void deveRetornarComputadorSemDefeito() {
        Computador computador = new Computador();

        assertEquals(true, computador.ligar());
    }
}
