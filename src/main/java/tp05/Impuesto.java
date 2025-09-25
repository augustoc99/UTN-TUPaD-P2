package tp05;

public class Impuesto {
    private String nombre;
    private double alicuota; // Porcentaje (ej. 0.21 = 21%)

    public Impuesto(String nombre, double alicuota) {
        this.nombre = nombre;
        this.alicuota = alicuota;
    }

    public double getAlicuota() { return alicuota; }

    @Override
    public String toString() {
        return "Impuesto{nombre='" + nombre + "', alicuota=" + (alicuota * 100) + "%}";
    }
}