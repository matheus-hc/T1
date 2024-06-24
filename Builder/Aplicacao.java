package Builder;

public class Aplicacao {
    public static void main(String[] args) {
        Computador pcGamer = new Computador.Builder()
                .setCpu("Intel i9")
                .setGpu("NVIDIA RTX 3080")
                .setRam(32)
                .setArmazenamento(1000)
                .build();

        Computador laptop = new Computador.Builder()
                .setCpu("Intel i5")
                .setGpu("Intel Integrated Graphics")
                .setRam(16)
                .setArmazenamento(512)
                .build();

        System.out.println(pcGamer);
        System.out.println(laptop);
    }
}
