package tp05;

public class EditorVideo {
    // Crea un Render a partir del proyecto y el formato. No lo guarda como atributo.
    public void exportar(String formato, Proyecto proyecto) {
        Render r = new Render(formato, proyecto);  // dependencia de creación
        System.out.println("Exportando proyecto en formato: " + r.getFormato());
        System.out.println(r);
    }
}