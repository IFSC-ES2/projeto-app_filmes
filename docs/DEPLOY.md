# Deploy e Homologação — CineLog

## 1. Objetivo
Este documento descreve como construir, executar e validar o CineLog em um ambiente de staging e homologação. O projeto está deployado no Railway e também suporta execução local reprodutível.

## 2. Ambiente de Staging (Railway)

### URL Pública
- **Login:** https://cinelog-production-6510.up.railway.app/index.html
- **Catálogo:** https://cinelog-production-6510.up.railway.app/catalogo.html
- **Status:** Online e ativo
- **Crédito:** $5 USD/mês (suficiente para aplicação de baixo tráfego)

### Acesso
Sem credenciais predefinidas. Use a tela de registro para criar um novo usuário de teste.

### Infraestrutura
- **Hospedagem:** Railway
- **Container:** Docker (multi-stage build com JDK 25)
- **Banco de dados:** H2 em memória
- **Porta:** 8080 (mapeada automaticamente pelo Railway)

---

## 3. Pré-requisitos (Execução Local)
- Java 25 JDK instalado.
- Acesso ao repositório local.
- Conexão de rede para baixar dependências na primeira execução.
- O projeto é executado a partir da pasta `cinelog`.

## 4. Variáveis de Ambiente
Nenhuma variável de ambiente obrigatória é exigida para esta versão do MVP.

> **Nota:** No Railway, a variável `PORT` é definida automaticamente como `${PORT:8080}` em `application.properties`.

## 5. Processo de Deploy no Railway

### 5.1. Pré-requisitos
- Conta Railway (gratuita)
- Railway CLI instalado localmente
- Docker (opcional — Railway faz o build automaticamente)

### 5.2. Passos
1. Autentique no Railway:
```bash
railway login
```

2. Inicialize o projeto:
```bash
cd cinelog
railway init
```
Selecione ou crie um novo projeto Railway.

3. Faça deploy:
```bash
railway up
```

4. Obtenha a URL pública:
```bash
railway domain
```

### 5.3. Verificação
- Acesse a URL fornecida pelo Railway (ex: `https://cinelog-production-6510.up.railway.app`)
- Verifique os logs:
```bash
railway logs
```

---

## 6. Comandos de Build Local
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

## 7. Comandos de Execução Local
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

## 8. Validação do Ambiente

### Staging (Railway)
1. Acesse `https://cinelog-production-6510.up.railway.app/index.html`
2. Clique em "Registre-se"
3. Crie um novo usuário com nome, e-mail e senha (mín. 6 caracteres)
4. Faça login com o e-mail e senha criados
5. Abra `https://cinelog-production-6510.up.railway.app/catalogo.html`
6. Adicione um título e valide a exibição no catálogo
7. Teste a funcionalidade de mudança de senha

### Local
1. Execute `./gradlew bootRun` no diretório `cinelog`
2. Acesse `http://localhost:8080/index.html`
3. Siga os mesmos passos acima (steps 2-7)

## 9. Processo de Deploy Completo

### Para Railway
1. Garanta que a pasta `cinelog` contém `Dockerfile` e `.dockerignore`
2. Execute `railway up` e aguarde o build completar
3. Obtenha a URL com `railway domain`
4. Acesse a URL pública para validar

### Para Execução Local
1. Execute `./gradlew clean build` no diretório `cinelog`
2. Execute `./gradlew bootRun` no diretório `cinelog`
3. Acesse `http://localhost:8080/index.html` para validação

## 10. Reprodutibilidade

### Staging Railroad
- Ambiente cloud hospedado e ativo
- Acesso público sem necessidade de configuração local
- Crédito de $5 USD/mês (suficiente para aplicação de baixo tráfego)

### Ambiente Local
- Totalmente reproduzível com Git clone
- Sem dependência de plataformas externas
- Ideal para desenvolvimento e testes offline

Ambas as alternativas são válidas para apresentação ao professor.
