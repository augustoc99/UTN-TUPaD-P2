package tp8;


public class EcommerceMain {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Alex", "alex@example.com");

        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(new Producto("Libro Cyberseguridad", 5000.0));
        pedido.agregarProducto(new Producto("Parlante", 3000.0));

        System.out.println("Productos en el pedido:");
        for (Producto p : pedido.getProductos()) {
            System.out.println(" - " + p);
        }

        double total = pedido.calcularTotal();
        System.out.println("Total del pedido: $" + total);

        pedido.setEstado(EstadoPedido.PAGADO);

        PagoConDescuento pagoTarjeta = new TarjetaCredito("1234-5678-9012-3456");
        pagoTarjeta.procesarPago(total);

        PagoConDescuento pagoPayPal = new PayPal("cuenta@paypal.com");
        pagoPayPal.procesarPago(total);
    }
}
