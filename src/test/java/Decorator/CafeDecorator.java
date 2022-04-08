package Decorator;

public abstract class CafeDecorator implements Cafeteria {

    private Cafeteria cafe;
    public String descricao;

    public CafeDecorator(Cafeteria cafe) {
        this.cafe = cafe;
    }

    public Cafeteria getCafe() {
        return cafe;
    }

    public void setCafe(Cafeteria cafe) {
        this.cafe = cafe;
    }

    public abstract double getPrecoCondimento();

    @Override
    public Double getPreco() {
        return this.cafe.getPreco() + this.getPrecoCondimento();
    }

    public abstract String getNomeCondimento();

    public String getDescricao() {
        return this.cafe.getDescricao() + " " + "+" + " " + this.getNomeCondimento();
    }
}

