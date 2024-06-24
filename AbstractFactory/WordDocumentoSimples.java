package AbstractFactory;

public class WordDocumentoSimples implements DocumentoSimples {
    @Override
    public void abrirSimples() {
        System.out.println("Abrindo documento Word simples");
    }
}