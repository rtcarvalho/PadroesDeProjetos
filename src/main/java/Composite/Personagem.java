package Composite;

public class Personagem {

    private Atribuicao talento;

    public void setTalento(Atribuicao talento) {
        this.talento = talento;
    }

    public String getTalento() {
        if (this.talento == null) {
            throw new NullPointerException("Personagem sem talentos");
        }

        return this.talento.getDescricao();
    }
}
