/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8;

public class TarjetaCredito implements PagoConDescuento {
    private String numero;

    public TarjetaCredito(String numero) {
        this.numero = numero;
    }

    @Override
    public double aplicarDescuento(double monto) {
        double descuento = monto * 0.10; // 10%
        return monto - descuento;
    }

    @Override
    public void procesarPago(double monto) {
        double montoConDescuento = aplicarDescuento(monto);
        System.out.println("Procesando pago con Tarjeta de Crédito " + numero
                + " por $" + montoConDescuento + " (10% de descuento).");
    }
}