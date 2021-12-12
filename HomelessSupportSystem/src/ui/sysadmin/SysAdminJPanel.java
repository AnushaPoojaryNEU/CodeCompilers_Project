/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.sysadmin;

import business.EcoSystem;
import business.useraccount.UserAccount;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import ui.uiutils.UiUtils;

/**
 *
 * @author anu61
 */
public class SysAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SysAdminJPanel
     */
     private final EcoSystem system;
    private final UserAccount userAccount;
    private final JPanel container;

    public SysAdminJPanel(JPanel container, EcoSystem system, UserAccount userAccount) {
        initComponents();
        this.container = container;
        this.system = system;
        this.userAccount = userAccount;
        
        imgtwo.setIcon(new ImageIcon(new ImageIcon("images/shelters.png").getImage(
                ).getScaledInstance(300, 300, Image.SCALE_DEFAULT)));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hospitalButton = new javax.swing.JButton();
        foodButton = new javax.swing.JButton();
        trainingButton = new javax.swing.JButton();
        shelterButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        imgtwo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 204));

        hospitalButton.setBackground(new java.awt.Color(38, 55, 85));
        hospitalButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        hospitalButton.setForeground(new java.awt.Color(253, 253, 223));
        hospitalButton.setText("Manage Hospital Enterprise Admin");
        hospitalButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hospitalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalButtonActionPerformed(evt);
            }
        });

        foodButton.setBackground(new java.awt.Color(38, 55, 85));
        foodButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        foodButton.setForeground(new java.awt.Color(253, 253, 223));
        foodButton.setText("Manage Food Enterprise Admin");
        foodButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        foodButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodButtonActionPerformed(evt);
            }
        });

        trainingButton.setBackground(new java.awt.Color(38, 55, 85));
        trainingButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        trainingButton.setForeground(new java.awt.Color(253, 253, 223));
        trainingButton.setText("Manage Training Center Enterprise Admin");
        trainingButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        trainingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trainingButtonActionPerformed(evt);
            }
        });

        shelterButton.setBackground(new java.awt.Color(38, 55, 85));
        shelterButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        shelterButton.setForeground(new java.awt.Color(253, 253, 223));
        shelterButton.setText("Manage Shelter Monitoring Enterprise Admin");
        shelterButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        shelterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shelterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(foodButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(shelterButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(trainingButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hospitalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(519, 519, 519)
                        .addComponent(imgtwo)))
                .addContainerGap(961, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(foodButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shelterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(trainingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(hospitalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(imgtwo)
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(482, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void hospitalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalButtonActionPerformed
        // TODO add your handling code here:
        UiUtils.nextScreen(container, new ManageEnterpriseAdminJPanel(container, system.getHospitalEnterprise()), "ManageEnterpriseAdmin");
    }//GEN-LAST:event_hospitalButtonActionPerformed

    private void foodButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodButtonActionPerformed
        // TODO add your handling code here:
        UiUtils.nextScreen(container, new ManageEnterpriseAdminJPanel(container, system.getFoodEnterprise()), "ManageEnterpriseAdmin");
    }//GEN-LAST:event_foodButtonActionPerformed

    private void trainingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trainingButtonActionPerformed
        // TODO add your handling code here:
        UiUtils.nextScreen(container, new ManageEnterpriseAdminJPanel(container, system.getTrainingCenterEnterprise()), "ManageEnterpriseAdmin");
    }//GEN-LAST:event_trainingButtonActionPerformed

    private void shelterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shelterButtonActionPerformed
        // TODO add your handling code here:
        UiUtils.nextScreen(container, new ManageEnterpriseAdminJPanel(container, system.getShelterMonitoringEnterprise()), "ManageEnterpriseAdmin");
    }//GEN-LAST:event_shelterButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton foodButton;
    private javax.swing.JButton hospitalButton;
    private javax.swing.JLabel imgtwo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton shelterButton;
    private javax.swing.JButton trainingButton;
    // End of variables declaration//GEN-END:variables
}
