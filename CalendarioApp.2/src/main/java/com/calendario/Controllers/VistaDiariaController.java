package com.calendario.Controllers;

import javafx.fxml.FXML;
import javafx.scene.layout.VBox;
import java.time.LocalDate;

public class VistaDiariaController {
    @FXML private VBox diaContainer;

    private LocalDate fechaActual;

    @FXML
    public void initialize() {
        fechaActual = LocalDate.now();
        actualizarVistaDiaria();
    }

    private void actualizarVistaDiaria() {
        // Implementación para mostrar el día actual con eventos en formato de 12 horas
    }

    @FXML
    private void diaAnterior() {
        fechaActual = fechaActual.minusDays(1);
        actualizarVistaDiaria();
    }

    @FXML
    private void diaSiguiente() {
        fechaActual = fechaActual.plusDays(1);
        actualizarVistaDiaria();
    }
}