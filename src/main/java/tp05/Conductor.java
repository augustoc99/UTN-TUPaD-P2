package tp05;

public class Conductor {
    private String nombre;
    private String licencia;

    // lado Conductor de la asociación bidireccional
    private Vehiculo vehiculo;

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public Vehiculo getVehiculo() { return vehiculo; }

    // setter seguro para mantener bidireccionalidad sin recursión infinita
    public void setVehiculo(Vehiculo v) {
        this.vehiculo = v;
        if (v != null && v.getConductor() != this) {
            v.setConductor(this);
        }
    }

    @Override
    public String toString() {
        return "Conductor{nombre='" + nombre + "', licencia='" + licencia + "'}";
    }
}