/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertidordemoneda;

import excepciones.Excepciones;
import calculos.Calculo;

/**
 *
 * @author Toshiba
 */
public class jConvDolCol extends javax.swing.JInternalFrame {

    /**
     * Creates new form jConvDolCol
     */
    public jConvDolCol() {
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

        jbtnCalcularDolCol = new javax.swing.JButton();
        jbtnLimpiarDC = new javax.swing.JButton();
        jbtnSalirDC = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jtfResultadoDC = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jtfTipoCambioDC = new javax.swing.JTextField();
        jtfMontoDol = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jbtnCalcularDolCol.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jbtnCalcularDolCol.setText("Calcular");
        jbtnCalcularDolCol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCalcularDolColActionPerformed(evt);
            }
        });

        jbtnLimpiarDC.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jbtnLimpiarDC.setText("Limpiar");
        jbtnLimpiarDC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimpiarDCActionPerformed(evt);
            }
        });

        jbtnSalirDC.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jbtnSalirDC.setForeground(java.awt.Color.red);
        jbtnSalirDC.setText("Salir");
        jbtnSalirDC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalirDCActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Resultado:");

        jtfResultadoDC.setBackground(new java.awt.Color(240, 240, 240));
        jtfResultadoDC.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jtfResultadoDC.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("colones");

        jPanel1.setBackground(java.awt.SystemColor.controlHighlight);
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jtfTipoCambioDC.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jtfTipoCambioDC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTipoCambioDCActionPerformed(evt);
            }
        });

        jtfMontoDol.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("dólares");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Tipo de Cambio:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Monto:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jtfMontoDol, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jtfTipoCambioDC, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfTipoCambioDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfMontoDol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnCalcularDolCol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnLimpiarDC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnSalirDC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jtfResultadoDC, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtnCalcularDolCol)
                        .addGap(31, 31, 31)
                        .addComponent(jbtnLimpiarDC)
                        .addGap(33, 33, 33)
                        .addComponent(jbtnSalirDC)))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfResultadoDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnCalcularDolColActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCalcularDolColActionPerformed
        double tipoCambio;
        double montoCol;
        double montoDol;
        int ex1;
        int ex2;

        Excepciones execp = new Excepciones ();
        Calculo calc = new Calculo();

        execp.soloNumeros(jtfTipoCambioDC.getText(),"tipo de cambio");
        tipoCambio = execp.getValor();
        ex1 = execp.getEx();

        execp.soloNumeros(jtfMontoDol.getText(),"monto en dólares");
        montoDol = execp.getValor();
        ex2 = execp.getEx();

        if (ex1 == -1 || ex2 == -1) {
        }
        else {
            calc.calcDolCol(tipoCambio, montoDol);
            montoCol = calc.getMonto();

            jtfResultadoDC.setText(Double.toString(calc.getMonto()));    
        }
    }//GEN-LAST:event_jbtnCalcularDolColActionPerformed

    private void jbtnLimpiarDCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimpiarDCActionPerformed
        jtfTipoCambioDC.setText("");
        jtfMontoDol.setText("");
        jtfResultadoDC.setText("");
    }//GEN-LAST:event_jbtnLimpiarDCActionPerformed

    private void jtfTipoCambioDCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTipoCambioDCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTipoCambioDCActionPerformed

    private void jbtnSalirDCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirDCActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbtnSalirDCActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnCalcularDolCol;
    private javax.swing.JButton jbtnLimpiarDC;
    private javax.swing.JButton jbtnSalirDC;
    private javax.swing.JTextField jtfMontoDol;
    private javax.swing.JTextField jtfResultadoDC;
    private javax.swing.JTextField jtfTipoCambioDC;
    // End of variables declaration//GEN-END:variables
}
