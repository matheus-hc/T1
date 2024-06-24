package AbstractFactory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DocumentoFactoryTest {

    @Test
    void testCriarPDFDocumentos() {
        DocumentoFactory factory = new PDFDocumentoFactory();
        DocumentoSimples docSimples = factory.criarDocumentoSimples();
        DocumentoCompleto docCompleto = factory.criarDocumentoCompleto();
        assertTrue(docSimples instanceof PDFDocumentoSimples);
        assertTrue(docCompleto instanceof PDFDocumentoCompleto);
    }

    @Test
    void testCriarWordDocumentos() {
        DocumentoFactory factory = new WordDocumentoFactory();
        DocumentoSimples docSimples = factory.criarDocumentoSimples();
        DocumentoCompleto docCompleto = factory.criarDocumentoCompleto();
        assertTrue(docSimples instanceof WordDocumentoSimples);
        assertTrue(docCompleto instanceof WordDocumentoCompleto);
    }

    @Test
    void testAbrirPDFDocumentos() {
        Aplicacao app = new Aplicacao(new PDFDocumentoFactory());
        app.abrirDocumentos();
    }

    @Test
    void testAbrirWordDocumentos() {
        Aplicacao app = new Aplicacao(new WordDocumentoFactory());
        app.abrirDocumentos();
    }
}