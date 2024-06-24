package Builder;

public class Computador {
    private String cpu;
    private String gpu;
    private int ram;
    private int armazenamento;

    private Computador(Builder builder) {
        this.cpu = builder.cpu;
        this.gpu = builder.gpu;
        this.ram = builder.ram;
        this.armazenamento = builder.armazenamento;
    }

    public static class Builder {
        private String cpu;
        private String gpu;
        private int ram;
        private int armazenamento;

        public Builder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setGpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public Builder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public Builder setArmazenamento(int armazenamento) {
            this.armazenamento = armazenamento;
            return this;
        }

        public Computador build() {
            return new Computador(this);
        }
    }

    @Override
    public String toString() {
        return "Computador [CPU=" + cpu + ", GPU=" + gpu + ", RAM=" + ram + "GB, Armazenamento=" + armazenamento + "GB]";
    }
}
