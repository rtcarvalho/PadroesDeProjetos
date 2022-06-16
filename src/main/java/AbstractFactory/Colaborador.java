package abstractfactory;

public class Colaborador {

    private Contrato contrato;
    private Beneficio beneficios;

    public Colaborador (FabricaAbstrat fabrica) {
        this.contrato = fabrica.createContrato();
        this.beneficios = fabrica.createBeneficio();
    }

    public String imprimirContrato() { return this.contrato.retornar(); }

    public String imprimiBeneficios() { return this.beneficios.retornar(); }

}
