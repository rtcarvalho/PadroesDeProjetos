package Composite;

public class Talento extends Atribuicao {

    public Talento(String descricao) {
        super(descricao);
    }

    @Override
    public String getCompetencia() {
        String o = null;
        return o;
    }

    public String getAtribuicao() {
        return "Talento: " + this.getDescricao() + "\n";
    }


}

