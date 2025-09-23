package tp03;

public class MainMascota {
    public static void main(String[] args) {
        Mascota m = new Mascota();
        m.nombre = "Ulf";
        m.especie = "Perro";
        m.edad = 3;

        m.mostrarInfo();
        m.cumplirAnios();
        m.mostrarInfo();
    }
}