package tp05;

public class Foto {
    private byte[] imagen;
    private String formato;

    public Foto(byte[] imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
    }

    public String getFormato() { return formato; }
}