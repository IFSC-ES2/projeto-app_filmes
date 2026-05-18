# Relatório da Sprint 2 — CineLog

## 1. Incremento Funcional do MVP

Nesta sprint, nos realizamos a migração da interface estática da Sprint 1 para uma arquitetura baseada em **React**. Conseguimos evoluir o core business do CineLog entregando um incremento real e funcional das seguintes histórias do backlog:

* **Cadastrar Filme/Série (Issue #06):** Tela com formulário em React que captura os dados e envia para persistência no banco H2 do backend.
* **Registro de Avaliação (Issue #07):** Lógica no backend que valida notas de 1 a 5 e rejeita valores inconsistentes enviados pelo frontend.
* **Listagem de Avaliações (Issue #08):** Componente React que consome o endpoint GET do Spring Boot e renderiza dinamicamente a biblioteca do usuário.
* **Exclusão de Títulos (Issue #09):** Ação direta na interface (botão de deletar) que dispara uma rota DELETE para limpar o registro do banco.

## 2. Padrões de Projeto Orientados a Objetos Aplicados

No backend em Spring Boot, aplicamos dois padrões criacionais para garantir as boas práticas exigidas:

* **Builder (`AvaliacaoBuilder`):** Essencial para construir o objeto `Avaliacao` de forma fluída. Como o formulário em React permite ou não enviar comentários opcionais, o Builder evita sobrecarga de construtores na classe Java.
* **Factory Method (`MidiaFactory`):** Centraliza a lógica de criação de mídias baseado na String recebida do React (`"filme"` ou `"serie"`), retornando a instância correta com suas respectivas regras de validação.

## 3. Situação da Integração Contínua

O nosso workflow do GitHub Actions (`ci.yml`) está totalmente operacional e rodando de forma automática a cada Pull Request aberto ou atualizado. 

**Nota de Transparência:** Devido ao esforço concentrado na migração do frontend para React e na resolução de conflitos de CORS, a esteira de CI nesta sprint continuou validando estritamente o ecossistema do backend Java (checkout, JDK 21, build do Gradle, testes automatizados, sintaxe YAML e existência de documentos obrigatórios). A automação de linters e testes do ecossistema Node/React ficou listada como pendência técnica para a Sprint 3.

## 4. Análise de Métricas

Substituímos o método de tamanho de camisetas pelo **Planning Poker com a sequência de Fibonacci**. 

* **Planejado para a Sprint:** 10 Story Points (Cadastro: 3, Avaliação: 3, Listagem: 2, Exclusão: 2).
* **Executado/Entregue:** 10 Story Points.

**Resumo da nossa análise:** Embora tenhamos completado a pontuação planejada, o tempo de desenvolvimento individual de cada tarefa foi maior do que o esperado. O fator que influenciou esse resultado foi o bloqueio inicial de requisições por causa do CORS entre as portas do React e do Spring Boot, exigindo que a equipe gastasse algumas horas de alinhamento técnico para liberar as rotas da API.
