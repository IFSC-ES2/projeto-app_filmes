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

**Responsável:** Isabella (Scrum Master).

**Forma de interpretação:** Quanto menor o índice, maior a qualidade. Um aumento súbito indica problemas na fase de desenvolvimento ou necessidade de refatoração.

**Análise Sprint 2:** Atualmente o foco da equipe se encontra mais focada no desenvolvimento do código e seu MVP dévido á sua velocidade baixa desplanejada, a criação dos testes é existente, porém, secundaria.

**Análise Sprint 3:** O foco da equipe se mantém no desenvolvimento do código e seu MVP, a criação de testes é sim existente, porém é novamente, secundaria.


**2. Métrica de Processo: Velocidade da Equipe**

**Nome:** Velocidade da Equipe

**Classificação:** Processo.

**Objetivo:** Medir a capacidade de entrega da equipe por período para melhorar a previsibilidade do planejamento.

**Definição ou Fórmula:**

$$V = \sum \text{Pontos de esforço das Issues concluídas no período}$$.

**Fonte dos dados:** GitHub Project Board e Issues estimadas.

**Frequência de atualização:** Por marco de entrega (baseline vs. realizado).

**Responsável:** Marcus Jhuan Epifânio Lima (Engenheiro de Qualidade).

**Forma de interpretação:** Se o Velocidade estiver muito abaixo do planejado, a capacidade da equipe deve ser revista ou o escopo reduzido.

**Análise Sprint 2:** A equipe se encontra com a velocidade abaixa da analisada dévido á fatores fora do controle da mesma, como um dos computadores dos membros acabar tendo morrido, o escopo portanto foi reduzido.

**Análise Sprint 3:** A equipe se encontra com a velocidade mais abaixa do que quanto á da Sprint 2, dévido á fatores fora do controle, como dois membros da equipe trabalharem além de estudar e também os membros se encontrarem com mais trabalhos além desse próprio.


**3. Métrica de Projeto: Percentual de Conclusão do MVP**

**Nome:** Evolução do MVP.

**Classificação:** Projeto.

**Objetivo:** Acompanhar o progresso físico do projeto em relação ao backlog priorizado para o MVP.

**Definição ou Fórmula:**

$$PC_{MVP} = \left( \frac{\text{Quantidade de Issues do MVP concluídas}}{\text{Total de Issues planejadas para o MVP}} \right) \times 100$$

**Fonte dos dados:** Documento de Baseline e GitHub Issues.

**Frequência de atualização:** Quinzenal.

**Responsável:** Marcus Jhuan Epifânio Lima (Engenheiro de Qualidade).

**Forma de interpretação:** Permite visualizar se a equipe conseguirá entregar o MVP dentro do cronograma do semestre.

## 4. Análise de Métricas

Substituímos o método de tamanho de camisetas pelo **Planning Poker com a sequência de Fibonacci**.

### Sprint 3
* **Planejado:** 15 Story Points (Cadastro/Vínculo: 3, Avaliação: 3, Listagem: 2, Exclusão: 2, Mudar Senha: 5).
* **Executado:** 15 Story Points.
* **Observação:** A equipe completou a pontuação planejada, apesar de ter enfrentado desafios na integração do estado de login entre React via CDN e o catálogo em JavaScript puro.

### Sprint 4
* **Planejado:** 12 Story Points (Estabilização do pipeline, documentação de deploy, validação local e atualização de evidências).
* **Executado:** 12 Story Points.

### Comparação antes/depois
* **Velocidade da equipe:** manteve-se estável entre Sprint 3 e Sprint 4, mostrando que o escopo de estabilização foi bem dimensionado.
* **Densidade de defeitos:** apresentou redução após a atualização do pipeline e a documentação de deploy, refletindo maior confiança na entrega.
* **Percentual de conclusão do MVP:** avançou na Sprint 4 com a consolidação de processos de entrega e validação.

### Análise histórica
* **Sprint 2:** o time teve atraso relativo por causa de bloqueios de integração e domínio técnico da ferramenta, mas manteve o MVP em desenvolvimento.
* **Sprint 3:** o foco foi corrigir as vulnerabilidades de vínculo de usuário e de mudança de senha, o que consumiu energia técnica significativa.
* **Sprint 4:** o foco foi tornar o MVP reprodutível e documentado, reduzindo o risco de falhas de entrega em ambiente de homologação.
