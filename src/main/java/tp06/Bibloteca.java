import java.util.*;

public class Caso2 {

    private static class Autor {
        private String id;
        private String nombre;
        private String nacionalidad;
        public Autor(String id, String nombre, String nacionalidad) { this.id=id; this.nombre=nombre; this.nacionalidad=nacionalidad; }
        public String getId() { return id; }
        public String getNombre() { return nombre; }
        public String getNacionalidad() { return nacionalidad; }
        public void mostrarInfo() { System.out.printf("Autor[%s] %s (%s)%n", id, nombre, nacionalidad); }
        @Override public String toString() { return nombre + " (" + nacionalidad + ")"; }
    }

    private static class Libro {
        private String isbn;
        private String titulo;
        private int anioPublicacion;
        private Autor autor;
        public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
            this.isbn=isbn; this.titulo=titulo; this.anioPublicacion=anioPublicacion; this.autor=autor;
        }
        public String getIsbn() { return isbn; }
        public String getTitulo() { return titulo; }
        public int getAnioPublicacion() { return anioPublicacion; }
        public Autor getAutor() { return autor; }
        public void mostrarInfo() {
            System.out.printf("Libro[%s] \"%s\" (%d) - %s%n", isbn, titulo, anioPublicacion, autor);
        }
        @Override public String toString() {
            return "Libro{" + "isbn='" + isbn + '\'' + ", titulo='" + titulo + '\'' + ", anio=" + anioPublicacion + ", autor=" + autor + '}';
        }
    }

    private static class Biblioteca {
        private String nombre;
        private final List<Libro> libros = new ArrayList<>();
        public Biblioteca(String nombre) { this.nombre = nombre; }
        public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) { libros.add(new Libro(isbn, titulo, anioPublicacion, autor)); }
        public void listarLibros() {
            System.out.println("== Libros en " + nombre + " ==");
            if (libros.isEmpty()) { System.out.println("(Sin libros)"); return; }
            for (Libro l : libros) l.mostrarInfo();
        }
        public Libro buscarLibroPorIsbn(String isbn) { for (Libro l : libros) if (l.getIsbn().equalsIgnoreCase(isbn)) return l; return null; }
        public boolean eliminarLibro(String isbn) {
            Iterator<Libro> it = libros.iterator();
            while (it.hasNext()) if (it.next().getIsbn().equalsIgnoreCase(isbn)) { it.remove(); return true; }
            return false;
        }
        public int obtenerCantidadLibros() { return libros.size(); }
        public List<Libro> filtrarLibrosPorAnio(int anio) { List<Libro> out = new ArrayList<>(); for (Libro l : libros) if (l.getAnioPublicacion()==anio) out.add(l); return out; }
        public void mostrarAutoresDisponibles() {
            Set<String> autores = new LinkedHashSet<>(); for (Libro l : libros) autores.add(l.getAutor().toString());
            System.out.println("Autores en biblioteca:"); for (String a : autores) System.out.println(" - " + a);
        }
    }

    public static void main(String[] args) {
        Biblioteca b = new Biblioteca("Biblioteca Central");
        Autor a1 = new Autor("A01", "Julio Verne", "Francia");
        Autor a2 = new Autor("A02", "Jorge Luis Borges", "Argentina");
        Autor a3 = new Autor("A03", "Ursula K. Le Guin", "EE.UU.");

        b.agregarLibro("ISBN-100", "Viaje al centro de la Tierra", 1864, a1);
        b.agregarLibro("ISBN-101", "La vuelta al mundo en 80 días", 1872, a1);
        b.agregarLibro("ISBN-200", "Ficciones", 1944, a2);
        b.agregarLibro("ISBN-201", "El Aleph", 1949, a2);
        b.agregarLibro("ISBN-300", "Los desposeídos", 1974, a3);

        b.listarLibros();

        System.out.println("\n== Buscar ISBN-201 ==");
        Libro l = b.buscarLibroPorIsbn("ISBN-201");
        if (l != null) l.mostrarInfo();

        System.out.println("\n== Libros de 1944 ==");
        for (Libro x : b.filtrarLibrosPorAnio(1944)) x.mostrarInfo();

        System.out.println("\n== Eliminar ISBN-200 ==");
        System.out.println(b.eliminarLibro("ISBN-200") ? "Eliminado" : "No encontrado");
        b.listarLibros();

        System.out.println("\nCantidad total de libros: " + b.obtenerCantidadLibros());

        System.out.println("\n== Autores disponibles ==");
        b.mostrarAutoresDisponibles();
    }
}
