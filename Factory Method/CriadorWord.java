public class CriadorWord extends CriadorDocumento {
    @Override
    public Documento criarDocumento() {
        return new WordDocumento();
    }
}