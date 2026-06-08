# Registro de Contribuições Individuais

## Objetivo
Registrar de forma objetiva a contribuição de cada integrante da equipe para cadaa Sprint, incluindo implementação, testes, documentação, revisão e organização do trabalho.

## Critérios
- Cada integrante indica o que implementou ou revisou.
- Sempre que possível, as contribuições são associadas a commits, documentos ou evidências de trabalho.
- Este registro serve como evidência de participação individual e coerência entre as atividades realizadas e os papéis assumidos.

## Contribuições da Sprint 1 (Histórico)

### Isabella Corrêa (Scrum Master)
- Documentação de entregas e de planejamento do projeto.
- Atualização do `README.md` para descrever o objetivo do MVP, as entregas já realizadas e o fluxo de documentação.
- Apoio na organização do trabalho e na formalização do processo de entrega.
- Desenvolvimento da camada de modelo e persistência de usuários.
- Criação do repositório `UsuarioRepository` e da entidade `Usuario`.
- Base inicial do backend Spring Boot para autenticação.

### Gabriel Ferreira de Souza da Silva (Arquiteto de Software)
- Revisão e correção de textos no `README.md` e em outros documentos do projeto.
- Ajuste de escrita e consistência nos registros de entrega.
- Contribuição para a preparação da evidência documental da Sprint 1.
- Desenvolvimento do HTML e CSS do projeto.

### Marcus Jhuan Epifânio Lima (DevOps/Infra)
- Implementação do vertical slice de autenticação de usuário.
- Criação do artefato de entrega da Sprint 1: `docs/entrega-sprint1.md`.
- Configuração de CI básico no GitHub Actions para execução automática dos testes.

## Contribuições da Sprint 2 (Entrega Atual)

### Isabella Corrêa (Scrum Master)
- **Organização do Trabalho:** Responsável pela manutenção e acompanhamento do board do projeto, garantindo que as issues estivessem atualizadas com critérios de aceitação objetivos.
- **Revisão e Qualidade:** Realizou a revisão de código e aprovação formal dos Pull Requests de backend seguindo as regras do Definition of Done.
- **Documentação Técnica:** Atualização completa e correção dos artefatos de planejamento (baseline.md, estimativas.md e riscos.md) para adequação ao feedbacks do professore.

### Gabriel Ferreira de Souza da Silva (Arquiteto de Software)
- **Desenvolvimento Core:** Implementação da lógica de negócios para o cadastro de títulos e validação do sistema de notas.
- **Padrões Orientados a Objetos:** Refatoração estrutural da arquitetura do projeto para implementação correta e justificada dos padrões Builder (na classe Avaliacao) e Factory Method (para segregação de regras de filmes/séries).
- **Testes:** Escrita dos testes unitários iniciais para assegurar que notas inválidas inseridas pelo usuário sejam adequadamente tratadas e rejeitadas pelo sistema.

### Marcus Jhuan Epifânio Lima (DevOps/Infra)
- **Infraestrutura de CI:** Configuração do workflow do GitHub Actions (ci.yml) integrando etapas de build do Gradle, verificação sintática de arquivos YAML e checagem de existência dos arquivos obrigatórios no repositório.
- **Desenvolvimento e Rotas:** Implementação dos endpoints REST correspondentes às rotas de listagem geral (GET) e remoção lógica por ID (DELETE) de mídias.
- **Execução Local:** Atualização das diretrizes e comandos documentados no README.md explicando detalhadamente como os testes automatizados devem ser disparados em ambiente de desenvolvimento local.

## Contribuições da Sprint 4 (Entrega 8)

### Isabella Corrêa (Scrum Master)
- Documentação de implantação: criação de `docs/DEPLOY.md` e atualização do `README.md` para refletir a pasta correta `cinelog` e os comandos de execução.
- Validação do ambiente local de homologação e execução com `.\gradlew.bat bootRun`.
- Revisão do workflow de CI e correção da validação de arquivos YAML.
- Evidências: `docs/DEPLOY.md`, `.github/workflows/ci.yml`, `README.md`, `docs/entregas/sprint-4.md`.

### Gabriel Ferreira de Souza da Silva (Arquiteto de Software)
- Correção da documentação técnica e alinhamento do relatório da Sprint 4 com as entregas reais do MVP.
- Participação na definição de critérios de validação local e na justificativa da alternativa de staging reprodutível.
- Apoio na conservação da arquitetura híbrida do frontend estático com React via CDN.
- Evidências: `docs/entregas/sprint-4.md`, `docs/adrs/ADR-0003.md`, `README.md`.

### Marcus Jhuan Epifânio Lima (DevOps/Infra)
- Atualização do workflow de CI para Sprint 4, adicionando a execução em `main` e a validação de documentação obrigatória.
- Ajuste do pipeline para usar o comando `yaml-lint` corretamente.
- Garantia de build e testes automatizados do projeto no backend.
- Evidências: `.github/workflows/ci.yml`, `docs/DEPLOY.md`, `docs/contribuicoes-individuais.md`.
