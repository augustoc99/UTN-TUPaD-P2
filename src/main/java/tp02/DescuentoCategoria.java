package tp02;

import java.util.Locale;
import java.util.Scanner;

public class DescuentoCategoria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();

        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        char cat = sc.next().trim().toUpperCase().charAt(0);

        double porcentaje;
        switch (cat) {
            case 'A': porcentaje = 10; break;
            case 'B': porcentaje = 15; break;
            case 'C': porcentaje = 20; break;
            default:
                System.out.println("Categoría inválida.");
                sc.close();
                return;
        }

        double descuento = precio * (porcentaje / 100.0);
        double finalConDescuento = precio - descuento;

        System.out.println("Descuento aplicado: " + porcentaje + "%");
        System.out.println("Precio final: " + finalConDescuento);

        sc.close();
    }
}