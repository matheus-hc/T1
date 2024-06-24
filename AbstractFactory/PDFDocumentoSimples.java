package AbstractFactory;

public class PDFDocumentoSimples implements DocumentoSimples {
    @Override
    public void abrirSimples() {
        System.out.println("Abrindo documento PDF simples");
    }
}
