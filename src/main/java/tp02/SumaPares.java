package tp02;

import java.util.Scanner;

public class SumaPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0, n;

        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            n = sc.nextInt();
            if (n % 2 == 0) suma += n;
        } while (n != 0);

        System.out.println("La suma de los números pares es: " + suma);
        sc.close();
    }
}