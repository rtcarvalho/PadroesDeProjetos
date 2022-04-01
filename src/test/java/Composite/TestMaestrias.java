package Composite;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestMaestrias {

    @Test
    void deveRetortnarHabilidadesPersonagem() {
        Maestrias maestrias1 = new Maestrias("Agua");

        Maestrias maestrias2 = new Maestrias("Fogo");
        Talento talento1 = new Talento("Meteoro de Pegasus");
        maestrias2.addAtribuicao(talento1);

        Maestrias maestrias3 = new Maestrias("Raio");
        Talento talento3 = new Talento("Relampago Amarelo");
        maestrias3.addAtribuicao(talento3);

        Maestrias talentos = new Maestrias("Maestrias magicas");
        talentos.addAtribuicao(maestrias1);
        talentos.addAtribuicao(maestrias2);
        talentos.addAtribuicao(maestrias3);

        Personagem personagem = new Personagem();
        personagem.setTalento(talentos);

        assertEquals("Maestrias: Maestro com Gelo\n" +
                "Maestrias: Maestria com Agua\n" +
                "Maestrias: Maestria com Fogo\n" +
                "Talento: Meteoro de Pegasus\n" +
                "Maestrias: Maestria com Raio\n" +
                "Talento: Relampago Amarelo\n", personagem.getTalento());
    }

    @Test
    void deveRetornarPersonagemSemTalento() {
        try {
            Personagem personagem = new Personagem();
            personagem.getTalento();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Personagem sem talentos", e.getMessage());
        }
    }
}