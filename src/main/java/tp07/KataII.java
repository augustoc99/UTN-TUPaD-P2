abstract class Figura {
    private final String nombre;

    protected Figura(String nombre) { this.nombre = nombre; }
    public String getNombre() { return nombre; }

    public abstract double calcularArea();

    @Override public String toString() {
        return "%s (area=%.4f)".formatted(nombre, calcularArea());
    }
}

class Circulo extends Figura {
    private final double radio;
    public Circulo(double radio) { super("Círculo"); this.radio = radio; }
    @Override public double calcularArea() { return Math.PI * radio * radio; }
}

class Rectangulo extends Figura {
    private final double base, altura;
    public Rectangulo(double base, double altura) {
        super("Rectángulo"); this.base = base; this.altura = altura;
    }
    @Override public double calcularArea() { return base * altura; }
}

public class Kata2Figuras {
    public static void main(String[] args) {
        Figura[] figuras = {
                new Circulo(2.5),
                new Rectangulo(3, 4),
                new Circulo(1.2),
                new Rectangulo(10, 0.5)
        };
        for (Figura f : figuras) {
            // polimorfismo: invoca calcularArea() de cada subclase
            System.out.println(f);
        }
    }
}
