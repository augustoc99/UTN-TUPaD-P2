package tp03;

public class MainEstudiante {
    public static void main(String[] args) {
        Estudiante e = new Estudiante();
        e.nombre = "Ana";
        e.apellido = "Pérez";
        e.curso = "Programación II";
        e.calificacion = 7;

        e.mostrarInfo();
        e.subirCalificacion(2);
        e.bajarCalificacion(1);
        e.mostrarInfo();
    }
}