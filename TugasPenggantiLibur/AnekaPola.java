/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPenggantiLibur;

/**
 *
 * @author akels
 */
public class AnekaPola extends javax.swing.JFrame {

    /**
     * Creates new form Pola
     */
    public AnekaPola() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAngka1 = new javax.swing.JTextField();
        txtAngka2 = new javax.swing.JTextField();
        btnProses = new javax.swing.JButton();
        cbPola = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        AreaHasil = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Pola");

        jLabel2.setText("Angka Pertama");

        jLabel3.setText("Angka Kedua");

        txtAngka1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAngka1ActionPerformed(evt);
            }
        });

        txtAngka2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAngka2ActionPerformed(evt);
            }
        });

        btnProses.setText("Proses");
        btnProses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProsesActionPerformed(evt);
            }
        });

        cbPola.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pola", "Pola 1", "Pola 2", "Pola 3", "Pola 4", "Pola 5", "Pola 6", "Pola 7" }));
        cbPola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPolaActionPerformed(evt);
            }
        });

        AreaHasil.setColumns(20);
        AreaHasil.setRows(5);
        jScrollPane1.setViewportView(AreaHasil);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(179, 179, 179))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtAngka1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(31, 31, 31)
                                .addComponent(txtAngka2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                        .addComponent(btnProses)
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbPola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAngka1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProses))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAngka2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cbPola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAngka1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAngka1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAngka1ActionPerformed

    private void btnProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProsesActionPerformed
        int a = Integer.parseInt(txtAngka1.getText()); // baris
    int b = Integer.parseInt(txtAngka2.getText()); // kolom
    int pil = cbPola.getSelectedIndex();

    StringBuilder pola = new StringBuilder();

    switch (pil) {
        case 1: // AnekaPola 1: #
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    pola.append("#");
                }
                pola.append("\n");
            }
            break;
        case 2: // AnekaPola 2: $
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    pola.append("$");
                }
                pola.append("\n");
            }
            break;
        case 3: // AnekaPola 3: angka baris
            for (int i = 1; i <= a; i++) {
                for (int j = 1; j <= b; j++) {
                    pola.append(i);
                }
                pola.append("\n");
            }
            break;
        case 4: // AnekaPola 4: angka kolom
            for (int i = 1; i <= a; i++) {
                for (int j = 1; j <= b; j++) {
                    pola.append(j);
                }
                pola.append("\n");
            }
            break;
        case 5: // AnekaPola 5: segitiga atas #
            for (int i = 1; i <= a; i++) {
                for (int j = 1; j <= i; j++) {
                    pola.append("#");
                }
                pola.append("\n");
            }
            break;
        case 6: // AnekaPola 6: segitiga angka
            for (int i = 1; i <= a; i++) {
                for (int j = 1; j <= i; j++) {
                    pola.append(j);
                }
                pola.append("\n");
            }
            break;
        case 7: // AnekaPola 7: kombinasi # dan $
            for (int i = 1; i <= a; i++) {
                for (int j = 1; j <= b; j++) {
                    if ((i + j) % 2 == 0) {
                        pola.append("#");
                    } else {
                        pola.append("$");
                    }
                }
                pola.append("\n");
            }
            break;
        default:
            pola.append("Silakan pilih pola terlebih dahulu.");
            break;
    }

    AreaHasil.setText(pola.toString());
    }//GEN-LAST:event_btnProsesActionPerformed

    private void cbPolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPolaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPolaActionPerformed

    private void txtAngka2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAngka2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAngka2ActionPerformed

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
            java.util.logging.Logger.getLogger(AnekaPola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnekaPola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnekaPola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnekaPola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnekaPola().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaHasil;
    private javax.swing.JButton btnProses;
    private javax.swing.JComboBox<String> cbPola;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAngka1;
    private javax.swing.JTextField txtAngka2;
    // End of variables declaration//GEN-END:variables
}
