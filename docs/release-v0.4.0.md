# Release v0.4.0 — Entrega 8 (Sprint 4)

**Data:** 08/06/2026

## Resumo
Esta release consolida a Entrega 8 (Sprint 4) do CineLog. O foco desta entrega foi tornar o MVP reprodutível e documentado, atualizar o pipeline de CI, registrar uma refatoração orientada a manutenção e publicar evidências das métricas atualizadas.

## Pontos entregues
- Ambiente de homologação local documentado em `docs/DEPLOY.md` (instruções de build/execução e validação).
- Pipeline de CI atualizado em `.github/workflows/ci.yml` (validações e execução automática em `main`).
- ADR atualizado: `docs/adrs/ADR-0003.md` (decisão sobre homologação local reprodutível).
- Métricas da Sprint 4 atualizadas em `docs/metricas.md`.
- Registro de contribuições individuais atualizado em `docs/contribuicoes-individuais.md`.
- Ajustes frontend estático em `cinelog/src/main/resources/static/` (login, catálogo e estilos).
- Evidências de build e testes locais: `./gradlew clean build` e execução com `./gradlew bootRun`.

## Refatoração e evidências
- Refatoração/ajuste de pacotes e organização de código backend para correção de paths e builds (commits na branch `Entrega-8-sprint-4`).
- ADR registrado em `docs/adrs/ADR-0003.md` quando a decisão teve impacto arquitetural.

## Como validar esta release
1. Clonar o repositório e checar a branch `Entrega-8-sprint-4` ou usar esta tag.
2. Seguir `docs/DEPLOY.md` para build e execução local.
3. Verificar endpoints: `http://localhost:8080/index.html` e `http://localhost:8080/catalogo.html`.

## Observações
- A release `v0.4.0` aponta para o estado estável do MVP validado localmente (homologação local reprodutível).
- Para criar uma release GitHub com notas completas, acesse a página de Releases do repositório e selecione a tag `v0.4.0`.

---

Arquivos chave: `docs/DEPLOY.md`, `docs/adrs/ADR-0003.md`, `docs/metricas.md`, `.github/workflows/ci.yml`, `docs/contribuicoes-individuais.md`.
