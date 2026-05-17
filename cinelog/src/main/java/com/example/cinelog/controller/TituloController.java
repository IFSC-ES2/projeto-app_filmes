package com.example.cinelog.controller;

import com.example.cinelog.dto.TituloRequest;
import com.example.cinelog.dto.TituloResponse;
import com.example.cinelog.model.Titulo;
import com.example.cinelog.service.TituloService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/titulos")
public class TituloController {

    private final TituloService tituloService;

    public TituloController(TituloService tituloService) {
        this.tituloService = tituloService;
    }

    @PostMapping
    public ResponseEntity<TituloResponse> adicionar(@Valid @RequestBody TituloRequest request) {
        Titulo titulo = tituloService.adicionarTitulo(
                request.getNome(),
                request.getTipo(),
                request.getNota(),
                request.getUsuarioId()
        );
        return ResponseEntity.status(HttpStatus.CREATED).body(new TituloResponse(titulo));
    }

    @GetMapping
    public ResponseEntity<List<TituloResponse>> listar(@RequestParam Long usuarioId) {
        List<TituloResponse> titulos = tituloService.listarPorUsuario(usuarioId)
                .stream()
                .map(TituloResponse::new)
                .toList();
        return ResponseEntity.ok(titulos);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, String>> excluir(@PathVariable Long id) {
        tituloService.excluirTitulo(id);
        Map<String, String> resposta = new HashMap<>();
        resposta.put("message", "Título removido com sucesso");
        return ResponseEntity.ok(resposta);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Map<String, String>> handleErro(IllegalArgumentException ex) {
        Map<String, String> resposta = new HashMap<>();
        resposta.put("status", "error");
        resposta.put("message", ex.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(resposta);
    }
}
