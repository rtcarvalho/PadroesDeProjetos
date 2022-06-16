package bridge;

public abstract class Character {

    protected Raca raca;

    protected float vidaBase;

    public Character(float vidaBase) { this.vidaBase = vidaBase; }

    public void setRaca(Raca raca) {
        this.raca = raca;
    }

    public void setVidaBase(float vidaBase) {
        this.vidaBase = vidaBase;
    }

    public abstract float calcularVida();
}
