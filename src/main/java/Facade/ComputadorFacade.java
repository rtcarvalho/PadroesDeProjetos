package Facade;

public class ComputadorFacade {

    public static boolean ligarComputador() {
        if (PlacaMae.getInstancia().verificarItemComDefeito()) {
            return false;
        }
        if (Processador.getInstancia().verificarItemComDefeito()) {
            return false;
        }
        if (Hd.getInstancia().verificarItemComDefeito()) {
            return false;
        }
        if (Memoria.getInstancia().verificarItemComDefeito()) {
            return false;
        }
        return true;
    }
}