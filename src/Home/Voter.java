/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Home;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class Voter extends javax.swing.JFrame {

    /**
     * Creates new form Voter
     */
    public Voter() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        radioAL = new javax.swing.JRadioButton();
        RadioBNP = new javax.swing.JRadioButton();
        RadioNP = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        btnCastVote = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cboCentre = new javax.swing.JComboBox<>();
        cboGender = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(radioAL);
        radioAL.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        radioAL.setText("Awami League");
        radioAL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioALMouseClicked(evt);
            }
        });
        radioAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioALActionPerformed(evt);
            }
        });
        getContentPane().add(radioAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 160, 39));

        buttonGroup1.add(RadioBNP);
        RadioBNP.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        RadioBNP.setText("BNP");
        RadioBNP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RadioBNPMouseClicked(evt);
            }
        });
        RadioBNP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioBNPActionPerformed(evt);
            }
        });
        getContentPane().add(RadioBNP, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 150, 33));

        buttonGroup1.add(RadioNP);
        RadioNP.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        RadioNP.setText("National Party");
        RadioNP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RadioNPMouseClicked(evt);
            }
        });
        RadioNP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioNPActionPerformed(evt);
            }
        });
        getContentPane().add(RadioNP, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 136, 35));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel1.setText("  Choose a Party");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 150, 40));

        btnCastVote.setBackground(new java.awt.Color(255, 0, 0));
        btnCastVote.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnCastVote.setForeground(new java.awt.Color(255, 255, 255));
        btnCastVote.setText("Cast Vote");
        btnCastVote.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCastVoteMouseClicked(evt);
            }
        });
        btnCastVote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCastVoteActionPerformed(evt);
            }
        });
        getContentPane().add(btnCastVote, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 128, 41));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel3.setText("  Choose a Centre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 133, 42));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel4.setText("        Gender");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 133, 42));

        cboCentre.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        cboCentre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Centre A", "Centre B", "Centre C" }));
        getContentPane().add(cboCentre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 159, 42));

        cboGender.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        cboGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        cboGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboGenderActionPerformed(evt);
            }
        });
        getContentPane().add(cboGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 159, 42));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home/online.jpeg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 390));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void radioALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioALActionPerformed
       
    }//GEN-LAST:event_radioALActionPerformed

    private void RadioBNPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioBNPActionPerformed
       
    }//GEN-LAST:event_RadioBNPActionPerformed

    private void btnCastVoteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCastVoteMouseClicked
        
    }//GEN-LAST:event_btnCastVoteMouseClicked
    
    private void radioALMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioALMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_radioALMouseClicked

    private void RadioBNPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RadioBNPMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioBNPMouseClicked

    private void RadioNPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RadioNPMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioNPMouseClicked

    private void btnCastVoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCastVoteActionPerformed
        
        String content = "",l = "";
        FileReader reader = null;
        int no = 0;
        try {
            reader = new FileReader("D:\\Online voting System\\LoginChack.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Voter.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        BufferedReader bufferedReader = new BufferedReader(reader);
            
        String line = "";
        try {
            while((line = bufferedReader.readLine()) != null){
                String [] singleLine = line.split(",");
                l = singleLine[0];
            }
        } catch (IOException ex) {
            Logger.getLogger(Voter.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        reader = null;
        try {
            reader = new FileReader("D:\\Online voting System\\CastVote.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Voter.class.getName()).log(Level.SEVERE, null, ex);
        }
            
             bufferedReader = new BufferedReader(reader);
            
            line = "";
        try {
            while((line = bufferedReader.readLine()) != null){
                String [] singleLine = line.split(",");
                if(singleLine[0].isEmpty() == true)continue;
                if(l.equals(singleLine[1])){
                    no = 1;
                    JOptionPane.showMessageDialog(null,"Your Vote has been Cast");
                    HomePage frm = new HomePage();
                    frm.setVisible(true);
                    frm.setBounds(400,200,550,400);
                    dispose();
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Voter.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
                int la = 1;
                if(radioAL.isSelected() == true){
                    content = "Awami League" + ","+l+","+cboGender.getSelectedItem().toString()+","+cboCentre.getSelectedItem().toString();
                }
                else if (RadioBNP.isSelected() == true){
                    content = "BNP" + ","+l+","+cboGender.getSelectedItem().toString()+","+cboCentre.getSelectedItem().toString();
                }
                else if(RadioNP.isSelected() == true){
                    content = "National Party"+ ","+l+","+cboGender.getSelectedItem().toString()+","+cboCentre.getSelectedItem().toString();
                }
                else {
                    JOptionPane.showMessageDialog(null,"Please Select a Party");
                    la = 0;
                }
                if(la == 0){
                   Voter frm = new Voter();
                   frm.setVisible(true);
                   frm.setBounds(400,200,500,400);
                   dispose();
                }
        if(no == 0){       
        FileWriter writer = null;
        try {
            writer = new FileWriter("D:\\Online voting System\\CastVote.txt",true);
        } catch (IOException ex) {
            Logger.getLogger(Voter.class.getName()).log(Level.SEVERE, null, ex);
        }
            
                BufferedWriter bufferedWriter = new BufferedWriter(writer);
            
        try {
            bufferedWriter.write(content);
        } catch (IOException ex) {
            Logger.getLogger(Voter.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            bufferedWriter.newLine();
        } catch (IOException ex) {
            Logger.getLogger(Voter.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            bufferedWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(Voter.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        if(la == 1){
        HomePage frm = new HomePage();
        frm.setVisible(true);
        frm.setBounds(400,200,550,400);
        dispose();
        }
        
    }//GEN-LAST:event_btnCastVoteActionPerformed

    private void RadioNPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioNPActionPerformed
       
    }//GEN-LAST:event_RadioNPActionPerformed

    private void cboGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboGenderActionPerformed

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
            java.util.logging.Logger.getLogger(Voter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Voter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Voter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Voter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Voter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RadioBNP;
    private javax.swing.JRadioButton RadioNP;
    private javax.swing.JButton btnCastVote;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboCentre;
    private javax.swing.JComboBox<String> cboGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton radioAL;
    // End of variables declaration//GEN-END:variables
}