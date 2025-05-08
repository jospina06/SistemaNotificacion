package co.edu.uniquindio.poo.sistemanotificacion.Model;

public class EmailNotificacion implements NotificacionStrategy{
    private String mensaje;

    public EmailNotificacion(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public void notificar(String mensaje, Usuario usuario) {

    }
}
