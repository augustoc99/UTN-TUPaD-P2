package tp05;

public class CalculadoraImpuesto {
    public double calcular(Impuesto impuesto, Contribuyente contribuyente) {
        if (impuesto == null || contribuyente == null) return 0;
        return contribuyente.getIngresoAnual() * impuesto.getAlicuota();
    }
}