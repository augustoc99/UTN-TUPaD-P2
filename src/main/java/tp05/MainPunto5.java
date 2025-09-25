package tp05;

public class MainPunto5 {
    public static void main(String[] args) {
        PlacaMadre pm = new PlacaMadre("ASROCK X560T", "AMD A4");
        Computadora pc = new Computadora("CORSAIR", "SN-001122", pm);
        Propietario prop = new Propietario("Augusto Cúneo", "41736301");

        // establecer relación bidireccional
        pc.setPropietario(prop);

        System.out.println(pc);
        System.out.println(prop);
        System.out.println(prop.getComputadora() == pc); // true
        System.out.println(pc.getPropietario() == prop); // true
    }
}