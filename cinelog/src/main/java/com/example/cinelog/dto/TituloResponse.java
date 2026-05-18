package com.example.cinelog.dto;

import com.example.cinelog.model.Titulo;

import java.time.LocalDate;

public class TituloResponse {

    private Long id;
    private String nome;
    private String tipo;
    private int nota;
    private LocalDate dataRegistro;

    public TituloResponse(Titulo titulo) {
        this.id = titulo.getId();
        this.nome = titulo.getNome();
        this.tipo = titulo.getTipo().name();
        this.nota = titulo.getNota();
        this.dataRegistro = titulo.getDataRegistro();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNota() {
        return nota;
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }
}
