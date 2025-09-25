package tp05;

public class ClaveSeguridad {
    private String codigo;
    private String ultimaModificacion; 

    public ClaveSeguridad(String codigo, String ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }

    @Override
    public String toString() {
        return "ClaveSeguridad{codigo='" + codigo +
               "', ultimaModificacion='" + ultimaModificacion + "'}";
    }
}