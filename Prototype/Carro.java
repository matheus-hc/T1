package Prototype;

public class Carro implements Veiculo {
    private String modelo;
    private String cor;

    public Carro(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
    }

    @Override
    public Veiculo clonar() {
        return new Carro(this.modelo, this.cor);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Carro [modelo=" + modelo + ", cor=" + cor + "]");
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }
}