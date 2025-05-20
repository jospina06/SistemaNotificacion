package co.edu.uniquindio.poo.sistemanotificacion.Model;

public class Invitado extends Usuario {

    public Invitado(String nombre, String correo) {
        super(nombre, correo);
    }

    @Override
    public String getEncabezado() {
        return "¡¡Nueva Notificación!!";
    }

    @Override
    public String mensajePersonalizado(String mensajeBase) {
        return "Para acceder a más detalles, Registrese";
    }

    @Override
    public String getFooter() {
        return "";
    }
}
