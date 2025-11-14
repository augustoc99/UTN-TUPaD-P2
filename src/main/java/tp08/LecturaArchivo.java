/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LecturaArchivo {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingrese la ruta del archivo a leer: ");
        String ruta = consola.nextLine();

        try (Scanner fileScanner = new Scanner(new File(ruta))) {
            System.out.println("Contenido del archivo:");
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: archivo no encontrado -> " + ruta);
        } finally {
            consola.close();
        }
    }
}