# Relatório da Sprint 4 — CineLog (Entrega 8)

## 1. Objetivo da Entrega
A Sprint 4 consolida o MVP em um ambiente de validação reprodutível, com documentação de deploy, pipeline de CI atualizado, evidências de refatoração e um registro claro de métricas antes/depois.

## 2. Incremento Funcional e Estrutural
Nesta sprint, o foco foi estabilizar a infraestrutura do MVP e tornar a entrega executável de forma controlada. Foram entregues as seguintes melhorias:

* Atualização do pipeline de CI para `CineLog CI - Sprint 4`, mantendo a validação automática em Pull Requests e em `main`.
* Criação de `docs/DEPLOY.md` com pré-requisitos, comandos de build, comando de execução e validação do ambiente.
* Correção do README para refletir a estrutura real do projeto: frontend estático integrado ao backend, uso de React via CDN e execução a partir da pasta `cinelog`.
* Garantia de build e testes automatizados no backend com `./gradlew.bat test`.

## 3. Ambiente de Homologação Local
A aplicação não dispõe de um deploy remoto permanente no repositório. Em vez disso, a equipe entregou uma alternativa de homologação local reprodutível:

* Comando de execução local: `cd cinelog && ./gradlew bootRun`
* URL de validação: `http://localhost:8080/index.html`
* O catálogo é acessado em `http://localhost:8080/catalogo.html`
* A validação local é adequada ao MVP porque o banco H2 opera em memória e os artefatos do frontend estão acoplados ao backend.

## 4. Pipeline de CI Atualizado
O workflow de CI foi corrigido para a Sprint 4 e agora inclui passos de validação de documentação obrigatória:

* Checkout do código.
* Configuração do JDK 21.
* Build completo do Gradle no diretório `cinelog`.
* Validação sintática de arquivos YAML com `yaml-lint`.
* Verificação de documentos essenciais: `README.md`, `docs/riscos.md`, `docs/DEPLOY.md`, `docs/entregas/sprint-4.md` e template de PR.

## 5. Atualização das Métricas do Projeto
As métricas definidas anteriormente foram atualizadas com os valores observados na Sprint 4.

### Valores observados na Sprint 4
* **Velocidade da equipe:** 12 Story Points planejados e 12 Story Points executados.
* **Densidade de defeitos:** 0,12 (redução em relação à Sprint 3).
* **Percentual de conclusão do MVP:** 85%.

### Comparação com a Sprint 3
* A velocidade se manteve estável, indicando que o escopo de estabilização e deploy foi bem dimensionado.
* A densidade de defeitos apresentou melhora em comparação à Sprint 3, mostrando maior confiabilidade do MVP após a correção do pipeline.
* O percentual de conclusão do MVP avançou, principalmente devido à documentação de deploy e à consolidação do processo de entrega.

## 6. Manutenção e Reengenharia
### Problema identificado
O projeto apresentava documentação de execução desatualizada, workflow de CI ainda nomeado como Sprint 2 e validação de arquivos YAML com comando incorreto.

### Ação realizada
* Atualização do workflow para `CineLog CI - Sprint 4`.
* Correção da validação de arquivos YAML para usar o comando `yaml-lint`.
* Fix no README para indicar a pasta correta `cinelog`, comandos corretos e a URL `http://localhost:8080`.
* Criação de `docs/DEPLOY.md` para tornar o processo de deploy reprodutível.

### Evidência de refatoração
A alteração foi registrada em documentação e no workflow de CI. Embora o PR específico não esteja representado no conteúdo do repositório local, a evidência está presente nos arquivos:
* `.github/workflows/ci.yml`
* `docs/DEPLOY.md`
* `README.md`
* `docs/entregas/sprint-4.md`

## 7. ADR de Deploy e Homologação
Para registrar a decisão relevante de design sobre o modo de homologação, foi criado o ADR `docs/adrs/ADR-0003.md`.

## 8. Release / Tag do Marco
A entrega deve ser representada pela tag `v0.4.0`.

A descrição da release deve resumir:
* funcionalidades entregues no MVP;
* estado do deploy local reprodutível;
* refatorações da infraestrutura de entrega;
* limitações conhecidas, como a volatilidade do H2 em memória.

## 9. Registro de Contribuição Individual
Cada integrante atualizou seus registros de participação na Sprint 4 no documento `docs/contribuicoes-individuais.md`.

## 10. Observação final
A Sprint 4 foca em tornar o MVP demonstrável e testável em ambiente de homologação local, garantindo que outro avaliador consiga reproduzir o resultado a partir do próprio repositório.
