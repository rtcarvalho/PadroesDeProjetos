package bridge;

public class Barbaro extends Character{

    public Barbaro(float vidaBase) {
        super(vidaBase);
    }

    public float calcularVida() {
        return this.vidaBase * (1 + this.raca.percentualAumento());
    }
}