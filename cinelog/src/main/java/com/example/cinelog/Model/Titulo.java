package com.example.cinelog.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "titulos")
public class Titulo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoTitulo tipo;

    // nota vai de 1 a 5
    @Column(nullable = false)
    private int nota;

    private LocalDate dataRegistro;

    // referência ao usuário dono do registro
    @Column(nullable = false)
    private Long usuarioId;

    public Titulo() {
    }

    public Titulo(String nome, TipoTitulo tipo, int nota, Long usuarioId) {
        this.nome = nome;
        this.tipo = tipo;
        this.nota = nota;
        this.usuarioId = usuarioId;
        this.dataRegistro = LocalDate.now();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoTitulo getTipo() {
        return tipo;
    }

    public void setTipo(TipoTitulo tipo) {
        this.tipo = tipo;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }
}
