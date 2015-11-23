/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.powerking.pointage.ui;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author delll
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Menu() {
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

        jLabelHistorique = new javax.swing.JLabel();
        jLabelStatistique = new javax.swing.JLabel();
        jLabelContact = new javax.swing.JLabel();
        jLabelQuiiter = new javax.swing.JLabel();
        jLabelCalculSalaire = new javax.swing.JLabel();
        jLabelTitreMenu = new javax.swing.JLabel();
        jLabelImportation = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 204));

        jLabelHistorique.setBackground(new java.awt.Color(0, 0, 255));
        jLabelHistorique.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelHistorique.setForeground(new java.awt.Color(51, 0, 204));
        jLabelHistorique.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/powerking/pointage/images/iconHistorique.png"))); // NOI18N
        jLabelHistorique.setText("     Consulter  Historique");
        jLabelHistorique.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHistoriqueMouseClicked(evt);
            }
        });

        jLabelStatistique.setBackground(new java.awt.Color(0, 204, 0));
        jLabelStatistique.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelStatistique.setForeground(new java.awt.Color(0, 153, 0));
        jLabelStatistique.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/powerking/pointage/images/iconstatistique.png"))); // NOI18N
        jLabelStatistique.setText("    Consulter  Statistique");
        jLabelStatistique.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelStatistiqueMouseClicked(evt);
            }
        });

        jLabelContact.setBackground(new java.awt.Color(255, 102, 0));
        jLabelContact.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelContact.setForeground(new java.awt.Color(255, 51, 204));
        jLabelContact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/powerking/pointage/images/iconContact.png"))); // NOI18N
        jLabelContact.setText("        Contactez Nous");
        jLabelContact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelContactMouseClicked(evt);
            }
        });

        jLabelQuiiter.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelQuiiter.setForeground(new java.awt.Color(255, 0, 0));
        jLabelQuiiter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/powerking/pointage/images/iconQuitter.png"))); // NOI18N
        jLabelQuiiter.setText("               Quitter");
        jLabelQuiiter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelQuiiterMouseClicked(evt);
            }
        });

        jLabelCalculSalaire.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelCalculSalaire.setForeground(new java.awt.Color(255, 102, 102));
        jLabelCalculSalaire.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/powerking/pointage/images/icondolar.png"))); // NOI18N
        jLabelCalculSalaire.setText("   Calculer Salaire journalier");
        jLabelCalculSalaire.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCalculSalaireMouseClicked(evt);
            }
        });

        jLabelTitreMenu.setBackground(new java.awt.Color(255, 204, 102));
        jLabelTitreMenu.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabelTitreMenu.setForeground(new java.awt.Color(204, 0, 0));
        jLabelTitreMenu.setText("  Gestion de Pointage");

        jLabelImportation.setBackground(new java.awt.Color(0, 0, 255));
        jLabelImportation.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelImportation.setForeground(new java.awt.Color(255, 51, 0));
        jLabelImportation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/powerking/pointage/images/icon_importer.png"))); // NOI18N
        jLabelImportation.setText("      Importer Fichier ");
        jLabelImportation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelImportationMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitreMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelImportation, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelHistorique, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCalculSalaire, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelStatistique, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelContact, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelQuiiter, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTitreMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelImportation, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelHistorique)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCalculSalaire)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelStatistique)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelContact)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelQuiiter))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelHistoriqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHistoriqueMouseClicked
        try {
            // TODO add your handling code here:
            new Historique().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_jLabelHistoriqueMouseClicked

    private void jLabelStatistiqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelStatistiqueMouseClicked
        // TODO add your handling code here:
        new Statistique().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabelStatistiqueMouseClicked

    private void jLabelContactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelContactMouseClicked
        // TODO add your handling code here:
        new Contact().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabelContactMouseClicked

    private void jLabelQuiiterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelQuiiterMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabelQuiiterMouseClicked

    private void jLabelCalculSalaireMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCalculSalaireMouseClicked
        // TODO add your handling code here:
        new CalculSalaireJour().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabelCalculSalaireMouseClicked

    private void jLabelImportationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImportationMouseClicked
        try {
            // TODO add your handling code here:
            new Importation().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_jLabelImportationMouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelCalculSalaire;
    private javax.swing.JLabel jLabelContact;
    private javax.swing.JLabel jLabelHistorique;
    private javax.swing.JLabel jLabelImportation;
    private javax.swing.JLabel jLabelQuiiter;
    private javax.swing.JLabel jLabelStatistique;
    private javax.swing.JLabel jLabelTitreMenu;
    // End of variables declaration//GEN-END:variables
}
