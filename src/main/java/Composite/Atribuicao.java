package Composite;

public abstract class Atribuicao {

    private String descricao;

    public Atribuicao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract String getCompetencia();
}
