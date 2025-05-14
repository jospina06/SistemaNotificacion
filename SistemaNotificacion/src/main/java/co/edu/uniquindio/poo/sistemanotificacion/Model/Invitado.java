package co.edu.uniquindio.poo.sistemanotificacion.Model;

public class Invitado extends Usuario {

    public Invitado(String nombre, String correo, String contrasena, boolean bloqueado) {
        super(nombre, correo, contrasena, bloqueado);
    }

    @Override
    public String getEncabezado() {
        return "";
    }

    @Override
    public String mensajePersonalizado(String mensajeBase) {
        return "";
    }

    @Override
    public String getFooter() {
        return "";
    }
}
