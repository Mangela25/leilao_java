/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gel_m
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    // Método que retorna a conexão com o banco de dados
    public static Connection getConnection() throws SQLException {
        try {
            // Registrar o driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Conectar com o banco de dados
            return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/seu_banco_de_dados", "usuario", "senha");
        } catch (ClassNotFoundException e) {
            throw new SQLException("Driver não encontrado: " + e.getMessage());
        }
    }
}
