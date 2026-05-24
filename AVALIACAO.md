# Avaliação - Engenharia de Software II

| entrega | aluno                              | commit  | data     | correção | nota | peso |
| ------- | ---------------------------------- | ------- | -------- | -------- | ---- | ---- |
| 1       | equipe                             | 511d282 | 16/03/26 | 20/03/26 | 5,5  | 2    |
| 2       | equipe                             | aa09e91 | 26/03/26 | 29/03/26 | 2,5  | 2    |
| 3       | equipe                             | a92dc58 | 09/04/26 | 22/04/26 | 7,6  | 3    |
| 4       | equipe                             | 5539a83 | 23/04/26 | 09/05/26 | 8,2  | 3    |
| 5       | Isabella Corrêa                    | ac429eb | 04/05/26 | 24/05/26 | 6,6  | 10   |
| 5       | Gabriel Ferreira de Souza da Silva | ac429eb | 04/05/26 | 24/05/26 | 6,1  | 10   |
| 5       | Marcus Jhuan Epifânio Lima         | ac429eb | 04/05/26 | 24/05/26 | 7,0  | 10   |

## Nota parcial

| aluno                              | nota parcial |
| ---------------------------------- | ------------ |
| Isabella Corrêa                    | 6,4          |
| Gabriel Ferreira de Souza da Silva | 6,2          |
| Marcus Jhuan Epifânio Lima         | 6,6          |

## Comentários

### Entrega 1

1. Equipe formada: parcialmente atendido.
   - Equipe incompleta.
   - A equipe não definiu que vai ser o scrum master
2. Tema definido: parcialmente atendido.
   - A equipe não respondeu às perguntas:
     - (a) qual problema o sistema pretende resolver?
     - (b) quem são os usuários?
     - (c) qual é a proposta do sistema para resolver o problema?
3. MVP: parcialmente atendido.
   - A equipe não deixou claro:
     - (b) quais são as funcionalidades principais;
     - (c) o que ficará fora do escopo neste momento.
4. Governança mínima: parciamente atendido.
   - A equipe apenas definiu algumas regras de proteção da ramificação principal que ainda não estão em vigor.
   - Ainda não foram implementados:
     - (b) template de issue;
     - (c) template de pull request;
     - (d) organização básica do repositório;
     - (e) board inicial para acompanhamento.

**observação:** No arquivo `README.md` ainda é possível ver o botão gerado automaticamente pelo sistama. Retirar.

#### Recuperação

1. Equipe formada: corrigido.
2. Tema definido: não houve alteração.
3. MVP: não houve alteração.
4. Governança mínima: ainda não foram implementados:
   - (b) template de issue;
   - (c) template de pull request.

### Entrega 2

1. Visão do produto: parcialmente atendido.
   - Não definiu quais objetivos o produto pretende atingir neste semestre.
   - Não definiu quais premissas, restrições ou limitações já são conhecidas.
2. Definição do MVP: parcialmente atendido.
   - não definiu quais funcionalidades ou ideias ficam fora do escopo neste momento.
   - não definiu por que esse recorte é viável para o semestre.
   - não definiu quais critérios foram usados pela equipe para decidir o que entra e o que fica de fora.
   - o MPV pare ser demasiado simples.
3. Backlog inicial com critérios de aceitação:
   - As descrição não estão suficientemente claras:
     - "Gerenciar" não é uma descrição clara.
     - Como o usuário pode "avaliar" um filme?
     - "Sistema de categorização", "Sistema de tags" e "Sistema de favoritar" não são títulos claros. O que deve ser feito com esses sistemas?
   - As prioridades devem esar definidas na própria issue, não no texto da descrição.
   - Quem é Trighy?
   - Não foram definidas prioridades relativas. Quais funcionalidades devem ser implementadas primeiro?
4. Definition of Done (DoD): não atendido.
5. ADRs iniciais: não atendido.
6. Atualização do README: não atendido.

**observação:** Vocês estão fazendo alterações diretamente na ramificação principal. Evitem isso. Criem ramificações próprias para as entregas.

#### Recuperação

- `README.md` gerado por IA.

### Entrega 3

- `README.md` gerado por IA.

#### Recuperação

1. Planejamento inicial e baseline: parcial
   - Informar o recorte do backlog que servirá de base para o planejamento;
   - Priorizar os itens mais importantes do MVP;
   - Apresentar estimativas dos itens priorizados;
   - Apresentar outras hipóteses assumidas.
2. Registro da abordagem de estimativa: parcial
   - Informar quais critérios foram usados para comparar ou dimensionar os itens;
   - Detalhar melhor as imitações ou incertezas foram percebidas durante a estimativa.
3. Capacidade planejada da equipe: parcial
   - Informar se há restrições conhecidas que possam impactar o andamento do trabalho;
   - Informar quais atores podem afetar previsibilidade ou produtividade no período.
