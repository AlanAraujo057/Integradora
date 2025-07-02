package com.calendario.database.dao;

import com.calendario.models.Usuario;
import java.util.List;

public interface UsuarioDAO {
    Usuario obtenerPorMatricula(String matricula);
    List<Usuario> obtenerTodos();
    boolean agregar(Usuario usuario);
    boolean existeUsuario(String matricula);
}

