package tp05;

public class FirmaDigital {
    private String codigoHash;
    private String fecha;
    // Agregación: conoce a un usuario que puede existir independientemente
    private UsuarioFirma usuario;

    public FirmaDigital(String codigoHash, String fecha) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
    }

    public void setUsuario(UsuarioFirma usuario) { this.usuario = usuario; }

    @Override
    public String toString() {
        return "FirmaDigital{hash='" + codigoHash + "', fecha='" + fecha +
               "', usuario=" + (usuario != null ? usuario : "-") + "}";
    }
}