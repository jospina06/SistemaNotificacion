package co.edu.uniquindio.poo.sistemanotificacion.Model;

public class FiltroUsuarioBloqueado extends FiltroNotificacion{

    public boolean manipular(Notificacion notificacion) {
        if (notificacion.getUsuario().isBloqueado()){
            System.out.println("El Usuario " + notificacion.getUsuario().getNombre() +
                    " está bloqueado. La notificación fue cancelada");
            return false;
        }
        return super.manipular(notificacion);
    }
}
