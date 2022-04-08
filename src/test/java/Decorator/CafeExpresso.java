package Decorator;

public class CafeExpresso implements Cafeteria{

    public Double preco;

    public CafeExpresso() {
    }

    public CafeExpresso(Double preco) {
        this.preco = preco;
    }

    @Override
    public Double getPreco() {
        return preco;
    }

    @Override
    public String getDescricao() {
        return "Café Expresso";
    }
}
