package com.example.cinelog.service;

import com.example.cinelog.model.Titulo;
import com.example.cinelog.model.TipoTitulo;
import com.example.cinelog.repository.TituloRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
public class TituloService {

    private final TituloRepository tituloRepository;

    public TituloService(TituloRepository tituloRepository) {
        this.tituloRepository = tituloRepository;
    }

    @Transactional
    public Titulo adicionarTitulo(String nome, String tipoStr, int nota, Long usuarioId) {
        if (nota < 1 || nota > 5) {
            throw new IllegalArgumentException("A nota deve estar entre 1 e 5");
        }

        TipoTitulo tipo;
        try {
            tipo = TipoTitulo.valueOf(tipoStr.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Tipo inválido. Use FILME ou SERIE");
        }

        Titulo titulo = new Titulo(nome, tipo, nota, usuarioId);
        titulo.setDataRegistro(LocalDate.now());
        return tituloRepository.save(titulo);
    }

    public List<Titulo> listarPorUsuario(Long usuarioId) {
        return tituloRepository.findByUsuarioId(usuarioId);
    }

    @Transactional
    public void excluirTitulo(Long id) {
        if (!tituloRepository.existsById(id)) {
            throw new IllegalArgumentException("Título não encontrado");
        }
        tituloRepository.deleteById(id);
    }
}
