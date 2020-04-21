package outrasAtividades;

import java.awt.Color;
import javax.swing.JOptionPane;

public class classeEleitoral extends javax.swing.JFrame {

    public classeEleitoral() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelIdade = new javax.swing.JLabel();
        jTextFieldIdade = new javax.swing.JTextField();
        jButtonVerificar = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jPanelResultado = new javax.swing.JPanel();
        jLabelResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabelIdade.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelIdade.setText("Idade:");

        jTextFieldIdade.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jButtonVerificar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButtonVerificar.setText("Verificar");
        jButtonVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerificarActionPerformed(evt);
            }
        });

        jLabelTitulo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelTitulo.setText("Verificação de classe eleitoral");

        jPanelResultado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 18))); // NOI18N
        jPanelResultado.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabelResultado.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelResultado.setText("-");
        jLabelResultado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelResultado.setOpaque(true);

        javax.swing.GroupLayout jPanelResultadoLayout = new javax.swing.GroupLayout(jPanelResultado);
        jPanelResultado.setLayout(jPanelResultadoLayout);
        jPanelResultadoLayout.setHorizontalGroup(
            jPanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelResultado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelResultadoLayout.setVerticalGroup(
            jPanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelIdade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonVerificar, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                    .addComponent(jLabelTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabelTitulo)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIdade)
                    .addComponent(jButtonVerificar))
                .addGap(30, 30, 30)
                .addComponent(jPanelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerificarActionPerformed
        
        int idade;
        String classeEleitoral = null;
        
        jLabelResultado.setForeground(Color.black);
        
        try {
            idade = Integer.parseInt(jTextFieldIdade.getText());
            if (idade < 16) {
                classeEleitoral = "Você não pode votar";
                jLabelResultado.setBackground(Color.red);
                jLabelResultado.setForeground(Color.white);
            } else if (idade == 16 || idade == 17 || idade > 65) {
                classeEleitoral = "Voto facultativo";
                jLabelResultado.setBackground(Color.yellow);
            } else if (idade >= 18 && idade <= 65) {
                classeEleitoral = "Voto deve votar";
                jLabelResultado.setBackground(Color.green);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Idade inválida!\n\n" + e, "Erro", 0);
            classeEleitoral = "-";
            Color color = new Color(214, 217, 223);
            jLabelResultado.setBackground(color);
            jLabelResultado.setForeground(Color.black);
        }
        jLabelResultado.setText(classeEleitoral);
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
            java.util.logging.Logger.getLogger(classeEleitoral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(classeEleitoral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(classeEleitoral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(classeEleitoral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new classeEleitoral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonVerificar;
    private javax.swing.JLabel jLabelIdade;
    private javax.swing.JLabel jLabelResultado;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelResultado;
    private javax.swing.JTextField jTextFieldIdade;
    // End of variables declaration//GEN-END:variables
}
