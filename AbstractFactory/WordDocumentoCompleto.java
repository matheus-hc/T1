package AbstractFactory;

public class WordDocumentoCompleto implements DocumentoCompleto {
    @Override
    public void abrirCompleto() {
        System.out.println("Abrindo documento Word completo");
    }
}