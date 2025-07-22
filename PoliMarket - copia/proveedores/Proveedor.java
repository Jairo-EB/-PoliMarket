package proveedores;

public class Proveedor {
    private int id;
    private String nombreEmpresa;

    public Proveedor(int id, String nombreEmpresa) {
        this.id = id;
        this.nombreEmpresa = nombreEmpresa;
    }

    public int getId() { return id; }
    public String getNombreEmpresa() { return nombreEmpresa; }
}