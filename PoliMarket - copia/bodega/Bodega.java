package bodega;

import proveedores.Proveedor;
import java.util.*;

public class Bodega {
    private List<Producto> productos;

    public Bodega() {
        productos = new ArrayList<>();
        productos.add(new Producto(1, "Monitor", 15));
        productos.add(new Producto(2, "Teclado", 10));
        productos.add(new Producto(3, "Mouse", 20));
    }

    public List<Producto> getProductosDisponibles() {
        return productos;
    }

    public void registrarSalidaProducto(int productoId, int cantidad) {
        for (Producto p : productos) {
            if (p.getId() == productoId) {
                p.reducirStock(cantidad);
                System.out.println("Salida registrada: " + cantidad + " de " + p.getNombre());
                return;
            }
        }
    }

    public void solicitarReabastecimiento(Proveedor proveedor, Producto producto, int cantidad) {
        System.out.println("Solicitando " + cantidad + " unidades de " + producto.getNombre() +
                " al proveedor: " + proveedor.getNombreEmpresa());
        producto.aumentarStock(cantidad);
    }

    public Producto buscarProductoPorId(int id) {
        for (Producto p : productos) {
            if (p.getId() == id) return p;
        }
        return null;
    }
}
