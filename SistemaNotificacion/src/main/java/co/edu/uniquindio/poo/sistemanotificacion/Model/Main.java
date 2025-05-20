package co.edu.uniquindio.poo.sistemanotificacion.Model;

public class Main {
    public static void main(String[] args) {

        //Crear Usuario
        Usuario usuario = new Admin("Juan", "jjospina@gmail.com");
        usuario.setBloqueado(true);

        //Crear notificación
        Notificacion notificacion = new Notificacion(usuario, "Se ha actualizado su perfil");

        //Establecer estrategia
        notificacion.setStrategy(new EmailNotificacion());

        //creacion de la Chain of Responsibility
        FiltroNotificacion filtro = new FiltroMensajeVacio();
        filtro.setNext(new FiltroUsuarioBloqueado());

        //Validar notificación
        if (filtro.manipular(notificacion)) {
            //Crear y ejecutar Command
            NotificacionCommand command = new EnviarNotificacionCommand(notificacion);
            NotificacionInvocador invocador = new NotificacionInvocador();
            invocador.addComando(command);
            invocador.ejecutarComandos();
        }
    }
}
