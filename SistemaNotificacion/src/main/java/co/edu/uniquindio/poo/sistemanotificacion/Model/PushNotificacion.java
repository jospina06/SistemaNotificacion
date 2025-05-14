package co.edu.uniquindio.poo.sistemanotificacion.Model;

public class PushNotificacion implements NotificacionStrategy{

    @Override
    public void notificar(String mensaje, Usuario usuario) {
        System.out.println("Notificación Push enviada a " + usuario.getNombre());
        System.out.println("Contenido: \n" + mensaje);
    }
}
