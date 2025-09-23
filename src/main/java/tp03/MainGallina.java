package tp03;

public class MainGallina {
    public static void main(String[] args) {
        Gallina g1 = new Gallina();
        g1.idGallina = 1;
        g1.edad = 2;
        g1.huevosPuestos = 0;

        g1.ponerHuevo();
        g1.envejecer();
        g1.mostrarEstado();

        Gallina g2 = new Gallina();
        g2.idGallina = 2;
        g2.edad = 1;
        g2.huevosPuestos = 0;

        g2.ponerHuevo();
        g2.ponerHuevo();
        g2.mostrarEstado();
    }
}