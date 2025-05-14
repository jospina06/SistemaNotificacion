package co.edu.uniquindio.poo.sistemanotificacion.Model;

public class FiltroNotificacion {
    private FiltroNotificacion next;

    public void setNext(FiltroNotificacion next) {
        this.next = next;
    }
    public boolean manipular(Notificacion notificacion){
        if (next != null) return next.manipular(notificacion);
        return true;
    }
}
