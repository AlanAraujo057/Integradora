module com.calendario.calendarioapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.calendario.calendarioapp to javafx.fxml;
    exports com.calendario.calendarioapp;
}