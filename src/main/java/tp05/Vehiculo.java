package tp05;

public class Vehiculo {
    private String patente;
    private String modelo;

    // AGREGACIÓN: el motor puede existir sin el vehículo
    private Motor motor;

    // ASOCIACIÓN bidireccional con Conductor
    private Conductor conductor;

    public Vehiculo(String patente, String modelo) {
        this.patente = patente;
        this.modelo = modelo;
    }

    public void setMotor(Motor motor) { this.motor = motor; }
    public Motor getMotor() { return motor; }

    public Conductor getConductor() { return conductor; }
    public void setConductor(Conductor c) {
        this.conductor = c;
        if (c != null && c.getVehiculo() != this) {
            c.setVehiculo(this);
        }
    }

    @Override
    public String toString() {
        return "Vehiculo{patente='" + patente + "', modelo='" + modelo +
               "', motor=" + (motor != null ? motor : "-") +
               ", conductor=" + (conductor != null ? conductor : "-") + "}";
    }
}