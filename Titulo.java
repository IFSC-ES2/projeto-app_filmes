package com.example.cinelog;

import com.example.cinelog.model.Titulo;
import com.example.cinelog.repository.TituloRepository;
import com.example.cinelog.service.TituloService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class TituloServiceTests {

    @Autowired
    private TituloRepository tituloRepository;

    private TituloService tituloService;

    @BeforeEach
    void setUp() {
        tituloService = new TituloService(tituloRepository);
    }

    @Test
    void deveAdicionarFilmeComSucesso() {
        Titulo titulo = tituloService.adicionarTitulo("Interestelar", "FILME", 5, 1L);

        assertNotNull(titulo.getId());
        assertEquals("Interestelar", titulo.getNome());
        assertEquals(5, titulo.getNota());
        assertNotNull(titulo.getDataRegistro());
    }

    @Test
    void deveAdicionarSerieComSucesso() {
        Titulo titulo = tituloService.adicionarTitulo("Breaking Bad", "SERIE", 5, 1L);

        assertEquals("SERIE", titulo.getTipo().name());
    }

    @Test
    void naoDeveAceitarNotaForaDoPadrao() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> tituloService.adicionarTitulo("Filme X", "FILME", 6, 1L));

        assertEquals("A nota deve estar entre 1 e 5", exception.getMessage());
    }

    @Test
    void naoDeveAceitarTipoInvalido() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> tituloService.adicionarTitulo("Documentário Y", "DOCUMENTARIO", 4, 1L));

        assertEquals("Tipo inválido. Use FILME ou SERIE", exception.getMessage());
    }

    @Test
    void deveListarTitulosPorUsuario() {
        tituloService.adicionarTitulo("Oppenheimer", "FILME", 5, 10L);
        tituloService.adicionarTitulo("The Bear", "SERIE", 4, 10L);
        tituloService.adicionarTitulo("Duna", "FILME", 4, 99L); // outro usuario

        List<Titulo> lista = tituloService.listarPorUsuario(10L);

        assertEquals(2, lista.size());
    }

    @Test
    void deveExcluirTitulo() {
        Titulo titulo = tituloService.adicionarTitulo("Parasita", "FILME", 5, 1L);
        Long id = titulo.getId();

        tituloService.excluirTitulo(id);

        List<Titulo> lista = tituloService.listarPorUsuario(1L);
        assertTrue(lista.isEmpty());
    }

    @Test
    void naoDeveExcluirTituloInexistente() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> tituloService.excluirTitulo(999L));

        assertEquals("Título não encontrado", exception.getMessage());
    }
}
