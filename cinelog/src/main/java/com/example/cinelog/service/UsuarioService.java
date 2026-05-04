package com.example.cinelog.service;

import com.example.cinelog.model.Usuario;
import com.example.cinelog.repository.UsuarioRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Transactional
    public Usuario registrarUsuario(String nome, String email, String senha) {
        if (usuarioRepository.findByEmail(email).isPresent()) {
            throw new IllegalArgumentException("E-mail já cadastrado");
        }
        Usuario usuario = new Usuario(nome, email, senha);
        return usuarioRepository.save(usuario);
    }

    public Usuario autenticarUsuario(String email, String senha) {
        return usuarioRepository.findByEmail(email)
                .filter(usuario -> usuario.getSenha().equals(senha))
                .orElseThrow(() -> new IllegalArgumentException("E-mail ou senha inválidos"));
    }
}
