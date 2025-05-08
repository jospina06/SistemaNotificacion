package co.edu.uniquindio.poo.sistemanotificacion.Model;

public class Invitado extends Usuario {

    public Invitado(String nombre, String correo, String contrasena) {
        super(nombre, correo, contrasena);
    }

    @Override
    public void formato(String mensaje) {
        System.out.println("Tiene un nuevo mensaje, para verlo Registrese");
    }
}
