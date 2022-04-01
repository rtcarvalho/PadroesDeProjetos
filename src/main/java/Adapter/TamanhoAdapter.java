package Adapter;

public class TamanhoAdapter extends TamanhoCm{

    private ITamanho medidaMilhas;

    public TamanhoAdapter(ITamanho medidaMilhas) {this.medidaMilhas = medidaMilhas;
    }

    public float recuperaTamanho() {
        medidaMilhas.setMedida(this.getCm() * 0.032f);
        return medidaMilhas.getMedida();

    }

    public void salvarTamanho() {
        this.setCm(medidaMilhas.getMedida() / 0.032f);
    }
}
