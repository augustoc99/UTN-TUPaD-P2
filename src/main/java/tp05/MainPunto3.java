package tp05;

public class MainPunto3 {
    public static void main(String[] args) {
        Autor autor = new Autor("Roberto Fontanarrosa", "Uruguay");
        Editorial editorial = new Editorial("Blackpool", "Londres");
        Libro libro = new Libro("El fútbol y la vida", "978-950-07-1234-5");

        libro.setAutor(autor);
        libro.setEditorial(editorial);

        System.out.println(libro);
    }
    }