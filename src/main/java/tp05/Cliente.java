package tp05;

public class Cliente {
    private String nombre;
    private String dni;

    // asociación bidireccional (lado Cliente)
    private TarjetaDeCredito tarjeta;

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public TarjetaDeCredito getTarjeta() { return tarjeta; }

    // setter seguro para mantener bidireccionalidad
    public void setTarjeta(TarjetaDeCredito t) {
        this.tarjeta = t;
        if (t != null && t.getCliente() != this) {
            t.setCliente(this);
        }
    }

    @Override
    public String toString() {
        return "Cliente{nombre='" + nombre + "', dni='" + dni + "'}";
    }
}