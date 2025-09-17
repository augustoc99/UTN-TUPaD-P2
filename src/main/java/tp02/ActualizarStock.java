package tp02;

import java.util.Scanner;

public class ActualizarStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = sc.nextInt();

        System.out.print("Ingrese la cantidad vendida: ");
        int vendida = sc.nextInt();

        System.out.print("Ingrese la cantidad recibida: ");
        int recibida = sc.nextInt();

        int nuevoStock = actualizarStock(stockActual, vendida, recibida);
        System.out.println("El nuevo stock del producto es: " + nuevoStock);

        sc.close();
    }

    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }
}