# Documentação de Arquitetura do Sistema — CineLog

## 1. Visão Geral

Com a evolução do projeto, o CineLog deixou de ser um monólito de páginas estáticas e passou a adotar uma arquitetura desacoplada baseada no modelo **Cliente-Servidor**. Isso separa completamente as responsabilidades de interface e de persistência de dados.

### Frontend

* **Tecnologia:** React (JavaScript / HTML5 / CSS3).
* **Responsabilidade:** Renderização da interface do usuário de forma dinâmica, gerenciamento de rotas internas no navegador, captura de dados dos formulários de avaliação e comunicação assíncrona com o servidor via Fetch API.

### Backend

* **Tecnologia:** Spring Boot 3 (Java 21).
* **Responsabilidade:** Exposição de endpoints RESTful que recebem e respondem dados exclusivamente no formato JSON, execução das regras de negócio (validação de notas e tipos de mídias) e segurança.

### Banco de Dados

* **Tecnologia:** H2 Database (Em memória).
* **Responsabilidade:** Persistência temporária dos dados de usuários, títulos e avaliações durante o ciclo de execução da aplicação.

---

## 2. Padrões de Projeto Orientados a Objetos Aplicados

Mesmo com a mudança no frontend, a arquitetura de classes do backend seguiu os requisitos de qualidade orientada a objetos da disciplina, utilizando dois padrões de projeto criacionais:

### Padrão 1: Builder

* **Aplicado:** Na entidade `Avaliacao`.
* **Nossa Justificativa:** Como o formulário em React permite enviar avaliações apenas com nota ou avaliações completas (com comentários textuais), o padrão Builder evita construtores sobrecarregados na classe Java, permitindo que o objeto seja montado de forma fluída dependendo do que o usuário preencheu na tela.

### Padrão 2: Factory Method

* **Aplicado:** Na instanciação de objetos herdados da classe abstrata `Midia` (classes `Filme` e `Serie`).
* **Nossa Justificativa:** O endpoint de cadastro recebe um parâmetro string (`tipo: "filme"` ou `"serie"`) vindo do React. A classe `MidiaFactory` isola a lógica de decisão do switch/case, devolvendo a instância correta configurada com suas validações de negócio nativas.
