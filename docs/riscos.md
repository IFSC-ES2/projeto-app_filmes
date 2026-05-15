## Riscos de Escopo #01

• **Identificação do risco:** O escopo do projéto pode atrasar, devido á adição continua de pequenas funcionalidades.

• **Descrição:** A adição de pequenas funcionalidades pode acumular descontroladamente, podendo afetar o avanço das Historias de Usuários.

• **Causa:** Mudanças frequentes de Requisitos.

• **Consequência:** Atraso na entrega e Estouro no Orçamento.

• **Probabilidade:** Baixa. 

• **Impacto:** Alto.

• **Prioridade:** Média.

• **Estratégia de mitigação:** Foco nas Historias de Usuários e após elas o adicionamento de pequenas funcionalidades.

• **Responsável pelo acompanhamento:** Marcus Jhuan (Scrum Master)

## Riscos de Prazo #02

• **Identificação do risco:** O cronograma que estipulamos pode atrasar, devido aos trabalhos externos.

• **Descrição:** A equipe pode sofrer atrasos ao decorrer o projeto, porque as tarefas e a organização do dia a dia podem afetar a a entrega.

• **Causa:** Projetos externos e trabalho.

• **Consequência:** Atraso na entrega.

• **Probabilidade:** Média.

• **Impacto:** Médio.

• **Prioridade:** Alta.

• **Estratégia de mitigação:** Organizar devidamente a tarefa de cada um e os trabalhos externos para que não venha ocorrer atrasos.

• **Responsável pelo acompanhamento:** Marcus Jhuan.

## Riscos da Equipe #03

• **Identificação do risco:** Saída inesperada de um membro da equipe, podem levar á atrasos inesperados.

• **Descrição:** Algum membro da equipe acabar derrepente e inesperadamente sair do grupo, causando trabalho extra para repor oque séria feito pelo mesmo e transferir as responsabilidades do mesmo para outros membros

• **Causa:** A saida de um membro.

• **Consequência:** Atraso na entrega.

• **Probabilidade:** Baixa.

• **Impacto:** Alto.

• **Prioridade:** Baixa.

• **Estratégia de mitigação:** Redestrebuição entre funções e trabalhos do certo membro em saída.

• **Responsável pelo acompanhamento:** Isabella Corrêa

## Riscos da Tecnologia #04

• **Identificação do risco:** As API's escolhidas para o projéto, podem ter falhas de comunicações.

• **Descrição:** As API's que escolhemos para o banco de dados e bliblioteca de filmes podem ocorrer conflitos.

• **Causa:** Infraestrutura Técnica

• **Consequência:** Atraso na entrega.

• **Probabilidade:** Média

• **Impacto:** Alto

• **Prioridade:** Alta

• **Estratégia de mitigação:** Evitar uso de muitas API'S e garantir o uso de redundância, para evitar a perda de funcionalidade.

• **Responsável pelo acompanhamento:** Gabriel

## Riscos de Qualidade/Processo #05

• **Identificação do risco:** Baixa Qualidade do Conteúdo.

• **Descrição:** Usuários que em suas reviews deixam comentários vagos, irrelevantes, ofensivos ou com spoilers.

• **Causa:** Decisões de Usuários Enuviadas.

• **Consequência:** Atraso na entrega

• **Probabilidade:** Baixa

• **Impacto:** Alto

• **Prioridade:** Média

• **Estratégia de mitigação:** Criação de uma opção para adicionar comentarios com spoilers e também uma forma dos usuários denunciarem comentários vagos, irrelevantes ou ofensivos.

• **Responsável pelo acompanhamento:** Gabriel 

## Riscos da Tecnologia/2 #06

• **Identificação do risco:** Falta de conhecimento a respeito da tecnologia usada.

• **Descrição:** Ao desenvolver o código, percebemos certas dificuldades em algumas implementações, onde precisamos pesquisar como resolver.

• **Causa:** Baixa experiência em programação.

• **Consequência:** Atraso na entrega

• **Probabilidade:** Média

• **Impacto:** Alto

• **Prioridade:** Alta

• **Estratégia de mitigação:** Implementações simples e diretas e times de programadores, ao invés de fazer o código sozinho.

