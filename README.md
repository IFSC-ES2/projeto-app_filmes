## CineLog - Biblioteca Digital de Avaliações

**1. Equipe**

- Isabella Corrêa - DevOps/Infra

- Gabriel Ferreira de Souza da Silva - Arquiteto de Software

- Marcus Jhuan Epifânio Lima - Scrum Master

**2. O Projeto**

**2.1 Problema**

- Cinéfilos não possuem uma ferramenta simples e centralizada para registrar filmes e séries assistidos, atribuir avaliações pessoais e manter uma biblioteca digital organizada. Serviços existentes (Letterboxd, IMDb) são complexos ou voltados para consumo de conteúdo, não para o registro pessoal.

**2.2 Proposta de Valor**

- O CineLog é uma aplicação web que funciona como uma biblioteca digital pessoal de avaliações. O usuário registra filmes e séries assistidos, atribui sua nota e mantém um histórico organizado — simples, pessoal e focado.

**2.3 Público-Alvo**

- Cinéfilos amadores e entusiastas que desejam organizar seu consumo audiovisual de forma prática, sem depender de redes sociais ou plataformas de streaming.

**3. MVP**

**3.1 Objetivo do MVP**

- Validar a proposta: um usuário consegue registrar um filme/série assistido, atribuir uma avaliação, escolher favoritos e visualizar sua biblioteca pessoal.

**3.2 Funcionalidades Incluídas**

- Cadastro de título (filme ou série).

- Registro da avaliação (nota de 1 a 5).

- Listagem de todos os títulos avaliados.

- Exclusão de um registro.

**3.3 Funcionalidades Não Incluídas**

- Sistema de categorização.

- Sistema de tags.

**4. Documentação das Entregas**

 **Entrega 3 - Planejamento e Baseline (09/04/2026)**

* **[Planejamento Inicial e Baseline](docs/baseline.md)**: Recorte do backlog, priorização e capacidade da equipe.

* **[Registro de Estimativas](docs/estimativas.md)**: Detalhamento da técnica utilizada e hipóteses assumidas.

* **[Definição de Métricas](docs/metricas.md)**: Fichas técnicas das métricas de produto, processo e projeto.

 **Entrega 4 - Riscos e Consolidação (16/04/2026)**
Esta etapa foca na segurança do projeto, na formalização do fluxo de trabalho colaborativo e na definição de critérios de qualidade.

* **[Registro e Análise de Riscos](docs/riscos.md)**: Identificação de 5 riscos críticos, matriz de prioridade (Probabilidade x Impacto) e plano de resposta (ações preventivas e reativas).

* **[Fluxo de Trabalho](docs/fluxo-de-trabalho.md)**: Documentação da estratégia de *branching*, política de Pull Requests e regras de aprovação de código.

* **[Critérios Iniciais de Qualidade](docs/qualidade.md)**: Seleção de 4 atributos baseados na norma **ISO/IEC 25010**, justificativa de relevância para o MVP e relação direta com os riscos identificados.

 **Entrega 5 - Sprint 1 (04/05/2026)**
 Esta etapa foca na entrega do primeiro incremento funcional (vertical slice), na atualização de documentações e release/tag do marco.
 - Entrega atual: vertical slice de autenticação de usuário com registro, login, persistência H2, página de entrada estática e testes automatizados.
 - Mais detalhes da entrega estão em [docs/entrega-sprint1.md](docs/entrega-sprint1.md).
 - Registro de participação individual está em [docs/contribuicoes-individuais.md](docs/contribuicoes-individuais.md).
 - Backlog de issues planejado está em [docs/backlog-issues.md](docs/backlog-issues.md).

## Como executar

- Abra o terminal na pasta `cinelog`.
- Rode `./gradlew.bat bootRun` para iniciar a aplicação.
- Abra o navegador em `http://localhost:8080/login.html`.
- O frontend de login/registro usa os endpoints `POST /api/auth/register` e `POST /api/auth/login`.
- Para rodar os testes automatizados, execute `./gradlew.bat test`.