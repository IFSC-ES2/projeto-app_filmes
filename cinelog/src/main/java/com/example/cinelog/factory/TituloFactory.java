package com.example.cinelog.factory;

import com.example.cinelog.model.Titulo;
import com.example.cinelog.model.TipoTitulo;

public final class TituloFactory {

    private TituloFactory() {
    }

    public static Titulo criarTitulo(String nome, String tipoStr, int nota, Long usuarioId) {
        if (nota < 1 || nota > 5) {
            throw new IllegalArgumentException("A nota deve estar entre 1 e 5");
        }

        TipoTitulo tipo;
        try {
            tipo = TipoTitulo.valueOf(tipoStr.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Tipo inválido. Use FILME ou SERIE");
        }

        return new Titulo(nome, tipo, nota, usuarioId);
    }
}
