package DecoratorTest;

import Decorator.Brioche;
import Decorator.CafeExpresso;
import Decorator.Cafeteria;
import Decorator.MisturaDaCasa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CafeTest {

    @Test
    void deveRetornarPrecoCafe() {
        Cafeteria cafe = new CafeExpresso(2.50);

        assertEquals(2.50, cafe.getPreco());
    }

    @Test
    void deveRetornarPrecoCafeComMisturaDaCasa() {
        Cafeteria cafe = new MisturaDaCasa(new CafeExpresso(2.50));

        assertEquals(3.00, cafe.getPreco());
    }

    @Test
    void deveRetornarPrecoCafeComBrioche() {
        Cafeteria cafe = new Brioche(new CafeExpresso(2.50));

        assertEquals(3.20, cafe.getPreco());
    }

    @Test
    void deveRetornarPrecoCafeComMisturaDaCasaMaisBrioche() {
        Cafeteria cafe = new MisturaDaCasa(new Brioche(new CafeExpresso(2.50)));

        assertEquals(3.70, cafe.getPreco());
    }

    @Test
    void deveRetornarDescricaoCafe() {
        Cafeteria cafe = new CafeExpresso();

        assertEquals("Café Expresso", cafe.getDescricao());
    }

    @Test
    void deveRetornarDescricaoCafeComMisturaDaCasa() {
        Cafeteria cafe = new MisturaDaCasa(new CafeExpresso());

        assertEquals("Café Expresso + Mistura da Casa", cafe.getDescricao());
    }

    @Test
    void deveRetornarDescricaoCafeComBrioche() {
        Cafeteria cafe = new Brioche(new CafeExpresso());

        assertEquals("Café Expresso + Brioche", cafe.getDescricao());
    }

    @Test
    void deveRetornarDescricaoCafeComMisturaDaCasaMaisBrioche() {
        Cafeteria cafe = new MisturaDaCasa(new Brioche(new CafeExpresso()));

        assertEquals("Café Expresso + Brioche + Mistura da Casa", cafe.getDescricao());
    }
}
