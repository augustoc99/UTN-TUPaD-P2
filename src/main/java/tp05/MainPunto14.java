package tp05;

public class MainPunto14 {
    public static void main(String[] args) {
        Proyecto p = new Proyecto("Video de Presentación", 7);
        EditorVideo editor = new EditorVideo();
        editor.exportar(".AVI", p);
    }
}