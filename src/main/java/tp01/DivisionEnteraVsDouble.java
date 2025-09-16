package tp01;

import java.util.Scanner;

public class DivisionEnteraVsDouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a: ");
        int a = sc.nextInt();

        System.out.print("b: ");
        int b = sc.nextInt();

        if (b != 0) {
            int divEntera = a / b;
            double divDouble = (double) a / b;

            System.out.println("a / b (int): " + divEntera);
            System.out.println("a / b (double): " + divDouble);
        } else {
            System.out.println("No se puede dividir por cero.");
        }

        sc.close();
    }
}