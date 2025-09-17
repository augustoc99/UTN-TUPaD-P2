package tp02;

import java.util.Locale;
import java.util.Scanner;

public class DescuentoEspecial {
    static double DESCUENTO_GLOBAL = 0.10;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();

        double precioFinal = calcularDescuentoEspecial(precio);
        System.out.println("El precio final con descuento es: " + precioFinal);

        sc.close();
    }

    public static double calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO_GLOBAL;
        double precioFinal = precio - descuentoAplicado;
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        return precioFinal;
    }
}