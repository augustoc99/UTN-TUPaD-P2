package tp05;

public class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte; // asociación (lado Titular)

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public Pasaporte getPasaporte() { return pasaporte; }

    public void setPasaporte(Pasaporte p) {
        this.pasaporte = p;
        if (p != null && p.getTitular() != this) {
            p.setTitular(this);
        }
    }

    @Override
    public String toString() {
        return "Titular{nombre='"+nombre+"', dni='"+dni+"'}";
    }
}