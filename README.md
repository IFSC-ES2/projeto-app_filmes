## CineLog - Biblioteca Digital de Avaliações

**1. Equipe**

* Isabella Corrêa - Scrum Master
* Gabriel Ferreira de Souza da Silva - Arquiteto de Software
* Marcus Jhuan Epifânio Lima - DevOps/Infra

**2. O Projeto e Proposta de Valor**

O CineLog é uma aplicação web focada em cinéfilos que desejam organizar seu consumo audiovisual de forma simples e direta. Ele funciona como uma biblioteca digital pessoal de avaliações onde o usuário registra filmes e séries assistidos e atribui notas.

**3. Stack Utilizada**

* **Frontend:** React (JavaScript, JSX)
* **Backend:** Spring Boot 3 (Java 21)
* **Banco de Dados:** H2 Database (Em memória)

**4. Documentação das Entregas**

* **Entrega 3:** [Planejamento Inicial](docs/baseline.md) | [Estimativas](docs/estimativas.md) | [Métricas](docs/metricas.md)
* **Entrega 4:** [Análise de Riscos](docs/riscos.md) | [Fluxo de Trabalho](docs/fluxo-de-trabalho.md) | [Critérios de Qualidade](docs/qualidade.md)
* **Entrega 5 (Sprint 1):** [Relatório Sprint 1](docs/entrega-sprint1.md)
* **Entrega 6 (Sprint 2):** [Relatório Sprint 2](docs/entregas/sprint-2.md) | [Arquitetura](docs/arquitetura.md) | [Definition of Done](docs/dod.md)

---

## Como Executar o Projeto Localmente

Como o projeto agora é desacoplado, você precisa iniciar o backend e o frontend separadamente:

### 1. Executando o Backend (Spring Boot)

1. Abra o terminal na pasta raiz do backend `/backend` (ou `cinelog`).
2. Execute o comando para iniciar a aplicação:
   ```bash
   ./gradlew bootRun

   (No Windows, use ./gradlew.bat bootRun)
   
3. O servidor backend subirá na porta http://localhost:8080.

2. Executando o Frontend (React)

Abra um novo terminal na pasta raiz do frontend /frontend.

Instale as dependências do projeto (necessário apenas na primeira execução):

npm install

E depois:

npm run dev
