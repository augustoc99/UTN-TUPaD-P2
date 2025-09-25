package tp05;

public class Reproductor {
    public void reproducir(Cancion c) {
        if (c == null) {
            System.out.println("No hay canción para reproducir.");
            return;
        }
        System.out.println("Reproduciendo: " + c.getTitulo() + " - " + c.getArtista().getNombre());
    }
}