package dao;

import taskmaneger.Task;
import taskmaneger.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import  java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TaskDAO {
     private final Conexao conexao;
     private final Connection conn;

    public TaskDAO() {
        this.conexao = new Conexao();
        this.conn = (Connection) this.conexao.getConnection();
    }
    //INSERIR//

    /**
     *
     * @param task
     */
public void inserir(Task task) {
    Conexao conexao = new Conexao();
    if (conexao.conectar()) {
        String sql = "INSERT INTO Task(Title, Description, Priority, dueDate) VALUES (?, ?, ?, ?)";
        try {
            Connection con = conexao.getConnection();
            try (PreparedStatement sentenca = con.prepareStatement(sql)) {
                sentenca.setString(1, task.getTitle());
                sentenca.setString(2, task.getDescription());
                sentenca.setString(3, task.getPriority());

                // Verifica se dueDate é não nulo antes de tentar obter o valor da data
                if (task.getDueDate() != null) {
                    java.sql.Date dueDateSQL = new java.sql.Date(task.getDueDate().getTime());
                    sentenca.setDate(4, dueDateSQL);
                } else {
                    // Se dueDate for nulo, define a coluna como NULL no banco de dados
                    sentenca.setNull(4, java.sql.Types.DATE);
                }

                sentenca.execute();
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    } else {
        System.out.println("Não foi possível conectar ao banco de dados.");
    }
}




     //EXCLUIR//
     public void excluir(int id){
         String sql = "DELETE FROM Task WHERE id = ?";
         
         try
         {
             if(this.conexao.conectar())
             {
                 try (PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql)) {
                     sentenca.setInt(1, id);
                     sentenca.execute();
                 }
                 this.conexao.getConnection().close();
             }
         }
         catch (SQLException ex) 
         {
        throw new RuntimeException(ex);
         }
     }
     
     //CONSULTAR//

public List<Task> consultar() {
    List<Task> listaTarefas = new ArrayList<>();
    String sql = "SELECT * FROM TASK";

    try {
        if (this.conexao.conectar()) {
            try (PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql)) {
                ResultSet resultadoSentenca = sentenca.executeQuery();

                while (resultadoSentenca.next()) {
                    Task task = new Task();

                    task.setId(resultadoSentenca.getInt("id"));
                    task.setTitle(resultadoSentenca.getString("Title"));
                    task.setDescription(resultadoSentenca.getString("Description"));
                    task.setPriority(resultadoSentenca.getString("Priority"));
                    task.setDueDate(resultadoSentenca.getDate("DueDate"));

                    listaTarefas.add(task);
                }
            }
            this.conexao.getConnection().close();
        }
    } catch (SQLException ex) {
        throw new RuntimeException(ex);
    }

    return listaTarefas;
}


     
     }