import Flyweight.PosicaoFactory;
import Flyweight.Team;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TeamTest {

    @Test
    void deveRetornarJogadores() {
        Team team = new Team();
        team.contratar("Fallen", "Awper", "Sniper");
        team.contratar("Fer", "Entry Fragger", "Rifler");
        team.contratar("FNX", "Entry Killer", "Rifler");
        team.contratar("Boltz", "Lucker", "Rifler");

        List<String> saida = Arrays.asList(
                "Jogador{nome='Fallen', posicao='Awper', areaAtuacao='Sniper'}",
                "Jogador{nome='Fer', posicao='Entry Fragger', areaAtuacao='Rifler'}",
                "Jogador{nome='FNX', posicao='Entry Killer', areaAtuacao='Rifler'}",
                "Jogador{nome='Boltz', posicao='Lucker', areaAtuacao='Rifler'}");

        assertEquals(saida, team.obterJogadores());
    }

    @Test
    void deveRetornarTotalPosicoes() {
        Team team = new Team();
        team.contratar("Fallen", "Awper", "Sniper");
        team.contratar("Fer", "Entry Fragger", "Rifler");
        team.contratar("FNX", "Entry Killer", "Rifler");
        team.contratar("Boltz", "Lucker", "Rifler");

        assertEquals(4, PosicaoFactory.getTotalPosicoes());
    }
}