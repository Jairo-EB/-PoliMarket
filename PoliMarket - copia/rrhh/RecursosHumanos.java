package rrhh;

import ventas.Vendedor;

public class RecursosHumanos {
    public void autorizarVendedor(Vendedor vendedor) {
        vendedor.setAutorizado(true);
        System.out.println("Vendedor autorizado: " + vendedor.getNombre());
    }
}