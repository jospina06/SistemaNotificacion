package co.edu.uniquindio.poo.sistemanotificacion.Model;

public class Invitado extends Usuario {

    public Invitado(String nombre, String correo, boolean bloqueado) {
        super(nombre, correo, bloqueado);
    }

    @Override
    public String getEncabezado() {
        return "";
    }

    @Override
    public String mensajePersonalizado(String mensajeBase) {
        return "";
    }

    @Override
    public String getFooter() {
        return "";
    }
}
