package Prototype;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarroTest {

    @Test
    void testClone() throws CloneNotSupportedException{
        Carro carro = new Carro("BRA2E19", new Modelo("Subaru", "Subaru Forester 2.0 16v Fa20f"));

        Carro carroClone = carro.clone();
        carroClone.setPlaca("QYG8E43");
        carroClone.getModelo().setNome("Honda Civic Type-R");
        carroClone.getModelo().setMotor("Honda Civic Type-R Turbo");

        assertEquals("Moto{placa=BRA2E19, modelo=Modelo{nome=Subaru, motor=Subaru Forester 2.0 16v Fa20f'}'}", carro.toString());
        assertEquals("Moto{placa=QYG8E43, modelo=Modelo{nome=Honda Civic Type-R, motor=Honda Civic Type-R Turbo'}'}", carroClone.toString());
    }
}
