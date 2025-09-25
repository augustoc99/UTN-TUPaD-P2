package tp05;

public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;

    // agregación
    private Banco banco;

    // asociación bidireccional
    private Cliente cliente;

    public TarjetaDeCredito(String numero, String fechaVencimiento) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
    }

    public void setBanco(Banco b) { this.banco = b; }

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente c) {
        this.cliente = c;
        if (c != null && c.getTarjeta() != this) {
            c.setTarjeta(this);
        }
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{numero='" + numero + "', venc='" + fechaVencimiento +
               "', banco=" + (banco != null ? banco : "-") +
               ", cliente=" + (cliente != null ? cliente : "-") + "}";
    }
}