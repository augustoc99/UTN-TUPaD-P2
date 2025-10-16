import java.util.*;

public class Caso1 {

    // ==== Tipos internos (estáticos) ====
    private enum CategoriaProducto {
        ALIMENTOS("Productos comestibles"),
        ELECTRONICA("Dispositivos electrónicos"),
        ROPA("Prendas de vestir"),
        HOGAR("Artículos para el hogar");

        private final String descripcion;
        CategoriaProducto(String descripcion) { this.descripcion = descripcion; }
        public String getDescripcion() { return descripcion; }
    }

    private static class Producto {
        private String id;
        private String nombre;
        private double precio;
        private int cantidad;
        private CategoriaProducto categoria;

        public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
            this.id = id; this.nombre = nombre; this.precio = precio; this.cantidad = cantidad; this.categoria = categoria;
        }

        public String getId() { return id; }
        public String getNombre() { return nombre; }
        public double getPrecio() { return precio; }
        public int getCantidad() { return cantidad; }
        public CategoriaProducto getCategoria() { return categoria; }
        public void setCantidad(int cantidad) { this.cantidad = cantidad; }

        public void mostrarInfo() {
            System.out.printf("ID=%s | %s | $%.2f | stock=%d | %s (%s)%n",
                    id, nombre, precio, cantidad, categoria, categoria.getDescripcion());
        }

        @Override public String toString() {
            return "Producto{" + "id='" + id + '\'' + ", nombre='" + nombre + '\'' + ", precio=" + precio +
                    ", cantidad=" + cantidad + ", categoria=" + categoria + '}';
        }
    }

    private static class Inventario {
        private final ArrayList<Producto> productos = new ArrayList<>();

        public void agregarProducto(Producto p) { productos.add(p); }

        public void listarProductos() {
            if (productos.isEmpty()) { System.out.println("(Inventario vacío)"); return; }
            for (Producto p : productos) p.mostrarInfo();
        }

        public Producto buscarProductoPorId(String id) {
            for (Producto p : productos) if (p.getId().equalsIgnoreCase(id)) return p;
            return null;
        }

        public boolean eliminarProducto(String id) {
            Iterator<Producto> it = productos.iterator();
            while (it.hasNext()) if (it.next().getId().equalsIgnoreCase(id)) { it.remove(); return true; }
            return false;
        }

        public boolean actualizarStock(String id, int nuevaCantidad) {
            Producto p = buscarProductoPorId(id);
            if (p == null) return false;
            p.setCantidad(nuevaCantidad);
            return true;
        }

        public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
            ArrayList<Producto> out = new ArrayList<>();
            for (Producto p : productos) if (p.getCategoria() == categoria) out.add(p);
            return out;
        }

        public int obtenerTotalStock() {
            int total = 0; for (Producto p : productos) total += p.getCantidad(); return total;
        }

        public Producto obtenerProductoConMayorStock() {
            if (productos.isEmpty()) return null;
            Producto max = productos.get(0);
            for (Producto p : productos) if (p.getCantidad() > max.getCantidad()) max = p;
            return max;
        }

        public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max) {
            ArrayList<Producto> out = new ArrayList<>();
            for (Producto p : productos) if (p.getPrecio() >= min && p.getPrecio() <= max) out.add(p);
            return out;
        }

        public void mostrarCategoriasDisponibles() {
            for (CategoriaProducto c : CategoriaProducto.values()) System.out.println(c + " → " + c.getDescripcion());
        }
    }

    // ==== Main ====
    public static void main(String[] args) {
        Inventario inv = new Inventario();
inv.agregarProducto(new Producto("P01","Leche", 1200, 30, CategoriaProducto.ALIMENTOS));
inv.agregarProducto(new Producto("P02","TV 43\"", 250000, 5, CategoriaProducto.ELECTRONICA));
inv.agregarProducto(new Producto("P03","Remera", 8000, 20, CategoriaProducto.ROPA));
inv.agregarProducto(new Producto("P04","Almohada", 6000, 12, CategoriaProducto.HOGAR));
inv.agregarProducto(new Producto("P05","Yerba", 3500, 40, CategoriaProducto.ALIMENTOS));

        System.out.println("== LISTA COMPLETA =="); inv.listarProductos();
        System.out.println("\n== BUSCAR P03 =="); Producto buscado = inv.buscarProductoPorId("P03"); if (buscado != null) buscado.mostrarInfo();
        System.out.println("\n== FILTRAR ALIMENTOS =="); for (Producto p : inv.filtrarPorCategoria(CategoriaProducto.ALIMENTOS)) p.mostrarInfo();
        System.out.println("\n== ELIMINAR P02 =="); System.out.println(inv.eliminarProducto("P02") ? "Eliminado" : "No encontrado"); inv.listarProductos();
        System.out.println("\n== ACTUALIZAR STOCK P01 a 50 =="); inv.actualizarStock("P01", 50); inv.buscarProductoPorId("P01").mostrarInfo();
        System.out.println("\n== TOTAL STOCK =="); System.out.println(inv.obtenerTotalStock());
        System.out.println("\n== PRODUCTO CON MAYOR STOCK =="); System.out.println(inv.obtenerProductoConMayorStock());
        System.out.println("\n== PRECIO ENTRE 1000 y 3000 =="); for (Producto p : inv.filtrarProductosPorPrecio(1000, 3000)) p.mostrarInfo();
        System.out.println("\n== CATEGORÍAS DISPONIBLES =="); inv.mostrarCategoriasDisponibles();
    }
}
