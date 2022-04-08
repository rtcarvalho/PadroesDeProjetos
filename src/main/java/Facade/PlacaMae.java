package Facade;

public class PlacaMae extends PcItem {

    private static PlacaMae placaMae = new PlacaMae();

    private PlacaMae() {};

    public static PlacaMae getInstancia() {
        return placaMae;
    }
}
