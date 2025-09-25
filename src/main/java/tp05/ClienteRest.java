package tp05;

public class ClienteRest {
    private String nombre;
    private String telefono;

    public ClienteRest(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "ClienteRest{nombre='" + nombre + "', telefono='" + telefono + "'}";
    }
}