module com.calendario {
    // Módulos de JavaFX requeridos
    requires javafx.controls;
    requires javafx.fxml;

    // Módulos de terceros (nombres exactos)
    requires org.controlsfx.controls;  // Nombre exacto del módulo ControlsFX
    requires org.kordamp.bootstrapfx.core;  // Nombre exacto del módulo BootstrapFX

    // Módulo para conexión a base de datos
    requires java.sql;

    // Paquetes que deben ser accesibles para JavaFX FXML
    opens com.calendario to javafx.fxml;
    opens com.calendario.Controllers to javafx.fxml;
    opens com.calendario.database to javafx.fxml;

    // Paquetes que se exportan para uso externo
    exports com.calendario;
    exports com.calendario.Controllers;
    exports com.calendario.database;
}