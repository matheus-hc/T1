package AbstractFactory;

public class PDFDocumentoCompleto implements DocumentoCompleto {
    @Override
    public void abrirCompleto() {
        System.out.println("Abrindo documento PDF completo");
    }
}