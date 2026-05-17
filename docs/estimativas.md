# Estimativas — Planning Poker (Sequência de Fibonacci)

## 1. Abordagem Utilizada

Substituímos a técnica de T-Shirt Size pela metodologia do **Planning Poker**, utilizando a **Sequência de Fibonacci** (1, 2, 3, 5, 8...) para determinar os *Story Points* de cada tarefa do MVP. 

A estimativa foi realizada de forma colaborativa pelos integrantes (Isabella, Gabriel e Marcus), avaliando três fatores fundamentais: complexidade do código, volume de esforço necessário e incerteza técnica.

## 2. Pontuação dos Itens do MVP (Sprint 2)

* **Issue #06: Cadastro de título (filme/série)**

  * **Pontuação:** **3 Story Points**.
  
  * **Justificativa:** Complexidade moderada. Exige a criação de componentes de formulário no React, o gerenciamento de estados no frontend e a criação dos endpoints de POST correspondentes no Spring Boot com validações básicas de campos.
  * **Incerteza:** Baixa. A equipe dominava o fluxo básico de requisições herdado da Sprint 1.

* **Issue #07: Registro de avaliação (nota de 1 a 5)**

  * **Pontuação:** **3 Story Points**.
  * **Justificativa:** Foco em lógica de negócio. Requer tratamento rigoroso no backend para barrar notas inválidas e renderização condicional de estrelas ou inputs numéricos no frontend em React.

* **Issue #08: Listagem de títulos avaliados**

  * **Pontuação:** **2 Story Points**.
  * **Justificativa:** Esforço mecânico. Exige o mapeamento de um array JSON retornado pelo Spring Boot para componentes visuais do React através de estruturas de repetição (ex: método `.map()`).

* **Issue #09: Exclusão de registro**

  * **Pontuação:** **2 Story Points**.
  * **Justificativa:** Baixa complexidade. Implementação de um botão de ação na listagem do React que dispara uma requisição HTTP DELETE direto para o ID da mídia no banco H2.

## 3. Gerenciamento de Incertezas da Nova Stack

A migração do frontend para **React** introduziu duas incertezas que impactaram nossa velocidade inicial:

1. **Configuração de CORS:** Risco moderado de bloqueio de requisições entre o servidor do React e a API do Spring Boot. Foi resolvido adicionando a anotação `@CrossOrigin` nos controladores do backend.

2. **Ciclo de Vida com useEffect:** Sincronizar a busca de dados da listagem assim que a página carrega sem gerar loops infinitos de requisições. Resolvido com o uso correto das dependências do hook.
