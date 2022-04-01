import org.junit.jupiter.api.Test;

class Comprimento {

    @Test
    void deveRetornarMilhasTamanho() {
        Comprimento comprimento = new Comprimento();
        comprimento.setComprimento(1f);

        assertEquals(1f, comprimento.getMedida());
    }

    private void setComprimento(float v) {
    }

    @Test
    void  deveRetornarCMTamanho() {
        Comprimento comprimento = new Comprimento();
        comprimento.setMedida(1f);

        assertEquals(31.249998092651367f, comprimento.getMedidaCM());
    }

}