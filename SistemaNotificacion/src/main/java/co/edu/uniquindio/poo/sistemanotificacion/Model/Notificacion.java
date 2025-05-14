package co.edu.uniquindio.poo.sistemanotificacion.Model;

public class Notificacion {
    private Usuario usuario;
    private String mensaje;
    private NotificacionStrategy strategy;

    public Notificacion(Usuario usuario, String mensaje) {
        this.usuario = usuario;
        this.mensaje = mensaje;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getMensaje() {
        return mensaje;
    }

    public NotificacionStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(NotificacionStrategy strategy) {
        this.strategy = strategy;
    }

    public void enviar(){
        String formato = usuario.formato(mensaje);
        strategy.notificar(formato, usuario);
    }
}
