package co.edu.uniquindio.poo.sistemanotificacion.Model;

import java.util.ArrayList;
import java.util.List;

public class NotificacionInvocador {
    private List<NotificacionCommand> colaNotificaciones = new ArrayList<>();

    public void addComando(NotificacionCommand command) {
        colaNotificaciones.add(command);
    }

    public void ejecutarComandos(){
        for (NotificacionCommand command : colaNotificaciones) {
            command.ejecutar();
        }
    }
}
