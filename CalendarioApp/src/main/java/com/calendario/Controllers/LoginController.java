package com.calendario.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import com.calendario.services.AuthenticationService;

public class LoginController {
    @FXML private TextField usuarioField;
    @FXML private PasswordField contrasenaField;

    private AuthenticationService authService;

    public void setAuthService(AuthenticationService authService) {
        this.authService = authService;
    }

    @FXML
    private void handleLogin() {
        String matricula = usuarioField.getText();
        String contrasena = contrasenaField.getText();

        // Lógica de autenticación
    }

    @FXML
    private void handleRegistro() {
        // Navegar a la pantalla de registro
    }
}