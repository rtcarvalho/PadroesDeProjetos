package Adapter;

public class Comprimento {

    ITamanho medida;
    TamanhoAdapter persistencia;

    public Comprimento() {
        medida = new TamanhoMilhas();
        persistencia = new TamanhoAdapter(medida);
    }

    public void setComprimento(float valor) {
        medida.setMedida(valor);
        persistencia.salvarTamanho();
    }

    public float getComprimento() {
        return persistencia.recuperaTamanho();
    }

    public float getComprimentoCM() {
        return persistencia.getCm();
    }
}
