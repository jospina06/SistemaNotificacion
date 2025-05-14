package co.edu.uniquindio.poo.sistemanotificacion.Model;

public class FiltroMensajeVacio extends FiltroNotificacion{

    public boolean manipular(Notificacion notificacion) {
        if (notificacion.getMensaje() == null || notificacion.getMensaje().isEmpty()) {
            System.out.println("El mensaje esta vacio. Se canceló la notificación");
            return false;
        }
        return super.manipular(notificacion);
    }
}
