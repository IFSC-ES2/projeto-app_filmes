# Entrega da Sprint 1

## Vertical Slice entregue

Nesta Sprint 1, a equipe entregou um vertical slice de autenticação de usuário, que inclui:

- Registro de usuário com formulário de frontend e backend Spring Boot.
- Login de usuário com autenticação básica e retorno de mensagem de sucesso.
- Persistência em banco de dados H2 em memória para os usuários cadastrados.
- Página estática `login.html` em `src/main/resources/static` com estilo CSS e integração via fetch.
- Testes automatizados para a camada de serviço de usuário.

## Como testar

1. Abra o terminal na pasta `cinelog`.
2. Execute `./gradlew.bat bootRun`.
3. Acesse `http://localhost:8080/login.html`.
4. Use o formulário para registrar e fazer login com um usuário.
5. Para executar a suíte de testes, rode `./gradlew.bat test`.

## CI/CD

Os testes são executados automaticamente no GitHub Actions sempre que há push ou pull request para a branch `main`.

Este vertical slice é uma entrega inicial do Sprint 1. O MVP completo do projeto ainda deverá avançar nas próximas sprints com as funcionalidades principais de registro de filmes/séries, avaliação, listagem e exclusão.
