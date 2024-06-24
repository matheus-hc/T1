public abstract class CriadorDocumento {
    public abstract Documento criarDocumento();
    
    public void abrirDocumento() {
        Documento doc = criarDocumento();
        doc.abrir();
    }
}

