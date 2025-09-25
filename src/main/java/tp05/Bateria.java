package tp05;

public class Bateria {
    private String modelo;
    private int capacidadMah;

    public Bateria(String modelo, int capacidadMah) {
        this.modelo = modelo;
        this.capacidadMah = capacidadMah;
    }

    @Override
    public String toString() {
        return "Bateria{modelo='"+modelo+"', capacidad="+capacidadMah+"mAh}";
    }
}