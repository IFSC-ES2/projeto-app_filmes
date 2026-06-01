package com.example.cinelog.controller;

import com.example.cinelog.dto.LoginRequest;
import com.example.cinelog.dto.MudarSenhaRequest;
import com.example.cinelog.dto.RegistroRequest;
import com.example.cinelog.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final UsuarioService usuarioService;

    public AuthController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping("/register")
    public ResponseEntity<Map<String, String>> register(@Valid @RequestBody RegistroRequest request) {
        var usuario = usuarioService.registrarUsuario(request.getNome(), request.getEmail(), request.getSenha());
        Map<String, String> body = new HashMap<>();
        body.put("status", "success");
        body.put("message", "Usuário cadastrado com sucesso");
        body.put("nome", usuario.getNome());
        return ResponseEntity.ok(body);
    }

    @PostMapping("/login")
    public ResponseEntity<Map<String, String>> login(@Valid @RequestBody LoginRequest request) {
        var usuario = usuarioService.autenticarUsuario(request.getEmail(), request.getSenha());
        Map<String, String> body = new HashMap<>();
        body.put("status", "success");
        body.put("message", "Bem-vindo, " + usuario.getNome() + "!");
        body.put("nome", usuario.getNome());
        body.put("id", String.valueOf(usuario.getId()));
        return ResponseEntity.ok(body);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Map<String, String>> handleIllegalArgument(IllegalArgumentException ex) {
        Map<String, String> body = new HashMap<>();
        body.put("status", "error");
        body.put("message", ex.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(body);
    }

      @PutMapping("/{id}/mudar-senha")
    public ResponseEntity<Map<String, String>> mudarSenha(
            @PathVariable Long id, 
            @Valid @RequestBody MudarSenhaRequest request) {
        
        usuarioService.alterarSenha(id, request.getSenhaAtual(), request.getNovaSenha());
        
        Map<String, String> body = new HashMap<>();
        body.put("status", "success");
        body.put("message", "Senha alterada com sucesso!");
        return ResponseEntity.ok(body);
    }
}
