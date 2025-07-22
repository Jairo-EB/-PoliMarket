import ventas.*;
import bodega.*;

public class AppMovilCliente {
    public static void main(String[] args) {
        
        System.out.println("  Bienvenido al sistema móvil PoliMarket 🔹");

        Bodega bodega = new Bodega();
        Ventas ventas = new Ventas(bodega);

        System.out.println("\n  Productos disponibles desde la app móvil:");
        for (Producto p : ventas.consultarProductos()) {
            p.mostrarProducto();
        }

        System.out.println("\n  Clientes registrados en el sistema:");
        for (Cliente c : ventas.getClientes()) {
            c.mostrarCliente();
        }

        System.out.println("\n Consulta móvil completada.");
    }
}
