package outrasAtividades;

import javax.swing.JOptionPane;

public class diasDaSemana extends javax.swing.JFrame {

    public diasDaSemana() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNumero = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jLabelTipoDia = new javax.swing.JLabel();
        jLabelTipoDiaInfo = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jButtonVerificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabelNumero.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelNumero.setText("Número:");

        jTextFieldNumero.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabelTipoDia.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelTipoDia.setText("Tipo de dia:");

        jLabelTipoDiaInfo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelTipoDiaInfo.setText("-");

        jLabelTitulo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelTitulo.setText("Verificador do tipo de dia");

        jButtonVerificar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButtonVerificar.setText("Verificar");
        jButtonVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitulo)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTipoDia)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelTipoDiaInfo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelNumero)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonVerificar)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabelTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumero)
                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVerificar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTipoDia)
                    .addComponent(jLabelTipoDiaInfo))
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerificarActionPerformed
        
        int dia;
        String tipoDia;
        
        try {
            dia = Integer.parseInt(jTextFieldNumero.getText());
            if (dia < 1 || dia > 7) {
                tipoDia = "Inválido";
            } else if (dia == 1 || dia == 7) {
                tipoDia = "Fim de semana";
            } else {
                tipoDia = "Útil";
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "O valor informado é inválido!\n\n" + e, "Erro", 0);
            tipoDia = "-";
        }
        jLabelTipoDiaInfo.setText(tipoDia);
        
    }//GEN-LAST:event_jButtonVerificarActionPerformed

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
            java.util.logging.Logger.getLogger(diasDaSemana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(diasDaSemana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(diasDaSemana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(diasDaSemana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new diasDaSemana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonVerificar;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelTipoDia;
    private javax.swing.JLabel jLabelTipoDiaInfo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JTextField jTextFieldNumero;
    // End of variables declaration//GEN-END:variables
}
