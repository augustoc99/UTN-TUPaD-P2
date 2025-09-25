package tp05;

public class CuentaBancaria {
    private String cbu;
    private double saldo;

    // COMPOSICIÓN: la cuenta nace con su clave y no expone setter
    private final ClaveSeguridad clave;

    // ASOCIACIÓN BIDIRECCIONAL con TitularCuenta
    private TitularCuenta titular;

    public CuentaBancaria(String cbu, double saldoInicial, ClaveSeguridad clave) {
        this.cbu = cbu;
        this.saldo = saldoInicial;
        this.clave = clave;
    }

    public ClaveSeguridad getClave() { return clave; }

    public TitularCuenta getTitular() { return titular; }
    public void setTitular(TitularCuenta t) {
        this.titular = t;
        if (t != null && t.getCuenta() != this) {
            t.setCuenta(this);
        }
    }

    @Override
    public String toString() {
        return "CuentaBancaria{cbu='" + cbu + "', saldo=" + saldo +
               ", clave=" + (clave != null ? clave : "-") +
               ", titular=" + (titular != null ? titular : "-") + "}";
    }
}