package Singleton;

public class EmpregadoMes {

    private EmpregadoMes() {
    };
    private static EmpregadoMes instance = new EmpregadoMes();
    public static EmpregadoMes getInstance() {
        return instance;
    }

    private String mes;
    private String nomeEmpregado;

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getNomeEmpregadoo() {
        return nomeEmpregado;
    }

    public void setNomeEmpregado(String nomeEmpregado) {
        this.nomeEmpregado = nomeEmpregado;
    }
}
