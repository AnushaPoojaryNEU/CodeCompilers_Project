/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.sheltermonitoring;

import business.EcoSystem;
import business.food.MenuItem;
import business.food.MenuItemOrder;
import business.useraccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import ui.uiutils.UiUtils;

public class PlaceOrderJPanel extends javax.swing.JPanel {

    private JPanel container;
    private UserAccount userAccount;
    private EcoSystem system;
    private ArrayList<MenuItemOrder> cart;
    private final List<MenuItem> menu;
    /**
     * Creates new form PlaceOrderJPanel
     */
    public PlaceOrderJPanel(JPanel container, EcoSystem system, UserAccount account) {
        initComponents();
        this.container = container;
        this.system = system;
        this.userAccount = account;
        cart = new ArrayList<MenuItemOrder>();
        
        cartTable.setShowHorizontalLines(true);
        cartTable.setShowVerticalLines(true);
        
       
        itemCBox.removeAllItems();
        this.menu = system.getFoodEnterprise().getMenu().getMenu();
        for (MenuItem mi : menu) {
            itemCBox.addItem(mi.getName());
        }
        
        cart = new ArrayList<MenuItemOrder>();
        populateCart();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cartTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        itemCBox = new javax.swing.JComboBox<>();
        quantityText = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        orderTotalText = new javax.swing.JLabel();
        placeOrderButton = new javax.swing.JButton();
        imageFour = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        commentsText = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 204));
        setForeground(new java.awt.Color(38, 55, 85));

        backButton.setBackground(new java.awt.Color(38, 55, 85));
        backButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 204));
        backButton.setText("Back");
        backButton.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                PlaceOrderJPanel.this.componentShown(evt);
            }
        });
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Place Order");

        cartTable.setBackground(new java.awt.Color(255, 255, 204));
        cartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Menu Item", "Quantity", "Price (per unit)", "Comments"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(cartTable);

        jLabel3.setText("Cart -");

        jLabel4.setText("Menu Item :");

        jLabel5.setText("Quantity :");

        quantityText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityTextActionPerformed(evt);
            }
        });

        addButton.setBackground(new java.awt.Color(38, 55, 85));
        addButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 204));
        addButton.setText("Add to Cart");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(38, 55, 85));
        updateButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 255, 204));
        updateButton.setText("Update Cart Item");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(38, 55, 85));
        deleteButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 204));
        deleteButton.setText("Delete Cart Item");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel6.setText("Order Total :");

        orderTotalText.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        orderTotalText.setText("$0.0");

        placeOrderButton.setBackground(new java.awt.Color(38, 55, 85));
        placeOrderButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        placeOrderButton.setForeground(new java.awt.Color(255, 255, 204));
        placeOrderButton.setText("Place Order");
        placeOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderButtonActionPerformed(evt);
            }
        });

        jLabel7.setText("Comments:");

        commentsText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commentsTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel3))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(itemCBox, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(54, 54, 54)
                                                .addComponent(jLabel6)
                                                .addGap(18, 18, 18)
                                                .addComponent(orderTotalText))
                                            .addComponent(quantityText, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(commentsText, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(placeOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(addButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(updateButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(deleteButton)))))
                        .addGap(62, 62, 62)
                        .addComponent(imageFour)))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backButton)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(imageFour))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(orderTotalText))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(itemCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(quantityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(commentsText, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addButton)
                            .addComponent(updateButton)
                            .addComponent(deleteButton))
                        .addGap(18, 18, 18)
                        .addComponent(placeOrderButton)))
                .addContainerGap(329, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        UiUtils.previousScreen(container, this);
    }//GEN-LAST:event_backButtonActionPerformed

    private MenuItemOrder parseMenuItemOrder() {
        MenuItemOrder mio = new MenuItemOrder();
        int idx = itemCBox.getSelectedIndex();
        if (idx < 0) {
            JOptionPane.showMessageDialog(this, "Please select a menu item");
            return null;
        }
        MenuItem mi = menu.get(idx);
        mio.setMenuItem(mi);
        if(mio.setQuantity(quantityText.getText()) == false) {
            JOptionPane.showMessageDialog(this, "Quantity is not in the correct format.");
            return null;
        }
        if(mio.setComments(commentsText.getText()) == false) {
            JOptionPane.showMessageDialog(this, "Comments is not in the correct format.");
            return null;
        }
        return mio;
    }
    
    
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        MenuItemOrder mio = parseMenuItemOrder();
        if (mio == null)
            return;
        
        cart.add(mio);
        JOptionPane.showMessageDialog(this, "Item added to order");
        quantityText.setText("");
        commentsText.setText("");
        populateCart();
    }//GEN-LAST:event_addButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        int idx = cartTable.getSelectedRow();
        
        if (idx < 0) { 
            JOptionPane.showMessageDialog(this, "Please select an item to be updated.");
            return;
        }
        
        MenuItemOrder mio = parseMenuItemOrder();
        if (mio == null)
            return;
        
        cart.set(idx, mio);
        JOptionPane.showMessageDialog(this, "Selected menu item updated.");
        quantityText.setText("");
        commentsText.setText("");
        populateCart();
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        int idx = cartTable.getSelectedRow();
        
        if (idx < 0) { 
            JOptionPane.showMessageDialog(this, "Please select an item to be updated.");
            return;
        }
        cart.remove(idx);
        JOptionPane.showMessageDialog(this, "Selected menu item removed.");
        populateCart();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void placeOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderButtonActionPerformed
        // TODO add your handling code here:
        if (cart.size() == 0) {
            JOptionPane.showMessageDialog(this, "Please add at least one item to the cart.");
            return;
        } 
        if (system.getFoodEnterprise().getAFoodManager() == null) {
            JOptionPane.showMessageDialog(this, "No food managers available. Please contact the food enterprise admin.");
            return;
        }
        system.getFoodEnterprise().placeOrder(system, userAccount, cart);
        JOptionPane.showMessageDialog(this, "Order Placed.");
        cart = new ArrayList<MenuItemOrder>();
        quantityText.setText("");
        commentsText.setText("");
        populateCart();
    }//GEN-LAST:event_placeOrderButtonActionPerformed

    private void quantityTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityTextActionPerformed

    private void commentsTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commentsTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_commentsTextActionPerformed

    private void componentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_componentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_componentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JTable cartTable;
    private javax.swing.JTextField commentsText;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel imageFour;
    private javax.swing.JComboBox<String> itemCBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel orderTotalText;
    private javax.swing.JButton placeOrderButton;
    private javax.swing.JTextField quantityText;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables

    private void populateCart() {
        DefaultTableModel model = (DefaultTableModel) cartTable.getModel();
        model.setRowCount(0);
        float total = 0.0f;
        for (MenuItemOrder mi: cart) {
            Object[] row = new Object[4];
            row[0] = mi.getMenuItem().getName();
            int quantity = mi.getQuantity();
            row[1] = quantity;
            float curItemCost = mi.getMenuItem().getCost();
            row[2] = curItemCost;
            total += (curItemCost * quantity);
            row[3] = mi.getComments();
            model.addRow(row);
        }
        orderTotalText.setText("$" + total);
    }
}
