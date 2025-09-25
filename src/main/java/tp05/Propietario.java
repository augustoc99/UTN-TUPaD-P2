package tp05;

public class Propietario {
    private String nombre;
    private String dni;

    // lado Propietario de la asociación bidireccional
    private Computadora computadora;

    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public Computadora getComputadora() { return computadora; }

    // setter seguro (mantiene la bidirección sin recursión infinita)
    public void setComputadora(Computadora c) {
        this.computadora = c;
        if (c != null && c.getPropietario() != this) {
            c.setPropietario(this);
        }
    }

    @Override
    public String toString() {
        return "Propietario{nombre='" + nombre + "', dni='" + dni + "'}";
    }
}