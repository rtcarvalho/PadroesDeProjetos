import Adapter.Aluno;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AlunoTest {

    @Test
    void deveRetornarConceitoAluno() {
        Aluno aluno = new Aluno();
        aluno.setAvaliacao("A");

        assertEquals("A", aluno.getAvaliacao());
    }

    @Test
    void deveRetornarNotaAluno() {
        Aluno aluno = new Aluno();
        aluno.setAvaliacao("A");

        assertEquals(9.0f, aluno.getNota());
    }
}