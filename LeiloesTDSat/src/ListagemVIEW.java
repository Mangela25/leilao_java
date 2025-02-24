/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gel_m
 */
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;

/*
 * Código completo para Listagem de Produtos com funcionalidade de Vender
 * Esta aplicação simula a interface gráfica para listar produtos e "vender" um produto.
 */

public class ListagemVIEW extends javax.swing.JFrame {

    // Declaração dos componentes
    private javax.swing.JButton btnVender;
    private javax.swing.JButton btnVendas;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JTextPane id_produto_venda;
    private javax.swing.JTable listaProdutos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;

    // Construtor da classe
    public ListagemVIEW() {
        initComponents();
        listarProdutos();
    }

    // Método que cria os componentes gráficos da interface
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaProdutos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        id_produto_venda = new javax.swing.JTextPane();
        btnVender = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnVendas = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        // Configuração da Tabela de Produtos
        listaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Valor", "Status"
            }
        ));
        jScrollPane1.setViewportView(listaProdutos);

        // Título da janela
        jLabel1.setFont(new java.awt.Font("Lucida Fax", 0, 18));
        jLabel1.setText("Lista de Produtos");

        // Rótulo de ID do produto para vender
        jLabel2.setFont(new java.awt.Font("Lucida Fax", 0, 14));
        jLabel2.setText("Vender Produto (ID)");

        jScrollPane2.setViewportView(id_produto_venda);

        // Botão "Vender"
        btnVender.setText("Vender");
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });

        // Botão "Consultar Vendas"
        btnVendas.setText("Consultar Vendas");
        btnVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendasActionPerformed(evt);
            }
        });

        // Botão "Voltar"
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        // Layout da interface gráfica
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVender))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnVoltar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(193, 193, 193))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVender))
                .addGap(29, 29, 29)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVendas)
                    .addComponent(btnVoltar))
                .addGap(17, 17, 17))
        );

        pack();
    }

    // Ação do botão "Vender"
    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {
        String id = id_produto_venda.getText();
        
        // Aqui você faria a lógica de vender o produto
        // Exemplo de chamada para uma função que realiza a venda no banco de dados
        // produtosdao.venderProduto(Integer.parseInt(id));
        
        listarProdutos(); // Atualiza a lista de produtos após a venda
    }

    // Ação do botão "Consultar Vendas"
    private void btnVendasActionPerformed(java.awt.event.ActionEvent evt) {
        // Aqui você pode implementar a tela de consulta de vendas
        // Exemplo: new VendasVIEW().setVisible(true);
    }

    // Ação do botão "Voltar"
    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose(); // Fecha a janela atual
    }

    // Método para listar os produtos na tabela
    private void listarProdutos() {
        try {
            // Aqui você simula a listagem dos produtos no banco de dados
            // Em um caso real, você chamaria um DAO para obter os produtos do banco

            DefaultTableModel model = (DefaultTableModel) listaProdutos.getModel();
            model.setNumRows(0); // Limpa a tabela antes de preencher com os dados atualizados
            
            // Lista de exemplo (substitua com a consulta ao banco de dados)
            ArrayList<ProdutoDTO> listagem = new ArrayList<>();
            listagem.add(new ProdutoDTO(1, "Produto A", 10.0, "Disponível"));
            listagem.add(new ProdutoDTO(2, "Produto B", 20.0, "Disponível"));
            listagem.add(new ProdutoDTO(3, "Produto C", 30.0, "Vendida"));

            for (ProdutoDTO produto : listagem) {
                model.addRow(new Object[]{
                    produto.getId(),
                    produto.getNome(),
                    produto.getValor(),
                    produto.getStatus()
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Classe DTO para Produto (usada como exemplo)
    class ProdutoDTO {
        private int id;
        private String nome;
        private double valor;
        private String status;

        public ProdutoDTO(int id, String nome, double valor, String status) {
            this.id = id;
            this.nome = nome;
            this.valor = valor;
            this.status = status;
        }

        public int getId() {
            return id;
        }

        public String getNome() {
            return nome;
        }

        public double getValor() {
            return valor;
        }

        public String getStatus() {
            return status;
        }
    }

    // Método principal para rodar a aplicação
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListagemVIEW().setVisible(true);
            }
        });
    }
}
