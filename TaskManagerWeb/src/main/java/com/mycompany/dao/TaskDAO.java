package com.mycompany.dao;

import com.mycompany.taskmaneger.Conexao;
import com.mycompany.taskmaneger.Task;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TaskDAO {
    private final Conexao conexao;
    private final Connection conn;

    public TaskDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConnection();
    }
    // INSERIR //
    public void inserir(Task task) {
        String sql = "INSERT INTO Task(Title, Description, Priority, dueDate) VALUES (?, ?, ?, ?)";

        try (PreparedStatement sentenca = conn.prepareStatement(sql)) {
            sentenca.setString(1, task.getTitle());
            sentenca.setString(2, task.getDescription());
            sentenca.setString(3, task.getPriority());
            if (task.getDueDate() != null) {
                java.sql.Date dueDateSQL = new java.sql.Date(task.getDueDate().getTime());
                sentenca.setDate(4, dueDateSQL);
            } else {
                sentenca.setNull(4, java.sql.Types.DATE);
            }

            sentenca.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir tarefa: " + e.getMessage(), e);
        }
    }
    // EXCLUIR //
    public void excluir(int id) {
        String sql = "DELETE FROM Task WHERE id = ?";

        try (PreparedStatement sentenca = conn.prepareStatement(sql)) {
            sentenca.setInt(1, id);
            sentenca.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao excluir tarefa: " + e.getMessage(), e);
        }
    }
    // CONSULTAR //
    public List<Task> consultar() {
        List<Task> listaTarefas = new ArrayList<>();
        String sql = "SELECT * FROM Task";

        try (PreparedStatement sentenca = conn.prepareStatement(sql);
             ResultSet resultadoSentenca = sentenca.executeQuery()) {

            while (resultadoSentenca.next()) {
                Task task = new Task();
                task.setId(resultadoSentenca.getInt("id"));
                task.setTitle(resultadoSentenca.getString("Title"));
                task.setDescription(resultadoSentenca.getString("Description"));
                task.setPriority(resultadoSentenca.getString("Priority"));
                task.setDueDate(resultadoSentenca.getDate("dueDate"));
                listaTarefas.add(task);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao consultar tarefas: " + e.getMessage(), e);
        }

        return listaTarefas;
    }
    // Fechar Conexão //
    public void fecharConexao() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao fechar conexão: " + e.getMessage(), e);
        }
    }
}
