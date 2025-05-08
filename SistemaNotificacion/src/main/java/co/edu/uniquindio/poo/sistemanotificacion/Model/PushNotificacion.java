package co.edu.uniquindio.poo.sistemanotificacion.Model;

public class PushNotificacion implements NotificacionStrategy{
    private String mensaje;

    public PushNotificacion(String mensaje) {
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
