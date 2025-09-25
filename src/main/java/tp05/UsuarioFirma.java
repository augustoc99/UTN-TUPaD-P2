package tp05;

public class UsuarioFirma {
    private String nombre;
    private String email;

    public UsuarioFirma(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public String toString() {
        return "UsuarioFirma{nombre='" + nombre + "', email='" + email + "'}";
    }
}