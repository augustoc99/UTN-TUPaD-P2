package tp05;

public class MainPunto7 {
    public static void main(String[] args) {
        Motor m = new Motor("Diésel", "8AJYSO35MN5");
        Vehiculo v = new Vehiculo("KAS769", "Toyota SW - Fortuner");
        Conductor c = new Conductor("Augusto Cúneo", "B1");

        v.setMotor(m);     // agregación
        v.setConductor(c); // asociación bidireccional segura

        System.out.println(v);
        System.out.println(c);
        System.out.println(c.getVehiculo() == v); // true
        System.out.println(v.getConductor() == c); // true
    }
}