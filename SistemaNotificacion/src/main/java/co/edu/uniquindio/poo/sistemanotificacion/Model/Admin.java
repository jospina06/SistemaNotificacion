package co.edu.uniquindio.poo.sistemanotificacion.Model;

public class Admin extends Usuario {

    public Admin(String nombre, String correo) {
        super(nombre, correo);
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
