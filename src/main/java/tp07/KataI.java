class Vehiculo {
    private final String marca;
    private final String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }

    public String mostrarInfo() {
        return "Vehículo {marca='%s', modelo='%s'}".formatted(marca, modelo);
    }
}

class Auto extends Vehiculo {
    private final int cantidadPuertas;

    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public String mostrarInfo() {
        return "Auto {marca='%s', modelo='%s', puertas=%d}"
                .formatted(getMarca(), getModelo(), cantidadPuertas);
    }
}

public class Kata1Vehiculos {
    public static void main(String[] args) {
        Auto auto = new Auto("Toyota", "Corolla", 4);
        System.out.println(auto.mostrarInfo());
    }
}
