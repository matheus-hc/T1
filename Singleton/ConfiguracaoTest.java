package Singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConfiguracaoTest {

    @Test
    void testInstanciaUnica() {
        Configuracao instancia1 = Configuracao.getInstancia();
        Configuracao instancia2 = Configuracao.getInstancia();

        assertSame(instancia1, instancia2);
    }

    @Test
    void testConfiguracaoInicial() {
        Configuracao configuracao = Configuracao.getInstancia();
        assertEquals("Configuração Padrão", configuracao.getConfiguracao());
    }

    @Test
    void testAlterarConfiguracao() {
        Configuracao configuracao = Configuracao.getInstancia();
        configuracao.setConfiguracao("Nova Configuração");

        Configuracao mesmaInstancia = Configuracao.getInstancia();
        assertEquals("Nova Configuração", mesmaInstancia.getConfiguracao());
    }
}