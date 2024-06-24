package AbstractFactory;

public class PDFDocumentoFactory implements DocumentoFactory {
    @Override
    public DocumentoSimples criarDocumentoSimples() {
        return new PDFDocumentoSimples();
    }

    @Override
    public DocumentoCompleto criarDocumentoCompleto() {
        return new PDFDocumentoCompleto();
    }
}