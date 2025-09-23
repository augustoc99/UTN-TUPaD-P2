package tp03;

public class MainNaveEspacial {
    public static void main(String[] args) {
        NaveEspacial nave = new NaveEspacial("Apollo", 50);

        nave.mostrarEstado();
        nave.avanzar(20);
        nave.recargarCombustible(40);
        nave.despegar();
        nave.avanzar(10);
        nave.mostrarEstado();
    }
}