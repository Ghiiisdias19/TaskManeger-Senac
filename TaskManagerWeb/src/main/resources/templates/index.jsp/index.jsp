<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Página Inicial</title>
</head>
<body>
    <header>
        <h1>Bem-vindo ao Sistema de Gerenciamento de Tarefas</h1>
    </header>
    <main>
        <section>
            <h2>Formulário de Login</h2>
            <form action="loginServlet" method="post">
                <label for="username">Usuário:</label>
                <input type="text" id="username" name="username" required><br>
                <label for="password">Senha:</label>
                <input type="password" id="password" name="password" required><br>
                <input type="submit" value="Login">
            </form>
        </section>
        <section>
            <h2>Links Úteis</h2>
            <ul>
                <li><a href="register.jsp">Registrar</a></li>
                <li><a href="tasks.jsp">Ver Tarefas</a></li>
            </ul>
        </section>
    </main>
    <footer>
        <p>Rodapé do Sistema de Gerenciamento de Tarefas</p>
    </footer>
</body>
</html>