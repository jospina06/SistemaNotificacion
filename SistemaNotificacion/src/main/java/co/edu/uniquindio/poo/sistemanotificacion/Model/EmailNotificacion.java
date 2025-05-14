package co.edu.uniquindio.poo.sistemanotificacion.Model;

public class EmailNotificacion implements NotificacionStrategy{

    @Override
    public void notificar(String mensaje, Usuario usuario) {
        System.out.println("Email enviado a " + usuario.getCorreo());
        System.out.println("Contenido: \n" + mensaje);
    }
}
