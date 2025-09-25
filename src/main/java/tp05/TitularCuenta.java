package tp05;

public class TitularCuenta {
    private String nombre;
    private String dni;

    // Asociación bidireccional
    private CuentaBancaria cuenta;

    public TitularCuenta(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public CuentaBancaria getCuenta() { return cuenta; }

    // setter seguro para mantener la bidireccionalidad
    public void setCuenta(CuentaBancaria c) {
        this.cuenta = c;
        if (c != null && c.getTitular() != this) {
            c.setTitular(this);
        }
    }

    @Override
    public String toString() {
        return "TitularCuenta{nombre='" + nombre + "', dni='" + dni + "'}";
    }
}