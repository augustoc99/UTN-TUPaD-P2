package tp05;

public class Proyecto {
    private String nombre;
    private int duracionMin; // duración total en minutos

    public Proyecto(String nombre, int duracionMin) {
        this.nombre = nombre;
        this.duracionMin = duracionMin;
    }

    @Override
    public String toString() {
        return "Proyecto{nombre='" + nombre + "', duracionMin=" + duracionMin + "}";
    }
}