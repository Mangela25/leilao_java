/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gel_m
 */

import javax.swing.*;

public class VendasView extends javax.swing.JFrame {

    public VendasView() {
        initComponents();
        try {
            listarVendas();
        } catch (UnsupportedOperationException e) {
            JOptionPane.showMessageDialog(this, "Funcionalidade de listar produtos vendidos ainda não implementada.", "Erro", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void listarVendas() {
        ProdutosDAO produtosDAO = new ProdutosDAO();
        try {
            produtosDAO.listarProdutosVendidos();  // Pode lançar UnsupportedOperationException
        } catch (UnsupportedOperationException e) {
            JOptionPane.showMessageDialog(this, "Funcionalidade de listar produtos vendidos ainda não implementada.", "Erro", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void initComponents() {
        // Início do código da interface (não alterado)
    }
}
