package Facade;

public class Hd extends PcItem {

    private static Hd hd = new Hd();

    private Hd() {};

    public static Hd getInstancia() {
        return hd;
    }

    public boolean verificarItemComDefeito() {
        return false;
    }
}
