# Relatório da Sprint 4 — CineLog (Entrega 8)

## 1. Incremento Funcional do MVP 

Nesta quarta e última sprint do projeto, a equipe focou na estabilização do ecossistema, na cobertura de testes automatizados e no refinamento da experiência do usuário (UX), consolidando todas as pontas do MVP do CineLog. Entregamos com sucesso as seguintes histórias:

* **Filtros e Ordenação Avançada no Catálogo (Issue #20):** Implementação de uma funcionalidade no frontend (`catalogo.html`) que permite ao usuário filtrar sua biblioteca pessoal por tipo (Filmes ou Séries) e ordenar as produções por nota (maior para menor), otimizando a usabilidade quando o catálogo cresce.

* **Garantia de Cobertura de Testes na API (Issue #21):** Escrita e execução de testes unitários e de integração utilizando `@WebMvcTest` e `MockMvc` no Spring Boot para blindar as rotas críticas de login, registro de usuários e persistência de títulos, garantindo estabilidade contra regressões de código.

## 2. Arquitetura e Visão de Implantação Atualizada

A arquitetura manteve o padrão híbrido e de baixo acoplamento estabelecido. Para atender às exigências de governança, documentamos a Visão de Componentes atualizada da aplicação:

```mermaid
graph TD
    subgraph Frontend (Camada de Apresentação)
        UI[index.html / catalogo.html] -->|Manipula Autenticação| LS[(Local Storage)]
        UI -->|Requisições REST / JSON| API[Spring Boot REST API]
    end

    subgraph Backend (Camada de Negócio & Segurança)
        API -->|Filtros de Validação| VAL[@Valid / Jakarta Validation]
        VAL -->|Regras de Domínio| SVC[Services: Usuario / Titulo]
    end

    subgraph Persistência (Camada de Dados)
        SVC -->|Spring Data JPA| DB[(H2 Database em Memória)]
    end