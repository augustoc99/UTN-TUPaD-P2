package tp05;

public class Documento {
    private String titulo;
    private String contenido;
    // Composición: el documento nace con su firma y no expone setter
    private final FirmaDigital firma;

    public Documento(String titulo, String contenido, FirmaDigital firma) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firma = firma;
    }

    public FirmaDigital getFirma() { return firma; }

    @Override
    public String toString() {
        return "Documento{titulo='" + titulo + "', firma=" + (firma != null ? firma : "-") + "}";
    }
}