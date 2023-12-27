package taskmaneger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
    
    private final String servidor;
    private final String banco;
    private final String usuario;
    private final String senha;
    private Connection conexao;
    
    public Conexao(){
        
        this.servidor = "localhost";
        this.banco = "taskmaneger";
        this.usuario = "root";
        this.senha = "@friends1994";
        this.conectar();
    }
    
        public boolean conectar(){
        try 
        {
                this.conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + this.banco, this.usuario, this.senha);
                return true;
        }
                
        catch(SQLException e){
             System.out.println("Erro ao conectar: " + e.getMessage());
                }
        return false;
    }
        
public Connection getConnection() {
    try {
        if (conexao == null || conexao.isClosed()) {
            // Adicione logs para debug
            System.out.println("Conexão nula ou fechada. Tentando estabelecer uma nova conexão.");
            // ... Restante do código
        }
        return conexao;
    } catch (SQLException e) {
        e.printStackTrace();
        return null;
    }
}
}