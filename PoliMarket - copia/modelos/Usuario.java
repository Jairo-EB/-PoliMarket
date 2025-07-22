package modelos;

public class Usuario {
    private int id;
    private String nombre;
    private String correo;
    private String clave;

    public Usuario(int id, String nombre, String correo, String clave) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.clave = clave;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getCorreo() { return correo; }
    public String getClave() { return clave; }

    public void mostrarInfo() {
        System.out.println("Usuario: " + nombre + ", Correo: " + correo);
    }
}