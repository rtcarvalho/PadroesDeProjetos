package Bridge;

public class Mage extends Character {

    public Mage(float vidaBase) {
        super(vidaBase);
    }

    public float calcularVida() {
        return this.vidaBase * (1 + this.raca.percentualAumento());
    }
}
