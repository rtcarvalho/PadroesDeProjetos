package BridgeTest;

import Bridge.Assassino;
import Bridge.Ladrao;
import Bridge.Mage;
import Bridge.Raca;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MageTest {

    @Test
    void deveRetornarVidaMagoAssassino() {
        Raca raca = new Assassino();
        Mage mage = new Mage(95);
        mage.setRaca(raca);
        assertEquals(104.5f, mage.calcularVida());
    }

    @Test
    void deveRetornarVidaMagoLadrao() {
        Raca raca = new Ladrao();
        Mage mage = new Mage(95);
        mage.setRaca(raca);
        assertEquals(114.00001f, mage.calcularVida());
    }

}