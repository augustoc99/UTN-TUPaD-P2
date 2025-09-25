package tp05;

public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private final Foto foto;     // composición
    private Titular titular;     // asociación bidireccional

    public Pasaporte(String numero, String fechaEmision, Foto foto) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = foto;
    }

    public Titular getTitular() { return titular; }
    public Foto getFoto() { return foto; }

    public void setTitular(Titular t) {
        this.titular = t;
        if (t != null && t.getPasaporte() != this) {
            t.setPasaporte(this);
        }
    }

    @Override
    public String toString() {
        return "Pasaporte{numero='"+numero+"', fechaEmision='"+fechaEmision+"', foto="+
               (foto!=null?foto.getFormato():"-")+"}";
    }
}