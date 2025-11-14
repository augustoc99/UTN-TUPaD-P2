/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8;

import java.util.Scanner;

public class PersonaConEdad {
    private String nombre;
    private int edad;

    public PersonaConEdad(String nombre, int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("La edad debe estar entre 0 y 120.");
        }
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Edad: ");
            int edad = scanner.nextInt();

            try {
                PersonaConEdad persona = new PersonaConEdad(nombre, edad);
                System.out.println("Persona creada: " + persona.getNombre()
                        + " (" + persona.getEdad() + " años)");
            } catch (EdadInvalidaException e) {
                System.out.println("Error al crear persona: " + e.getMessage());
            }
        }
    }
}