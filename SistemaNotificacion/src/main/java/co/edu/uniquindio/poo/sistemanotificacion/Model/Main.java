package co.edu.uniquindio.poo.sistemanotificacion.Model;

public class Main {
    public static void main(String[] args) {

        //Crear Usuario
        Usuario usuario1 = new Admin("Juan", "jjospina@gmail.com");
        Usuario usuario2 = new Cliente("Luis", "luis@gmail.com");
        Usuario usuario3 = new Cliente("daniel", "daniel@gmail.com");

        //Crear notificación
        Notificacion notificacion = new Notificacion(usuario1, "Se ha actualizado su perfil");

        //Establecer estrategia
        notificacion.setStrategy(new EmailNotificacion());

        //creacion de la Chain of Responsibility
        FiltroNotificacion filtro = new FiltroMensajeVacio();
        filtro.setNext(new FiltroUsuarioBloqueado());

        //Validar notificación
        if (filtro.filtrar(notificacion)) {
            //Crear y ejecutar Command
            NotificacionCommand command = new EnviarNotificacionCommand(notificacion);
            NotificacionInvocador invocador = new NotificacionInvocador();
            invocador.addComando(command);
            invocador.ejecutarComandos();
        }

        Notificador notificador = new Notificador();
        notificador.suscribir(usuario2);
        notificador.suscribir(usuario3);
        notificador.generarNotificacion("Nueva oferta disponible");
    }
}
