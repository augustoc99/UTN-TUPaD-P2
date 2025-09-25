package tp05;

public class CodigoQR {
    private String valor;
    private UsuarioQR usuario; // asociación unidireccional

    public CodigoQR(String valor, UsuarioQR usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }

    public String getValor() { return valor; }

    @Override
    public String toString() {
        return "CodigoQR{valor='" + valor + "', usuario=" + (usuario != null ? usuario : "-") + "}";
    }
}