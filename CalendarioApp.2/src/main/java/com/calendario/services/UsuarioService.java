package com.calendario.services;

import com.calendario.models.Usuario;
import java.util.List;

public interface UsuarioService {
    List<Usuario> obtenerTodosUsuarios();
    boolean agregarUsuario(Usuario usuario);
    Usuario obtenerUsuarioPorMatricula(String matricula);
}