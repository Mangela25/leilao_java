/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adm
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ProdutosDAO {
    
    private Connection conn;
    
    public ProdutosDAO() {
        try {
            // Ajuste aqui: adicione useSSL=false para desabilitar SSL na conexão
            String url = "jdbc:mysql://localhost:3306/nome_do_banco?useSSL=false";
            String usuario = "usuario";  // Coloque o nome de usuário correto
            String senha = "senha";  // Coloque a senha correta
            this.conn = DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Exemplo de um método para cadastrar um produto (já existe no seu código)
    public boolean cadastrarProduto(ProdutosDTO produto) {
        String sql = "INSERT INTO produtos (nome, valor, status) VALUES ('" 
                    + produto.getNome() + "', " 
                    + produto.getValor() + ", '" 
                    + produto.getStatus() + "')";
        
        try (Statement stmt = conn.createStatement()) {
            int resultado = stmt.executeUpdate(sql);
            return resultado > 0;  // Retorna true se foi inserido com sucesso
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Corrigir a exceção UnsupportedOperationException (caso ainda não tenha implementado)
    public void listarProdutosVendidos() {
        // Implementação do método ou, se não for implementado, apenas logue o erro
        throw new UnsupportedOperationException("Método listarProdutosVendidos não implementado ainda.");
    }
    
    // Fechar conexão quando não for mais necessário
    public void fecharConexao() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