4. Definição das métricas que serão acompanhadas: atendido
5. Ficha de cada métrica: parcial
   - Separar as fichas de cada métrica em arquivos diferentes
     - Em cada uma adicionar data do acompanhamento e valor coletado

### Entrega 4

1. Registro inicial de riscos do projeto: parcial
   - Atribuir ID aos riscos para identificação e acompanhamento
   - A estratégia de mitigação dos riscos 4 e 5 não parecem factíveis
2. Análise e priorização dos riscos: parcial
   - A matriz de riscos deve ser preenchida com os riscos identificados pela equipe
   - A equipe destacou o risco 2 com nível alto sendo que tem probabilidade média e impacto médio. Por quê?
3. Plano de resposta aos riscos: não atendido
4. Consolidação do fluxo de trabalho no repositório
   - Não basta possuir template de PR com checklist mínimo de revisão; ele deve ser preenchido e utilizado.
5. Definição inicial de critérios de qualidade do projeto: atendido
6. Relação entre riscos e qualidade: atendido
7. Definição preliminar de avaliação da qualidade: atendido
8. Atualização da documentação do projeto: atendido

### Entrega 5

1. Primeiro incremento funcional do sistema: parcial.
   - Foi implementado um vertical slice de autenticação, com página `login.html`, endpoints `POST /api/auth/register` e `POST /api/auth/login`, serviço de usuário, repositório JPA e persistência H2.
   - A aplicação inicia corretamente com `./gradlew bootRun` e o incremento é demonstrável quando usado o comando correto.
   - O comando documentado no README e em `entrega-sprint1.md` é `./gradlew.bat bootRun`, que falha em ambiente Linux com `Permissão negada`.
   - A funcionalidade escolhida não aparece claramente como item do MVP nas entregas anteriores, que priorizavam cadastro, avaliação, listagem e exclusão de filmes/séries. A escolha da autenticação foi registrada na Sprint 1, mas não foi suficientemente justificada com base na priorização já definida.
2. Testes de unidade automatizados: parcial.
   - Há testes automatizados em `UsuarioServiceTests.java`, cobrindo cadastro, duplicidade de e-mail, autenticação e senha incorreta.
   - Os testes passam com `./gradlew test`.
   - O comando documentado para testes é `./gradlew.bat test`, que falha em Linux com `Permissão negada`.
3. Escopo da Sprint 1 explicitado e justificado: parcial.
   - `entrega-sprint1.md` descreve o vertical slice entregue e como testar.
   - `backlog-issues.md` lista itens concluídos e pendentes.
   - Não há justificativa suficiente de por que autenticação foi o incremento mais adequado em relação ao backlog/MVP priorizado anteriormente.
   - As issues reais da Sprint 1 no GitHub tinham descrições vazias em vários casos e algumas permaneceram abertas, como `#18` e `#20`.
4. Backlog e board atualizados: parcial.
   - Há registro documental do backlog em `backlog-issues.md`.
   - As issues reais verificadas no GitHub não trazem critérios de aceitação em parte relevante dos itens da Sprint 1.
   - Não ficou clara a vinculação entre issues, commits e pull request.
5. Fluxo de trabalho evidenciado no repositório: parcial.
   - Houve desenvolvimento em branch e merge do PR `#26`.
   - O PR `#26` foi mesclado sem reviews registrados; o GitHub indicou `reviewDecision: REVIEW_REQUIRED` e `reviews: []`.
   - O workflow de CI versionado está incorreto: com `working-directory: ./cinelog`, o passo `./cinelog/gradlew test --no-daemon` procura `cinelog/cinelog/gradlew` e falha.
6. Registro das contribuições individuais: parcial.
   - Há registro em `contribuicoes-individuais.md`.
   - O registro não associa de forma objetiva cada contribuição a issues, commits, PRs ou reviews.
   - Contribuições individuais:
     - Gabriel: contribuiu com frontend HTML/CSS, ajustes de README e criação/organização de issues. A participação é rastreável, mas menos ligada à lógica/testes centrais, e as issues criadas para a Sprint 1 ficaram incompletas.
     - Isabella Corrêa: contribuiu com setup inicial do Spring Boot, entidade/repositório de usuário e documentação de backlog/contribuições. A participação foi relevante, mas o PR da entrega foi mesclado sem review e parte da documentação/processo ficou insuficiente.
     - Marcus: maior contribuição técnica no incremento, concentrando controller, DTOs, serviço, testes, documentação da sprint e workflow de CI.
7. Documentação atualizada: parcial.
   - O README descreve a entrega e aponta para `entrega-sprint1.md`.
   - As instruções de execução e de testes usam `gradlew.bat`, que não funcionou no ambiente de correção.
   - O que já funciona no MVP aparece de forma resumida, mas a relação com o MVP priorizado anteriormente ficou frágil.
8. Release do marco: parcial.
   - A tag `v0.1.0` existe.
   - Não foi encontrada uma GitHub Release publicada para `v0.1.0`.
