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

## 5. Ambiente de Publicação e Homologação 

O incremento da Sprint 3 foi implantado e validado em um **Ambiente de Homologação Local Unificado**.

* **Justificativa de Infraestrutura:** Como o CineLog utiliza o banco de dados H2 operando estritamente em memória (`in-memory`), a persistência é volatilizada a cada reinicialização do processo. Por este motivo técnico, a equipe optou por centralizar a homologação no ambiente local do servidor embutido do Spring Boot (porta `8080`), onde os artefatos do frontend e backend rodam acoplados.

* **Processo de Homologação:** A Scrum Master (Isabella) e o Arquiteto (Gabriel) realizaram uma sessão de BVT (*Build Verification Testing*) simulando múltiplos cadastros de títulos e fluxos de alteração de senha para garantir que o estado do `localStorage` não sofria vazamento de escopo entre sessões de usuários diferentes.

## 6. Garantia do Definition of Done (DoD)

A conformidade com o *Definition of Done* da equipe foi auditada através das seguintes evidências:

1. **Mecanismo de Revisão por Pares (Peer Review):** Nenhuma issue de código (como a #01 e a #16) foi integrada à branch principal (`main`) sem a abertura de um Pull Request formal e a revisão obrigatória de outro integrante da equipe, validando critérios de clean code e tratamento de exceções.

2. **Validação de Restrições de Dados:** O Arquiteto de Software garantiu que o payload do frontend respeitasse rigidamente as anotações `@NotNull` e `@Size` do Spring Boot, prevenindo falhas de injeção de dados inválidos no banco de dados.

## 7. Indicação de Entrega de Valor

O estado estável e funcional do MVP ao término desta etapa foi documentado e versionado diretamente no sistema de controle de versão.

* **Link Oficial da Release v0.3.0 (Sprint 3):** https://github.com/IFSC-ES2/projeto-app_filmes/tree/Entrega-7-(sprint-3) 