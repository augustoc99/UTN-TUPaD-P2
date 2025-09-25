package tp05;

public class Celular {
    private String imei;
    private String marca;
    private String modelo;

    // AGREGACIÓN: la batería puede existir sin el celular
    private Bateria bateria;

    // ASOCIACIÓN BIDIRECCIONAL con Usuario
    private Usuario usuario;

    public Celular(String imei, String marca, String modelo) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
    }

    public void setBateria(Bateria b) { this.bateria = b; }
    public Bateria getBateria() { return bateria; }

    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario u) {
        this.usuario = u;
        if (u != null && u.getCelular() != this) {
            u.setCelular(this);
        }
    }

    @Override
    public String toString() {
        return "Celular{imei='"+imei+"', marca='"+marca+"', modelo='"+modelo+
               "', bateria="+(bateria!=null?bateria:"-")+"}";
    }
}