package tp05;

public class MainPunto9 {
    public static void main(String[] args) {
        Paciente p = new Paciente("Franco Colapinto", "DASPU");
        Profesional pr = new Profesional("Dr. Briatore", "Motricidad");

        CitaMedica c = new CitaMedica("02-10-2025", "09:15");
        c.setPaciente(p);
        c.setProfesional(pr);

        System.out.println(c);
    }
}