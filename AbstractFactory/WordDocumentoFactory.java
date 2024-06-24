package AbstractFactory;

public class WordDocumentoFactory implements DocumentoFactory {
    @Override
    public DocumentoSimples criarDocumentoSimples() {
        return new WordDocumentoSimples();
    }

    @Override
    public DocumentoCompleto criarDocumentoCompleto() {
        return new WordDocumentoCompleto();
    }
}