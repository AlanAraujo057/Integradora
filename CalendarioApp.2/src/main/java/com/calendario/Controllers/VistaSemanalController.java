package com.calendario.Controllers;

import javafx.fxml.FXML;
import javafx.scene.layout.VBox;
import java.time.LocalDate;

public class VistaSemanalController {
    @FXML private VBox semanaContainer;

    private LocalDate fechaInicioSemana;

    @FXML
    public void initialize() {
        fechaInicioSemana = LocalDate.now();
        actualizarVistaSemanal();
    }

    private void actualizarVistaSemanal() {
        // Implementación para mostrar la semana actual con eventos en formato de 12 horas
    }

    @FXML
    private void semanaAnterior() {
        fechaInicioSemana = fechaInicioSemana.minusWeeks(1);
        actualizarVistaSemanal();
    }

    @FXML
    private void semanaSiguiente() {
        fechaInicioSemana = fechaInicioSemana.plusWeeks(1);
        actualizarVistaSemanal();
    }
}