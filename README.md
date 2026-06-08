# CineLog — Biblioteca Digital de Avaliações

## 1. Equipes
**Isabella Corrêa** — DevOps / Infra

**Gabriel Ferreira de Souza da Silva** — Scrum Master

**Marcus Jhuan Epifânio Lima** — Arquiteto do software

---

## 2. O Projeto e Proposta de Valor
O **CineLog** é uma aplicação web focada em cinéfilos que desejam organizar seu consumo audiovisual de forma simples, elegante e direta. A plataforma funciona como uma biblioteca digital pessoal de avaliações, permitindo que o usuário registre filmes e séries assistidos, atribua notas de 1 a 5 e gerencie seu histórico de maneira totalmente individualizada e segura.

---

## 3. Stack Utilizada e Arquitetura
A aplicação adota uma estratégia híbrida e leve de desenvolvimento para o MVP, mantendo o frontend estático integrado ao servidor e sem um build de frontend separado.

**Frontend:** HTML e JavaScript estático servidos pelo Spring Boot. O login usa **React via CDN** em `index.html`, enquanto o catálogo funciona com JavaScript puro e `localStorage` em `catalogo.html`.

**Backend:** RESTful API construída com **Spring Boot 3 (Java 21)**, com validação de dados usando `jakarta.validation` e tratamento global de exceções.

**Banco de Dados:** **H2 Database** em memória, para acelerar o desenvolvimento e a execução dos testes automatizados.

---

## 4. Documentação das Entregas

**Entrega 3:** [Planejamento Inicial](docs/baseline.md) | [Estimativas](docs/estimativas.md) | [Métricas](docs/metricas.md)

**Entrega 4:** [Análise de Riscos](docs/riscos.md) | [Fluxo de Trabalho](docs/fluxo-de-trabalho.md) | [Critérios de Qualidade](docs/qualidade.md)

**Entrega 5 (Sprint 1):** [Relatório Sprint 1](docs/entrega-sprint1.md)

**Entrega 6 (Sprint 2):** [Relatório Sprint 2](docs/entregas/sprint-2.md) | [Arquitetura](docs/arquitetura.md) | [Definition of Done](docs/dod.md)

**Entrega 7 (Sprint 3):** [Relatório Sprint 3](docs/entregas/sprint-3.md)

**Entrega 8 (Sprint 4):** [Relatório Sprint 4](docs/entregas/sprint-4.md) | [Deploy](docs/DEPLOY.md)

---

## 5. Justificativa Técnica das Issues (Foco da Sprint 3)

Em resposta aos critérios de qualidade e governança arquitetural estabelecidos no projeto, a Sprint 3 priorizou a resolução de débitos técnicos e segurança, justificados a seguir:

**Issue #01 — Ajuste no Vínculo de Usuário no Catálogo:**
  * Justificativa: O MVP possuía uma vulnerabilidade relacional onde os títulos eram criados de forma órfã no banco de dados. A amarração via localStorage foi implementada para garantir a integridade referencial (Data Integrity). Sem este ajuste, o sistema violaria o critério de isolamento de dados, permitindo que um usuário visualizasse ou alterasse avaliações de terceiros.
    
**Issue #16 — Implementação da Funcionalidade de Mudar Senha:**
  * Justificativa: O gerenciamento de credenciais é um requisito não-funcional crítico de segurança para qualquer sistema com barreira de autenticação. Esta issue garante o princípio de Self-Service cadastral e mitiga os riscos de exposição ou obsolescência de senhas no ecossistema, validando os dados diretamente na regra de negócio do Spring Boot antes da persistência.

---

## Como Executar o Projeto Localmente

A interface do CineLog é servida de forma estática pelo backend Spring Boot. Não existe uma pasta `/frontend` no repositório.

### 1. Inicializando o Servidor (Spring Boot)

Abra o terminal na pasta `cinelog` e execute o comando correspondente ao seu sistema operacional.

**No Windows:**
```powershell
cd cinelog
.\gradlew.bat bootRun
```

**No Linux / macOS:**
```bash
cd cinelog
chmod +x ./gradlew
./gradlew bootRun
```

O backend e os arquivos estáticos do frontend estarão disponíveis em `http://localhost:8080`.

### 2. Acessando a Aplicação

Abra no seu navegador:

`http://localhost:8080/index.html`

O catálogo estará disponível em:

`http://localhost:8080/catalogo.html`

> Para informações completas de deploy e validação, consulte `docs/DEPLOY.md`.
