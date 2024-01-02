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
public class jConvColDol extends javax.swing.JInternalFrame {

    /**
     * Creates new form jConvColDol
     */
    public jConvColDol() {
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

        jbtnCalcularColDol = new javax.swing.JButton();
        jbtnLimpiarCD = new javax.swing.JButton();
        jbtnSalirCD = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jtfResultadoCD = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jtfTipoCambioCD = new javax.swing.JTextField();
        jtfMontoCol = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setMaximizable(true);
        setTitle("Conversión de colones a dólares");
        setAutoscrolls(true);
        setFont(new java.awt.Font("Agency FB", 0, 18)); // NOI18N
        setFrameIcon(null);

        jbtnCalcularColDol.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jbtnCalcularColDol.setText("Calcular");
        jbtnCalcularColDol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCalcularColDolActionPerformed(evt);
            }
        });

        jbtnLimpiarCD.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jbtnLimpiarCD.setText("Limpiar");
        jbtnLimpiarCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimpiarCDActionPerformed(evt);
            }
        });

        jbtnSalirCD.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jbtnSalirCD.setForeground(java.awt.Color.red);
        jbtnSalirCD.setText("Salir");
        jbtnSalirCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalirCDActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Resultado:");

        jtfResultadoCD.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jtfResultadoCD.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("dólares");

        jPanel1.setBackground(java.awt.SystemColor.controlHighlight);
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jtfTipoCambioCD.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jtfTipoCambioCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTipoCambioCDActionPerformed(evt);
            }
        });

        jtfMontoCol.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("colones");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Tipo de Cambio:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Monto:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jtfMontoCol, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(11, 11, 11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jtfTipoCambioCD, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfTipoCambioCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfMontoCol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jbtnCalcularColDol, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnLimpiarCD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnSalirCD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jtfResultadoCD, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtnCalcularColDol)
                        .addGap(28, 28, 28)
                        .addComponent(jbtnLimpiarCD)
                        .addGap(31, 31, 31)
                        .addComponent(jbtnSalirCD)))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfResultadoCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfTipoCambioCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTipoCambioCDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTipoCambioCDActionPerformed

    private void jbtnCalcularColDolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCalcularColDolActionPerformed
        double tipoCambio;  
        double montoCol;        
        int ex1;
        int ex2;
        
        Excepciones execp = new Excepciones ();
        Calculo calc = new Calculo();
       
        
        execp.soloNumeros(jtfTipoCambioCD.getText(),"tipo de cambio");
        tipoCambio = execp.getValor();
        ex1 = execp.getEx();
        
        execp.soloNumeros(jtfMontoCol.getText(),"monto en colones");
        montoCol = execp.getValor();
        ex2 = execp.getEx();               
        
        if (ex1 == -1 || ex2 == -1) {            
        }
        else {
            calc.calcColDol(tipoCambio, montoCol);
            jtfResultadoCD.setText(Double.toString(calc.getMonto()));                }
    }//GEN-LAST:event_jbtnCalcularColDolActionPerformed

    private void jbtnSalirCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirCDActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbtnSalirCDActionPerformed

    private void jbtnLimpiarCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimpiarCDActionPerformed
        jtfTipoCambioCD.setText("");
        jtfMontoCol.setText("");
        jtfResultadoCD.setText("");
    }//GEN-LAST:event_jbtnLimpiarCDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnCalcularColDol;
    private javax.swing.JButton jbtnLimpiarCD;
    private javax.swing.JButton jbtnSalirCD;
    private javax.swing.JTextField jtfMontoCol;
    private javax.swing.JTextField jtfResultadoCD;
    private javax.swing.JTextField jtfTipoCambioCD;
    // End of variables declaration//GEN-END:variables
}
