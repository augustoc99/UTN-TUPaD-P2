import java.util.ArrayList;
import java.util.List;

abstract class Empleado {
    private final String nombre;
    protected Empleado(String nombre) { this.nombre = nombre; }
    public String getNombre() { return nombre; }
    public abstract double calcularSueldo();
}

class EmpleadoPlanta extends Empleado {
    private final double sueldoBasico;
    private final double porcentajeAntiguedad; // ej: 0.15 = 15%

    public EmpleadoPlanta(String nombre, double sueldoBasico, double porcentajeAntiguedad) {
        super(nombre);
        this.sueldoBasico = sueldoBasico;
        this.porcentajeAntiguedad = porcentajeAntiguedad;
    }

    @Override public double calcularSueldo() {
        return sueldoBasico * (1.0 + porcentajeAntiguedad);
    }
}

class EmpleadoTemporal extends Empleado {
    private final int horasTrabajadas;
    private final double valorHora;

    public EmpleadoTemporal(String nombre, int horasTrabajadas, double valorHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    @Override public double calcularSueldo() {
        return horasTrabajadas * valorHora;
    }
}

public class Kata3Empleados {
    public static void main(String[] args) {
        List<Empleado> equipo = new ArrayList<>();
        equipo.add(new EmpleadoPlanta("Alex", 500_000, 0.20));
        equipo.add(new EmpleadoTemporal("Sam", 160, 2500));
        equipo.add(new EmpleadoTemporal("Pat", 90, 3000));

        double totalNomina = 0.0;
        for (Empleado e : equipo) {
            double sueldo = e.calcularSueldo(); // polimórfico
            String tipo = (e instanceof EmpleadoPlanta) ? "Planta" :
                          (e instanceof EmpleadoTemporal) ? "Temporal" : "Otro";
            System.out.printf("%s (%s): $%,.2f%n", e.getNombre(), tipo, sueldo);
            totalNomina += sueldo;
        }
        System.out.printf("Total nómina: $%,.2f%n", totalNomina);
    }
}
