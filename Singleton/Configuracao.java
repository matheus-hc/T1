package Singleton;

public class Configuracao {
    private static Configuracao instanciaUnica;
    private String configuracao;

    // Construtor privado para evitar instanciação externa
    private Configuracao() {
        this.configuracao = "Configuração Padrão";
    }

    // Método estático para obter a instância única
    public static Configuracao getInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new Configuracao();
        }
        return instanciaUnica;
    }

    public String getConfiguracao() {
        return configuracao;
    }

    public void setConfiguracao(String configuracao) {
        this.configuracao = configuracao;
    }
}