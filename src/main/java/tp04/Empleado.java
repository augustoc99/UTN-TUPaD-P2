package tp04;

public class Empleado {
    // Atributos (encapsulados)
    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    // Atributos estáticos
    private static int totalEmpleados = 0;
    private static int nextId = 1; // para asignar id automático cuando corresponda

    // Constructor sobrecargado 1: recibe TODOS los atributos
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;                 // uso de this (requisito 1)
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;             // ambos constructores incrementan el total (req. 2)
        if (id >= nextId) nextId = id + 1; // mantiene consistencia del autoincremento
    }

    // Constructor sobrecargado 2: solo nombre y puesto → id automático y salario por defecto
    public Empleado(String nombre, String puesto) {
        this.id = nextId++;           // id automático (req. 2)
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 0.0;           // salario por defecto (req. 2)
        totalEmpleados++;
    }

    // Métodos sobrecargados actualizarSalario (req. 3)
    // Aumenta por porcentaje (ej: 10 = +10%)
    public void actualizarSalario(double porcentaje) {
        this.salario += this.salario * (porcentaje / 100.0);
    }
    // Aumenta por monto fijo
    public void actualizarSalarioCantidad(double monto) {
        this.salario += monto;
    }

    // toString legible (req. 4)
    @Override
    public String toString() {
        return "Empleado{id=" + id + ", nombre='" + nombre + "', puesto='" + puesto + "', salario=" + salario + "}";
    }

    // Método estático para mostrar total de empleados (req. 5)
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    // Getters y Setters (req. 6 - encapsulamiento)
    public int getId() { return id; }
    public void setId(int id) {
        this.id = id;
        if (id >= nextId) nextId = id + 1;
    }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getPuesto() { return puesto; }
    public void setPuesto(String puesto) { this.puesto = puesto; }
    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }
}
