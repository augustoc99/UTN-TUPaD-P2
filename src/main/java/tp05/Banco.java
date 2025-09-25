package tp05;

public class Banco {
    private String nombre;
    private String cuit;

    public Banco(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }

    @Override
    public String toString() {
        return "Banco{nombre='" + nombre + "', cuit='" + cuit + "'}";
    }
}