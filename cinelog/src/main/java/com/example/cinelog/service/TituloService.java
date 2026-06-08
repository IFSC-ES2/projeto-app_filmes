package com.example.cinelog.service;

import com.example.cinelog.factory.TituloFactory;
import com.example.cinelog.model.Titulo;
import com.example.cinelog.repository.TituloRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TituloService {

    private final TituloRepository tituloRepository;

    public TituloService(TituloRepository tituloRepository) {
        this.tituloRepository = tituloRepository;
    }

    @Transactional
    public Titulo adicionarTitulo(String nome, String tipoStr, int nota, Long usuarioId) {
        Titulo titulo = TituloFactory.criarTitulo(nome, tipoStr, nota, usuarioId);
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
