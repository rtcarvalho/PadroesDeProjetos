import builder.Computador;
import builder.ComputadorBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ComputadorBuilderTest {

    @Test
    void deveRetornarComputadorValido() {
        ComputadorBuilder computadorBuilder = new ComputadorBuilder();
        Computador computador = computadorBuilder
                .setFonte("Fonte XPG Core 850W")
                .setPlacaMae("Placa-Mãe TUF H310M-Plus LGA 1151")
                .setMemoriaRam("Memoria DDR4 8GB")
                .setHd("HD 1TBCorsair")
                .setProcessador("Intel Core i3 8100")
                .setPlacaVideo(" Nvidia")
                .build();

        assertNotNull(computador);
    }

    @Test
    void deveRetornarComputadorValidoComSsd() {
        ComputadorBuilder computadorBuilder = new ComputadorBuilder();
        Computador computador = computadorBuilder
                .setFonte("Fonte Corsair")
                .setPlacaMae("Placa Gigabyte")
                .setMemoriaRam("Memoria Corsair")
                .setHd("Hd Corsair")
                .setProcessador("Processador Intel")
                .setPlacaVideo("Placa de Vídeo Nvidia")
                .build();

        assertNotNull(computador);
    }

    @Test
    void deveRetornarExcecaoComputadorSemFonte() {
        try {
            ComputadorBuilder computadorBuilder = new ComputadorBuilder();
            Computador computador = computadorBuilder
                    .setPlacaMae("Placa Gigabyte")
                    .setMemoriaRam("Memoria Corsair")
                    .setHd("Hd Corsair")
                    .setProcessador("Processador Intel")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("A Fonte é obrigatória.", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoComputadorSemPlacaMae() {
        try {
            ComputadorBuilder computadorBuilder = new ComputadorBuilder();
            Computador computador = computadorBuilder
                    .setFonte("Fonte Corsair")
                    .setMemoriaRam("Memoria Corsair")
                    .setHd("Hd Corsair")
                    .setProcessador("Processador Intel")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("A Placa-Mãe é obrigatória.", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoComputadorSemProcessador() {
        try {
            ComputadorBuilder computadorBuilder = new ComputadorBuilder();
            Computador computador = computadorBuilder
                    .setFonte("Fonte Corsair")
                    .setPlacaMae("Placa Gigabyte")
                    .setMemoriaRam("Memoria Corsair")
                    .setHd("Hd Corsair")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O Processador é obrigatório.", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoComputadorSemHd() {
        try {
            ComputadorBuilder computadorBuilder = new ComputadorBuilder();
            Computador computador = computadorBuilder
                    .setFonte("Fonte Corsair")
                    .setPlacaMae("Placa Gigabyte")
                    .setProcessador("Processador Intel")
                    .setMemoriaRam("Memoria Corsair")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O HD é obrigatório.", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoComputadorSemMemoriaRam() {
        try {
            ComputadorBuilder computadorBuilder = new ComputadorBuilder();
            Computador computador = computadorBuilder
                    .setFonte("Fonte Corsair")
                    .setPlacaMae("Placa Gigabyte")
                    .setProcessador("Processador Intel")
                    .setHd("Hd Corsair")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("A Memória Ram é obrigatória.", e.getMessage());
        }
    }
}