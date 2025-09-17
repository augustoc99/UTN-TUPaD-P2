package tp02;

import java.util.Locale;
import java.util.Scanner;

public class PrecioFinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = sc.nextDouble();

        System.out.print("Ingrese el impuesto en porcentaje (Ej: 10): ");
        double impPct = sc.nextDouble();

        System.out.print("Ingrese el descuento en porcentaje (Ej: 5): ");
        double descPct = sc.nextDouble();

        double precioFinal = calcularPrecioFinal(precioBase, impPct, descPct);
        System.out.println("El precio final del producto es: " + precioFinal);

        sc.close();
    }

    public static double calcularPrecioFinal(double precioBase, double impuestoPct, double descuentoPct) {
        double impuesto = precioBase * (impuestoPct / 100.0);
        double descuento = precioBase * (descuentoPct / 100.0);
        return precioBase + impuesto - descuento;
    }
}