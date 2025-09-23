package tp03;

public class NaveEspacial {
    String nombre;
    int combustible;

    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }

    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println(nombre + " despegó.");
        } else {
            System.out.println("Combustible insuficiente para despegar.");
        }
    }

    public void avanzar(int distancia) {
        int consumo = distancia * 2;
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println(nombre + " avanzó " + distancia + " km.");
        } else {
            System.out.println("Combustible insuficiente para avanzar " + distancia + " km.");
        }
    }

    public void recargarCombustible(int cantidad) {
        if (cantidad > 0 && combustible + cantidad <= 100) {
            combustible += cantidad;
            System.out.println("Se recargaron " + cantidad + " unidades de combustible.");
        } else {
            System.out.println("No se puede superar el límite de 100 unidades de combustible.");
        }
    }

    public void mostrarEstado() {
        System.out.println("Nave: " + nombre + " - Combustible: " + combustible);
    }
}