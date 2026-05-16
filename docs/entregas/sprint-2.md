# Fechamento da Sprint 2 - CineLog

## 1. Incremento Funcional do MVP
Nesta sprint, saímos da página estática de login da Sprint 1 e evoluímos o CineLog. Implementamos as seguintes funcionalidades centrais diretamente ligadas às nossas issues:

* **Cadastrar Filme/Série (Issue #12):** O usuário agora consegue salvar um título informando nome e tipo, persistindo os dados no banco H2.

* **Avaliação de 1 a 5 (Issue #13):** Implementação da lógica de negócio que valida e atribui notas aos títulos salvos.

* **Listagem e Exclusão (Issue #14 e #15):** Tela para visualização da biblioteca pessoal e rota HTTP DELETE para remover títulos.

## 2. Padrões de Projeto OO Aplicados

Para cumprir as boas práticas de engenharia de software e evitar código macarrônico, aplicamos dois padrões de projeto de forma justificada:

### Padrão 1: Builder (Criacional)

* **Problema identificado:** A classe de entidade `Avaliacao` começou a crescer. Tínhamos campos obrigatórios (título, nota) e opcionais (comentário, tags, data de visualização). Criar múltiplos construtores estava deixando o código confuso.

* **Solução e Classes Afetadas:** Criamos a classe interna `AvaliacaoBuilder`.

* **Benefício/Trade-off:** O código de criação de instâncias nos controladores e nos testes ficou muito mais legível. 

### Padrão 2: Factory Method (Criacional)

* **Problema identificado:** O sistema precisa diferenciar o comportamento e regras de validação ao instanciar um "Filme" ou uma "Série" (ex: Séries exigem contagem de temporadas, Filmes não).

* **Solução e Classes Afetadas:** Criamos a classe `MidiaFactory` com o método `criarMidia(String tipo)`.

* **Benefício/Trade-off:** Centralizamos a lógica de criação de objetos, facilitando caso decidamos adicionar novos tipos (como Documentários) no futuro.

## 3. Atualização de Métricas e Riscos

* **Métrica de Produtividade (Velocity):** Planejamos 18 pontos de story points para esta sprint e conseguimos entregar 14. O desvio aconteceu porque o grupo teve dificuldade inicial para configurar os testes de integração simples integrados ao banco H2.

* **Riscos:** O risco de "Atraso na configuração do CI" foi totalmente mitigado, pois a esteira do GitHub Actions rodou com sucesso em todos os PRs abertos. O risco de "Erros de concorrência no banco H2" foi identificado como novo risco baixo para a próxima etapa.

## 4. Registro de Contribuições Individuais

Seguindo os papéis definidos na governança do time, a divisão de trabalho nesta sprint foi:

* **Isabella Corrêa (Scrum Master):** Organização do board do GitHub, revisão de critérios de aceitação das issues #12 e #13, escrita do relatório da sprint e revisão final dos Pull Requests (#22 e #25).

* **Gabriel Ferreira (Arquiteto):** Refatoração do modelo de dados para suportar os padrões Builder e Factory Method, implementação do endpoint `POST /api/avaliacoes` e criação dos testes (com ajuda do Marcua) de unidade das entidades.

* **Marcus Jhuan (DevOps/Infra):** Configuração final do arquivo `ci.yml` no GitHub Actions (ajuste do linter de YAML e checagem de arquivos obrigatórios), implementação do endpoint `DELETE /api/avaliacoes` e escrita das instruções de execução de testes no README.
