# Padrões de Projeto no CineLog

## O que são padrões de projeto

Padrões de projeto são soluções recorrentes para problemas comuns no design de software. Eles descrevem o problema, o contexto e a essência da solução de forma reutilizável em diferentes sistemas.

### Vantagens

- acelera o desenvolvimento
- melhora a confiabilidade do software
- evita gastar tempo reinventando soluções já consolidadas
- cria um vocabulário comum na equipe

## Padrões aplicados no CineLog

### 1. Repository (Padrão de Persistência)

#### Problema identificado
O sistema precisava manter dados de `Usuario` e `Titulo` sem espalhar a lógica de acesso ao banco pelas classes de negócio.

#### Padrão aplicado
O projeto usa o padrão **Repository** por meio de interfaces Spring Data JPA:
- `com.example.cinelog.repository.UsuarioRepository`
- `com.example.cinelog.repository.TituloRepository`

#### Por que é adequado
- separa a lógica de persistência da lógica de negócio
- facilita testes e manutenção
- aproveita consultas e operações padrão do Spring Data

#### Classes afetadas
- `UsuarioService`
- `TituloService`
- `AuthController`
- `TituloController`

#### Consequências
- **Benefícios:** desacoplamento, clareza de responsabilidades, reuso de consultas.
- **Trade-offs:** aumento da abstração e dependência do Spring Data JPA.

### 2. Factory (Padrão Criacional)

#### Problema identificado
A criação de objetos `Titulo` exigia validação e conversão de tipo antes de persistir, e essa lógica não deveria ficar diretamente dentro do serviço.

#### Padrão aplicado
Foi adicionada a classe de fábrica:
- `com.example.cinelog.factory.TituloFactory`

O `TituloService` agora delega a criação do objeto `Titulo` à fábrica, mantendo o serviço focado apenas na regra de negócio e persistência.

#### Por que é adequado
- centraliza a criação de objetos e validação de entrada
- torna o serviço mais enxuto e mais fácil de testar
- facilita a evolução da lógica de criação sem alterar `TituloService`

#### Classes afetadas
- `TituloFactory`
- `TituloService`
- `Titulo`

#### Consequências
- **Benefícios:** isolamento da lógica de construção, maior organização, melhor legibilidade.
- **Trade-offs:** mais classes no projeto e abstração adicional.

### 3. DTO (Data Transfer Object)

#### Problema identificado
As rotas HTTP não deveriam trabalhar diretamente com as entidades do banco de dados.

#### Padrão observado
O projeto usa DTOs para entrada e saída:
- `LoginRequest`
- `RegistroRequest`
- `MudarSenhaRequest`
- `TituloRequest`
- `TituloResponse`

#### Por que é adequado
- separa o modelo de banco da API REST
- permite validação de dados no nível do transporte
- protege a entidade de mudanças diretas pela camada de apresentação

#### Consequências
- **Benefícios:** contrato de API explícito, maior robustez.
- **Trade-offs:** necessidade de mapeamento entre DTOs e entidades.

## Revisão do padrão no contexto do CineLog

A aplicação já possui uma arquitetura em camadas:
- controladores tratam requisições HTTP
- serviços contêm regras de negócio
- repositórios gerenciam a persistência
- DTOs definem contratos de entrada/saída

Essas camadas refletem aplicações bem-sucedidas de padrões de projeto, como Repository e Factory, e ajudam a manter o sistema flexível para evolução futura.

