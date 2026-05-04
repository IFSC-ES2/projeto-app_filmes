package com.example.cinelog;

import com.example.cinelog.model.Usuario;
import com.example.cinelog.repository.UsuarioRepository;
import com.example.cinelog.service.UsuarioService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class UsuarioServiceTests {

    @Autowired
    private UsuarioRepository usuarioRepository;

    private UsuarioService usuarioService;

    @BeforeEach
    void setUp() {
        usuarioService = new UsuarioService(usuarioRepository);
    }

    @Test
    void deveRegistrarUsuarioComSucesso() {
        Usuario usuario = usuarioService.registrarUsuario("Ana", "ana@example.com", "segredo1");

        assertNotNull(usuario.getId());
        assertEquals("Ana", usuario.getNome());
        assertEquals("ana@example.com", usuario.getEmail());
    }

    @Test
    void naoDeveRegistrarEmailDuplicado() {
        usuarioService.registrarUsuario("Ana", "ana@example.com", "segredo1");

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> usuarioService.registrarUsuario("Ana2", "ana@example.com", "segredo2"));

        assertEquals("E-mail já cadastrado", exception.getMessage());
    }

    @Test
    void deveAutenticarUsuarioExistente() {
        usuarioService.registrarUsuario("Ana", "ana@example.com", "segredo1");

        Usuario autenticado = usuarioService.autenticarUsuario("ana@example.com", "segredo1");

        assertEquals("Ana", autenticado.getNome());
    }

    @Test
    void naoDeveAutenticarComSenhaIncorreta() {
        usuarioService.registrarUsuario("Ana", "ana@example.com", "segredo1");

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> usuarioService.autenticarUsuario("ana@example.com", "errada"));

        assertEquals("E-mail ou senha inválidos", exception.getMessage());
    }
}
