/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adm
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProdutosDAO {

    // Método para cadastrar produto no banco
    public boolean cadastrarProduto(ProdutosDTO produto) {
        Connection con = null;
        PreparedStatement pst = null;

        try {
            con = Conexao.getConnection(); // Conexão com o banco de dados
            String sql = "INSERT INTO produtos (nome, valor, status) VALUES (?, ?, ?)";
            pst = con.prepareStatement(sql);
            pst.setString(1, produto.getNome());
            pst.setInt(2, produto.getValor());
            pst.setString(3, produto.getStatus());

            int rowsAffected = pst.executeUpdate();
            return rowsAffected > 0; // Retorna true se o produto foi inserido com sucesso
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        } finally {
            try {
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    // Método para listar todos os produtos do banco de dados
    public ArrayList<ProdutosDTO> listarProdutos() {
    ArrayList<ProdutosDTO> produtosList = new ArrayList<>();
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    try {
        con = Conexao.getConnection(); // Conexão com o banco de dados
        String sql = "SELECT * FROM produtos"; // Consulta SQL
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery(); // Executa a consulta

        // Loop para preencher a lista com os dados do banco
        while (rs.next()) {
            ProdutosDTO produto = new ProdutosDTO();
            produto.setId(rs.getInt("id"));
            produto.setNome(rs.getString("nome"));
            produto.setValor(rs.getInt("valor"));
            produto.setStatus(rs.getString("status"));
            produtosList.add(produto); // Adiciona o produto na lista
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    } finally {
        try {
            if (rs != null) rs.close();
            if (pst != null) pst.close();
            if (con != null) con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    return produtosList; // Retorna a lista de produtos
    }
}
