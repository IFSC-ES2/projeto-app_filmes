 ## Critérios de qualidade

1. **Manutenibilidade**
   - Código fácil de modificar e documentado
   - Importante para evolução do projeto

2. **Confiabilidade**
   - Sistema com mínimo de falhas
   - Essencial para garantir confiança do usuário

3. **Usabilidade**
   - Interface simples e objetiva
   - Importante para MVP

4. **Desempenho**
   - Respostas rápidas
   - Evita abandono do usuário

## Relação entre riscos e qualidade

1. **Riscos de Escopo (adição contínua de pequenas funcionalidades)**
   - Afeta: Manutenibilidade (código fica mais complexo com mudanças frequentes), Confiabilidade (mais chances de bugs ao adicionar features), Desempenho (sistema pode ficar lento com extras).
   - Como mitigar ajuda: Focar nas histórias de usuário primeiro mantém o código simples e fácil de manter. Isso protege a manutenibilidade e evita sobrecarga na confiabilidade e desempenho.

2. **Riscos de Prazo (atrasos por trabalhos externos)**
   - Afeta: Usabilidade (interface pode ser feita às pressas), Desempenho (otimizações ficam para depois).
   - Como mitigar ajuda: Organizar tarefas e equilibrar trabalhos externos permite tempo para refinar a usabilidade. Revisões contínuas garantem que o desempenho seja otimizado sem pressa.

3. **Riscos da Equipe (saída inesperada de membro)**
   - Afeta: Manutenibilidade (código pode ficar inconsistente com redistribuição), Confiabilidade (erros ao transferir responsabilidades).
   - Como mitigar ajuda: Redistribuir funções rapidamente mantém a equipe produtiva, ajudando na manutenibilidade ao evitar gaps. Pair programming ou revisões extras protegem a confiabilidade.

4. **Riscos da Tecnologia (falhas nas APIs escolhidas)**
   - Afeta: Confiabilidade (comunicação falha causa bugs), Desempenho (APIs ruins atrasam respostas).
   - Como mitigar ajuda: Ter APIs alternativas documentadas permite trocas rápidas, melhorando confiabilidade. Testes iniciais e benchmarks antecipam problemas de desempenho.

5. **Riscos de Qualidade/Processo (baixa qualidade de conteúdo, como comentários ruins)**
   - Afeta: Usabilidade (usuários frustrados com conteúdo irrelevante), Confiabilidade (sistema permite conteúdo ofensivo, perdendo confiança).
   - Como mitigar ajuda: Filtros para comentários forçam qualidade, melhorando usabilidade ao tornar a experiência melhor. Isso também aumenta confiabilidade, já que o sistema fica mais confiável para usuários.

## Definição preliminar de avaliação da qualidade

### Escopo inicial
Por enquanto, vamos focar em checar esses atributos (Manutenibilidade, Confiabilidade, Usabilidade e Desempenho) nas próximas sprints, dando prioridade ao MVP. Mais pra frente, podemos adicionar métricas mais robustas e testes com usuários reais.

### Modelo de qualidade adotado
Estamos usando o ISO/IEC 25010 como base, que fala sobre características de qualidade no software. Nossos atributos se encaixam direitinho:
- Manutenibilidade (facilidade de manter)
- Confiabilidade (confiança no sistema)
- Usabilidade (facilidade de usar)
- Desempenho (eficiência)

### Métricas ou evidências preliminares
- **Manutenibilidade**: Atingir mais de 80% de cobertura em testes unitários, manter complexidade ciclomática baixa (menos de 10), e usar padrões de design no código.
- **Confiabilidade**: Menos de 5 bugs por sprint, e medir o tempo médio entre falhas.
- **Usabilidade**: Aplicar testes heurísticos do Nielsen, coletar feedback em protótipos, e ver se tarefas principais levam menos de 2 minutos.
- **Desempenho**: Tempo de resposta médio abaixo de 2 segundos, verificar throughput de requisições, e monitorar uso de CPU/memória em testes de carga.
