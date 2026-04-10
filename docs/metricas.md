**Definição de Métricas — CineLog**

Neste documento, definimos as métricas que serão acompanhadas para garantir a qualidade do produto, a eficiência do processo e a saúde do projeto CineLog 

**Nossa justificativa:** A seleção destas métricas foi feita para a necessidade de estabelecer um controle objetivo sobre o desenvolvimento do MVP do CineLog, garantindo que a entrega agregue valor ao usuário final com o mínimo de falhas.



**1. Métrica de Produto: Densidade de Bugs**

**Nome:** Densidade de Defeitos.

**Classificação:** Produto.

**Objetivo:** Medir a qualidade do código entregue no MVP e identificar a necessidade de reforço em testes.

Definição ou Fórmula:

$$D = \frac{\text{Total de bugs encontrados}}{\text{Total de funcionalidades entregues}}$$.

**Fonte dos dados:** GitHub Issues (etiquetadas como #bug).

**Frequência de atualização:** Semanal (ao final de cada entrega).

**Responsável:** Isabella (Engenheira de Qualidade).

**Forma de interpretação:** Quanto menor o índice, maior a qualidade. Um aumento súbito indica problemas na fase de desenvolvimento ou necessidade de refatoração.



**2. Métrica de Processo: Velocidade da Equipe**

**Nome:** Velocidade da Equipe

**Classificação:** Processo.

**Objetivo:** Medir a capacidade de entrega da equipe por período para melhorar a previsibilidade do planejamento.

**Definição ou Fórmula:**

$$V = \sum \text{Pontos de esforço das Issues concluídas no período}$$.

**Fonte dos dados:** GitHub Project Board e Issues estimadas.

**Frequência de atualização:** Por marco de entrega (baseline vs. realizado).

**Responsável:** Marcus Jhuan Epifânio Lima (Scrum Master).

**Forma de interpretação:** Se o Velocidade estiver muito abaixo do planejado, a capacidade da equipe deve ser revista ou o escopo reduzido.



**3. Métrica de Projeto: Percentual de Conclusão do MVP**

**Nome:** Evolução do MVP.

**Classificação:** Projeto.

**Objetivo:** Acompanhar o progresso físico do projeto em relação ao backlog priorizado para o MVP.

**Definição ou Fórmula:**

$$\% = \left( \frac{\text{Issues concluídas do MVP}}{\text{Total de Issues planejadas para o MVP}} \right) \times 100$$

**Fonte dos dados:** Documento de Baseline e GitHub Issues.

**Frequência de atualização:** Quinzenal.

**Responsável:** Marcus Jhuan Epifânio Lima (Scrum Master).

**Forma de interpretação:** Permite visualizar se a equipe conseguirá entregar o MVP dentro do cronograma do semestre
