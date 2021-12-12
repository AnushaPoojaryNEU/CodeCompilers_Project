/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.sheltermonitoring;

import business.EcoSystem;
import business.useraccount.UserAccount;
import business.workqueue.FoodRequest;

import java.awt.CardLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import ui.uiutils.UiUtils;

/**
 *
 * 
 */
public class FoodOrderJPanel extends javax.swing.JPanel {

    private JPanel container;
    private UserAccount userAccount;
    private EcoSystem system;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public FoodOrderJPanel(JPanel container, EcoSystem system, UserAccount account) {
        initComponents();
        
        this.container = container;
        this.system = system;
        this.userAccount = account;
        //valueLabel.setText(enterprise.getName());
        populateRequestTable();
    }
    
    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        model.setRowCount(0);
        for (FoodRequest req: system.getWorkRequestManager().getFoodRequestsForUser(userAccount)) {
            Object[] row = new Object[5];
            row[0] = req.getMessage();
            row[1] = req.getSender().getIndividual().getName();
            row[2] = req.getReceiver().getIndividual().getName();
            row[3] = req.getStatus();
            row[4] = req.getRequestDate();
            model.addRow(row);
        }
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        enterpriseLabel = new javax.swing.JLabel();
        newOrderButton = new javax.swing.JButton();
        imageEight = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 204));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                FoodOrderJPanel.this.componentShown(evt);
            }
        });

        workRequestJTable.setBackground(new java.awt.Color(255, 255, 204));
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Receiver", "Status", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Order Food for Community");

        newOrderButton.setBackground(new java.awt.Color(38, 55, 85));
        newOrderButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        newOrderButton.setForeground(new java.awt.Color(255, 255, 204));
        newOrderButton.setText("Place New Order");
        newOrderButton.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                FoodOrderJPanel.this.componentShown(evt);
            }
        });
        newOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newOrderButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(newOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addComponent(imageEight)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 426, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(newOrderButton)
                .addGap(18, 18, 18)
                .addComponent(imageEight)
                .addContainerGap(184, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void newOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newOrderButtonActionPerformed
       UiUtils.nextScreen(container, 
            new PlaceOrderJPanel(container, system, userAccount), 
            "PlaceOrderJPanel");
    }//GEN-LAST:event_newOrderButtonActionPerformed

    private void componentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_componentShown
        // TODO add your handling code here:
        if (system != null && userAccount != null && workRequestJTable != null)
            populateRequestTable();
    }//GEN-LAST:event_componentShown

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel imageEight;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton newOrderButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
