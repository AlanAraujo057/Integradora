package com.calendario.models;

public class EventoInvitacion {
    private int eventoId;
    private String usuarioMatricula;
    private boolean aceptada;

    public int getEventoId() {
        return eventoId;
    }

    public void setEventoId(int eventoId) {
        this.eventoId = eventoId;
    }

    public String getUsuarioMatricula() {
        return usuarioMatricula;
    }

    public void setUsuarioMatricula(String usuarioMatricula) {
        this.usuarioMatricula = usuarioMatricula;
    }

    public boolean isAceptada() {
        return aceptada;
    }

    public void setAceptada(boolean aceptada) {
        this.aceptada = aceptada;
    }

    public EventoInvitacion(int eventoId, String usuarioMatricula, boolean aceptada) {
        this.eventoId = eventoId;
        this.usuarioMatricula = usuarioMatricula;
        this.aceptada = aceptada;
    }
    // Constructor, getters y setters
}
