package Prototype;

public class Moto implements Veiculo {
    private String modelo;
    private String cilindrada;

    public Moto(String modelo, String cilindrada) {
        this.modelo = modelo;
        this.cilindrada = cilindrada;
    }

    @Override
    public Veiculo clonar() {
        return new Moto(this.modelo, this.cilindrada);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Moto [modelo=" + modelo + ", cilindrada=" + cilindrada + "]");
    }

    public String getModelo() {
        return modelo;
    }

    public String getCilindrada() {
        return cilindrada;
    }
}