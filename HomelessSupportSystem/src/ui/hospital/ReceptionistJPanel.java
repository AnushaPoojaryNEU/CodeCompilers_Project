/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.hospital;

import business.EcoSystem;
import business.useraccount.UserAccount;
import business.workqueue.DoctorAppointmentWorkRequest;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anu61
 */
public class ReceptionistJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ReceptionistJPanel
     */
    private final JPanel container;
    private final UserAccount account;
    private final EcoSystem system;
    private ArrayList<DoctorAppointmentWorkRequest> appts;
    private final List<UserAccount> doctors;
    
    public ReceptionistJPanel(JPanel container, UserAccount account, EcoSystem system) {
        initComponents();
        this.container = container;
        this.account = account;
        this.system = system;
        this.doctors = system.getHospitalEnterprise().getAllDoctors();
        
        docCombo.removeAllItems();
        
        for(UserAccount ua : doctors) {
            docCombo.addItem(ua.getIndividual().getName());
        }
        
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        docCombo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        summaryText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        descText = new javax.swing.JTextArea();
        loadButton = new javax.swing.JButton();
        assignButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Problem", "Status", "Request Date", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        jLabel1.setText("Problem Summary");

        summaryText.setEditable(false);
        summaryText.setBackground(new java.awt.Color(255, 255, 255));
        summaryText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                summaryTextActionPerformed(evt);
            }
        });

        jLabel2.setText("Description");

        descText.setEditable(false);
        descText.setColumns(20);
        descText.setRows(5);
        jScrollPane2.setViewportView(descText);

        loadButton.setText("Load Selected Request");
        loadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadButtonActionPerformed(evt);
            }
        });

        assignButton.setText("Assign to Doctor");
        assignButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Select Doctor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 815, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(loadButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(assignButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(summaryText)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                                    .addComponent(docCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(summaryText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(docCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loadButton)
                    .addComponent(assignButton))
                .addGap(113, 113, 113))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void summaryTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_summaryTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_summaryTextActionPerformed

    private void loadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = table.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to load.");
            return;
        }
        
        DoctorAppointmentWorkRequest req = appts.get(selectedRow);
        
        summaryText.setText(req.getProblem());
        descText.setText(req.getPatientComments());
    }//GEN-LAST:event_loadButtonActionPerformed

    private void assignButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignButtonActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        int selectedRow = table.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row on the table.");
            return;
        }
        
        DoctorAppointmentWorkRequest req = appts.get(selectedRow);
        
        int idx = docCombo.getSelectedIndex();
        if (idx < 0) {
            JOptionPane.showMessageDialog(this, "Please select a doctor to assign the appointment to.");
            return;
        }
        UserAccount ua = doctors.get(idx);
        
        req.setDoctorName(ua.getIndividual().getName());
        req.setReceiver(ua);
        req.setStatus("Doctor assigned");
        system.getWorkRequestManager().updateWorkRequest(req);
        JOptionPane.showMessageDialog(this, "Doctor assigned successfully.");
        summaryText.setText("");
        descText.setText("");
        populateTable();
    }//GEN-LAST:event_assignButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignButton;
    private javax.swing.JTextArea descText;
    private javax.swing.JComboBox<String> docCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton loadButton;
    private javax.swing.JTextField summaryText;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        this.appts = system.getWorkRequestManager(
            ).getDoctorAppointmentWorkReqWithStatus(account, "REQUESTED");
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        for (DoctorAppointmentWorkRequest req: appts) {
            Object[] row = new Object[4];
            row[0] = req.getProblem();
            row[1] = req.getStatus();
            row[2] = req.getRequestDate();            
            row[3] = req.getPatientComments();
            model.addRow(row);
        }
    }
    
}