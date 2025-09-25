package tp05;

public class Reserva {
    private String fecha;   // ej: "2025-10-12"
    private String hora;    // ej: "20:30"

    // Asociación unidireccional (solo Reserva conoce al ClienteRest)
    private ClienteRest cliente;

    // Agregación (Reserva conoce una Mesa que puede existir por separado)
    private Mesa mesa;

    public Reserva(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }

    public void setCliente(ClienteRest cliente) { this.cliente = cliente; }
    public void setMesa(Mesa mesa) { this.mesa = mesa; }

    @Override
    public String toString() {
        return "Reserva{fecha='" + fecha + "', hora='" + hora + "', " +
               "cliente=" + (cliente != null ? cliente : "-") + ", " +
               "mesa=" + (mesa != null ? mesa : "-") + "}";
    }
}