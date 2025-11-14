/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionSegura {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el dividendo (entero): ");
            int numerador = scanner.nextInt();

            System.out.print("Ingrese el divisor (entero): ");
            int denominador = scanner.nextInt();

            try {
                int resultado = numerador / denominador;
                System.out.println("Resultado: " + resultado);
            } catch (ArithmeticException e) {
                System.out.println("Error: no se puede dividir por cero.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida: debe ingresar números enteros.");
        }
    }
}