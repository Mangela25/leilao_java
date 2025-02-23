/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gel_m
 */
import javax.swing.JOptionPane;

public class cadastroVIEW extends javax.swing.JFrame {

    public cadastroVIEW() {
        initComponents();
    }

    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cadastroNome = new javax.swing.JTextField();
        cadastroValor = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnCadastrar = new javax.swing.JButton();
        btnProdutos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 0, 24)); 
        jLabel1.setText("Sistema de Leilões");

        jLabel3.setText("Cadastre um novo produto");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        jLabel4.setText("Nome:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        jLabel5.setText("Valor:");

        btnCadastrar.setBackground(new java.awt.Color(153, 255, 255));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnProdutos.setText("Consultar Produtos");
        btnProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(btnCadastrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(202, 202, 202)
                            .addComponent(jLabel3))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(72, 72, 72)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addGap(31, 31, 31)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cadastroNome)
                                .addComponent(cadastroValor, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cadastroNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cadastroValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnCadastrar)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(btnProdutos)
                .addGap(22, 22, 22))
        );


        pack();
    }

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // Obter os valores dos campos
        String nome = cadastroNome.getText();
        String valorText = cadastroValor.getText();
        
        // Verificar se os campos estão preenchidos
        if (nome.isEmpty() || valorText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos os campos devem ser preenchidos!", "Erro", JOptionPane.ERROR_MESSAGE);
            return; // Interrompe o método se algum campo estiver vazio
        }

        // Verificar se o valor é um número válido
        int valor;
        try {
            valor = Integer.parseInt(valorText);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "O valor deve ser um número válido!", "Erro", JOptionPane.ERROR_MESSAGE);
            return; // Interrompe o método se o valor não for um número
        }

        // Se passou pelas validações, criar o objeto produto e fazer o cadastro
        ProdutosDTO produto = new ProdutosDTO();
        String status = "A Venda";  // Esse valor é definido como "A Venda" por padrão

        produto.setNome(nome);
        produto.setValor(valor);
        produto.setStatus(status);

        ProdutosDAO produtodao = new ProdutosDAO();
        boolean sucesso = produtodao.cadastrarProduto(produto);

        // Mostrar a mensagem dependendo do sucesso do cadastro
        if (sucesso) {
            JOptionPane.showMessageDialog(this, "Produto cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar produto. Tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }                                            

    private void btnProdutosActionPerformed(java.awt.event.ActionEvent evt) {                                            
        listagemVIEW listagem = new listagemVIEW(); 
        listagem.setVisible(true);
    }                                           

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastroVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnProdutos;
    private javax.swing.JTextField cadastroNome;
    private javax.swing.JTextField cadastroValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration                   
}
