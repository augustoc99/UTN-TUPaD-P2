package tp05;

public class Usuario {
    private String nombre;
    private String dni;
    private Celular celular; // asociación (lado Usuario)

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public Celular getCelular() { return celular; }

    // setter seguro para mantener la relación bidireccional
    public void setCelular(Celular c) {
        this.celular = c;
        if (c != null && c.getUsuario() != this) {
            c.setUsuario(this);
        }
    }

    @Override
    public String toString() {
        return "Usuario{nombre='"+nombre+"', dni='"+dni+"'}";
    }
}