• **Responsável pelo acompanhamento:** Marcus


## 2. Análise e Priorização dos Riscos

**1.1 Critérios de Classificação**

- Para padronizar a análise, adotamos os seguintes critérios para avaliar a Probabilidade e o Impacto:

**Probabilidade:**

- Baixa: O evento é considerado raro e tem poucas chances de ocorrer durante o ciclo de vida deste MVP (ex: < 20% de chance).

- Média: O evento é possível e pode ocorrer em algum momento do desenvolvimento, especialmente em fases de integração (ex: 20% a 60% de chance).

- Alta: O evento é muito provável e quase certo de ocorrer se nenhuma ação preventiva for tomada (ex: > 60% de chance).


**Impacto:**

- Baixo: Causa um desconforto mínimo ou um atraso desprezível que não compromete as metas da Sprint.

- Médio: Causa atrasos perceptíveis no cronograma ou afeta funcionalidades secundárias do app, exigindo readequação de tarefas.

- Alto: Impede a entrega de uma funcionalidade principal do MVP, compromete a segurança dos dados ou gera instabilidade total no sistema.

**1.2 Matriz de Priorização**

A prioridade final de cada risco é calculada através da combinação entre Probabilidade e Impacto, seguindo a lógica abaixo:

| Nível | Probabilidade  | Impacto |
| :--- | :--- | :--- |
| **Baixo** | Evento raro, com menos de 20% de hipótese de ocorrer. | Impacto mínimo que não compromete o cronograma ou o MVP. |
| **Médio** | Evento possível, com 20% a 60% de hipótese de ocorrer. | Atrasos perceptíveis ou afetação de funções secundárias. |
| **Alto** | Evento muito provável, com mais de 60% de hipótese de ocorrer. | Impede a entrega do MVP ou compromete a estabilidade do sistema. |

### 2. Matriz de Priorização
A prioridade é definida pelo cruzamento da Probabilidade com o Impacto:

| Probabilidade \ Impacto | Baixo | Médio | Alto |
| :--- | :--- | :--- | :--- |
| **Baixa** | Prioridade Baixa | Prioridade Baixa | Prioridade Média |
| **Média** | Prioridade Baixa | Prioridade Média | **Prioridade Alta** |
| **Alta** | Prioridade Média | **Prioridade Alta** | **Prioridade Crítica** |

**2.1 Justificativa da Priorização**

Os riscos de **Tecnologia (R04)** foi classificado com **Prioridade Alta**. Isso deve-se ao facto de possuír um Impacto Alto (pode impedir a entrega do MVP) e uma Probabilidade Média de ocorrência devido à dependência de APIs externas.
O risco de de **Tecnologia/2 (R06)** também foi classificado como **Prioridade Alta** pois acaba atrasando a entrega dos códigos. Está sendo priorizada e usado a estratégia de mitigação.


**3.1 Riscos ativos**
No momento todos os riscos anteriores continuam ativos.
**3.2 Riscos Mitigados**
Ainda não houve risco mitigado, apesar do risco 03 ter mínima chance de ocorrer.
O risco 06 embora sendo aplicado a estratégia de mitigação, não foi mitigado por ter códigos complexos mesmo para 2 alunos.
**3.3 Riscos Concretizados**
Risco 01 e Risco 02 ocorreram devido à altas demandas nas últimas semanas.
Risco 06 ocorreu algumas vezes.
**3.4 Novos riscos identificados**
O Risco 06 foi adicionado.
**3.5 Ações de mitigações**
Risco 01: Está sendo priorizado funcionalidades já pensadas ou funcionalidades essenciais para o projeto.
Risco 02: Divisão de tarefas em time para que o projeto não fique parado quando ocorrer indisponibilidade de alguem.
Risco 03: Este risco não deverá ocorrer.
Risco 04: Será usado apenas API's necessárias e consolidadas para que a funcionalidade não seja afetada com frequência.
Risco 05: Este risco não está tendo foco pois está longe da implementação desta funcionalidade.
Risco 06: Para mitigar este risco, estamos trabalhando entre duplas para facilitar a troca de informação, também estamos implementando o código de forma mais simples, sem muitas funcionalidades que não foram apresentadas em aula.
