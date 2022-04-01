package Decorator;

public class Brioche extends CafeDecorator {

    public Brioche(Cafeteria cafe) {
        super(cafe);
    }

    public double getPrecoCondimento() {
        return 0.70;
    }

    public String getNomeCondimento() {
        return "Brioche";
    }
}
