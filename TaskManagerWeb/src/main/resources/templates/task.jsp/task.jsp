<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Página de Tarefas</title>
</head>
<body>
    <header>
        <h1>Suas Tarefas</h1>
    </header>
    <main>
        <section>
            <h2>Lista de Tarefas</h2>
            <ul>
                <li>Tarefa 1</li>
                <li>Tarefa 2</li>
                <li>Tarefa 3</li>
            </ul>
        </section>
        <section>
            <h2>Adicionar Nova Tarefa</h2>
            <form action="addTaskServlet" method="post">
                <label for="task">Tarefa:</label>
                <input type="text" id="task" name="task" required><br>
                <input type="submit" value="Adicionar">
            </form>
        </section>
        <section>
            <h2>Editar Tarefa</h2>
            <form action="editTaskServlet" method="post">
                <label for="editTask">Selecione a Tarefa:</label>
                <select id="editTask" name="editTask">
                    <option value="1">Tarefa 1</option>
                    <option value="2">Tarefa 2</option>
                    <option value="3">Tarefa 3</option>
                </select><br>
                <label for="editedTask">Nova Descrição:</label>
                <input type="text" id="editedTask" name="editedTask" required><br>
                <input type="submit" value="Editar">
            </form>
        </section>
        <section>
            <h2>Excluir Tarefa</h2>
            <form action="deleteTaskServlet" method="post">
                <label for="deleteTask">Selecione a Tarefa:</label>
                <select id="deleteTask" name="deleteTask">
                    <option value="1">Tarefa 1</option>
                    <option value="2">Tarefa 2</option>
                    <option value="3">Tarefa 3</option>
                </select><br>
                <input type="submit" value="Excluir">
            </form>
        </section>
    </main>
    <footer>
        <p>Rodapé do Sistema de Gerenciamento de Tarefas</p>
    </footer>
</body>
</html>
