package bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BarbaroTest {

    @Test
    void deveRetornarVidaBarbaroAssassino() {
        Raca raca = new Assassino();
        Barbaro barbaro = new Barbaro(100);
        barbaro.setRaca(raca);
        assertEquals(110.0f, barbaro.calcularVida());
    }

    @Test
    void deveRetornarVidaBarbaroLadrao() {
        Raca raca = new Ladrao();
        Barbaro barbaro = new Barbaro(100);
        barbaro.setRaca(raca);
        assertEquals(120.00001f, barbaro.calcularVida());
    }

}
