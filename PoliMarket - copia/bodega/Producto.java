package bodega;

public class Producto {
    private int id;
    private String nombre;
    private int cantidad;

    public Producto(int id, String nombre, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public int getCantidad() { return cantidad; }

    public void reducirStock(int cantidad) {
        if (this.cantidad >= cantidad) {
            this.cantidad -= cantidad;
        }
    }

    public void aumentarStock(int cantidad) {
        this.cantidad += cantidad;
    }

    public void mostrarProducto() {
        System.out.println("Producto: " + nombre + " (Stock: " + cantidad + ")");
    }
}