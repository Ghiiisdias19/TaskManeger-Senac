<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Página de Registro</title>
    <script>
        function validateForm() {
            var email = document.getElementById("email").value;
            var emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
            if (!emailPattern.test(email)) {
                alert("Formato de email inválido");
                return false;
            }
            return true;
        }
    </script>
</head>
<body>
    <header>
        <h1>Registre-se</h1>
    </header>
    <main>
        <section>
            <h2>Formulário de Registro</h2>
            <form action="registerServlet" method="post" onsubmit="return validateForm()">
                <label for="username">Usuário:</label>
                <input type="text" id="username" name="username" required><br>
                <label for="email">Email:</label>
                <input type="email" id="email" name="email" required><br>
                <label for="password">Senha:</label>
                <input type="password" id="password" name="password" required><br>
                <input type="submit" value="Registrar">
            </form>
        </section>
    </main>
    <footer>
        <p>Rodapé do Sistema de Gerenciamento de Tarefas</p>
    </footer>
</body>
</html>
