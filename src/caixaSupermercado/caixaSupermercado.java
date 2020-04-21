package caixaSupermercado;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;

public class caixaSupermercado extends javax.swing.JFrame {
    
        produto cachorro_quente, hamburger, misto, refrigerante;
        List<produto> produtos = new ArrayList<>();
        
        int codigo = 0, quantidade = 1;
        String nome;
        double precoUnitario = 0, valorCompra = 0, pagamento = 0, troco = 0;
                
        public caixaSupermercado() {
            
        initComponents();
        
        // Inicializa as variáves com as características dos produtos
        cachorro_quente = new produto(100, "Cachorro-quente", 4.5);
        hamburger = new produto(101, "Hamburger", 5);
        misto = new produto(102, "Misto", 2.75);
        refrigerante = new produto(103, "Refrigerante", 3.5);
        
        // Adiciona as variáveis à lista de produtos
        produtos.add(0, cachorro_quente);
        produtos.add(1, hamburger);
        produtos.add(2, misto);
        produtos.add(3, refrigerante);
        
        // Cria um modelo com os valores para o spinner 
        // Os valores são: padrão, mínimo, máximo, passo
        SpinnerNumberModel model = new SpinnerNumberModel(1, 1, 5, 1); 
        
        // Aplica o modelo ao spinner
        jSpinnerQuantidade.setModel(model);
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelProduto = new javax.swing.JPanel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        jLabelQuantidade = new javax.swing.JLabel();
        jSpinnerQuantidade = new javax.swing.JSpinner();
        jLabelPrecoUnitario = new javax.swing.JLabel();
        jTextFieldPrecoUnitario = new javax.swing.JTextField();
        jPanelCompra = new javax.swing.JPanel();
        jLabelValorCompra = new javax.swing.JLabel();
        jLabelPagamento = new javax.swing.JLabel();
        jTextFieldPagamento = new javax.swing.JTextField();
        jButtonFinalizarCompra = new javax.swing.JButton();
        jTextFieldValorCompra = new javax.swing.JTextField();
        jPanelConsulta = new javax.swing.JPanel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabelCodigo = new javax.swing.JLabel();
        jButtonRealizarConsulta = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Caixa de supermercado");
        setResizable(false);

        jPanelProduto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Produto", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 0, 18))); // NOI18N

        jTextFieldNome.setEditable(false);
        jTextFieldNome.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextFieldNome.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldNome.setToolTipText("");
        jTextFieldNome.setFocusable(false);

        jLabelNome.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelNome.setText("Nome:");

        jLabelQuantidade.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelQuantidade.setText("Quantidade:");

        jSpinnerQuantidade.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinnerQuantidade.setToolTipText("Quantidade");
        jSpinnerQuantidade.setNextFocusableComponent(jTextFieldPagamento);
        jSpinnerQuantidade.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerQuantidadeStateChanged(evt);
            }
        });

        jLabelPrecoUnitario.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelPrecoUnitario.setText("Preço unitário (R$):");
        jLabelPrecoUnitario.setToolTipText("Valor unitáio");

        jTextFieldPrecoUnitario.setEditable(false);
        jTextFieldPrecoUnitario.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextFieldPrecoUnitario.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldPrecoUnitario.setFocusable(false);

        javax.swing.GroupLayout jPanelProdutoLayout = new javax.swing.GroupLayout(jPanelProduto);
        jPanelProduto.setLayout(jPanelProdutoLayout);
        jPanelProdutoLayout.setHorizontalGroup(
            jPanelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelProdutoLayout.createSequentialGroup()
                        .addComponent(jLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldNome))
                    .addGroup(jPanelProdutoLayout.createSequentialGroup()
                        .addGroup(jPanelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPrecoUnitario)
                            .addComponent(jLabelQuantidade))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSpinnerQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                            .addComponent(jTextFieldPrecoUnitario))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelProdutoLayout.setVerticalGroup(
            jPanelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPrecoUnitario)
                    .addComponent(jTextFieldPrecoUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelQuantidade)
                    .addComponent(jSpinnerQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelCompra.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Compra", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 0, 18))); // NOI18N

        jLabelValorCompra.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelValorCompra.setText("Valor (R$):");

        jLabelPagamento.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelPagamento.setText("Pagamento (R$):");

        jTextFieldPagamento.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextFieldPagamento.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jButtonFinalizarCompra.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButtonFinalizarCompra.setText("Finalizar compra");
        jButtonFinalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizarCompraActionPerformed(evt);
            }
        });

        jTextFieldValorCompra.setEditable(false);
        jTextFieldValorCompra.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextFieldValorCompra.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldValorCompra.setFocusable(false);

        javax.swing.GroupLayout jPanelCompraLayout = new javax.swing.GroupLayout(jPanelCompra);
        jPanelCompra.setLayout(jPanelCompraLayout);
        jPanelCompraLayout.setHorizontalGroup(
            jPanelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCompraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonFinalizarCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                    .addGroup(jPanelCompraLayout.createSequentialGroup()
                        .addComponent(jLabelPagamento)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldPagamento))
                    .addGroup(jPanelCompraLayout.createSequentialGroup()
                        .addComponent(jLabelValorCompra)
                        .addGap(59, 59, 59)
                        .addComponent(jTextFieldValorCompra)))
                .addContainerGap())
        );
        jPanelCompraLayout.setVerticalGroup(
            jPanelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCompraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelValorCompra)
                    .addComponent(jTextFieldValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPagamento)
                    .addComponent(jTextFieldPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonFinalizarCompra)
                .addContainerGap())
        );

        jPanelConsulta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consulta", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 0, 18))); // NOI18N

        jTextFieldCodigo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextFieldCodigo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldCodigo.setToolTipText("Código");

        jLabelCodigo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelCodigo.setText("Código:");

        jButtonRealizarConsulta.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButtonRealizarConsulta.setText("Consultar");
        jButtonRealizarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRealizarConsultaActionPerformed(evt);
            }
        });

        jButtonLimpar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelConsultaLayout = new javax.swing.GroupLayout(jPanelConsulta);
        jPanelConsulta.setLayout(jPanelConsultaLayout);
        jPanelConsultaLayout.setHorizontalGroup(
            jPanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCodigo)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonRealizarConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelConsultaLayout.setVerticalGroup(
            jPanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodigo)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRealizarConsulta)
                    .addComponent(jButtonLimpar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanelProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanelCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanelConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRealizarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRealizarConsultaActionPerformed
        
        try {
            codigo = Integer.parseInt(jTextFieldCodigo.getText());
            
            for(produto p : produtos) {
                
                if(codigo == p.codigo) {
                    
                    // Define valores das variáves a partir dos valores do
                    // objeto selecionado da lista de produtos
                    nome = p.nome;
                    precoUnitario = p.precoUnitario;
                    quantidade = (int) jSpinnerQuantidade.getValue();
                    
                    // Define valores dos campos do produto
                    jTextFieldNome.setText(nome);
                    jTextFieldPrecoUnitario.setText(Double.toString(precoUnitario));
                    
                    // Define valores dos campos da compra
                    valorCompra = precoUnitario * quantidade;
                    jTextFieldValorCompra.setText(Double.toString(valorCompra));
                    
                    jSpinnerQuantidade.requestFocus();
                    
                    return ;
                }
            }
            JOptionPane.showMessageDialog(rootPane, "O código digitado não está"
                    + " cadastrado no sistema.", "Código inválido", 2);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "O código digitado não é válido!", 
                                          "Código inválido", 0);
        }
        
    }//GEN-LAST:event_jButtonRealizarConsultaActionPerformed

    public void limpar() {
        codigo = 0;
        nome = "";
        precoUnitario = 0;
        quantidade = 1;
        valorCompra = 0;
        pagamento = 0;
        troco = 0;
        
        jTextFieldCodigo.setText("");
        jTextFieldNome.setText("");
        jTextFieldPrecoUnitario.setText("");
        jSpinnerQuantidade.setValue(1);
        jTextFieldValorCompra.setText("");
        jTextFieldPagamento.setText("");
        
        jTextFieldCodigo.requestFocus();
    }
    
    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        limpar();
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jSpinnerQuantidadeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerQuantidadeStateChanged
        
        if(precoUnitario != 0) {
            quantidade = (int) jSpinnerQuantidade.getValue();
            valorCompra = precoUnitario * quantidade;
            jTextFieldValorCompra.setText(Double.toString(valorCompra));
        }
    }//GEN-LAST:event_jSpinnerQuantidadeStateChanged

    private void jButtonFinalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizarCompraActionPerformed
        
        if(valorCompra != 0) {
            
            try {
                pagamento = Double.valueOf(jTextFieldPagamento.getText());
                
                if(pagamento >= valorCompra) {
                    
                    troco = pagamento - valorCompra;
                    
                    JOptionPane.showMessageDialog(rootPane, "O pagamento foi"
                            + " realizado com sucesso!\n\n"
                            + "Troco (R$): " + troco, "Pagamento realizado", 1);
                    
                    limpar();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "O valor do pagamento"
                        + " é insuficiente!", "Pagamento insuficiente", 2);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, "O valor do pagamento"
                        + " é inválido", "Pagamento inválido", 0);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "O valor da compra"
                        + " é inválido", "Compra inválida", 2);
        }
    }//GEN-LAST:event_jButtonFinalizarCompraActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(caixaSupermercado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(caixaSupermercado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(caixaSupermercado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(caixaSupermercado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new caixaSupermercado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFinalizarCompra;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonRealizarConsulta;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelPagamento;
    private javax.swing.JLabel jLabelPrecoUnitario;
    private javax.swing.JLabel jLabelQuantidade;
    private javax.swing.JLabel jLabelValorCompra;
    private javax.swing.JPanel jPanelCompra;
    private javax.swing.JPanel jPanelConsulta;
    private javax.swing.JPanel jPanelProduto;
    private javax.swing.JSpinner jSpinnerQuantidade;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPagamento;
    private javax.swing.JTextField jTextFieldPrecoUnitario;
    private javax.swing.JTextField jTextFieldValorCompra;
    // End of variables declaration//GEN-END:variables
}