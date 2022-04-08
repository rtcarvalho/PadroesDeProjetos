package AbstractFactoryTest;

import AbstractFactory.Colaborador;
import AbstractFactory.FabricaAbstrat;
import AbstractFactory.FabricaEstagiario;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColaboradorTest {

    @Test
    void deveRetornarContratoEstagiario() {
        FabricaAbstrat fabrica = new FabricaEstagiario();
        Colaborador colaborador = new Colaborador(fabrica);
        assertEquals("contrato estagiario", colaborador.imprimirContrato());
    }

    @Test
    void deveRetornarBeneficiosEstagiario() {
        FabricaAbstrat fabrica = new FabricaEstagiario();
        Colaborador colaborador = new Colaborador(fabrica);
        assertEquals("Beneficio estagiario", colaborador.imprimiBeneficios());
    }
}
