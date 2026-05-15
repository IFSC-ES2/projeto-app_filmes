function LoginPage() {
  const [aba, setAba] = React.useState("login");
  const [mensagem, setMensagem] = React.useState({ texto: "", sucesso: null });
  const [logado, setLogado] = React.useState(false);
  const [nomeUsuario, setNomeUsuario] = React.useState("");

  const [loginEmail, setLoginEmail] = React.useState("");
  const [loginSenha, setLoginSenha] = React.useState("");
  const [registerNome, setRegisterNome] = React.useState("");
  const [registerEmail, setRegisterEmail] = React.useState("");
  const [registerSenha, setRegisterSenha] = React.useState("");

  async function postAuth(url, dados, mostrarBemVindo) {
    try {
      const response = await fetch(url, {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(dados),
      });
      const body = await response.json();
      if (!response.ok) {
        setMensagem({ texto: body.message || "Erro ao processar.", sucesso: false });
        return;
      }
      setMensagem({ texto: body.message, sucesso: true });
      if (mostrarBemVindo) {
        setNomeUsuario(body.nome);
        setLogado(true);
      } else {
        setAba("login");
      }
    } catch {
      setMensagem({ texto: "Erro de conexão. Tente novamente.", sucesso: false });
    }
  }

  function handleLogin(e) {
    e.preventDefault();
    postAuth("/api/auth/login", { email: loginEmail, senha: loginSenha }, true);
  }

  function handleCadastro(e) {
    e.preventDefault();
    postAuth("/api/auth/register", { nome: registerNome, email: registerEmail, senha: registerSenha }, false);
  }

  function handleLogout() {
    setLogado(false);
    setNomeUsuario("");
    setMensagem({ texto: "", sucesso: null });
    setAba("login");
  }

  function trocarAba(novaAba) {
    setAba(novaAba);
    setMensagem({ texto: "", sucesso: null });
  }

  return (
    <>
      <header>
        <a className="logo" href="#">
          <div className="logo-icone">🍿</div>
          <span className="logo-texto">Cine<span>log</span></span>
        </a>
        <nav>
          <a href="#">Filmes</a>
          <a href="#">Séries</a>
          <a href="#">Top 100</a>
          <a href="#" className="nav-btn">Login</a>
        </nav>
      </header>

      <div className="pagina">
        <div className="login">
          {!logado && (
            <div className="tabs">
              <button className={`tab-button ${aba === "login" ? "active" : ""}`} onClick={() => trocarAba("login")}>Entrar</button>
              <button className={`tab-button ${aba === "cadastro" ? "active" : ""}`} onClick={() => trocarAba("cadastro")}>Cadastrar</button>
            </div>
          )}

          {mensagem.texto && (
            <div className={`message ${mensagem.sucesso ? "success" : "error"}`}>{mensagem.texto}</div>
          )}

          {!logado && aba === "login" && (
            <form onSubmit={handleLogin}>
              <h2>Entrar</h2>
              <p>Use seu e-mail e senha para acessar.</p>
              <label htmlFor="loginEmail">E-mail</label>
              <input id="loginEmail" type="email" placeholder="seu@email.com" value={loginEmail} onChange={e => setLoginEmail(e.target.value)} required />
              <label htmlFor="loginSenha">Senha</label>
              <input id="loginSenha" type="password" placeholder="••••••••" value={loginSenha} onChange={e => setLoginSenha(e.target.value)} required />
              <button type="submit">Entrar</button>
            </form>
          )}

          {!logado && aba === "cadastro" && (
            <form onSubmit={handleCadastro}>
              <h2>Cadastrar</h2>
              <p>Crie sua conta para usar o CineLog.</p>
              <label htmlFor="registerNome">Nome</label>
              <input id="registerNome" type="text" placeholder="Seu nome" value={registerNome} onChange={e => setRegisterNome(e.target.value)} required />
              <label htmlFor="registerEmail">E-mail</label>
              <input id="registerEmail" type="email" placeholder="seu@email.com" value={registerEmail} onChange={e => setRegisterEmail(e.target.value)} required />
              <label htmlFor="registerSenha">Senha</label>
              <input id="registerSenha" type="password" placeholder="••••••••" value={registerSenha} onChange={e => setRegisterSenha(e.target.value)} required minLength={6} />
              <button type="submit">Cadastrar</button>
            </form>
          )}

          {logado && (
            <div className="welcome-screen">
              <h2>Bem-vindo ao CineLog</h2>
              <p>Você está autenticado como {nomeUsuario}.</p>
              <button className="secondary-button" onClick={handleLogout}>Sair</button>
            </div>
          )}
        </div>
      </div>
    </>
  );
}