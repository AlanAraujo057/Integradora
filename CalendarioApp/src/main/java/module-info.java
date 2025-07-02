module com.calendario {
    requires javafx.controls;
    requires javafx.fxml;

    // Solo incluye módulos que realmente existan
    requires controlsfx;  // Nombre correcto del módulo ControlsFX
    requires bootstrapfx; // Nombre correcto del módulo BootstrapFX

    requires java.sql;

    opens com.calendario to javafx.fxml;
    opens com.calendario.controllers to javafx.fxml;
    opens com.calendario.database to javafx.fxml;

    exports com.calendario;
    exports com.calendario.controllers;
    exports com.calendario.database;
}