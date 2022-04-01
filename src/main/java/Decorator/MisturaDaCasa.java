package Decorator;

public class MisturaDaCasa extends CafeDecorator{

    public MisturaDaCasa(Cafeteria cafeteria) {
        super(cafeteria);
    }

    public double getPrecoCondimento() {
        return 0.50;
    }

    public String getNomeCondimento() {
        return "Mistura da Casa";
    }
}
