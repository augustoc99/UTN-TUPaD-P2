import java.util.*;

public class Caso3 {

    private static class Profesor {
        private String id;
        private String nombre;
        private String especialidad;
        private final List<Curso> cursos = new ArrayList<>();

        public Profesor(String id, String nombre, String especialidad) {
            this.id = id; this.nombre = nombre; this.especialidad = especialidad;
        }

        public String getId() { return id; }
        public String getNombre() { return nombre; }
        public List<Curso> getCursos() { return Collections.unmodifiableList(cursos); }

        public void agregarCurso(Curso c) {
            if (c == null) return;
            if (!cursos.contains(c)) cursos.add(c);
            if (c.getProfesor() != this) c.setProfesor(this);
        }

        public void eliminarCurso(Curso c) {
            if (c == null) return;
            if (cursos.remove(c)) {
                if (c.getProfesor() == this) c.setProfesor(null);
            }
        }

        public void listarCursos() {
            System.out.println("Cursos de " + nombre + ":");
            for (Curso c : cursos) System.out.println(" - " + c.getCodigo() + " " + c.getNombre());
        }

        public void mostrarInfo() {
            System.out.printf("Profesor[%s] %s (%s) | cursos=%d%n",
                    id, nombre, especialidad, cursos.size());
        }

        @Override public String toString() { return nombre + " (" + especialidad + ")"; }

        void _agregarSoloLista(Curso c) { if (!cursos.contains(c)) cursos.add(c); }
        void _removerSoloLista(Curso c) { cursos.remove(c); }
    }

    private static class Curso {
        private String codigo;
        private String nombre;
        private Profesor profesor; // puede ser null

        public Curso(String codigo, String nombre) { this.codigo=codigo; this.nombre=nombre; }

        public String getCodigo() { return codigo; }
        public String getNombre() { return nombre; }
        public Profesor getProfesor() { return profesor; }

        public void setProfesor(Profesor nuevo) {
            if (this.profesor == nuevo) return;
            Profesor previo = this.profesor;
            this.profesor = null;
            if (previo != null) previo._removerSoloLista(this);
            this.profesor = nuevo;
            if (nuevo != null) nuevo._agregarSoloLista(this);
        }

        public void mostrarInfo() {
            System.out.printf("Curso[%s] %s | Profesor: %s%n",
                    codigo, nombre, profesor == null ? "(sin asignar)" : profesor.getNombre());
        }

        @Override public String toString() {
            return "Curso{" + codigo + " - " + nombre + ", profesor=" +
                    (profesor == null ? "null" : profesor.getNombre()) + "}";
        }
    }

    private static class Universidad {
        private String nombre;
        private final List<Profesor> profesores = new ArrayList<>();
        private final List<Curso> cursos = new ArrayList<>();

        public Universidad(String nombre) { this.nombre = nombre; }

        public void agregarProfesor(Profesor p) { if (p != null) profesores.add(p); }
        public void agregarCurso(Curso c) { if (c != null) cursos.add(c); }

        public Profesor buscarProfesorPorId(String id) {
            for (Profesor p : profesores) if (p.getId().equalsIgnoreCase(id)) return p;
            return null;
        }

        public Curso buscarCursoPorCodigo(String codigo) {
            for (Curso c : cursos) if (c.getCodigo().equalsIgnoreCase(codigo)) return c;
            return null;
        }

        public boolean asignarProfesorACurso(String codigoCurso, String idProfesor) {
            Curso c = buscarCursoPorCodigo(codigoCurso);
            Profesor p = buscarProfesorPorId(idProfesor);
            if (c == null || p == null) return false;
            c.setProfesor(p);
            return true;
        }

        public void listarProfesores() {
            System.out.println("== Profesores ==");
            for (Profesor p : profesores) p.mostrarInfo();
        }

        public void listarCursos() {
            System.out.println("== Cursos ==");
            for (Curso c : cursos) c.mostrarInfo();
        }

        public boolean eliminarCurso(String codigo) {
            Iterator<Curso> it = cursos.iterator();
            while (it.hasNext()) {
                Curso c = it.next();
                if (c.getCodigo().equalsIgnoreCase(codigo)) {
                    if (c.getProfesor() != null) c.setProfesor(null);
                    it.remove();
                    return true;
                }
            }
            return false;
        }

        public boolean eliminarProfesor(String id) {
            Iterator<Profesor> it = profesores.iterator();
            while (it.hasNext()) {
                Profesor p = it.next();
                if (p.getId().equalsIgnoreCase(id)) {
                    List<Curso> copia = new ArrayList<>(p.getCursos());
                    for (Curso c : copia) c.setProfesor(null);
                    it.remove();
                    return true;
                }
            }
            return false;
        }

        public void reporteCursosPorProfesor() {
            System.out.println("== Reporte: cursos por profesor ==");
            for (Profesor p : profesores) {
                System.out.printf("%s → %d cursos%n", p.getNombre(), p.getCursos().size());
            }
        }
    }

    public static void main(String[] args) {
        Universidad u = new Universidad("UNC - FCEFyN");

        Profesor p1 = new Profesor("PR01", "Ana Gutiérrez", "Bases de Datos");
        Profesor p2 = new Profesor("PR02", "Luis Romero", "Programación II");
        Profesor p3 = new Profesor("PR03", "Mara Díaz", "Algoritmos");

        Curso c1 = new Curso("BD101", "Modelado de Datos");
        Curso c2 = new Curso("PR201", "Java Colecciones");
        Curso c3 = new Curso("AL301", "Estructuras");
        Curso c4 = new Curso("BD102", "SQL Avanzado");
        Curso c5 = new Curso("PR202", "Patrones de Diseño");

        u.agregarProfesor(p1); u.agregarProfesor(p2); u.agregarProfesor(p3);
        u.agregarCurso(c1); u.agregarCurso(c2); u.agregarCurso(c3); u.agregarCurso(c4); u.agregarCurso(c5);

        u.asignarProfesorACurso("BD101", "PR01");
        u.asignarProfesorACurso("PR201", "PR02");
        u.asignarProfesorACurso("AL301", "PR03");
        u.asignarProfesorACurso("BD102", "PR01");
        u.asignarProfesorACurso("PR202", "PR02");

        u.listarCursos();
        System.out.println();
        u.listarProfesores();
        System.out.println();
        p1.listarCursos(); p2.listarCursos(); p3.listarCursos();

        System.out.println("\n== Cambiar profesor de PR202 → PR03 ==");
        u.asignarProfesorACurso("PR202", "PR03");
        u.listarCursos();
        System.out.println();
        p2.listarCursos(); p3.listarCursos();

        System.out.println("\n== Eliminar BD102 ==");
        u.eliminarCurso("BD102");
        u.listarCursos();
        System.out.println();
        p1.listarCursos();

        System.out.println("\n== Eliminar profesor PR02 ==");
        u.eliminarProfesor("PR02");
        u.listarProfesores();
        System.out.println();
        u.listarCursos();

        System.out.println();
        u.reporteCursosPorProfesor();
    }
}
