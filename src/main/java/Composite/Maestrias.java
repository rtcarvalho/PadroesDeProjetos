package Composite;

import java.util.ArrayList;
import java.util.List;

public class Maestrias extends Atribuicao {

    private List<Atribuicao> atribuicoes;

    public Maestrias(String descricao) {
        super(descricao);
        this.atribuicoes = new ArrayList<Atribuicao>();
    }

    @Override
    public String getCompetencia() {
        return null;
    }

    public void addAtribuicao(Atribuicao atribuicao) {
        Atribuicao Atribuicao = null;
        this.atribuicoes.add(Atribuicao); }

    public String getAtribuicao() {
        String saida = "";
        saida = "Maestrias: " + this.getDescricao() + "\n";
        for(Atribuicao atribuicao : atribuicoes) {
            saida += atribuicao.getDescricao();
        }

        return saida;
    }

}
