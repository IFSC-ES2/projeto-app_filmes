package com.example.cinelog.repository;

import com.example.cinelog.model.Titulo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TituloRepository extends JpaRepository<Titulo, Long> {

    List<Titulo> findByUsuarioId(Long usuarioId);
}
