package entregas;

import ventas.Cliente;
import bodega.Bodega;
import bodega.Producto;

public class Entregas {
    private Bodega bodega;

    public Entregas(Bodega bodega) {
        this.bodega = bodega;
    }

    public void entregarProducto(int productoId, Cliente cliente, int cantidad) {
        Producto producto = bodega.buscarProductoPorId(productoId);
        if (producto != null) {
            System.out.println("Entregando " + cantidad + " de " + producto.getNombre() + " a " + cliente.getNombre());
            bodega.registrarSalidaProducto(productoId, cantidad);
        } else {
            System.out.println("Producto no encontrado para entregar.");
        }
    }
}
