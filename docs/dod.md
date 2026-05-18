# Definition of Done (DoD) — Critérios

Uma issue ou história de usuário só será movida para a coluna de **"Concluído" (Done)** no board do projeto se atender rigorosamente aos seguintes critérios estabelecidos pelo time:

## 1. Qualidade de Código e Padrões

* O código Java deve seguir o padrão CamelCase para variáveis/métodos e PascalCase para classes.

* O código passou por uma etapa de limpeza, garantindo que não existam trechos comentados sem uso ou prints desnecessários no console.

## 2. Testes e Validação

* Foram desenvolvidos e executados com sucesso os testes unitários correspondentes à lógica de negócio implementada.

* A build e a execução dos testes automatizados foram validadas localmente com o comando `./gradlew test`.

## 3. Revisão por Pares 

* As alterações foram submetidas obrigatoriamente por meio de um Pull Request preenchido com clareza.

* O Pull Request recebeu, no mínimo, **1 aprovação** de outro integrante do time após a revisão do código.

## 4. Integração Contínua e Documentação

* O pipeline do GitHub Actions (`CineLog CI`) executou todas as etapas com sucesso e retornou o status "verde".

* Caso a alteração impacte o modelo de dados ou inclua novos endpoints, a documentação pertinente (como o arquivo de entregas da sprint) foi devidamente atualizada.
