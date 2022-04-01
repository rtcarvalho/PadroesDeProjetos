package Adapter;

public class TamanhoMilha implements ITamanho{

    private float milhas;

    @Override
    public float getTamanho() {
        return this.milhas;
    }

    @Override
    public  void setTamanho(float milhas) {
        this.milhas = milhas;
    }

}
