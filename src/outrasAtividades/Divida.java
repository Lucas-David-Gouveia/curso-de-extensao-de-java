package outrasAtividades;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Divida extends javax.swing.JFrame {
    
    String cabecalho;
    double divida;
    
    int[] parcelas = {1, 3, 6, 9, 12};
    double[] juros = {0, 0.1, 0.15, 0.20, 0.25};

    public Divida() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldDivida = new javax.swing.JTextField();
        jLabelDivida = new javax.swing.JLabel();
        jButtonTabela = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculador de dívida");
        setResizable(false);

        jTextFieldDivida.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextFieldDivida.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabelDivida.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelDivida.setText("Valor da dívida (R$):");

        jButtonTabela.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButtonTabela.setText("Montar tabela");
        jButtonTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTabelaActionPerformed(evt);
            }
        });

        tabela.setColumns(1);
        tabela.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tabela.setRows(5);
        tabela.setText("Dívida (R$)\tJuros (R$)\tNº parcelas\tParcela (R$)\n---------------------------------------------------------------------------");
        jScrollPane2.setViewportView(tabela);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelDivida)
                        .addGap(30, 30, 30)
                        .addComponent(jTextFieldDivida, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButtonTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDivida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonTabela)
                    .addComponent(jLabelDivida))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTabelaActionPerformed
        
        try {
            divida = Double.parseDouble(jTextFieldDivida.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane,
                    "O valor da dívida deve ser numérico!",
                    "Valor inválido", 0);
            jTextFieldDivida.setText("");
            jTextFieldDivida.requestFocus();
            return ;
        }
        
        if(divida <= 0) {
            JOptionPane.showMessageDialog(rootPane,
                    "O valor da dívida deve ser maior que zero!",
                    "Valor inválido", 2);
            jTextFieldDivida.setText("");
            jTextFieldDivida.requestFocus();
            return ;
        }
        
        tabela.setText("");
        
        cabecalho = "Dívida (R$)	Juros (R$)	Nº parcelas"
                + "	Parcela (R$)\n"
                + "--------------------------------------"
                + "-------------------------------------";
        
        tabela.setText(cabecalho);
        DecimalFormat f = new DecimalFormat("#,###.##");
        
        
        for(int i = 0; i < parcelas.length; i++) {
            
            String dividaStr = f.format(divida*(1+juros[i]));
            String jurosStr = f.format((divida*juros[i]));
            String parcelaStr = f.format(divida*(1+juros[i])/parcelas[i]);
            
            tabela.setText(tabela.getText() + "\n"); 
            tabela.setText(tabela.getText() + dividaStr
                    + "	" + jurosStr + "	" + parcelas[i]
                    + "	" + parcelaStr);
            
        }
    }//GEN-LAST:event_jButtonTabelaActionPerformed

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
            java.util.logging.Logger.getLogger(Divida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Divida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Divida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Divida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Divida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonTabela;
    private javax.swing.JLabel jLabelDivida;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldDivida;
    private javax.swing.JTextArea tabela;
    // End of variables declaration//GEN-END:variables
}
