# Registro de Contribuições Individuais

## Objetivo
Registrar de forma objetiva a contribuição de cada integrante da equipe para cada Sprint, incluindo implementação, testes, documentação, revisão e organização do trabalho.

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
- Documentação de implantação: criação de `docs/DEPLOY.md` e atualização do `README.md` para refletir a pasta correta `cinelog`, os comandos de execução corretos e a validação do ambiente local.
- Valida��o do ambiente local de homologa��o com `.\gradlew.bat bootRun` e testes de acesso a `http://localhost:8080/index.html` e `http://localhost:8080/catalogo.html`.
- Revisão do workflow de CI e correção da validação de arquivos YAML para garantir checklist de qualidade automatizada.
- Evidências: `docs/DEPLOY.md`, `.github/workflows/ci.yml`, `README.md`, `docs/entregas/sprint-4.md`.

### Gabriel Ferreira de Souza da Silva (Arquiteto de Software)
- Correção da documentação técnica e alinhamento do relatório da Sprint 4 com as entregas reais do MVP.
- Definição e documentação da arquitetura híbrida do projeto: backend Spring Boot servindo frontend estático, com login em React via CDN e catálogo em JavaScript puro.
- Criação do ADR `docs/adrs/ADR-0003.md` para justificar a homologação local reprodutível e o estágio de deploy alternativo.
- Evidências: `docs/entregas/sprint-4.md`, `docs/adrs/ADR-0003.md`, `README.md`.

### Marcus Jhuan Epifânio Lima (DevOps/Infra)
- Atualização do workflow de CI para Sprint 4, adicionando execução automática em `main` e validação de artefatos obrigatórios.
- Ajuste do pipeline para usar `yaml-lint` corretamente e manter o processo de build/testes do Gradle estável em `cinelog`.
- Sincronização das correções de código no clone do Marcus, incluindo a validação do build do backend e a organização dos pacotes Java de modelo e repositório.
- Registro das métricas da Sprint 4 e atualização do documento de contribuições individuais.
- Evidências: `.github/workflows/ci.yml`, `docs/metricas.md`, `docs/contribuicoes-individuais.md`.
