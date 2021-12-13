/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.food;


import business.EcoSystem;
import business.useraccount.UserAccount;
import business.workqueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 *
 */
public class ChefJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    
    
    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public ChefJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.system = business;
      
        titleText.setText("Welcome, " + userAccount.getIndividual().getName());
        table.setShowHorizontalLines(true);
        table.setShowVerticalLines(true);
        populateTable();
        
        imgnine.setIcon(new ImageIcon(new ImageIcon("images/resmenu.jpg").getImage(
                ).getScaledInstance(400, 300, Image.SCALE_DEFAULT)));
    }
    
    private ArrayList<WorkRequest> getAcceptedOrders() {
        ArrayList<WorkRequest> li = new ArrayList<WorkRequest>();
        
        for (WorkRequest w : system.getWorkRequestManager().getWorkRequestForUser(userAccount)) {
            if (w.getStatus().equals("Accepted"))
                li.add(w);
        }
        return li;
    }
    
    public void populateTable(){
        ArrayList<WorkRequest> orders = getAcceptedOrders();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        for (WorkRequest w: orders) {
            Object[] row = new Object[5];
            row[0] = w.getRequestDate().toString();
            row[1] = w;
            row[2] = w.getSender().getUsername();
            row[3] = w.getReceiver().getUsername();
            row[4] = w.getStatus();
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
        table = new javax.swing.JTable();
        processJButton = new javax.swing.JButton();
        imageTwo = new javax.swing.JLabel();
        titleText = new javax.swing.JLabel();
        imgnine = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 204));

        table.setBackground(new java.awt.Color(255, 255, 204));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Message", "Sender", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(table);

        processJButton.setBackground(new java.awt.Color(38, 55, 85));
        processJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        processJButton.setForeground(new java.awt.Color(255, 255, 204));
        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });

        titleText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleText.setText("Welcome");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(processJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(titleText)))
                .addGap(6, 6, 6))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(imgnine)
                .addGap(448, 448, 448))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(titleText)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(processJButton)
                .addGap(56, 56, 56)
                .addComponent(imgnine)
                .addContainerGap(123, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed
        int selectedRow = table.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Please select an order.");
            return;
        }
        
        WorkRequest request = (WorkRequest)table.getValueAt(selectedRow, 1);
        request.setStatus("Food Prepared");
        JOptionPane.showMessageDialog(this, "Food marked as prepared.");
        populateTable();
    }//GEN-LAST:event_processJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imageTwo;
    private javax.swing.JLabel imgnine;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processJButton;
    private javax.swing.JTable table;
    private javax.swing.JLabel titleText;
    // End of variables declaration//GEN-END:variables
}
