package co.edu.uniquindio.poo.sistemanotificacion.Model;

import java.util.Collection;
import java.util.LinkedList;

public class Notificador {
    private Collection<Usuario> suscriptores;

    public Notificador() {
        this.suscriptores = new LinkedList<>();
    }

    public void suscribir(Usuario usuario) {
        suscriptores.add(usuario);
    }

    public void desuscribir(Usuario usuario) {
        suscriptores.remove(usuario);
    }

    public void generarNotificacion(String mensajeBase) {
        for (Usuario usuario : suscriptores) {
            Notificacion notificacion = new Notificacion(usuario, mensajeBase);
            notificacion.setStrategy(new SMSNotificacion());

            FiltroNotificacion filtro = new FiltroMensajeVacio();
            filtro.setNext(new FiltroUsuarioBloqueado());

            if (filtro.filtrar(notificacion)) {
                NotificacionCommand command = new EnviarNotificacionCommand(notificacion);
                NotificacionInvocador invocador = new NotificacionInvocador();
                invocador.addComando(command);
                invocador.ejecutarComandos();
            }
        }
    }
}
