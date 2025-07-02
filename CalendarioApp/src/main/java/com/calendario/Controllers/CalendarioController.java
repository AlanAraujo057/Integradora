package com.calendario.Controllers;


import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;
import java.time.YearMonth;

public class CalendarioController {
    @FXML private GridPane calendarioGrid;

    private YearMonth currentYearMonth;

    @FXML
    public void initialize() {
        currentYearMonth = YearMonth.now();
        actualizarVistaMensual();
    }

    private void actualizarVistaMensual() {
        // Implementación para mostrar el mes actual con los eventos
    }

    @FXML
    private void mesAnterior() {
        currentYearMonth = currentYearMonth.minusMonths(1);
        actualizarVistaMensual();
    }

    @FXML
    private void mesSiguiente() {
        currentYearMonth = currentYearMonth.plusMonths(1);
        actualizarVistaMensual();
    }
}