/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8;


public class PayPal implements PagoConDescuento {
    private String emailCuenta;

    public PayPal(String emailCuenta) {
        this.emailCuenta = emailCuenta;
    }

    @Override
    public double aplicarDescuento(double monto) {
        double descuento = monto * 0.05; // 5%
        return monto - descuento;
    }

    @Override
    public void procesarPago(double monto) {
        double montoConDescuento = aplicarDescuento(monto);
        System.out.println("Procesando pago con PayPal (" + emailCuenta
                + ") por $" + montoConDescuento + " (5% de descuento).");
    }
}