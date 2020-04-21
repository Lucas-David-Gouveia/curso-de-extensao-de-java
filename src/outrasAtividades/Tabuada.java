package outrasAtividades;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Tabuada extends javax.swing.JFrame {
    
    int numero, resultado, inicio, fim;
    String linha;
    
    SpinnerNumberModel modeloNumero, modeloInicio, modeloFim;
    ChangeListener listener;
    

    public Tabuada() {
        
        initComponents();
        
        // padrão, mínimo, máximo, passo
        modeloNumero = new SpinnerNumberModel(1, 1, 100, 1);
        modeloInicio = new SpinnerNumberModel(1, 1, 100, 1);
        modeloFim = new SpinnerNumberModel(10, 1, 100, 1);
        
        jSpinnerTabuada.setModel(modeloNumero);
        jSpinnerInicio.setModel(modeloInicio);
        jSpinnerFim.setModel(modeloFim);
        
        inicio = (int) jSpinnerInicio.getValue();
        fim = (int) jSpinnerFim.getValue();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTabuada = new javax.swing.JLabel();
        jSpinnerInicio = new javax.swing.JSpinner();
        jSpinnerFim = new javax.swing.JSpinner();
        jSpinnerTabuada = new javax.swing.JSpinner();
        jLabelInicio = new javax.swing.JLabel();
        jLabelFim = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabuada = new javax.swing.JTextArea();
        jButtonTabuada = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tabuada");
        setResizable(false);

        jLabelTabuada.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelTabuada.setText("Tabuada do:");

        jSpinnerInicio.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinnerInicio.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerInicioStateChanged(evt);
            }
        });

        jSpinnerFim.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSpinnerFim.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerFimStateChanged(evt);
            }
        });

        jSpinnerTabuada.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabelInicio.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelInicio.setText("Iniciar em:");

        jLabelFim.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelFim.setText("Terminar em:");

        tabuada.setEditable(false);
        tabuada.setColumns(1);
        tabuada.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tabuada.setRows(10);
        tabuada.setFocusable(false);
        jScrollPane1.setViewportView(tabuada);

        jButtonTabuada.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButtonTabuada.setText("Montar tabuada");
        jButtonTabuada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTabuadaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelTabuada, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelFim))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSpinnerFim, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                            .addComponent(jSpinnerTabuada, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSpinnerInicio, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jButtonTabuada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTabuada)
                            .addComponent(jSpinnerTabuada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelInicio)
                            .addComponent(jSpinnerInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelFim)
                            .addComponent(jSpinnerFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonTabuada)))
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTabuadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTabuadaActionPerformed
        
        numero = (int) jSpinnerTabuada.getValue();
        tabuada.setText("");
        
        for(int i = inicio; i <= fim; i++) {
            
            if(i != inicio) {
                tabuada.setText(tabuada.getText() + "\n");
            }
            
            resultado = numero * i;
            linha = numero + " x " + i + " = " + resultado;
            tabuada.setText(tabuada.getText() + linha);
            
        }
        
    }//GEN-LAST:event_jButtonTabuadaActionPerformed

    private void jSpinnerInicioStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerInicioStateChanged
                
        if((int) jSpinnerInicio.getValue() > fim){
            jSpinnerInicio.setValue(inicio);
        } else if ((int) jSpinnerInicio.getValue() > fim) {
            
        } else {
            inicio = (int) jSpinnerInicio.getValue();
            modeloFim.setMinimum(inicio);
        }
        
    }//GEN-LAST:event_jSpinnerInicioStateChanged

    private void jSpinnerFimStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerFimStateChanged
        
        if((int) jSpinnerFim.getValue() < inicio) {
            jSpinnerFim.setValue(fim);
        } else {
            fim = (int) jSpinnerFim.getValue();
            modeloInicio.setMaximum(fim);
        }
    }//GEN-LAST:event_jSpinnerFimStateChanged
    
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
            java.util.logging.Logger.getLogger(Tabuada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabuada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabuada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabuada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabuada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonTabuada;
    private javax.swing.JLabel jLabelFim;
    private javax.swing.JLabel jLabelInicio;
    private javax.swing.JLabel jLabelTabuada;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerFim;
    private javax.swing.JSpinner jSpinnerInicio;
    private javax.swing.JSpinner jSpinnerTabuada;
    private javax.swing.JTextArea tabuada;
    // End of variables declaration//GEN-END:variables
}
