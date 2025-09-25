package tp05;

public class MainPunto4 {
    public static void main(String[] args) {
        Banco banco = new Banco("BBVA", "30-857585696-9");
        Cliente cli = new Cliente("Franco Colapinto", "42222111");
        TarjetaDeCredito tc = new TarjetaDeCredito("5152 6700 8875 9923", "05/29");

        tc.setBanco(banco);  // agregación
        tc.setCliente(cli);  // asociación bidireccional segura

        System.out.println(tc);
        System.out.println(cli);
        System.out.println(cli.getTarjeta() == tc); // true
        System.out.println(tc.toString());
    }
}