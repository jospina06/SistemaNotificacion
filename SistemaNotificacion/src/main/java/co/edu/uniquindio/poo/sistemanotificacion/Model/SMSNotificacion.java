package co.edu.uniquindio.poo.sistemanotificacion.Model;

public class SMSNotificacion implements  NotificacionStrategy{

    @Override
    public void notificar(String mensaje, Usuario usuario) {
        System.out.println("SMS enviado a " + usuario.getCorreo());
        System.out.println("Contenido: \n" + mensaje);
    }
}
