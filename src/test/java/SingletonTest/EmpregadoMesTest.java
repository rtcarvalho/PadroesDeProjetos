package SingletonTest;

import Singleton.EmpregadoMes;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmpregadoMesTest {

    @Test
    public void deveRetornarMes() {
        EmpregadoMes.getInstance().setMes("Dezembro");
        assertEquals("Dezembro", EmpregadoMes.getInstance().getMes());
    }

    @Test
    public void deveRetornarNomeFuncionario() {
        EmpregadoMes.getInstance().setNomeEmpregado("Renato");
        assertEquals("Renato", EmpregadoMes.getInstance().getNomeEmpregadoo());
    }
}