package tp04;

public class MainEmpleados {
    public static void main(String[] args) {
        // Instanciar usando ambos constructores (tarea 2)
        Empleado e1 = new Empleado(100, "Ana Pérez", "Desarrolladora", 550000);
        Empleado e2 = new Empleado("Luis Gómez", "QA"); // id auto, salario 0.0
        e2.setSalario(420000); // seteamos salario inicial

        // Aplicar métodos sobrecargados actualizarSalario (tarea 2)
        e1.actualizarSalario(10);            // +10% a e1
        e2.actualizarSalarioCantidad(30000); // +$30.000 a e2

        // Imprimir información con toString (tarea 2)
        System.out.println("== Empleados ==");
        System.out.println(e1);
        System.out.println(e2);

        // Total de empleados creados (tarea 2)
        System.out.println("Total empleados: " + Empleado.mostrarTotalEmpleados());
    }
}