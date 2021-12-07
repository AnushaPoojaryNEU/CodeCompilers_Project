/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.systemadmin;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.network.Network;
import business.role.AdminRole;
import business.role.Role;
import business.useraccount.UserAccount;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anu61
 */
public class ManageEnterpriseAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEnterpriseAdminJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecoSystem;
    Enterprise enterprise;
    
    public ManageEnterpriseAdminJPanel(JPanel userProcessContainer, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        btnCreate.setEnabled(false);
        this.populateTable();
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
        enterpriseAdminTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jNetworkComboBox = new javax.swing.JComboBox<>();
        jEnterpriseTypeComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        btnCreateAdmin = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        enterpriseAdminTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Network", "Enterprise Name", "Enterprise Type", "Enterprise Admin"
            }
        ));
        jScrollPane1.setViewportView(enterpriseAdminTable);

        jLabel1.setText("Network:");

        jLabel2.setText("Enterprise Type:");

        jNetworkComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jNetworkComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNetworkComboBoxActionPerformed(evt);
            }
        });

        jEnterpriseTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jEnterpriseTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEnterpriseTypeComboBoxActionPerformed(evt);
            }
        });

        jLabel3.setText("Name:");

        jLabel4.setText("UserName:");

        jLabel5.setText("Password:");

        btnCreateAdmin.setText("Create Admin");
        btnCreateAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAdminActionPerformed(evt);
            }
        });

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(btnCreateAdmin))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jNetworkComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jEnterpriseTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtName)
                                .addComponent(txtUsername))
                            .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(btnCreate))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnBack)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack)
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(btnCreateAdmin)))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jNetworkComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jEnterpriseTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addComponent(btnCreate)
                .addContainerGap(85, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jNetworkComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNetworkComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNetworkComboBoxActionPerformed

    private void jEnterpriseTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEnterpriseTypeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jEnterpriseTypeComboBoxActionPerformed

    private void btnCreateAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAdminActionPerformed
        // TODO add your handling code here:
        jNetworkComboBox.removeAllItems();
        jEnterpriseTypeComboBox.removeAllItems();
        int SelectedRow = enterpriseAdminTable.getSelectedRow();
        if (SelectedRow >= 0) {
            Enterprise e = (Enterprise) enterpriseAdminTable.getValueAt(SelectedRow, 0);
            for (Network n : ecoSystem.getNetworkList()) {
                for (Enterprise e1 : n.getEnterpriseDirectory().getEnterpriseList()) {
                    if (e1.equals(e)) {
                        enterprise = e;
                        jNetworkComboBox.insertItemAt(n, 0);
                        jNetworkComboBox.setSelectedIndex(0);
                        jEnterpriseTypeComboBox.insertItemAt(e1.enterpriseType.getValue(), 0);
                        jEnterpriseTypeComboBox.setSelectedIndex(0);
                        txtName.setText(e1.getName());
                        jNetworkComboBox.setEditable(false);
                        jEnterpriseTypeComboBox.setEditable(false);
                        txtName.setEditable(false);
                        btnCreate.setEnabled(true);
                        break;
                    }
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please select a row.");
        }
    }//GEN-LAST:event_btnCreateAdminActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
         if (txtUsername.getText().equals("") || PasswordField.getPassword().equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill out all the details");
        } else if (validUsernamePattern()) {
            if (validPasswordPattern()) {
                String username = txtUsername.getText();
                char c[] = PasswordField.getPassword();
                String password = String.valueOf(c);
                System.out.println("list: " + enterprise.getUserAccountDirectory().getUserAccountList());
                if (enterprise.getUserAccountDirectory().getUserAccountList().isEmpty()) {
                    if (ecoSystem.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
                        enterprise.getUserAccountDirectory().createUserAccount(username, password, new AdminRole(), Role.RoleType.Admin);
                        ecoSystem.getUserAccountDirectory().createUserAccount(username, password, new AdminRole(), Role.RoleType.Admin);
                        JOptionPane.showMessageDialog(null, "Admin created successfully");
                    } else {
                          JOptionPane.showMessageDialog(null, "Username already taken");
                    }

                } else {
                    System.out.println("else");
                    JOptionPane.showMessageDialog(null, "Enterprise Admin already exists.");
                }
                txtName.setText("");
                txtUsername.setText("");
                PasswordField.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Please enter valid password");
            }
        } else {

            JOptionPane.showMessageDialog(null, "Username is invalid. Username must be in the format: xx_xx@xx.xx");
        }
        this.populateTable();
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        SystemAdminWorkAreaJPanel systemAdminWorkAreaJPanel = new SystemAdminWorkAreaJPanel(userProcessContainer, ecoSystem);
        userProcessContainer.add("systemAdminWorkAreaJPanel", systemAdminWorkAreaJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnCreateAdmin;
    private javax.swing.JTable enterpriseAdminTable;
    private javax.swing.JComboBox<String> jEnterpriseTypeComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox<String> jNetworkComboBox;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        jNetworkComboBox.removeAllItems();
        jEnterpriseTypeComboBox.removeAllItems();
        DefaultTableModel model = (DefaultTableModel) enterpriseAdminTable.getModel();
        model.setRowCount(0);
        UserAccount u = null;
        for (Network n : ecoSystem.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                Object[] row = new Object[4];
                row[0] = e;
                row[1] = n;
                row[2] = e.getEnterpriseType().getValue();
                
                for(UserAccount ua: e.getUserAccountDirectory().getUserAccountList())
                {
                    if(ua.getRoleType().getValue().equalsIgnoreCase(Role.RoleType.Admin.getValue()))
                    {
                        
                        u = ua;
                        row[3] = u;

                    }
                }
                model.addRow(row);
            }
        }
    }

    private boolean validUsernamePattern() {
         
        Pattern p = Pattern.compile("^[a-zA-Z0-9]([._-](?![._-])|[a-zA-Z0-9]){3,18}[a-zA-Z0-9]$");
        Matcher m = p.matcher(txtUsername.getText());
        Boolean b = m.matches();
        return b;
    }

    private boolean validPasswordPattern() {
        Pattern q = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=_])(?=\\S+$).{6,20}$");
        Matcher n = q.matcher(String.valueOf(PasswordField.getPassword()));
        Boolean c = n.matches();
        return c;
    }
}
