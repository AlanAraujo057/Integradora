package com.calendario.services;


import com.calendario.models.Usuario;

public interface AuthenticationService {
    Usuario login(String matricula, String contrasena);
    boolean registrar(Usuario usuario);
}