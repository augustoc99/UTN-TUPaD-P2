package tp05;

public class MainPunto12 {
    public static void main(String[] args) {
        Impuesto iva = new Impuesto("IVA", 0.21);
        Contribuyente contrib = new Contribuyente("Franco Colapinto", 1500000);

        CalculadoraImpuesto calc = new CalculadoraImpuesto();
        double monto = calc.calcular(iva, contrib);

        System.out.println(iva);
        System.out.println(contrib);
        System.out.println("Monto de impuesto: " + monto);
    }
}