module co.edu.uniquindio.poo.sistemanotificacion {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.poo.sistemanotificacion to javafx.fxml;
    exports co.edu.uniquindio.poo.sistemanotificacion;
}