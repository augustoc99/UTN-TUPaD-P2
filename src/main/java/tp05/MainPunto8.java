package tp05;

public class MainPunto8 {
    public static void main(String[] args) {
        UsuarioFirma u = new UsuarioFirma("Franco Colapinto", "fcolapa@alpine.fr");
        FirmaDigital f = new FirmaDigital("fc43hash", "20-05-25");
        f.setUsuario(u); // agregación

        Documento d = new Documento("Contrato por temporada", "Contenido del contrato de temporadas...", f); // composición

        System.out.println(d);
        System.out.println(d.getFirma());
    }
}