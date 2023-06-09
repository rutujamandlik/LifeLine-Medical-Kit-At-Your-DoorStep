
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Manager;

import Business.Distribution.Distribution;
import Business.Enterprise.Enterprise;
import Business.Order.Order;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CustomerOrderWorkRequest;
import Business.WorkQueue.PharmacyAdminOrderWorkRequest;
import Business.WorkQueue.WorkRequest;
import UI.Toast;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rutuja
 */
public class ManagerAssignDeliveryJPanel extends javax.swing.JPanel {

    private UserAccount userAccount;
    private ArrayList<Enterprise> warehouseEnterpriseArray;
    private Distribution distribution;
    /**
     * Creates new form ManagerAssignDeliveryJPanel
     */
    public ManagerAssignDeliveryJPanel(UserAccount userAccount, ArrayList<Enterprise> warehouseEnterpriseArray, Distribution distribution) { 
        initComponents();
        
        this.userAccount = userAccount;
        this.warehouseEnterpriseArray = warehouseEnterpriseArray;
        this.distribution = distribution;
        
        populateTable();
        populatePharmacyDeliveryPicker();
        populateHomeDeliveryPicker();
    }

    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel)tblOrders.getModel();
        model.setRowCount(0);
        
        ArrayList<WorkRequest> workReq = distribution.getWorkQueue().getWorkRequestListArray();
        
        for (int i=workReq.size()-1; i>=0; i--) {
            
            CustomerOrderWorkRequest req = (CustomerOrderWorkRequest)workReq.get(i);
            Order order = req.getOrder();
                Object[] row = new Object[5];
                row[0] = req;
                row[1] = order.getId();
                row[2] = order.getQuantity();
                row[3] = order.getPrice();
                row[4] = req.getStatus();
                
                model.addRow(row);
        }
        ArrayList<WorkRequest> workReq2 = distribution.getWorkQueue().getWorkRequestListArray2();
        for (int i=workReq2.size()-1; i>=0; i--) {
            
            PharmacyAdminOrderWorkRequest req = (PharmacyAdminOrderWorkRequest)workReq2.get(i);
            Order order = req.getOrder();
                Object[] row = new Object[5];
                row[0] = req;
                row[1] = order.getId();
                row[2] = order.getQuantity();
                row[3] = order.getPrice();
                row[4] = req.getStatus();

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

        mainPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelSendToDoctor = new javax.swing.JPanel();
        btnAssignPharmacyDelivery = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pharmacyDeliveryPicker = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        Enterprises = new javax.swing.JLabel();
        btnAccept = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrders = new javax.swing.JTable();
        panelSendToDoctor1 = new javax.swing.JPanel();
        btnAssignHomeDelivery = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        homeDeliveryPicker = new javax.swing.JComboBox();

        mainPanel.setBackground(new java.awt.Color(79, 173, 177));
        mainPanel.setPreferredSize(new java.awt.Dimension(997, 800));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel1.setFont(new java.awt.Font("Devanagari MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Process Order & Assign Delivery Man");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(jLabel1)
                .addContainerGap(258, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelSendToDoctor.setBackground(new java.awt.Color(255, 255, 255));
        panelSendToDoctor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        btnAssignPharmacyDelivery.setBackground(new java.awt.Color(79, 173, 177));
        btnAssignPharmacyDelivery.setFont(new java.awt.Font("Devanagari MT", 1, 14)); // NOI18N
        btnAssignPharmacyDelivery.setForeground(new java.awt.Color(0, 0, 0));
        btnAssignPharmacyDelivery.setText("Assign");
        btnAssignPharmacyDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignPharmacyDeliveryActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Devanagari MT", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Assign Pharmacy Delivery Partner");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setIconTextGap(0);

        jLabel3.setFont(new java.awt.Font("Devanagari MT", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Select Pharmacy Delivery Partner:");

        pharmacyDeliveryPicker.setBackground(new java.awt.Color(79, 173, 177));
        pharmacyDeliveryPicker.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout panelSendToDoctorLayout = new javax.swing.GroupLayout(panelSendToDoctor);
        panelSendToDoctor.setLayout(panelSendToDoctorLayout);
        panelSendToDoctorLayout.setHorizontalGroup(
            panelSendToDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSendToDoctorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSendToDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
                    .addGroup(panelSendToDoctorLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pharmacyDeliveryPicker, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSendToDoctorLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAssignPharmacyDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelSendToDoctorLayout.setVerticalGroup(
            panelSendToDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSendToDoctorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelSendToDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pharmacyDeliveryPicker, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAssignPharmacyDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        Enterprises.setFont(new java.awt.Font("Devanagari MT", 1, 24)); // NOI18N
        Enterprises.setForeground(new java.awt.Color(0, 0, 0));
        Enterprises.setText("Orders");
        Enterprises.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Enterprises.setIconTextGap(0);

        btnAccept.setBackground(new java.awt.Color(79, 173, 177));
        btnAccept.setFont(new java.awt.Font("Devanagari MT", 1, 14)); // NOI18N
        btnAccept.setForeground(new java.awt.Color(0, 0, 0));
        btnAccept.setText("Accept");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });

        btnReject.setBackground(new java.awt.Color(79, 173, 177));
        btnReject.setFont(new java.awt.Font("Devanagari MT", 1, 14)); // NOI18N
        btnReject.setForeground(new java.awt.Color(0, 0, 0));
        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });

        tblOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Message", "Order ID", "Quantity", "Price", "Order Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrders);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Enterprises, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Enterprises, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        panelSendToDoctor1.setBackground(new java.awt.Color(255, 255, 255));
        panelSendToDoctor1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        btnAssignHomeDelivery.setBackground(new java.awt.Color(79, 173, 177));
        btnAssignHomeDelivery.setFont(new java.awt.Font("Devanagari MT", 1, 14)); // NOI18N
        btnAssignHomeDelivery.setForeground(new java.awt.Color(0, 0, 0));
        btnAssignHomeDelivery.setText("Assign");
        btnAssignHomeDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignHomeDeliveryActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Devanagari MT", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Assign Home Delivery Partner");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.setIconTextGap(0);

        jLabel7.setFont(new java.awt.Font("Devanagari MT", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Select Home Delivery Partner:");

        homeDeliveryPicker.setBackground(new java.awt.Color(79, 173, 177));
        homeDeliveryPicker.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout panelSendToDoctor1Layout = new javax.swing.GroupLayout(panelSendToDoctor1);
        panelSendToDoctor1.setLayout(panelSendToDoctor1Layout);
        panelSendToDoctor1Layout.setHorizontalGroup(
            panelSendToDoctor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSendToDoctor1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSendToDoctor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelSendToDoctor1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(homeDeliveryPicker, 0, 325, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSendToDoctor1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAssignHomeDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelSendToDoctor1Layout.setVerticalGroup(
            panelSendToDoctor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSendToDoctor1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelSendToDoctor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homeDeliveryPicker, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAssignHomeDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                        .addComponent(panelSendToDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelSendToDoctor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelSendToDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelSendToDoctor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1281, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1281, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 606, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignPharmacyDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignPharmacyDeliveryActionPerformed

        int selectedRow = tblOrders.getSelectedRow();
        if (selectedRow < 0) {
            Toast toast = new Toast(mainPanel, "Please select a row to assign", false);
            return;
        }

        String value = tblOrders.getModel().getValueAt(selectedRow, 4).toString();
        
        if (value.contains("Customer")) {
            Toast toast = new Toast(mainPanel, "Please assign this order to customer delivery partner", false);
            
        } else {
            PharmacyAdminOrderWorkRequest request = (PharmacyAdminOrderWorkRequest) tblOrders.getValueAt(selectedRow, 0);
            if(request.getStatus().equals("Retail Order Accepted")){

                UserAccount ua = (UserAccount)pharmacyDeliveryPicker.getSelectedItem();
                request.setReceiver(ua);
                request.setStatus("On the way");
                populateTable();

                Toast toast = new Toast(mainPanel, "Order assigned successfully", true);

            } else if (request.getStatus().equals("Retail Order placed")) {
                Toast toast = new Toast(mainPanel, "Please accept the order first", false);

            } else {
                Toast toast = new Toast(mainPanel, "Order cannot be assigned", false);

            }
        }
        
    }//GEN-LAST:event_btnAssignPharmacyDeliveryActionPerformed

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        // TODO add your handling code here:

        int selectedRow = tblOrders.getSelectedRow();
        if (selectedRow < 0){
            Toast toast = new Toast(mainPanel, "Please select a row to accept", false);
            return;
        }

        WorkRequest request = (WorkRequest) tblOrders.getValueAt(selectedRow, 0);
        if(request.getStatus().equals("Customer order placed")){
            request.setStatus("Customer Order Accepted");
            Toast toast = new Toast(mainPanel, "Order accepted successfully", true);
            
        } else if (request.getStatus().equals("Retail Order placed")){
            request.setStatus("Retail Order Accepted");
            Toast toast = new Toast(mainPanel, "Order accepted successfully", true);
            
        } else {
            Toast toast = new Toast(mainPanel, "Order cannot be accepted/rejected", false);
        }
        populateTable();
    }//GEN-LAST:event_btnAcceptActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed

        int selectedRow = tblOrders.getSelectedRow();
        if (selectedRow < 0) {
            Toast toast = new Toast(mainPanel, "Please select a row to reject", false);
            return;
        }

        WorkRequest request = (WorkRequest) tblOrders.getValueAt(selectedRow, 0);
        if(request.getStatus().equals("Customer order placed")){
            request.setStatus("Rejected");
            Toast toast = new Toast(mainPanel, "Order rejected successfully", true);
            
        } else if (request.getStatus().equals("Retail Order placed")){
            request.setStatus("Rejected");
            Toast toast = new Toast(mainPanel, "Order rejected successfully", true);
            
        } else {
            Toast toast = new Toast(mainPanel, "Order cannot be accepted/rejected", false);
        }
        populateTable();
    }//GEN-LAST:event_btnRejectActionPerformed

    private void btnAssignHomeDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignHomeDeliveryActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblOrders.getSelectedRow();
        if (selectedRow < 0) {
            Toast toast = new Toast(mainPanel, "Please select a row to assign", false);
            return;
        }
            
        String value = tblOrders.getModel().getValueAt(selectedRow, 4).toString();
        
        if (value.contains("Retail")) {
            Toast toast = new Toast(mainPanel, "Please assign this order to pharmacy delivery partner", false);
            
        } else {
            CustomerOrderWorkRequest request = (CustomerOrderWorkRequest) tblOrders.getValueAt(selectedRow, 0);
            if (request.getStatus().equals("Customer Order Accepted")) {

                UserAccount ua = (UserAccount)homeDeliveryPicker.getSelectedItem();
                request.setReceiver(ua);
                request.setStatus("On the way");
                populateTable();

                Toast toast = new Toast(mainPanel, "Order assigned successfully", true);

            } else if (request.getStatus().equals("Customer order placed")) {
                Toast toast = new Toast(mainPanel, "Please accept the order first", false);

            } else {
                Toast toast = new Toast(mainPanel, "Order cannot be assigned", false);

            }
        }
        
    }//GEN-LAST:event_btnAssignHomeDeliveryActionPerformed

    private void populateHomeDeliveryPicker(){
        homeDeliveryPicker.removeAllItems();
        
        String role = "Home Delivery Man";
        
        for (UserAccount ua: distribution.getUserAccountDirectory().getUserAccountList()) {
            if (ua.getRole().toString().equals(role)) {
                homeDeliveryPicker.addItem(ua);
            }
        }
    }
    private void populatePharmacyDeliveryPicker(){
        pharmacyDeliveryPicker.removeAllItems();
        
        String role = "Pharmacy Delivery Man";
        
        for (UserAccount ua:distribution.getUserAccountDirectory().getUserAccountList()) {
            if (ua.getRole().toString().equals(role)) {
                pharmacyDeliveryPicker.addItem(ua);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Enterprises;
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnAssignHomeDelivery;
    private javax.swing.JButton btnAssignPharmacyDelivery;
    private javax.swing.JButton btnReject;
    private javax.swing.JComboBox homeDeliveryPicker;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel panelSendToDoctor;
    private javax.swing.JPanel panelSendToDoctor1;
    private javax.swing.JComboBox pharmacyDeliveryPicker;
    private javax.swing.JTable tblOrders;
    // End of variables declaration//GEN-END:variables
}
