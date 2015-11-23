/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.powerking.pointage.ui;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.powerking.pointage.lib.AdminDAO;



public class Authentification extends javax.swing.JFrame {
    
    /**
     * Creates new form Login
     */
    
    private Connection cnx;
     AdminDAO e= new AdminDAO();
    public Authentification() {
       e.connexion();
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

        jLabel1imagePointeuse = new javax.swing.JLabel();
        jLabellogin = new javax.swing.JLabel();
        jLabelpwd = new javax.swing.JLabel();
        JTextFiekdLogin = new javax.swing.JTextField();
        jButton1Connecter = new javax.swing.JButton();
        JTextFiekdPass = new javax.swing.JPasswordField();
        error = new javax.swing.JLabel();
        jLabel4logoPowerKing = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 255));

        jLabel1imagePointeuse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/powerking/pointage/images/pointeuse.jpg"))); // NOI18N

        jLabellogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabellogin.setForeground(new java.awt.Color(51, 51, 255));
        jLabellogin.setText("LOGIN          : ");

        jLabelpwd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelpwd.setForeground(new java.awt.Color(51, 51, 255));
        jLabelpwd.setText("PASSWORD :");

        JTextFiekdLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFiekdLoginActionPerformed(evt);
            }
        });

        jButton1Connecter.setBackground(new java.awt.Color(255, 102, 0));
        jButton1Connecter.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1Connecter.setForeground(new java.awt.Color(255, 255, 255));
        jButton1Connecter.setText("Connecter");
        jButton1Connecter.setBorderPainted(false);
        jButton1Connecter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ConnecterActionPerformed(evt);
            }
        });

        JTextFiekdPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFiekdPassActionPerformed(evt);
            }
        });

        error.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        error.setForeground(new java.awt.Color(0, 153, 51));

        jLabel4logoPowerKing.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/powerking/pointage/images/logoPowerKing.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1imagePointeuse)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4logoPowerKing, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1Connecter, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelpwd)
                                        .addGap(18, 18, 18)
                                        .addComponent(JTextFiekdPass, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabellogin)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(JTextFiekdLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)))
                        .addGap(52, 52, 52))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4logoPowerKing)
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTextFiekdLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabellogin))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTextFiekdPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelpwd))
                        .addGap(24, 24, 24)
                        .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jButton1Connecter, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1imagePointeuse))
                .addContainerGap(311, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton1ConnecterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ConnecterActionPerformed
        // TODO add your handling code here:
        boolean result = e.authentification(JTextFiekdLogin.getText(), JTextFiekdPass.getText());
            if(result){
                System.err.println("DONE");
                new Menu().setVisible(true);
                setVisible(false);
                this.dispose();
            }
            else{
                JTextFiekdLogin.setText("");
                JTextFiekdPass.setText("");
                error.setText("admin non trouver");
            }
       
        
    }//GEN-LAST:event_jButton1ConnecterActionPerformed

    private void JTextFiekdLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFiekdLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFiekdLoginActionPerformed

    private void JTextFiekdPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFiekdPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFiekdPassActionPerformed
    
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
            java.util.logging.Logger.getLogger(Authentification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Authentification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Authentification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Authentification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Authentification().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTextFiekdLogin;
    private javax.swing.JPasswordField JTextFiekdPass;
    private javax.swing.JLabel error;
    private javax.swing.JButton jButton1Connecter;
    private javax.swing.JLabel jLabel1imagePointeuse;
    private javax.swing.JLabel jLabel4logoPowerKing;
    private javax.swing.JLabel jLabellogin;
    private javax.swing.JLabel jLabelpwd;
    // End of variables declaration//GEN-END:variables
}
