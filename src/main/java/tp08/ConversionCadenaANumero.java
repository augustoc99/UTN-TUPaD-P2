/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8;

import java.util.Scanner;

public class ConversionCadenaANumero {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese un texto que represente un número entero: ");
            String texto = scanner.nextLine();

            try {
                int numero = Integer.parseInt(texto);
                System.out.println("Número convertido correctamente: " + numero);
            } catch (NumberFormatException e) {
                System.out.println("Error: '" + texto + "' no es un número entero válido.");
            }
        }
    }
}