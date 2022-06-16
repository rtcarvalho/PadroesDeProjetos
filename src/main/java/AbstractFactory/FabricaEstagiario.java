package abstractfactory;

public class FabricaEstagiario implements FabricaAbstrat {

    @Override
    public Contrato createContrato() {
        return new ContratoEstagiario();
    }

    @Override
    public Beneficio createBeneficio() {
        return new BeneficioEstagiario();
    }
}
