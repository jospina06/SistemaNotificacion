package co.edu.uniquindio.poo.sistemanotificacion.Model;

public class EnviarNotificacionCommand implements NotificacionCommand {
    private Notificacion notificacion;

    public EnviarNotificacionCommand(Notificacion notificacion) {
        this.notificacion = notificacion;
    }

    public void ejecutar(){
        notificacion.enviar();
    }
}
