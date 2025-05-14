package co.edu.uniquindio.poo.sistemanotificacion.Model;

public abstract class Usuario {
    private String nombre;
    private String correo;
    private String contrasena;
    private boolean bloqueado;

    public Usuario(String nombre, String correo, String contrasena, boolean bloqueado) {
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }

    public final String formato (String mensajeBase){
        return getEncabezado() + "\n" + mensajePersonalizado(mensajeBase) + "\n" + getFooter();
    }

    public abstract String getEncabezado();
    public abstract String mensajePersonalizado(String mensajeBase);
    public abstract String getFooter();
}
