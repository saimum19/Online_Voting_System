/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Home;

/**
 *
 * 
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    public HomePage() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cmbOption = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnEnter = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("   Welcome To Online Voting System");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 39, 435, 44));

        cmbOption.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        cmbOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Voter" }));
        cmbOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOptionActionPerformed(evt);
            }
        });
        jPanel1.add(cmbOption, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 179, 172, 35));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("     Choose Option");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 179, 160, 35));

        btnEnter.setBackground(new java.awt.Color(255, 0, 0));
        btnEnter.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnEnter.setForeground(new java.awt.Color(255, 255, 255));
        btnEnter.setText("Enter");
        btnEnter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEnterMouseClicked(evt);
            }
        });
        jPanel1.add(btnEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 286, 139, 33));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home/online.jpeg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbOptionActionPerformed

    private void btnEnterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnterMouseClicked
        String check = cmbOption.getSelectedItem().toString();
        if(check == "Admin"){
            LoginAdmin frm = new LoginAdmin();
            frm.setVisible(true);
            frm.setBounds(400,200,500,400);
            dispose();
        }
        else{
            Login frm = new Login();
            frm.setVisible(true);
            frm.setBounds(400,200,500,400);
            dispose();
        }
    }//GEN-LAST:event_btnEnterMouseClicked

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnter;
    private javax.swing.JComboBox<String> cmbOption;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
