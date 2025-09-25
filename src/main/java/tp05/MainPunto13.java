package tp05;

public class MainPunto13 {
    public static void main(String[] args) {
        UsuarioQR u = new UsuarioQR("Franco Colapinto", "fcolapinto@alpine.fr");
        GeneradorQR gen = new GeneradorQR();
        gen.generar("PAGO-ORD-#FC43N1", u);  // dependencia de creación
    }
}