package com.mycompany.taskmaneger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    private final String servidor;
    private final String banco;
    private final String usuario;
    private final String senha;
    private Connection conexao;
    
    public Conexao() {
        this.servidor = "localhost";
        this.banco = "taskmaneger";
        this.usuario = "root";
        this.senha = "@friends1994";
        this.conectar();
    }
    
    public boolean conectar() {
        try {
            this.conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + this.banco, this.usuario, this.senha);
            System.out.println("Conexão estabelecida com sucesso.");
            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
            return false;
        }
    }
    
    public Connection getConnection() {
        try {
            if (conexao == null || conexao.isClosed()) {
                System.out.println("Conexão nula ou fechada. Tentando estabelecer uma nova conexão.");
                conectar();
            }
            return conexao;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public void fecharConexao() {
        try {
            if (conexao != null && !conexao.isClosed()) {
                conexao.close();
                System.out.println("Conexão fechada com sucesso.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao fechar conexão: " + e.getMessage());
        }
    }
    
    public boolean isConexaoAtiva() {
        try {
            return conexao != null && !conexao.isClosed();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}