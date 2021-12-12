/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.food;

import business.EcoSystem;
import business.useraccount.UserAccount;
import javax.swing.JPanel;
import ui.uiutils.UiUtils;

/**
 *
 * @author Geetha
 */
public class FoodSupplyManagerJPanel extends javax.swing.JPanel {

    private final JPanel container;
    private final UserAccount account;
    private final EcoSystem system;
    
    /**
     * Creates new form FoodManagerJPanel
     */
    public FoodSupplyManagerJPanel(JPanel container, UserAccount account, EcoSystem system) {
        initComponents();
        
        this.container = container;
        this.account = account;
        this.system = system;
        
        titleText.setText("Welcome, " + account.getIndividual().getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleText = new javax.swing.JLabel();
        ordersButton = new javax.swing.JButton();
        menuButton = new javax.swing.JButton();

        titleText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleText.setText("Welcome, ");

        ordersButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ordersButton.setText("Manage Orders");
        ordersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordersButtonActionPerformed(evt);
            }
        });

        menuButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        menuButton.setText("Manage Menu");
        menuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(titleText))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ordersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(266, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(titleText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addComponent(menuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(ordersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void menuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButtonActionPerformed
        // TODO add your handling code here:
        UiUtils.nextScreen(container, new ManageMenu(container, 
                account, system), "ManageMenu");
    }//GEN-LAST:event_menuButtonActionPerformed

    private void ordersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordersButtonActionPerformed
        UiUtils.nextScreen(container, new AcceptRejectOrders(container, 
                system, account), "AcceptRejectOrders");
    }//GEN-LAST:event_ordersButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton menuButton;
    private javax.swing.JButton ordersButton;
    private javax.swing.JLabel titleText;
    // End of variables declaration//GEN-END:variables
}