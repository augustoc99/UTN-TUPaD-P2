package tp05;

public class Contribuyente {
    private String nombre;
    private double ingresoAnual;

    public Contribuyente(String nombre, double ingresoAnual) {
        this.nombre = nombre;
        this.ingresoAnual = ingresoAnual;
    }

    public double getIngresoAnual() { return ingresoAnual; }

    @Override
    public String toString() {
        return "Contribuyente{nombre='" + nombre + "', ingresoAnual=" + ingresoAnual + "}";
    }
}