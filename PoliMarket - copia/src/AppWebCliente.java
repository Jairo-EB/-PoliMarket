import ventas.*;
import bodega.*;
import rrhh.*;
import entregas.*;
import proveedores.*;

public class AppWebCliente {
    public static void main(String[] args) {
        
        Bodega bodega = new Bodega();
        Ventas ventas = new Ventas(bodega);
        RecursosHumanos rrhh = new RecursosHumanos();
        Proveedor proveedor = new Proveedor(1, "Proveedora S.A.");
        Entregas entregas = new Entregas(bodega);


        Vendedor vendedor = new Vendedor(1, "Camila");
        rrhh.autorizarVendedor(vendedor);

        if (vendedor.isAutorizado()) {
            System.out.println("Productos disponibles:");
            for (Producto p : ventas.consultarProductos()) {
                p.mostrarProducto();
            }

            
            System.out.println("\nClientes:");
            for (Cliente c : ventas.getClientes()) {
                c.mostrarCliente();
            }

        
            Cliente cliente = ventas.buscarClientePorId(1);
            entregas.entregarProducto(1, cliente, 2); // Entregar 2 monitores

            
            Producto producto = bodega.buscarProductoPorId(1);
            bodega.solicitarReabastecimiento(proveedor, producto, 5); // Reabastecer 5 monitores

            System.out.println("\nProductos actualizados:");
            for (Producto p : ventas.consultarProductos()) {
                p.mostrarProducto();
            }
        } else {
            System.out.println("El vendedor no está autorizado.");
        }
    }
}
