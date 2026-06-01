# CineLog — Biblioteca Digital de Avaliações

## 1. Equipe e Papéis
**Isabella Corrêa** — DevOps / Infra
**Gabriel Ferreira de Souza da Silva** — Scrum Master
**Marcus Jhuan Epifânio Lima** — Arquiteto do software

---

## 2. O Projeto e Proposta de Valor
O **CineLog** é uma aplicação web focada em cinéfilos que desejam organizar seu consumo audiovisual de forma simples, elegante e direta. A plataforma funciona como uma biblioteca digital pessoal de avaliações, permitindo que o usuário registre filmes e séries assistidos, atribua notas de 1 a 5 e gerencie seu histórico de maneira totalmente individualizada e segura.

---

## 3. Stack Utilizada e Arquitetura
A aplicação adota uma estratégia híbrida e leve de desenvolvimento para o MVP, eliminando a necessidade de builds complexos de frontend:

**Frontend:** Interface SPA parcial construída com **React (via CDN)** para o fluxo de autenticação reativa, integrada com páginas dinâmicas em **Vanilla JavaScript**. A comunicação de estado e sessão entre os escopos é gerenciada de forma persistente através de localStorage.
**Backend:** RESTful API robusta construída com **Spring Boot 3 (Java 21)**, aplicando padrões de validação de dados (jakarta.validation) e tratamento global de exceções.
**Banco de Dados:** **H2 Database**, operando em memória para garantir rapidez no ciclo de desenvolvimento e testes.

---

## 4. Documentação das Entregas

**Entrega 3:** [Planejamento Inicial](docs/baseline.md) | [Estimativas](docs/estimativas.md) | [Métricas](docs/metricas.md)
**Entrega 4:** [Análise de Riscos](docs/riscos.md) | [Fluxo de Trabalho](docs/fluxo-de-trabalho.md) | [Critérios de Qualidade](docs/qualidade.md)
**Entrega 5 (Sprint 1):** [Relatório Sprint 1](docs/entrega-sprint1.md)
**Entrega 6 (Sprint 2):** [Relatório Sprint 2](docs/entregas/sprint-2.md) | [Arquitetura](docs/arquitetura.md) | [Definition of Done](docs/dod.md)
**Entrega 7 (Sprint 3):** [Relatório Sprint 3](docs/entregas/sprint-3.md)

---

## 5. Justificativa Técnica das Issues (Foco da Sprint 3)

Em resposta aos critérios de qualidade e governança arquitetural estabelecidos no projeto, a Sprint 3 priorizou a resolução de débitos técnicos e segurança, justificados a seguir:

**Issue #01 — Ajuste no Vínculo de Usuário no Catálogo:**
  * Justificativa: O MVP possuía uma vulnerabilidade relacional onde os títulos eram criados de forma órfã no banco de dados. A amarração via localStorage foi implementada para garantir a integridade referencial (Data Integrity). Sem este ajuste, o sistema violaria o critério de isolamento de dados, permitindo que um usuário visualizasse ou alterasse avaliações de terceiros.
**Issue #16 — Implementação da Funcionalidade de Mudar Senha:**
  * Justificativa: O gerenciamento de credenciais é um requisito não-funcional crítico de segurança para qualquer sistema com barreira de autenticação. Esta issue garante o princípio de Self-Service cadastral e mitiga os riscos de exposição ou obsolescência de senhas no ecossistema, validando os dados diretamente na regra de negócio do Spring Boot antes da persistência.

---

## Como Executar o Projeto Localmente

Como a interface é servida de forma estática e integrada ao ecossistema do servidor, você só precisa iniciar o ecossistema do Backend para que a aplicação completa fique disponível.

### 1. Inicializando o Servidor (Spring Boot)

1. Abra o terminal na pasta raiz do backend /backend (ou cinelog).
2. Execute o comando correspondente ao seu sistema operacional para compilar e subir o servidor:
>**No Linux / macOS:**
>
ash
> hmod +x gradlew
> /gradlew bootRun
> 
 *No Windows:**
> 
sh
> .gradlew.bat bootRun
> `
. O backend e os arquivos estáticos do frontend subirão unificados na porta: `htp://localhost:8080`.


### 2. Acessando a Aplicação

*om o servidor ativo, abra o seu navegador e aceda diretamente a: **`http://localhost:8080/index.html`**
*Caso queira testar alterações visuais em tempo real no frontend sem reiniciar o servidor Java, você também pode abrir o arquivo `ndex.html`utilizando a extensão **Live Server** do VS Code.
