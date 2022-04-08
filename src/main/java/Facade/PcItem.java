package Facade;

public abstract class PcItem {

    private boolean itemComDefeito = false;

    public void setItemComDefeito(boolean itemComDefeito) {
        this.itemComDefeito = itemComDefeito;
    }

    public boolean verificarItemComDefeito() {
        return this.itemComDefeito;
    }
}
