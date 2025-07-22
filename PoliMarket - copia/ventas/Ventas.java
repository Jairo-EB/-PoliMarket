package ventas;

import bodega.Bodega;
import bodega.Producto;
import java.util.*;

public class Ventas {
    private Bodega bodega;
    private List<Cliente> clientes;

    public Ventas(Bodega bodega) {
        this.bodega = bodega;
        clientes = new ArrayList<>();
        clientes.add(new Cliente(1, "Jairo", "Cra 14 17 A 123"));
        clientes.add(new Cliente(2, "Laura", "Carrera 45 #89"));
    }

    public List<Producto> consultarProductos() {
        return bodega.getProductosDisponibles();
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public Cliente buscarClientePorId(int id) {
        for (Cliente c : clientes) {
            if (c.getId() == id) return c;
        }
        return null;
    }
}
