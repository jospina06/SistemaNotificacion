package co.edu.uniquindio.poo.sistemanotificacion.Model;

public class Admin extends Usuario {
    private String idAdmin;

    public Admin(String nombre, String correo, String contrasena, String idAdmin) {
        super(nombre, correo, contrasena);
        this.idAdmin = idAdmin;
    }

    public String getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(String idAdmin) {
        this.idAdmin = idAdmin;
    }

    @Override
    public void formato(String mensaje) {
        System.out.println("Mensaje nuevo para Admin N°: " + idAdmin + "\n" + mensaje);
    }

}
