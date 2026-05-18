# Registro de Riscos — CineLog

## 1. Identificação dos Riscos

### R01: Crescimento descontrolado do escopo

* **Descrição:** Inclusão de pequenas funcionalidades não planejadas que acumulam e atrasam o desenvolvimento das histórias de usuário centrais do MVP.

* **Causa:** Mudanças frequentes de ideias ou falta de apego ao planejamento do MVP.

* **Consequência:** Atraso na entrega das funcionalidades principais da sprint.

* **Probabilidade:** Baixa
  - **Impacto:** Alto 
  
  - **Prioridade:** Média.

* **Plano de Resposta:**

  * *Ação para prever:* Bloquear qualquer nova feature que não esteja listada nas funcionalidades do MVP (Cadastro, Nota, Listagem e Exclusão).
  * *Ação Reativa:* Caso uma tarefa atrase por excesso de escopo, congelar a feature secundária e focar exclusivamente no funcionamento do CRUD básico.
  
* **Responsável:** Isabella Corrêa (Scrum Master).

### R02: Conflito de agenda e indisponibilidade da equipe

* **Descrição:** A equipe sofrer atrasos nas entregas devido a demandas de trabalho externo e outras disciplinas da faculdade.

* **Causa:** Projetos externos, emprego e rotina fora do IFSC.

* **Consequência:** Atraso na entrega da Sprint dentro do prazo regulamentar.

* **Probabilidade:** Média 

  - **Impacto:** Alto
  
  - **Prioridade:** Alta.

* **Justificativa da Prioridade:** O impacto foi elevado para Alto porque a perda de um prazo de sprint compromete diretamente a nota parcial e a aprovação no semestre.

* **Plano de Resposta:**

  * *Ação para prever:* Quebrar as issues em tarefas muito pequenas para que possam ser feitas em blocos de 30 minutos ao longo da semana.
  * *Ação Reativa:* Adotar programação em dupla assim que um integrante sinalizar que está sem tempo.
  
* **Responsável:** Isabella Corrêa.

### R03: Saída inesperada de membros da equipe

* **Descrição:** Desistência da disciplina ou desligamento de um dos integrantes do grupo.

* **Causa:** Fatores pessoais ou acadêmicos externos ao projeto.

* **Consequência:** Sobrecarga de trabalho nos integrantes remanescentes e atraso no cronograma.

* **Probabilidade:** Baixa 

  - **Impacto:** Alto.
  
  - **Prioridade:** Média.
  
* **Plano de Resposta:**
  * *Ação para prever:* Manter a documentação técnica atualizada e código bem comentado para que qualquer um consiga assumir a tarefa do outro.
  * *Ação Reativa:* Redistribuição imediata das tarefas essenciais do MVP entre os dois membros restantes.
  
* **Responsável:** Isabella Corrêa.

### R04: Problemas de persistência com o banco de dados H2

* **Descrição:** Erros de configuração ou perda de dados em memória no banco H2 durante a integração com o Spring Boot.

* **Causa:** Falta de familiaridade com o ciclo de vida do banco H2 em memória durante os testes automatizados.

* **Consequência:** Falha na build do CI e impossibilidade de testar a listagem e o cadastro de filmes.

* **Probabilidade:** Média
  - **Impacto:** Alto
  - **Prioridade:** Alta.

* **Plano de Resposta:**
  * *Ação para prever:* Utilizar a configuração padrão do Spring Data JPA e testar o isolamento das tabelas localmente antes de subir o código.
  * *Ação Reativa:* Usar scripts `schema.sql` e `data.sql` simples para resetar e forçar o estado correto do banco a cada execução de teste.
  
* **Responsável:** Gabriel Ferreira.

### R05: Baixa cobertura ou falha nos testes automatizados

* **Descrição:** Dificuldade em criar testes de integração simples que passem na esteira de CI do GitHub Actions.

* **Causa:** Pouca experiência prática com a escrita de asserções de teste automatizados no Spring Boot.

* **Consequência:** Reprovação nos critérios obrigatórios da entrega e quebra do pipeline de CI.

* **Probabilidade:** Média

  - **Impacto:** Alto
  - **Prioridade:** Alta.

* **Plano de Resposta:**
  * *Ação para prever* Criar uma estrutura base de teste funcional logo no início da sprint para servir de modelo para o restante do time.
  * *Ação Reativa:* Realizar sessões de alinhamento técnico síncronas para resolver problemas de configuração de teste em conjunto.
  
* **Responsável:** Marcus Jhuan.

---

## 2. Matriz de Priorização

A prioridade é definida pelo cruzamento da Probabilidade com o Impacto, conforme a tabela abaixo:

| Probabilidade \ Impacto | Baixo | Médio | Alto |
| :--- | :--- | :--- | :--- |
| **Baixa** | Prioridade Baixa | Prioridade Baixa | Prioridade Média |
| **Média** | Prioridade Baixa | Prioridade Média | **Prioridade Alta** |
| **Alta** | Prioridade Média | **Prioridade Alta** | **Prioridade Crítica** |

---

## 3. Acompanhamento dos Riscos (Fechamento da Sprint 2)

### 3.A Riscos Ativos

* **R01 (Escopo):** Continua ativo, mas controlado pelo rigor no foco do MVP.

* **R02 (Agenda):** Permanece ativo devido às rotinas de trabalho dos integrantes.

### 3.B Riscos Mitigados

* **R03 (Saída de Membros):** Mitigado. A equipe se consolidou e dividiu bem as frentes de trabalho para a Sprint 2.

### 3.C Riscos Concretizados

* **R02 (Conflito de Agenda):** Concretizou-se parcialmente no início da sprint, gerando atraso nas primeiras tarefas de backend. A estratégia de divisão em pares evitou que o projeto ficasse travado.

* **R05 (Falha nos Testes):** Concretizou-se. Tivemos problemas para fazer os testes rodarem de forma limpa no GitHub Actions por falta de configuração correta do ambiente de teste, o que demandou esforço focado de infraestrutura.

### 3.D Novos Riscos Identificados

* Não foram mapeados novos riscos nesta sprint; o foco total se manteve na estabilização dos riscos técnicos de persistência e foco para atualizar o projeto com base nos feedbacks que o professor fez na avaliacao.

### 3.E Ações de Mitigação Planejadas para a Próxima Sprint

* **Foco no R02:** Estabelecer commits menores e mais frequentes para evitar o acúmulo de revisões de Pull Request na véspera da entrega.

* **Foco no R04:** Deixar o banco de dados H2 configurado para salvar em arquivo local de desenvolvimento para facilitar a depuração visual do frontend.
