package outrasAtividades;

import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TesteGerais extends javax.swing.JFrame {

        public TesteGerais() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldNumero = new javax.swing.JTextField();
        jButtonVerificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextFieldNumero.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

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
                .addGap(83, 83, 83)
                .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jButtonVerificar)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVerificar))
                .addContainerGap(143, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerificarActionPerformed
       
        int numero = Integer.parseInt(jTextFieldNumero.getText());
        
        int[] a = new int[2];
        
        ArrayList<String> lista = new ArrayList<>();
        
        int index = 0;
        
        lista.add("nome");
        lista.set(index, "novo nome");
        lista.get(index);
        lista.remove("nome");
        lista.clear();
        
        switch(numero) {
            case 1: case 2:
                JOptionPane.showMessageDialog(rootPane, "1 ou 2");
                break;
            default:
                JOptionPane.showMessageDialog(rootPane, "Nem 1 nem 2");
        }
    }//GEN-LAST:event_jButtonVerificarActionPerformed

    public void JOption(){
        
         // Criar caixa de diálogo
        JOptionPane pane = new JOptionPane();
        JDialog caixaDialogo = pane.createDialog(rootPane, "Título");
        caixaDialogo.show();
        
        JTextField nome = new JTextField();
        JTextField telefone = new JTextField();
        
        Object[] message = {
            "Nome:", nome,
            "Telefone:", telefone
        };
        
        int resposta = JOptionPane.showConfirmDialog(rootPane, message,
                "Adicionar contato", JOptionPane.OK_CANCEL_OPTION);
        
        if(resposta == JOptionPane.OK_OPTION) {
            
            if(nome.getText().isEmpty() || telefone.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, 
                        "Nome ou telefone vazios!", "Informações inválidas", 0);
            } else {
                // Código
            }
        }
        
    }
    
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
            java.util.logging.Logger.getLogger(TesteGerais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TesteGerais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TesteGerais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TesteGerais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TesteGerais().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonVerificar;
    private javax.swing.JTextField jTextFieldNumero;
    // End of variables declaration//GEN-END:variables
}
