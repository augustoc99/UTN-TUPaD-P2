package tp05;

public class MainPunto10 {
    public static void main(String[] args) {
        ClaveSeguridad clave = new ClaveSeguridad("2431", "01-02-2022");
        CuentaBancaria cuenta = new CuentaBancaria("0000003100012345678901", 150000.0, clave);
        TitularCuenta titular = new TitularCuenta("Franco Colapinto", "41222111");

        // Asociación bidireccional segura
        cuenta.setTitular(titular);

        System.out.println(cuenta);
        System.out.println(titular);
        System.out.println(titular.getCuenta() == cuenta); // true
        System.out.println(cuenta.getTitular() == titular); // true
    }
}