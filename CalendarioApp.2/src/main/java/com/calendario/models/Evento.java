package com.calendario.models;

import java.time.LocalDateTime;
import java.util.List;

public class Evento {
    private int id;
    private String titulo;
    private LocalDateTime fechaHora;
    private String descripcion;
    private String color;
    private String creadorMatricula;
    private List<String> participantes;

    // Constructor, getters y setters

    public Evento(int id, String titulo, LocalDateTime fechaHora, String descripcion, String color, String creadorMatricula, List<String> participantes) {
        this.id = id;
        this.titulo = titulo;
        this.fechaHora = fechaHora;
        this.descripcion = descripcion;
        this.color = color;
        this.creadorMatricula = creadorMatricula;
        this.participantes = participantes;
    }

    public List<String> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List<String> participantes) {
        this.participantes = participantes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCreadorMatricula() {
        return creadorMatricula;
    }

    public void setCreadorMatricula(String creadorMatricula) {
        this.creadorMatricula = creadorMatricula;
    }
}