package tp03;

public class MainLibro {
    public static void main(String[] args) {
        Libro l = new Libro("Java Básico", "Autor El señor X", 2020);
        l.setAnioPublicacion(-5);  // Prueba de año inválido
        l.setAnioPublicacion(2022); // Prueba de año válido

        System.out.println(l.getTitulo() + " - " + l.getAutor() + " - " + l.getAnioPublicacion());
    }
}