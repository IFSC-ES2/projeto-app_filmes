# Deploy e Homologação — CineLog

## 1. Objetivo
Este documento descreve como construir, executar e validar o CineLog em um ambiente de homologação local reprodutível. O projeto não tem deploy remoto publicado no repositório; a alternativa válida é a execução local do servidor Spring Boot com acesso à interface via navegador.

## 2. Pré-requisitos
- Java 21 JDK instalado.
- Acesso ao repositório local.
- Conexão de rede para baixar dependências na primeira execução.
- O projeto é executado a partir da pasta `cinelog`.

## 3. Variáveis de ambiente
Nenhuma variável de ambiente obrigatória é exigida para esta versão do MVP.

## 4. Comandos de build
### Windows
```powershell
cd cinelog
.\gradlew.bat clean build
```

### Linux/macOS
```bash
cd cinelog
chmod +x ./gradlew
./gradlew clean build
```

## 5. Comandos de execução
### Windows
```powershell
cd cinelog
.\gradlew.bat bootRun
```

### Linux/macOS
```bash
cd cinelog
chmod +x ./gradlew
./gradlew bootRun
```

## 6. Validação do ambiente
1. Acesse `http://localhost:8080/index.html`.
2. Cadastre um usuário ou faça login com um usuário existente.
3. Abra `http://localhost:8080/catalogo.html`.
4. Cadastre um título e confirme a exibição no catálogo.
5. Use a funcionalidade de mudança de senha no catálogo e valide a mensagem de sucesso ou erro.
6. Verifique o carregamento dos arquivos estáticos `login.jsx`, `main.jsx`, `catalogo.html` e `estilo.css`.

## 7. Processo de deploy
1. Garanta que o Java 21 esteja instalado.
2. Execute `clean build` no diretório `cinelog`.
3. Execute `bootRun` no diretório `cinelog`.
4. Acesse `http://localhost:8080/index.html` para validação.

## 8. Reprodutibilidade
O ambiente local documentado é a alternativa equivalente ao staging para esta aplicação. A utilização de H2 em memória e do frontend estático integrado ao backend torna a homologação local um método previsível e suficiente para validação do MVP.

## 9. Observações
- Não há necessidade de instalar dependências de frontend com `npm` ou `package.json`.
- O conjunto de arquivos do frontend é servido diretamente pelo Spring Boot a partir de `cinelog/src/main/resources/static/`.
