import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CriadorDocumentoTest {

    @Test
    void testCriarPDFDocumento() {
        CriadorDocumento criador = new CriadorPDF();
        Documento doc = criador.criarDocumento();
        assertTrue(doc instanceof PDFDocumento);
    }

    @Test
    void testCriarWordDocumento() {
        CriadorDocumento criador = new CriadorWord();
        Documento doc = criador.criarDocumento();
        assertTrue(doc instanceof WordDocumento);
    }

    @Test
    void testAbrirPDFDocumento() {
        CriadorDocumento criador = new CriadorPDF();
        criador.abrirDocumento();
    }

    @Test
    void testAbrirWordDocumento() {
        CriadorDocumento criador = new CriadorWord();
        criador.abrirDocumento();
    }
}
