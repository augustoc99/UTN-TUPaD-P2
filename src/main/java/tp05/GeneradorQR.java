package tp05;

public class GeneradorQR {
    // Dependencia de creación: recibe datos, crea un CodigoQR y lo usa.
    public void generar(String valor, UsuarioQR usuario) {
        CodigoQR qr = new CodigoQR(valor, usuario); // creado aquí (no se guarda como atributo)
        System.out.println("QR generado con valor: " + qr.getValor());
        System.out.println(qr);
    }
}