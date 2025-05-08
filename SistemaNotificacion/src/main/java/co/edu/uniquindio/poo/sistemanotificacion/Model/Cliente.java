package co.edu.uniquindio.poo.sistemanotificacion.Model;

public class Cliente extends Usuario {

    public Cliente(String nombre, String correo, String contrasena) {
        super(nombre, correo, contrasena);
    }

    @Override
    public void formato(String mensaje) {
        System.out.println("TIENES UN NUEVO MENSAJE: \n" + mensaje);
    }
}
