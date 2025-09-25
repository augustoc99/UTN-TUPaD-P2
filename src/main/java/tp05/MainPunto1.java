package tp05;

public class MainPunto1 {
    public static void main(String[] args) {
        Foto f = new Foto("img".getBytes(), "JPG");
        Pasaporte p = new Pasaporte("AR123456", "2025-09-01", f);
        Titular t = new Titular("Franco Colapinto", "41.111.222");
        p.setTitular(t);

        System.out.println(p);
        System.out.println(t);
        System.out.println(t.getPasaporte() == p); // true
        System.out.println(p.getTitular() == t);   // true
    }
}