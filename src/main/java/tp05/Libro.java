package tp05;

public class Libro {
    private String titulo;
    private String isbn;

    // Asociación unidireccional
    private Autor autor;

    // Agregación
    private Editorial editorial;

    public Libro(String titulo, String isbn) {
        this.titulo = titulo;
        this.isbn = isbn;
    }

    public void setAutor(Autor a) { this.autor = a; }
    public void setEditorial(Editorial e) { this.editorial = e; }

    @Override
    public String toString() {
        return "Libro{titulo='"+titulo+"', isbn='"+isbn+
               "', autor="+(autor!=null?autor:"-")+
               ", editorial="+(editorial!=null?editorial:"-")+"}";
    }
}