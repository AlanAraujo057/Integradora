package com.calendario.database.dao;

import com.calendario.models.Evento;
import com.calendario.models.EventoInvitacion;
import java.time.LocalDate;
import java.util.List;

public interface EventoDAO {
    Evento obtenerPorId(int id);
    List<Evento> obtenerPorUsuario(String matricula);
    List<Evento> obtenerPorFecha(LocalDate fecha, String matricula);
    int crear(Evento evento);
    boolean eliminar(int id, String matricula);
    List<EventoInvitacion> obtenerInvitaciones(String matricula);
    boolean responderInvitacion(int eventoId, String matricula, boolean aceptar);
}
