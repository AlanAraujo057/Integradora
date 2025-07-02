package com.calendario.services;

import com.calendario.models.Evento;
import com.calendario.models.EventoInvitacion;
import java.time.LocalDate;
import java.util.List;

public interface EventoService {
    Evento crearEvento(Evento evento);
    boolean eliminarEvento(int eventoId, String matricula);
    List<Evento> obtenerEventosPorUsuario(String matricula);
    List<Evento> obtenerEventosPorFecha(LocalDate fecha, String matricula);
    boolean responderInvitacion(int eventoId, String matricula, boolean aceptar);
    List<EventoInvitacion> obtenerInvitaciones(String matricula);
}