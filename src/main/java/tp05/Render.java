package tp05;

public class Render {
    private String formato;     // p.ej. "MP4", "MKV"
    private Proyecto proyecto;  // asociación unidireccional

    public Render(String formato, Proyecto proyecto) {
        this.formato = formato;
        this.proyecto = proyecto;
    }

    public String getFormato() { return formato; }

    @Override
    public String toString() {
        return "Render{formato='" + formato + "', proyecto=" + proyecto + "}";
    }
}