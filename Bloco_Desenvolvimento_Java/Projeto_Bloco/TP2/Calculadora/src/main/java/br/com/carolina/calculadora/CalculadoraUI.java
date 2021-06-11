/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.carolina.calculadora;

/**
 *
 * @author carol
 */
public class CalculadoraUI extends javax.swing.JFrame {
    private float num1;
    
    private float num2;
    /**
     * Creates new form CalculadoraUI
     */
    public CalculadoraUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CalculatorPanel = new javax.swing.JPanel();
        firstNumberText = new java.awt.TextField();
        firstNumber = new javax.swing.JLabel();
        secondNumber = new javax.swing.JLabel();
        secondNumberText = new java.awt.TextField();
        result = new javax.swing.JLabel();
        resultText = new java.awt.TextField();
        CleanBtn = new java.awt.Button();
        OperationPanel = new javax.swing.JPanel();
        AddBtn = new javax.swing.JButton();
        SubtractBtn = new javax.swing.JButton();
        DivideBtn = new javax.swing.JButton();
        MultiplyBtn = new javax.swing.JButton();
        ExitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CalculatorPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Calculadora"));

        firstNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        firstNumber.setText("Primeiro Número:");

        secondNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        secondNumber.setText("Segundo Número:");
        secondNumber.setToolTipText("");

        secondNumberText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondNumberTextActionPerformed(evt);
            }
        });

        result.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        result.setText("Resultado:");

        resultText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultTextActionPerformed(evt);
            }
        });

        CleanBtn.setLabel("Limpar");
        CleanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CleanBtnActionPerformed(evt);
            }
        });

        OperationPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Operações"));
        OperationPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        AddBtn.setText("Somar");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        SubtractBtn.setText("Subtrair");
        SubtractBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubtractBtnActionPerformed(evt);
            }
        });

        DivideBtn.setText("Dividir");
        DivideBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivideBtnActionPerformed(evt);
            }
        });

        MultiplyBtn.setText("Multiplicar");
        MultiplyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiplyBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OperationPanelLayout = new javax.swing.GroupLayout(OperationPanel);
        OperationPanel.setLayout(OperationPanelLayout);
        OperationPanelLayout.setHorizontalGroup(
            OperationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OperationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OperationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AddBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SubtractBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))
                .addGap(18, 28, Short.MAX_VALUE)
                .addGroup(OperationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MultiplyBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                    .addComponent(DivideBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        OperationPanelLayout.setVerticalGroup(
            OperationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OperationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OperationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBtn)
                    .addComponent(MultiplyBtn))
                .addGap(19, 19, 19)
                .addGroup(OperationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SubtractBtn)
                    .addComponent(DivideBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout CalculatorPanelLayout = new javax.swing.GroupLayout(CalculatorPanel);
        CalculatorPanel.setLayout(CalculatorPanelLayout);
        CalculatorPanelLayout.setHorizontalGroup(
            CalculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CalculatorPanelLayout.createSequentialGroup()
                .addGroup(CalculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CleanBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OperationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CalculatorPanelLayout.createSequentialGroup()
                        .addGroup(CalculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CalculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(result, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(secondNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
                            .addComponent(firstNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CalculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(secondNumberText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                            .addComponent(firstNumberText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(resultText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        CalculatorPanelLayout.setVerticalGroup(
            CalculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CalculatorPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(CalculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(firstNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CalculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(secondNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(secondNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CalculatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(OperationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(CleanBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        ExitBtn.setText("Sair");
        ExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(CalculatorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(CalculatorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void secondNumberTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondNumberTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_secondNumberTextActionPerformed

    private void resultTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultTextActionPerformed

    private void ExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitBtnActionPerformed

    private void CleanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CleanBtnActionPerformed
        firstNumberText.setText("");
        secondNumberText.setText("");
        resultText.setText("");
    }//GEN-LAST:event_CleanBtnActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        setNumbers();
        
        float result = num1 + num2;
        
        resultText.setText(String.valueOf(result));
    }//GEN-LAST:event_AddBtnActionPerformed

    private void MultiplyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultiplyBtnActionPerformed
        setNumbers();
        
        float result = num1 * num2;
        
        resultText.setText(String.valueOf(result));
    }//GEN-LAST:event_MultiplyBtnActionPerformed

    private void SubtractBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubtractBtnActionPerformed
        setNumbers();
        
        float result = num1 - num2;
        
        resultText.setText(String.valueOf(result));
    }//GEN-LAST:event_SubtractBtnActionPerformed

    private void DivideBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivideBtnActionPerformed
        setNumbers();
        
        float result = num1 / num2;
        
        resultText.setText(String.valueOf(result));
    }//GEN-LAST:event_DivideBtnActionPerformed

    private void setNumbers() throws NumberFormatException {
        num1 = Float.parseFloat(firstNumberText.getText());
        num2 = Float.parseFloat(secondNumberText.getText());
    }

    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(CalculadoraUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JPanel CalculatorPanel;
    private java.awt.Button CleanBtn;
    private javax.swing.JButton DivideBtn;
    private javax.swing.JButton ExitBtn;
    private javax.swing.JButton MultiplyBtn;
    private javax.swing.JPanel OperationPanel;
    private javax.swing.JButton SubtractBtn;
    private javax.swing.JLabel firstNumber;
    private java.awt.TextField firstNumberText;
    private javax.swing.JLabel result;
    private java.awt.TextField resultText;
    private javax.swing.JLabel secondNumber;
    private java.awt.TextField secondNumberText;
    // End of variables declaration//GEN-END:variables
}