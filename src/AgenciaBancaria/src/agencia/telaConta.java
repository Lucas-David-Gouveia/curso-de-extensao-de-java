package agencia;

import contas.*;
import javax.swing.JOptionPane;

public class telaConta extends javax.swing.JFrame {
    
    ContaEspecial c1;
    ContaPoupanca c2;
    ContaUniversitaria c3;
    
    String tipo;
    
    public telaConta() {
        initComponents();
    }
    
    public telaConta(ContaEspecial contaEspecial) {
        initComponents();
        c1 = contaEspecial;
        tipo = "Especial";
    }
    
    public telaConta(ContaPoupanca contaPoupanca) {
        initComponents();
        c2 = contaPoupanca;
        tipo = "Poupança";
    }
    
    public telaConta(ContaUniversitaria contaUniversitaria) {
        initComponents();
        c3 = contaUniversitaria;
        tipo = "Universitária";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabelBemVindo = new javax.swing.JLabel();
        jPanelOperacoes = new javax.swing.JPanel();
        jButtonDepositar = new javax.swing.JButton();
        jButtonSacar = new javax.swing.JButton();
        jButtonVerTipo = new javax.swing.JButton();
        jButtonSaldo = new javax.swing.JButton();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Conta");
        setResizable(false);

        jLabelBemVindo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelBemVindo.setText("Olá Cliente, o que deseja?");

        jPanelOperacoes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Operações", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 0, 18))); // NOI18N

        jButtonDepositar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButtonDepositar.setText("Depositar");
        jButtonDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDepositarActionPerformed(evt);
            }
        });

        jButtonSacar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButtonSacar.setText("Sacar");
        jButtonSacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSacarActionPerformed(evt);
            }
        });

        jButtonVerTipo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButtonVerTipo.setText("Tipo de conta");
        jButtonVerTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerTipoActionPerformed(evt);
            }
        });

        jButtonSaldo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButtonSaldo.setText("Saldo");
        jButtonSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaldoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelOperacoesLayout = new javax.swing.GroupLayout(jPanelOperacoes);
        jPanelOperacoes.setLayout(jPanelOperacoesLayout);
        jPanelOperacoesLayout.setHorizontalGroup(
            jPanelOperacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOperacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelOperacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelOperacoesLayout.createSequentialGroup()
                        .addComponent(jButtonDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSacar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelOperacoesLayout.createSequentialGroup()
                        .addComponent(jButtonVerTipo)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSaldo)
                        .addGap(0, 2, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelOperacoesLayout.setVerticalGroup(
            jPanelOperacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOperacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelOperacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVerTipo)
                    .addComponent(jButtonSaldo))
                .addGap(18, 18, 18)
                .addGroup(jPanelOperacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSacar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelBemVindo)
                    .addComponent(jPanelOperacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabelBemVindo)
                .addGap(18, 18, 18)
                .addComponent(jPanelOperacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDepositarActionPerformed

        String val;
        Object tipoDeposito = null;
        
        if(tipo.equals("Poupança")) {
            
            Object[] itens = {"Saldo", "Poupança"};
            tipoDeposito = JOptionPane.showInputDialog(rootPane, "Escolha uma opção:", 
                    "Opções de depósito", 3, null, itens, itens[0]);
            
            if(tipoDeposito == null) {
                return ;
            }
            
        }
        
        val = JOptionPane.showInputDialog(rootPane, "Valor:", "Depósito", 3);
         
        if(val != null) {
            
            try {
                
                double valor = Double.parseDouble(val);

                if(valor > 0) {
                    
                    switch (tipo) {
                        case "Especial":
                            
                            c1.depositar(valor);
                            break;
                            
                        case "Poupança":
                            
                            if(tipoDeposito.toString().equals("Saldo")) {
                                c2.depositar(valor);
                            } else {
                                c2.depositarPoupanca(valor);
                            }
                            
                            break;
                            
                        case "Universitária":
                            
                            c3.depositar(valor);
                            break;
                    }
                    

                } else {

                    JOptionPane.showMessageDialog(rootPane,
                        "O valor deve ser maior que zero!",
                        "Erro ao realizar depósito", 0);
                }

            } catch (NumberFormatException e) {

                JOptionPane.showMessageDialog(rootPane, "Valor inválido!",
                "Erro ao realizar depósito", 0);
            }
        }

    }//GEN-LAST:event_jButtonDepositarActionPerformed

    private void jButtonSacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSacarActionPerformed

        String val;
        Object tipoSaque = null;
        
        if(tipo.equals("Poupança")) {
            
            Object[] itens = {"Saldo", "Poupança"};
            tipoSaque = JOptionPane.showInputDialog(rootPane, "Escolha uma opção:", 
                    "Opções de saque", 3, null, itens, itens[0]);
            
            if(tipoSaque == null) {
                return ;
            }
        }
        
        val = JOptionPane.showInputDialog(rootPane, "Valor:", "Saque", 3);

        if(val != null) {

            try {

                double valor = Double.parseDouble(val);

                if(valor > 0) {
                    
                    switch (tipo) {
                        
                        case "Especial":
                            
                            if(valor > c1.getSaldoLimite() + c1.getSaldo()) {
                                
                                JOptionPane.showMessageDialog(rootPane, "Saldo insuficiente!",
                                "Erro ao realizar saque 1", 0);
                                
                            } else if(valor > c1.getSaldo()) {
                                
                                if(!c1.sacarLimite(valor - c1.getSaldo())) {
                                    JOptionPane.showMessageDialog(rootPane, "Saldo insuficiente!",
                                    "Erro ao realizar saque 2", 0);
                                    return ;
                                }
                                
                                if(!c1.sacar(c1.getSaldo())) {
                                    JOptionPane.showMessageDialog(rootPane, "Saldo insuficiente!",
                                    "Erro ao realizar saque 3", 0);
                                }
                                
                            } else {
                                if(!c1.sacar(valor)) {
                                    JOptionPane.showMessageDialog(rootPane, "Saldo insuficiente!",
                                    "Erro ao realizar saque 4", 0);
                                }
                            }
                            
                            break;
                            
                        case "Poupança":
                            
                            if(tipoSaque.toString().equals("Saldo")) {
                                
                                if(!c2.sacar(valor)) {
                                    JOptionPane.showMessageDialog(rootPane, "Saldo insuficiente!",
                                    "Erro ao realizar saque", 0);
                                }
                                
                            } else {
                                
                                if(!c2.sacarPoupanca(valor)) {
                                    JOptionPane.showMessageDialog(rootPane, "Saldo insuficiente!",
                                    "Erro ao realizar saque", 0);
                                }
                            }
                            
                            break;
                            
                        case "Universitária":
                            
                            if(!c3.sacar(valor)) {
                                JOptionPane.showMessageDialog(rootPane, "Saldo insuficiente!",
                                    "Erro ao realizar saque", 0);
                            }
                            
                            break;
                    }

                } else {

                    JOptionPane.showMessageDialog(rootPane,
                        "O valor deve ser maior que zero!",
                        "Erro ao realizar saque", 0);
                }

            } catch (NumberFormatException e) {

                JOptionPane.showMessageDialog(rootPane, "Valor inválido!",
                    "Erro ao realizar saque", 0);
            }
        }

    }//GEN-LAST:event_jButtonSacarActionPerformed

    private void jButtonVerTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerTipoActionPerformed
        
        String infoConta = null;
        
        switch (tipo) {
            case "Especial":
                infoConta = "especial";
                break;
            case "Poupança":
                infoConta = "poupança";
                break;
            case "Universitária":
                infoConta = "universitária\n\nO curso do cliente é: " + 
                        c3.getCurso();
                break;
        }
        
        JOptionPane.showMessageDialog(rootPane, "Esta é uma conta do tipo: " + 
                infoConta, "Tipo de conta", 1);
        
    }//GEN-LAST:event_jButtonVerTipoActionPerformed

    private void jButtonSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaldoActionPerformed
        
        String infoConta = null;
        
        switch (tipo) {
                        case "Especial":
                            infoConta = "Saldo: R$" + c1.getSaldo() + "\n\n" +
                                    "Limite: R$" + c1.getSaldoLimite();
                            break;
                        case "Poupança":
                            infoConta = "Saldo: R$" + c2.getSaldo() + "\n\n" +
                                    "Poupança: R$" + c2.getPoupanca();
                            break;
                        case "Universitária":
                            infoConta = "Saldo: R$" + c3.getSaldo();
                            break;
                    }
        
        JOptionPane.showMessageDialog(rootPane, infoConta, "Saldo", 1);
        
    }//GEN-LAST:event_jButtonSaldoActionPerformed

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
            java.util.logging.Logger.getLogger(telaConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaConta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDepositar;
    private javax.swing.JButton jButtonSacar;
    private javax.swing.JButton jButtonSaldo;
    private javax.swing.JButton jButtonVerTipo;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabelBemVindo;
    private javax.swing.JPanel jPanelOperacoes;
    // End of variables declaration//GEN-END:variables
}