package outrasAtividades;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class SrJubileuPanificadora extends javax.swing.JFrame {
    
    double preco;
    String precoStr;

    public SrJubileuPanificadora() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTextArea();
        jPanelPao = new javax.swing.JPanel();
        jTextFieldPreco = new javax.swing.JTextField();
        jLabelPreco = new javax.swing.JLabel();
        jButtonTabela = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Panificadora Jubileu");
        setResizable(false);

        tabela.setColumns(1);
        tabela.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tabela.setRows(1);
        tabela.setTabSize(1);
        jScrollPane1.setViewportView(tabela);

        jPanelPao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pão", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 0, 18))); // NOI18N

        jTextFieldPreco.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabelPreco.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelPreco.setText("Preço:");

        javax.swing.GroupLayout jPanelPaoLayout = new javax.swing.GroupLayout(jPanelPao);
        jPanelPao.setLayout(jPanelPaoLayout);
        jPanelPaoLayout.setHorizontalGroup(
            jPanelPaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPreco)
                .addGap(30, 30, 30)
                .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelPaoLayout.setVerticalGroup(
            jPanelPaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPreco))
                .addContainerGap())
        );

        jButtonTabela.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButtonTabela.setText("Montar tabela");
        jButtonTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTabelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelPao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonTabela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelPao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButtonTabela)))
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTabelaActionPerformed
        
        try {
            preco = Double.parseDouble(jTextFieldPreco.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane,
                    "O preço informado não é um valor numérico!",
                    "Preço inválido", 0);
            return ;
        }
        
        if(preco <= 0) {
            JOptionPane.showMessageDialog(rootPane,
                    "O preço do pão deve ser maior que zero!",
                    "Preço inválido", 2);
            return ;
        }
        
        tabela.setText("");
        DecimalFormat f = new DecimalFormat("0.00");
        
        for(int i = 1; i <= 50; i++) {
            if(i > 1) {
                tabela.setText(tabela.getText() + "\n");
            }
            
            precoStr = f.format(preco * i);
            tabela.setText(tabela.getText() + i + " - " + "R$" + precoStr);
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
            java.util.logging.Logger.getLogger(SrJubileuPanificadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SrJubileuPanificadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SrJubileuPanificadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SrJubileuPanificadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SrJubileuPanificadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonTabela;
    private javax.swing.JLabel jLabelPreco;
    private javax.swing.JPanel jPanelPao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldPreco;
    private javax.swing.JTextArea tabela;
    // End of variables declaration//GEN-END:variables
}
