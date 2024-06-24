public class CriadorPDF extends CriadorDocumento {
    @Override
    public Documento criarDocumento() {
        return new PDFDocumento();
    }
}
