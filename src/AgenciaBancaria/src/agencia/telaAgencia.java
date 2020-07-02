package agencia;

import contas.*;
import javax.swing.JOptionPane;

public class telaAgencia extends javax.swing.JFrame {
   
    public telaAgencia() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelNumero = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jLabelNovoSaldo = new javax.swing.JLabel();
        jTextFieldSaldo = new javax.swing.JTextField();
        jLabelTipo = new javax.swing.JLabel();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jLabelCurso1 = new javax.swing.JLabel();
        jTextFieldCurso = new javax.swing.JTextField();
        jButtonCriarConta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agência");
        setResizable(false);

        jLabelNome.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelNome.setText("Nome:");

        jTextFieldNome.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabelNumero.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelNumero.setText("Nº:");

        jTextFieldNumero.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabelNovoSaldo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelNovoSaldo.setText("Saldo:");

        jTextFieldSaldo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabelTipo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelTipo.setText("Tipo de conta:");

        jComboBoxTipo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Especial", "Poupança", "Universitária" }));
        jComboBoxTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxTipoItemStateChanged(evt);
            }
        });

        jLabelCurso1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelCurso1.setText("Curso:");

        jTextFieldCurso.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextFieldCurso.setEnabled(false);

        jButtonCriarConta.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButtonCriarConta.setText("Criar conta");
        jButtonCriarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCriarContaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelCurso1)
                            .addGap(18, 18, 18)
                            .addComponent(jTextFieldCurso))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelTipo)
                            .addGap(18, 18, 18)
                            .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelNumero)
                            .addGap(18, 18, 18)
                            .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabelNovoSaldo)
                            .addGap(18, 18, 18)
                            .addComponent(jTextFieldSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jButtonCriarConta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelNome)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelNumero)
                        .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelNovoSaldo)
                        .addComponent(jTextFieldSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTipo)
                    .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCurso1)
                    .addComponent(jTextFieldCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonCriarConta)
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButtonCriarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCriarContaActionPerformed
        
        String nome = jTextFieldNome.getText().trim();
        int numero;
        double saldo;
        String tipo = jComboBoxTipo.getSelectedItem().toString();
        String curso = jTextFieldCurso.getText().trim();
        
        if(nome.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "O campo nome está vazio!", 
                    "Erro ao criar conta", 0);
            return ;
        }
        
        try {
            numero = Integer.parseInt(jTextFieldNumero.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "O número da conta é inválido!", 
                    "Erro ao criar conta", 0);
            return ;
        }
        
        try {
            saldo = Double.parseDouble(jTextFieldSaldo.getText().trim());
            if(saldo < 0) {
                JOptionPane.showMessageDialog(rootPane, "O saldo não pode ser negativo!", 
                    "Erro ao criar conta", 0);
                return ;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "O valor do saldo é inválido!", 
                    "Erro ao criar conta", 0);
            return ;
        }
        
        if(tipo.equals("Universitária") && curso.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "O campo curso está vazio!", 
                    "Erro ao criar conta", 0);
            return ;
        }
        
        // Criação da conta
        
        switch(tipo) {
            
            case "Especial":
                
                ContaEspecial contaEspecial;
                contaEspecial = new ContaEspecial(nome, numero, saldo);
                new telaConta(contaEspecial).setVisible(true);
                break;
                
            case "Poupança":
                
                ContaPoupanca contaPoupanca;
                contaPoupanca = new ContaPoupanca(nome, numero, saldo, 0);
                new telaConta(contaPoupanca).setVisible(true);
                break;
                
            case "Universitária":
                
                ContaUniversitaria contaUniversitaria;
                contaUniversitaria = new ContaUniversitaria(nome, numero, saldo, curso);
                new telaConta(contaUniversitaria).setVisible(true);
                break;
        }
        
        // Limpando campos para uma nova conta
        
        jTextFieldNome.setText("");
        jTextFieldNumero.setText("");
        jTextFieldSaldo.setText("");
        jTextFieldCurso.setText("");
        jComboBoxTipo.setSelectedIndex(0);
        jTextFieldNome.requestFocus();
                
    }//GEN-LAST:event_jButtonCriarContaActionPerformed

    private void jComboBoxTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxTipoItemStateChanged
        
        if(jComboBoxTipo.getSelectedItem().toString().equals("Universitária")) {
            jTextFieldCurso.setEnabled(true);
        } else {
            jTextFieldCurso.setText("");
            jTextFieldCurso.setEnabled(false);
        }
    }//GEN-LAST:event_jComboBoxTipoItemStateChanged
    
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
            java.util.logging.Logger.getLogger(telaAgencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaAgencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaAgencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaAgencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaAgencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCriarConta;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JLabel jLabelCurso1;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNovoSaldo;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JTextField jTextFieldCurso;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldSaldo;
    // End of variables declaration//GEN-END:variables
}