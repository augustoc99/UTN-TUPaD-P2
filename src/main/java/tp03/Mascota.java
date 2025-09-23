package tp03;

public class Mascota {
    String nombre;
    String especie;
    int edad;

    public void mostrarInfo() {
        System.out.println(nombre + " (" + especie + ") - Edad: " + edad);
    }

    public void cumplirAnios() {
        edad++;
    }
    }