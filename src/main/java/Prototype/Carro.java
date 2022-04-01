package Prototype;

public class Carro implements Cloneable{
    private String placa;
    private Modelo modelo;

    public Carro(String placa, Modelo modelo) {
        this.placa = placa;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    @Override
    public Carro clone() throws CloneNotSupportedException{
        Carro CarroClone = (Carro) super.clone();
        CarroClone.modelo = (Modelo) CarroClone.modelo.clone();
        return CarroClone;
    }

    @Override
    public  String toString() {
        return "Moto{"+
                "placa="+placa+
                ", modelo="+modelo+ '\'' +
                "}";

    }
}
