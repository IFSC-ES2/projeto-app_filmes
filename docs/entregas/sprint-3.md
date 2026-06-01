# Relatório da Sprint 3 — CineLog

## 1. Incremento Funcional do MVP

Nesta Sprint 3, a equipa focou na segurança da aplicação, na experiência de utilizador (UX) e na integridade dos dados, resolvendo o desacoplamento que existia entre os ecrãs da aplicação. Conseguimos entregar as seguintes histórias do backlog:

* **Integração e Vínculo de Utilizador no Catálogo (Issue #01):** Correção do fluxo crítico de autenticação. Agora, o `usuarioId` e o `usuarioNome` gerados no ecrã de Login (React) são persistidos no `localStorage` e recuperados dinamicamente na página do catálogo. Isto garante que cada filme ou série cadastrado seja rigidamente atrelado ao ID do utilizador ativo, corrigindo a falha de persistência anterior.

* **Alteração de Senha Segura (Issue #16):** Implementação de uma funcionalidade de segurança. Foi adicionada uma nova secção no painel do catálogo que permite ao utilizador redefinir a sua senha. O processo faz uma validação no backend Spring Boot, que verifica se a "senha atual" confere com a base de dados antes de persistir a nova senha (mínimo de 6 caracteres).

## 2. Arquitetura e Segurança Aplicada

Para suportar estas alterações, aplicámos melhorias estruturais no ecossistema da aplicação:

* **Segurança Baseada em Estado:** Implementação de guarda de rotas simples no frontend (`catalogo.html`), que expulsa utilizadores não autenticados de volta para a página de index caso tentem forçar o acesso sem um token/ID válido no `localStorage`.
  
* **Tratamento de Exceções customizado:** O endpoint `PUT /api/auth/{id}/mudar-senha` devolve mensagens claras de erro de negócio (ex: "Senha atual incorreta" ou "Formato inválido"), capturadas pelo `@ExceptionHandler` no Spring Boot e exibidas de forma reativa na interface.

## 3. Situação da Integração Contínua

O nosso workflow do GitHub Actions continua a validar a build do projeto de forma automática a cada Pull Request. Para esta sprint, garantimos que todas as validações de restrições de integridade do Spring Boot (anotações `@NotBlank`, `@Size`) estão cobertas e a passar com sucesso na esteira automatizada.

## 4. Análise de Métricas

Continuámos a utilizar o método de estimativa **Planning Poker com a sequência de Fibonacci** para manter a precisão das entregas.

* **Pontuação das tarefas desta entrega (Suas tarefas):**
  * **Issue #01 (Ajuste de Vínculo):** 2 Story Points (Complexidade baixa, mas exigiu alinhamento de arquitetura de dados entre React e Vanilla JS).
  * **Issue #16 (Mudar Senha):** 5 Story Points (Complexidade média/alta por ser uma funcionalidade Full-Stack com lógica de validação de dados em base de dados).

**Análise técnica da Sprint:** O principal desafio desta sprint foi gerir o estado da sessão do utilizador entre tecnologias diferentes (o Login em React CDN e o Catálogo em Vanilla JS). A utilização de armazenamento local (`localStorage`) provou ser uma solução para contornar o problema sem a necessidade de introduzir bibliotecas pesadas de gerência de estado nesta fase do MVP.
