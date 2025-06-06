package co.edu.uniquindio.poo.sistemanotificacion.Model;

public class Cliente extends Usuario {

    public Cliente(String nombre, String correo) {
        super(nombre, correo);
    }

    @Override
    public String getEncabezado() {
        return "Hola Cliente, ";
    }

    @Override
    public String mensajePersonalizado(String mensajeBase) {
        return mensajeBase;
    }

    @Override
    public String getFooter() {
        return "Gracias por usar la aplicación.";
    }
}
