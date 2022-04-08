package Facade;

public class Memoria extends PcItem {

    private static Memoria memoria = new Memoria();

    private Memoria() {};

    public static Memoria getInstancia() {
        return memoria;
    }

    public boolean verificarItemComDefeito() {
        return false;
    }

    public void setItemComDefeito(boolean b) {
    }
}
