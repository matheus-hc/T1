package AbstractFactory;

public interface DocumentoFactory {
    DocumentoSimples criarDocumentoSimples();

    DocumentoCompleto criarDocumentoCompleto();
}