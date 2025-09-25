package tp05;

public class MainPunto2 {
    public static void main(String[] args) {
        Bateria bat = new Bateria("EB-BA123", 5000);
        Celular cel = new Celular("357890123456789", "Apple", "Iphone18");
        Usuario usu = new Usuario("Franco Colapinto", "4222111");

        cel.setBateria(bat);   // agregación
        cel.setUsuario(usu);   // bidireccional segura

        System.out.println(cel);
        System.out.println(usu);
        System.out.println(usu.getCelular() == cel); // true
        System.out.println(cel.getUsuario() == usu); // true
    }
}