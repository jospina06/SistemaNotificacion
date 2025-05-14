package co.edu.uniquindio.poo.sistemanotificacion.Model;

public class Admin extends Usuario {
    private String idAdmin;

    public Admin(String nombre, String correo, boolean bloqueado, String idAdmin) {
        super(nombre, correo, bloqueado);
        this.idAdmin = idAdmin;
    }

    public String getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(String idAdmin) {
        this.idAdmin = idAdmin;
    }

    @Override
    public String getEncabezado() {
        return "[ADMIN]";
    }

    @Override
    public String mensajePersonalizado(String mensajeBase) {
        return "Administrador: " + mensajeBase;
    }

    @Override
    public String getFooter() {
        return "-- Sistena --";
    }
}
