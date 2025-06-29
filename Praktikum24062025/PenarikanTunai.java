/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum24062025;

import javax.swing.JOptionPane;

/**
 *
 * @author akels
 */
public class PenarikanTunai extends javax.swing.JFrame {

    /**
     * Creates new form PenarikanTunai
     */
    public PenarikanTunai() {
        initComponents();
        setTitle("PENARIKAN TUNAI");
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    private Rekening aktif;

    public PenarikanTunai(Rekening aktif) {
        initComponents();
        this.aktif = aktif;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCancel = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        btn100 = new javax.swing.JButton();
        btn200 = new javax.swing.JButton();
        btn300 = new javax.swing.JButton();
        txtNominal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnProses = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));

        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 51));
        btnCancel.setText("CANCEL");
        btnCancel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        btnCancel.setContentAreaFilled(false);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnMenu.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnMenu.setForeground(new java.awt.Color(255, 255, 0));
        btnMenu.setText("KE MENU UTAMA");
        btnMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        btnMenu.setContentAreaFilled(false);
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        btn100.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn100.setForeground(new java.awt.Color(255, 255, 51));
        btn100.setText("100.000");
        btn100.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        btn100.setContentAreaFilled(false);
        btn100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn100ActionPerformed(evt);
            }
        });

        btn200.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn200.setForeground(new java.awt.Color(255, 255, 51));
        btn200.setText("200.000");
        btn200.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        btn200.setContentAreaFilled(false);
        btn200.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn200ActionPerformed(evt);
            }
        });

        btn300.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn300.setForeground(new java.awt.Color(255, 255, 51));
        btn300.setText("300.000");
        btn300.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        btn300.setContentAreaFilled(false);
        btn300.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn300ActionPerformed(evt);
            }
        });

        txtNominal.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setText("JUMLAH LAIN");

        btnProses.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btnProses.setForeground(new java.awt.Color(255, 255, 51));
        btnProses.setText("PROSES");
        btnProses.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        btnProses.setContentAreaFilled(false);
        btnProses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProsesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnMenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                            .addComponent(btnCancel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn200, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                        .addGap(300, 300, 300)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNominal)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, Short.MAX_VALUE)
                        .addComponent(btnProses, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btn100, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn300, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn100)
                    .addComponent(btn300))
                .addGap(80, 80, 80)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn200)
                    .addComponent(txtNominal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMenu)
                    .addComponent(btnProses))
                .addGap(95, 95, 95)
                .addComponent(btnCancel)
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        new MenuUtama(aktif).setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btn100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn100ActionPerformed
        double nominal = 100000;

        if (nominal % 50000 != 0) {
            JOptionPane.showMessageDialog(this, "Nominal harus kelipatan Rp50.000!", "Gagal", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (aktif.getSaldo() - nominal < 50000) {
            JOptionPane.showMessageDialog(this, "Saldo harus tersisa minimal Rp50.000 setelah penarikan!", "Gagal", JOptionPane.ERROR_MESSAGE);
            return;
        }

        aktif.setSaldo(aktif.getSaldo() - nominal);
        JOptionPane.showMessageDialog(this, "Penarikan Rp100.000 berhasil!\nSisa saldo: Rp" + (int) aktif.getSaldo(), "Sukses", JOptionPane.INFORMATION_MESSAGE);
        new MenuUtama(aktif).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn100ActionPerformed

    private void btn200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn200ActionPerformed
        double nominal = 200000;

        if (nominal % 50000 != 0) {
            JOptionPane.showMessageDialog(this, "Nominal harus kelipatan Rp50.000!", "Gagal", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (aktif.getSaldo() - nominal < 50000) {
            JOptionPane.showMessageDialog(this, "Saldo harus tersisa minimal Rp50.000 setelah penarikan!", "Gagal", JOptionPane.ERROR_MESSAGE);
            return;
        }

        aktif.setSaldo(aktif.getSaldo() - nominal);
        JOptionPane.showMessageDialog(this, "Penarikan Rp200.000 berhasil!\nSisa saldo: Rp" + (int) aktif.getSaldo(), "Sukses", JOptionPane.INFORMATION_MESSAGE);
        new MenuUtama(aktif).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn200ActionPerformed

    private void btn300ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn300ActionPerformed
        double nominal = 300000;

        if (nominal % 50000 != 0) {
            JOptionPane.showMessageDialog(this, "Nominal harus kelipatan Rp50.000!", "Gagal", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (aktif.getSaldo() - nominal < 50000) {
            JOptionPane.showMessageDialog(this, "Saldo harus tersisa minimal Rp50.000 setelah penarikan!", "Gagal", JOptionPane.ERROR_MESSAGE);
            return;
        }

        aktif.setSaldo(aktif.getSaldo() - nominal);
        JOptionPane.showMessageDialog(this, "Penarikan Rp300.000 berhasil!\nSisa saldo: Rp" + (int) aktif.getSaldo(), "Sukses", JOptionPane.INFORMATION_MESSAGE);
        new MenuUtama(aktif).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn300ActionPerformed

    private void btnProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProsesActionPerformed
        String input = txtNominal.getText().trim();
        double nominal;

        try {
            nominal = Double.parseDouble(input);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Masukkan nominal yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (nominal <= 0) {
            JOptionPane.showMessageDialog(this, "Nominal harus lebih dari 0!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (nominal % 50000 != 0) {
            JOptionPane.showMessageDialog(this, "Nominal harus kelipatan Rp50.000!", "Gagal", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (aktif.getSaldo() - nominal < 50000) {
            JOptionPane.showMessageDialog(this, "Saldo tidak mencukupi! Minimal sisa saldo Rp50.000 setelah penarikan.", "Gagal", JOptionPane.ERROR_MESSAGE);
            return;
        }

        aktif.setSaldo(aktif.getSaldo() - nominal);
        JOptionPane.showMessageDialog(this, "Penarikan sebesar Rp" + (int) nominal + " berhasil!\nSisa saldo: Rp" + (int) aktif.getSaldo(), "Sukses", JOptionPane.INFORMATION_MESSAGE);
        new MenuUtama(aktif).setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnProsesActionPerformed

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
            java.util.logging.Logger.getLogger(PenarikanTunai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PenarikanTunai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PenarikanTunai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PenarikanTunai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PenarikanTunai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn100;
    private javax.swing.JButton btn200;
    private javax.swing.JButton btn300;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnProses;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNominal;
    // End of variables declaration//GEN-END:variables
}
