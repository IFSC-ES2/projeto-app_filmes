# Backlog de Issues

Este documento apresenta as issues planejadas para evidenciar o backlog do projeto, incluindo o trabalho da Sprint 1 e itens do MVP pendentes.

## Issues da Sprint 1 (vertical slice de autenticação)

1. **Implementar registro de usuário**
   - Descrição: Criar endpoint de cadastro de usuário com validação de e-mail único.
   - Critérios de aceitação:
     - o usuário pode se registrar com nome, e-mail e senha
     - e-mail duplicado é rejeitado
     - dados são persistidos em H2
   - Status: concluído
   - Evidências: `UsuarioService`, `UsuarioRepository`, `Usuario`.

2. **Implementar login de usuário**
   - Descrição: Criar endpoint de autenticação com verificação de senha.
   - Critérios de aceitação:
     - usuário existente pode logar com e-mail e senha
     - senha incorreta retorna erro apropriado
   - Status: concluído
   - Evidências: `AuthController`, `UsuarioService`.

3. **Criar testes automatizados de unidade**
   - Descrição: Adicionar testes unitários para regras de negócio de autenticação.
   - Critérios de aceitação:
     - testes executam com `./gradlew.bat test`
     - validam cadastro, duplicidade de e-mail e login
   - Status: concluído
   - Evidências: `cinelog/src/test/java/com/example/cinelog/UsuarioServiceTests.java`.

4. **Configurar CI no GitHub Actions**
   - Descrição: Configurar pipeline para executar testes automaticamente em push/PR.
   - Critérios de aceitação:
     - workflow `CI` em `.github/workflows/ci.yml`
     - roda `./gradlew test`
   - Status: concluído
   - Evidências: `.github/workflows/ci.yml`.

5. **Documentar entrega de Sprint 1**
   - Descrição: Criar artefato com o que foi entregue e como testar.
   - Critérios de aceitação:
     - documento com escopo e instruções de teste
     - link no README
   - Status: concluído
   - Evidências: `docs/entrega-sprint1.md`, `README.md`.

## Issues pendentes para o MVP

6. **Cadastro de título (filme/série)**
   - Descrição: Criar funcionalidade para o usuário registrar um título assistido.
   - Critérios de aceitação:
     - o usuário pode cadastrar título com nome e tipo
     - o registro é salvo no banco
   - Status: pendente

7. **Registro de avaliação**
   - Descrição: Permitir que o usuário atribua nota de 1 a 5 a um título.
   - Critérios de aceitação:
     - nota é associada ao título e ao usuário
     - nota inválida é rejeitada
   - Status: pendente

8. **Listagem de títulos avaliados**
   - Descrição: Exibir os títulos registrados com suas avaliações.
   - Critérios de aceitação:
     - lista é retornada por endpoint ou interface
     - inclui título, nota e data de registro
   - Status: pendente

9. **Exclusão de registro**
   - Descrição: Permitir remoção de um título/avaliação.
   - Critérios de aceitação:
     - o usuário pode excluir um registro existente
     - exclusão não afeta outros registros
   - Status: pendente