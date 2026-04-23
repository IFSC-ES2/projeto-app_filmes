## Riscos de Escopo

• **Identificação do risco:** O escopo do projéto pode atrasar, devido á adição continua de pequenas funcionalidades.

• **Descrição:** A adição de pequenas funcionalidades pode acumular descontroladamente, podendo afetar o avanço das Historias de Usuários.

• **Causa:** Mudanças frequentes de Requisitos.

• **Consequência:** Atraso na entrega e Estouro no Orçamento.

• **Probabilidade:** Baixa. 

• **Impacto:** Alto.

• **Prioridade:** Média.

• **Estratégia de mitigação:** Foco nas Historias de Usuários e após elas o adicionamento de pequenas funcionalidades.

• **Responsável pelo acompanhamento:** Marcus Jhun (Scrum Master)

## Riscos de Prazo

• **Identificação do risco:** O cronograma que estipulamos pode atrasar, devido aos trabalhos externos.

• **Descrição:** A equipe pode sofrer atrasos ao decorrer o projeto, porque as tarefas e a organização do dia a dia podem afetar a a entrega.

• **Causa:** Projetos externos e trabalho.

• **Consequência:** Atraso na entrega.

• **Probabilidade:** Média.

• **Impacto:** Médio.

• **Prioridade:** Alta.

• **Estratégia de mitigação:** Organizar devidamente a tarefa de cada um e os trabalhos externos para que não venha ocorrer atrasos.

• **Responsável pelo acompanhamento:** Marcus Jhuan.

## Riscos da Equipe

• **Identificação do risco:** Saída inesperada de um membro da equipe, podem levar á atrasos inesperados.

• **Descrição:** Algum membro da equipe acabar derrepente e inesperadamente sair do grupo, causando trabalho extra para repor oque séria feito pelo mesmo e transferir as responsabilidades do mesmo para outros membros

• **Causa:** A saida de um membro.

• **Consequência:** Atraso na entrega.

• **Probabilidade:** Baixa.

• **Impacto:** Alto.

• **Prioridade:** Baixa.

• **Estratégia de mitigação:** Redestrebuição entre funções e trabalhos do certo membro em saída.

• **Responsável pelo acompanhamento:** Isabella Corrêa

## Riscos da Tecnologia

• **Identificação do risco:** As API's escolhidas para o projéto, podem ter falhas de comunicações.

• **Descrição:** As API's que escolhemos para o banco de dados e bliblioteca de filmes podem ocorrer conflitos.

• **Causa:** Infraestrutura Técnica

• **Consequência:** Atraso na entrega.

• **Probabilidade:** Média

• **Impacto:** Alto

• **Prioridade:** Alta

• **Estratégia de mitigação:** Ter documentado API's extras que fazem o mesmo serviço, dessa forma se ocorrer falhas entre duas API's, basta trocar uma delas.

• **Responsável pelo acompanhamento:** Gabriel

## Riscos de Qualidade/Processo

• **Identificação do risco:** Baixa Qualidade do Conteúdo.

• **Descrição:** Usuários que em suas reviews deixam comentários vagos, irrelevantes, ofensivos ou com spoilers.

• **Causa:** Decisões de Usuários Enuviadas.

• **Consequência:** Atraso na entrega

• **Probabilidade:** Baixa

• **Impacto:** Alto

• **Prioridade:** Média

• **Estratégia de mitigação:** Criar um filtro que impede comentários desse tipo, forçando á não ser vago, irrelevante, ofensivo ou com spoilers.

• **Responsável pelo acompanhamento:** Gabriel 

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

Os riscos de **Tecnologia (R04)** e **Prazo (R02)** foram classificados com **Prioridade Alta**. Isso deve-se ao facto de possuírem um Impacto Alto (podem impedir a entrega do MVP) e uma Probabilidade Média de ocorrência devido à dependência de APIs externas e à carga de trabalho da equipa.
