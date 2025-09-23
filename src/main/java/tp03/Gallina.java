package tp03;

public class Gallina {
    int idGallina;
    int edad;
    int huevosPuestos;

    public void ponerHuevo() {
        huevosPuestos++;
    }

    public void envejecer() {
        edad++;
    }

    public void mostrarEstado() {
        System.out.println("Gallina " + idGallina + " - Edad: " + edad + " - Huevos puestos: " + huevosPuestos);
    }
}