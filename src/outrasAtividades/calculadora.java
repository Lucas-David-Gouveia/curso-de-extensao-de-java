package outrasAtividades;

import java.text.DecimalFormat;

public class calculadora extends javax.swing.JFrame {
    
    boolean cicloFinalizado = true;
    boolean telaZerada = true;
    
    int n1 = 0, n2 = -1;
    double res;
    char operacao = 'n';

    public calculadora() {
        initComponents();
        System.out.println("n1: " + n1);
        System.out.println("n2: " + n2);
        System.out.println("op: " + operacao);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldTela = new javax.swing.JTextField();
        jButton0 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonIgual = new javax.swing.JButton();
        jButtonSomar = new javax.swing.JButton();
        jButtonSubtrair = new javax.swing.JButton();
        jButtonMultiplicar = new javax.swing.JButton();
        jButtonDividir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setResizable(false);

        jTextFieldTela.setEditable(false);
        jTextFieldTela.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jTextFieldTela.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldTela.setText("0");
        jTextFieldTela.setFocusable(false);

        jButton0.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jButton0.setText("0");
        jButton0.setFocusable(false);
        jButton0.setMaximumSize(new java.awt.Dimension(57, 57));
        jButton0.setMinimumSize(new java.awt.Dimension(57, 57));
        jButton0.setPreferredSize(new java.awt.Dimension(57, 57));
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jButton1.setText("1");
        jButton1.setFocusable(false);
        jButton1.setMaximumSize(new java.awt.Dimension(57, 57));
        jButton1.setPreferredSize(new java.awt.Dimension(57, 57));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jButton2.setText("2");
        jButton2.setFocusable(false);
        jButton2.setMaximumSize(new java.awt.Dimension(57, 57));
        jButton2.setPreferredSize(new java.awt.Dimension(57, 57));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jButton3.setText("3");
        jButton3.setFocusable(false);
        jButton3.setMaximumSize(new java.awt.Dimension(57, 57));
        jButton3.setPreferredSize(new java.awt.Dimension(57, 57));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jButton4.setText("4");
        jButton4.setFocusable(false);
        jButton4.setMaximumSize(new java.awt.Dimension(57, 57));
        jButton4.setMinimumSize(new java.awt.Dimension(57, 57));
        jButton4.setPreferredSize(new java.awt.Dimension(57, 57));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jButton5.setText("5");
        jButton5.setFocusable(false);
        jButton5.setMaximumSize(new java.awt.Dimension(57, 57));
        jButton5.setMinimumSize(new java.awt.Dimension(57, 57));
        jButton5.setPreferredSize(new java.awt.Dimension(57, 57));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jButton6.setText("6");
        jButton6.setFocusable(false);
        jButton6.setMaximumSize(new java.awt.Dimension(57, 57));
        jButton6.setMinimumSize(new java.awt.Dimension(57, 57));
        jButton6.setPreferredSize(new java.awt.Dimension(57, 57));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jButton7.setText("7");
        jButton7.setFocusable(false);
        jButton7.setMaximumSize(new java.awt.Dimension(57, 57));
        jButton7.setMinimumSize(new java.awt.Dimension(57, 57));
        jButton7.setPreferredSize(new java.awt.Dimension(57, 57));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jButton8.setText("8");
        jButton8.setFocusable(false);
        jButton8.setMaximumSize(new java.awt.Dimension(57, 57));
        jButton8.setMinimumSize(new java.awt.Dimension(57, 57));
        jButton8.setPreferredSize(new java.awt.Dimension(57, 57));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jButton9.setText("9");
        jButton9.setFocusable(false);
        jButton9.setMaximumSize(new java.awt.Dimension(57, 57));
        jButton9.setMinimumSize(new java.awt.Dimension(57, 57));
        jButton9.setPreferredSize(new java.awt.Dimension(57, 57));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButtonLimpar.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jButtonLimpar.setText("C");
        jButtonLimpar.setFocusable(false);
        jButtonLimpar.setMaximumSize(new java.awt.Dimension(57, 57));
        jButtonLimpar.setPreferredSize(new java.awt.Dimension(57, 57));
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jButtonIgual.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jButtonIgual.setText("=");
        jButtonIgual.setFocusable(false);
        jButtonIgual.setMaximumSize(new java.awt.Dimension(57, 57));
        jButtonIgual.setMinimumSize(new java.awt.Dimension(57, 57));
        jButtonIgual.setPreferredSize(new java.awt.Dimension(57, 57));
        jButtonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIgualActionPerformed(evt);
            }
        });

        jButtonSomar.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jButtonSomar.setText("+");
        jButtonSomar.setFocusable(false);
        jButtonSomar.setMaximumSize(new java.awt.Dimension(57, 57));
        jButtonSomar.setMinimumSize(new java.awt.Dimension(57, 57));
        jButtonSomar.setPreferredSize(new java.awt.Dimension(57, 57));
        jButtonSomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSomarActionPerformed(evt);
            }
        });

        jButtonSubtrair.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jButtonSubtrair.setText("-");
        jButtonSubtrair.setFocusable(false);
        jButtonSubtrair.setMaximumSize(new java.awt.Dimension(57, 57));
        jButtonSubtrair.setPreferredSize(new java.awt.Dimension(57, 57));
        jButtonSubtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubtrairActionPerformed(evt);
            }
        });

        jButtonMultiplicar.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jButtonMultiplicar.setText("x");
        jButtonMultiplicar.setFocusable(false);
        jButtonMultiplicar.setMaximumSize(new java.awt.Dimension(57, 57));
        jButtonMultiplicar.setMinimumSize(new java.awt.Dimension(57, 57));
        jButtonMultiplicar.setPreferredSize(new java.awt.Dimension(57, 57));
        jButtonMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiplicarActionPerformed(evt);
            }
        });

        jButtonDividir.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jButtonDividir.setText("÷");
        jButtonDividir.setFocusable(false);
        jButtonDividir.setMaximumSize(new java.awt.Dimension(57, 57));
        jButtonDividir.setMinimumSize(new java.awt.Dimension(57, 57));
        jButtonDividir.setPreferredSize(new java.awt.Dimension(57, 57));
        jButtonDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDividirActionPerformed(evt);
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
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonDividir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldTela)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonSubtrair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonSomar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonMultiplicar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jTextFieldTela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDividir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonSomar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
        if(!telaZerada) {
            escreverNaTela('0');
        }
    }//GEN-LAST:event_jButton0ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        escreverNaTela('1');
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        escreverNaTela('2');
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        escreverNaTela('3');
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        escreverNaTela('4');
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        escreverNaTela('5');
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        escreverNaTela('6');
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        escreverNaTela('7');
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        escreverNaTela('8');
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        escreverNaTela('9');
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        limparVariaveis();
        jTextFieldTela.setText("0");
        telaZerada = true;
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIgualActionPerformed
        realizarCalculo(operacao);
    }//GEN-LAST:event_jButtonIgualActionPerformed

    private void jButtonSomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSomarActionPerformed
        definirOperacao('+');
    }//GEN-LAST:event_jButtonSomarActionPerformed

    private void jButtonSubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubtrairActionPerformed
        definirOperacao('-');
    }//GEN-LAST:event_jButtonSubtrairActionPerformed

    private void jButtonMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiplicarActionPerformed
        definirOperacao('x');
    }//GEN-LAST:event_jButtonMultiplicarActionPerformed

    private void jButtonDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDividirActionPerformed
        definirOperacao('/');
    }//GEN-LAST:event_jButtonDividirActionPerformed
    
    public void escreverNaTela(char caracter) {
        if(cicloFinalizado) {
           jTextFieldTela.setText("");
           if(caracter == '0') {
               telaZerada = true;
           } else {
               telaZerada = false;
               cicloFinalizado = false;
           }
        }
        jTextFieldTela.setText(jTextFieldTela.getText() + caracter);
        int valor = Character.getNumericValue(caracter);
        
        if(valor != -1 && valor != 33) {
            atualizarNumeros(valor);
        }
        System.out.println("valor: " + valor);
    }
    
    public void atualizarNumeros(int numero) {
        
        if(operacao == 'n') { // Atualiza o primeiro número
            n1 = n1*10 + numero;
        } else { // Atualiza o segundo número
            if(n2 == -1) {
                n2 = 0;
            }
            n2 = n2*10 + numero;
        }
         System.out.println("n1 = " + n1);
         System.out.println("n2 = " + n2);
    }
    
    public void definirOperacao(char op) {
        if (operacao == 'n' && n1 > 0) {
            operacao = op;
            System.out.println("Operação = " + operacao);
            escreverNaTela(operacao);
        }
    }
    
    public void realizarCalculo(char operacao) {
        if((operacao != 'n') && (n2 == -1)) {
            jTextFieldTela.setText("Erro de sintaxe");
            limparVariaveis();
            return ;
        }
        
        // Limita o número de casas decimais    
        DecimalFormat f = new DecimalFormat("0.0000");
        String resultado;
        
        switch(operacao) {
            case '+':
                res = n1 + n2;
                resultado = f.format(res);
                jTextFieldTela.setText(resultado);
                break;
            case '-':
                res = n1 - n2;
                resultado = f.format(res);
                jTextFieldTela.setText(resultado);
                break;
            case 'x':
                res = n1 * n2;
                resultado = f.format(res);
                jTextFieldTela.setText(resultado);
                break;
            case '/':
                if(n2 <= 0) {
                    jTextFieldTela.setText("Erro");
                } else {
                    res = (double) n1 / (double) n2;
                    resultado = f.format(res);
                    jTextFieldTela.setText(resultado);
                }
                break;
        }
        limparVariaveis();
    }
    
    public void limparVariaveis() {
        cicloFinalizado = true;
        operacao = 'n';
        n1 =  0;
        n2 = -1;
        res = 0;
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
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonDividir;
    private javax.swing.JButton jButtonIgual;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonMultiplicar;
    private javax.swing.JButton jButtonSomar;
    private javax.swing.JButton jButtonSubtrair;
    private javax.swing.JTextField jTextFieldTela;
    // End of variables declaration//GEN-END:variables
}
