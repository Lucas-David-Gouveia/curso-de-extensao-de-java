package agenda;

import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Agenda extends javax.swing.JFrame {
    
    ArrayList<Cliente> lista = new ArrayList<>();

    public Agenda() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        agenda = new javax.swing.JTextArea();
        jButtonAdicionar = new javax.swing.JButton();
        jButtonRemover = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda");
        setResizable(false);

        agenda.setEditable(false);
        agenda.setColumns(3);
        agenda.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        agenda.setRows(1);
        agenda.setTabSize(16);
        agenda.setText("Nº    Nome\tTelefone\n----------------------------------------------------");
        agenda.setFocusable(false);
        jScrollPane1.setViewportView(agenda);

        jButtonAdicionar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButtonAdicionar.setText("Adicionar");
        jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarActionPerformed(evt);
            }
        });

        jButtonRemover.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButtonRemover.setText("Remover");
        jButtonRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAdicionar)
                        .addGap(30, 30, 30)
                        .addComponent(jButtonRemover)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdicionar)
                    .addComponent(jButtonRemover))
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void atualizarLista() {
        
        DecimalFormat formatter = new DecimalFormat("000");
        
        String cabecalho = "Nº     Nome	Telefone\n"
                + "----------------------------------------------------";
        
        agenda.setText(cabecalho);
        
        for(Cliente cliente : lista) {
            
            agenda.setText(agenda.getText() + "\n");
            
            agenda.setText(agenda.getText() + 
                    formatter.format(lista.indexOf(cliente)) + "    " + 
                    cliente.nome + "	" + cliente.telefone);
        }
        
    }
    
    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed
        
        JTextField txtNome = new JTextField();
        JTextField txtTelefone = new JTextField();
        
        Object[] mensagem = {
            "Nome:", txtNome,
            "Telefone:", txtTelefone
        };
        
        int resposta;
        
        resposta = JOptionPane.showConfirmDialog(rootPane, mensagem, "Novo contato",
                2, -1, null);
        
        if(resposta == 0) {
            
            if(txtNome.getText().trim().isEmpty() ||
                    txtTelefone.getText().trim().isEmpty()) {
                
                JOptionPane.showMessageDialog(rootPane,
                        "Nome ou telefone vazio!",
                        "Campo inválido", 2);
                
            } else {
                
                try {
                    int tel = Integer.parseInt(txtTelefone.getText());
                    
                    Cliente cliente = new Cliente(txtNome.getText().trim(), tel);
                    lista.add(cliente);
                    
                    atualizarLista();
                    
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(rootPane,
                        "O telefone informado é inválido!",
                        "Telefone inválido", 2);
                }
            }
            
        }
        
    }//GEN-LAST:event_jButtonAdicionarActionPerformed

    private void jButtonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverActionPerformed
        
        String resposta = JOptionPane.showInputDialog(rootPane, "Índice:",
                "Remover contato", -1);
        
        if(resposta != null) {
            
            if(resposta.isEmpty()) {
                
                JOptionPane.showMessageDialog(rootPane,
                        "O índice informado está vazio!",
                        "Índice vazio", 2);
                
            } else {
                
                try {
                    
                    int indice = Integer.parseInt(resposta);
                    
                    if(indice < lista.size()) {
                        lista.remove(indice);
                        atualizarLista();
                    } else {
                        JOptionPane.showMessageDialog(rootPane,
                        "Não há um contato com o índice informado!",
                        "Índice inválido", 2);
                    }
                    
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(rootPane,
                        "O índice informado é inválido!",
                        "Índice inválido", 2);
                }
                
            }
            
        }
        
    }//GEN-LAST:event_jButtonRemoverActionPerformed

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
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea agenda;
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonRemover;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
