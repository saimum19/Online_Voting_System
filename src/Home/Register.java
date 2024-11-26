package Home;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
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
        txtName = new javax.swing.JTextField();
        txtFatherName = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtMotherName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDateOfBirth = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel1.setText("         Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 64, 110, 37));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel2.setText(" Father's Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 136, 110, 39));

        txtName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNameMouseClicked(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 64, 220, 37));

        txtFatherName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFatherNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtFatherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 136, 220, 39));

        btnRegister.setBackground(new java.awt.Color(255, 0, 0));
        btnRegister.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 474, 125, 36));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel3.setText("  Mother's Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 210, 110, 41));
        getContentPane().add(txtMotherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 210, 220, 41));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel4.setText("    Date Of Birth");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 281, 110, 32));

        txtDateOfBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateOfBirthActionPerformed(evt);
            }
        });
        getContentPane().add(txtDateOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 281, 220, 32));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel5.setText("          NID");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 346, 110, 31));
        getContentPane().add(txtNID, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 346, 220, 31));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel6.setText("      Password");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 410, 110, 31));
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 410, 221, 31));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel7.setText("        Registration");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 16, 198, 28));

        btnClear.setBackground(new java.awt.Color(0, 0, 255));
        btnClear.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 474, 121, 36));

        btnBack.setBackground(new java.awt.Color(102, 255, 0));
        btnBack.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 23, -1, 29));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFatherNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFatherNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFatherNameActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        String content = txtNID.getText()+","+txtPassword.getText()+"\n";
        try {
            if(txtName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Please Enter Name");
            }
            else if(txtFatherName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Please Enter Father's Name");
            }
            else if(txtMotherName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Please Enter Mother's Name");
            }
            else if(txtDateOfBirth.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Please Enter Date Of Birth");
            }
            else if(txtNID.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Please Enter NID Number");
            }
            else if(txtPassword.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Please Enter Password");
            }
            else{
                FileWriter writer = new FileWriter("D:\\Online voting System\\Login.txt",true);
            
                BufferedWriter bufferedWriter = new BufferedWriter(writer);
            
                bufferedWriter.write(content);
                bufferedWriter.newLine();
                bufferedWriter.close();
            
                JOptionPane.showMessageDialog(null,"Register Successfully");
                LoginPage frm = new LoginPage();
                frm.setVisible(true);
                frm.setBounds(400,200,500,400);
                dispose();  
            }
         
        } catch (IOException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void txtNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameMouseClicked

    private void txtDateOfBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateOfBirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateOfBirthActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
            Login frm = new Login();
            frm.setVisible(true);
            frm.setBounds(400,200,500,400);
            dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtName.setText("");
        txtFatherName.setText("");
        txtMotherName.setText("");
        txtDateOfBirth.setText("");
        txtNID.setText("");
        txtPassword.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtDateOfBirth;
    private javax.swing.JTextField txtFatherName;
    private javax.swing.JTextField txtMotherName;
    private javax.swing.JTextField txtNID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables
}
