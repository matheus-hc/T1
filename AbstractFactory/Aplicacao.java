package AbstractFactory;

public class Aplicacao {
    private DocumentoSimples docSimples;
    private DocumentoCompleto docCompleto;

    public Aplicacao(DocumentoFactory factory) {
        docSimples = factory.criarDocumentoSimples();
        docCompleto = factory.criarDocumentoCompleto();
    }

    public void abrirDocumentos() {
        docSimples.abrirSimples();
        docCompleto.abrirCompleto();
    }
}