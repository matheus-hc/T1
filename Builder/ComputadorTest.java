package Builder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ComputadorTest {

    @Test
    void testCriarPCGamer() {
        Computador pcGamer = new Computador.Builder()
                .setCpu("Intel i9")
                .setGpu("NVIDIA RTX 3080")
                .setRam(32)
                .setArmazenamento(1000)
                .build();

        assertEquals("Intel i9", pcGamer.getCpu());
        assertEquals("NVIDIA RTX 3080", pcGamer.getGpu());
        assertEquals(32, pcGamer.getRam());
        assertEquals(1000, pcGamer.getArmazenamento());
    }

    @Test
    void testCriarLaptop() {
        Computador laptop = new Computador.Builder()
                .setCpu("Intel i5")
                .setGpu("Intel Integrated Graphics")
                .setRam(16)
                .setArmazenamento(512)
                .build();

        assertEquals("Intel i5", laptop.getCpu());
        assertEquals("Intel Integrated Graphics", laptop.getGpu());
        assertEquals(16, laptop.getRam());
        assertEquals(512, laptop.getArmazenamento());
    }
}
