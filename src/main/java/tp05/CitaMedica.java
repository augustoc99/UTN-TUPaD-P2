package tp05;

public class CitaMedica {
    private String fecha;
    private String hora;
    // Asociaciones unidireccionales
    private Paciente paciente;
    private Profesional profesional;

    public CitaMedica(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }

    public void setPaciente(Paciente paciente) { this.paciente = paciente; }
    public void setProfesional(Profesional profesional) { this.profesional = profesional; }

    @Override
    public String toString() {
        return "CitaMedica{fecha='" + fecha + "', hora='" + hora +
                "', paciente=" + (paciente != null ? paciente : "-") +
                ", profesional=" + (profesional != null ? profesional : "-") + "}";
    }
}