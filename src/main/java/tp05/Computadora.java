package tp05;

public class Computadora {
    private String marca;
    private String numeroSerie;

    // COMPOSICIÓN: la placa madre “nace” con la computadora y no tiene setter
    private final PlacaMadre placaMadre;

    // ASOCIACIÓN bidireccional con Propietario
    private Propietario propietario;

    public Computadora(String marca, String numeroSerie, PlacaMadre placaMadre) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = placaMadre;
    }

    public PlacaMadre getPlacaMadre() { return placaMadre; }

    public Propietario getPropietario() { return propietario; }
    public void setPropietario(Propietario p) {
        this.propietario = p;
        if (p != null && p.getComputadora() != this) {
            p.setComputadora(this);
        }
    }

    @Override
    public String toString() {
        return "Computadora{marca='" + marca + "', serie='" + numeroSerie +
               "', placa=" + (placaMadre != null ? placaMadre : "-") +
               ", propietario=" + (propietario != null ? propietario : "-") + "}";
    }
}