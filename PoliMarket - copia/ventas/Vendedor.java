package ventas;

public class Vendedor {
    private int id;
    private String nombre;
    private boolean autorizado;

    public Vendedor(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.autorizado = false;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public boolean isAutorizado() { return autorizado; }
    public void setAutorizado(boolean autorizado) { this.autorizado = autorizado; }
}
