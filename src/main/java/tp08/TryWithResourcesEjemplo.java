/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TryWithResourcesEjemplo {

    public static void main(String[] args) {
        try (Scanner consola = new Scanner(System.in)) {
            System.out.print("Ingrese la ruta del archivo a leer con BufferedReader: ");
            String ruta = consola.nextLine();

            try (BufferedReader reader = new BufferedReader(new FileReader(ruta))) {
                String linea;
                System.out.println("Contenido del archivo:");
                while ((linea = reader.readLine()) != null) {
                    System.out.println(linea);
                }
            } catch (IOException e) {
                System.out.println("Error al leer el archivo: " + e.getMessage());
            }
        }
    }
}