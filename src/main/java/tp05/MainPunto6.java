package tp05;

public class MainPunto6 {
    public static void main(String[] args) {
        ClienteRest cli = new ClienteRest("Franco Colapinto", "351-555-5555");
        Mesa m = new Mesa(7, 4);
        Reserva r = new Reserva("10-02-2025", "22:30");

        r.setCliente(cli);  // asociación unidireccional
        r.setMesa(m);       // agregación

        System.out.println(r);
    }
}