# Backlog de Issues — CineLog

Este documento detalha o estado das issues do projeto, cobrindo o histórico da Sprint 1 e as entregas centrais finalizadas na Sprint 2.

## Issues Concluídas na Sprint 2 (Core do MVP)

### Issue #06: Cadastro de título (filme/série)

* **Descrição:** Criar funcionalidade e rotas no backend para que o usuário consiga registrar um título assistido em sua biblioteca digital.

* **Prioridade Relativa:** **Alta** (Item fundamental da proposta de valor do MVP).

* **Critérios de Aceitação:**
  * O sistema deve permitir o cadastro informando nome do título e o tipo (filme ou série).
  * Os dados inseridos devem ser persistidos corretamente no banco H2.
  
* **Status:** Concluído.
* **Evidências no Repositório:** `MidiaController.java`, `MidiaService.java`, classe factory de criação de mídias.

### Issue #07: Registro de avaliação por nota

* **Descrição:** Permitir que o usuário adicione uma nota de avaliação de 1 a 5 para um filme ou série cadastrado.

* **Prioridade Relativa:** **Alta** (Core business do sistema de notas).
* **Critérios de Aceitação:**
  * A nota deve estar vinculada de forma íntegra ao ID do título.
  * Lógicas de validação devem rejeitar notas que estejam fora do intervalo numérico de 1 a 5.
  
* **Status:** Concluído.
* **Evidências no Repositório:** Validador na classe `Avaliacao` e implementação do padrão Builder.

### Issue #08: Listagem de títulos avaliados

* **Descrição:** Exibir em tela ou retornar via endpoint todos os títulos registrados na biblioteca pessoal com suas respectivas notas de avaliação.

* **Prioridade Relativa:** **Média** (Depende do cadastro para fazer sentido).
* **Critérios de Aceitação:**
  * Retornar os dados estruturados com nome do título, nota atribuída e tipo de mídia.
  
* **Status:** Concluído.
* **Evidências no Repositório:** Rota `GET /api/avaliacoes`.

### Issue #09: Exclusão de registro da biblioteca

* **Descrição:** Permitir que o usuário delete permanentemente um registro de filme ou série da sua listagem pessoal.

* **Prioridade Relativa:** **Média**.

* **Critérios de Aceitação:**
  * O usuário pode disparar a remoção de um registro por ID através da interface.
  * A exclusão de uma mídia não pode comprometer a integridade dos demais dados salvos no banco H2.
  
* **Status:** Concluído.
* **Evidências no Repositório:** Rota `DELETE /api/avaliacoes/{id}`.
