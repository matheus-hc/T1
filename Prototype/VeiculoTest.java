package Prototype;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VeiculoTest {

    @Test
    void testClonarCarro() {
        Carro original = new Carro("Tesla Model S", "Preto");
        Carro clone = (Carro) original.clonar();

        assertNotSame(original, clone);
        assertEquals(original.getModelo(), clone.getModelo());
        assertEquals(original.getCor(), clone.getCor());
    }

    @Test
    void testClonarMoto() {
        Moto original = new Moto("Yamaha MT-09", "900cc");
        Moto clone = (Moto) original.clonar();

        assertNotSame(original, clone);
        assertEquals(original.getModelo(), clone.getModelo());
        assertEquals(original.getCilindrada(), clone.getCilindrada());
    }

    @Test
    void testExibirInfoCarro() {
        Carro carro = new Carro("Tesla Model S", "Preto");
        carro.exibirInfo();
    }

    @Test
    void testExibirInfoMoto() {
        Moto moto = new Moto("Yamaha MT-09", "900cc");
        moto.exibirInfo();
    }
}