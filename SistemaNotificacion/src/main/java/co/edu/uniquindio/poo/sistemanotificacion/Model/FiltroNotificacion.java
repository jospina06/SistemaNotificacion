package co.edu.uniquindio.poo.sistemanotificacion.Model;

public class FiltroNotificacion {
    private FiltroNotificacion next;

    public void setNext(FiltroNotificacion next) {
        this.next = next;
    }
    public boolean filtrar(Notificacion notificacion){
        if (next != null) return next.filtrar(notificacion);
        return true;
    }
}
