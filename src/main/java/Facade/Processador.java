package Facade;

public class Processador extends PcItem {

    private static Processador processador = new Processador();

    private Processador() {};

    public static Processador getInstancia() {
        return processador;
    }

    public boolean verificarItemComDefeito() {
        return false;
    }
}
