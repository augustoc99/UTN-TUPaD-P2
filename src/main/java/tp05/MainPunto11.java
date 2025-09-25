package tp05;

public class MainPunto11 {
    public static void main(String[] args) {
        Artista a = new Artista("Robert Miles", "Electrtónica");
        Cancion c = new Cancion("Children", a);

        Reproductor r = new Reproductor();
        r.reproducir(c);  // dependencia de uso
    }
}