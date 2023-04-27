/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Customer;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Hospital.Hospital;
import Business.Network.Network;
import Business.Order.Order;
import Business.Products.Product;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CustomerOrderWorkRequest;
import Business.WorkQueue.TestRequest;
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
 * @author milindsharma
 */
public class ViewOrdersJPanel extends javax.swing.JPanel {

    EcoSystem system;
    UserAccount userAccount;
    Customer customer;

    /**
     * Creates new form ViewOrdersJPanel
     */
    public ViewOrdersJPanel(UserAccount userAccount, EcoSystem system, Customer customer) {
        initComponents();
        this.system = system;
        this.userAccount = userAccount;
        this.customer = customer;
        
        populateTable();
        populatePicker();
    }

    private void populatePicker(){
        hospitalPicker.removeAllItems();
        for (Network network: system.getNetworkList()) {
                for (Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseListArray()) {
                    if (enterprise.getHospitalDirectory() != null){
                        for (Hospital hospital: enterprise.getHospitalDirectory().getHospitalsArray()) {
                            hospitalPicker.addItem(hospital);
                        }
                    }
                }
            }
    }
    
    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) tblOrders.getModel();
        
        model.setRowCount(0);
        ArrayList<WorkRequest> workReq = userAccount.getWorkQueue().getWorkRequestListArray();
        
        for (int i=workReq.size()-1; i>=0; i--){
            CustomerOrderWorkRequest customerOrderWorkReq = null;
            try {
                customerOrderWorkReq = (CustomerOrderWorkRequest)workReq.get(i);
            }
            catch(Exception e){
                continue;
            }
            Order order = customerOrderWorkReq.getOrder();

            for(Product product:order.getItems()){
                
                Object[] row = new Object[5];
                row[0] = product;
                row[1] = product.getDistribution();
                row[2] = order.getQuantity();
                row[3] = order.getPrice();
                row[4] = customerOrderWorkReq.getStatus();
                model.addRow(row);
            }
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
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtMessage = new javax.swing.JTextField();
        btnSendForTesting = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        hospitalPicker = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrders = new javax.swing.JTable();

        mainPanel.setBackground(new java.awt.Color(79, 173, 177));
        mainPanel.setPreferredSize(new java.awt.Dimension(997, 800));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.setPreferredSize(new java.awt.Dimension(1165, 106));

        jLabel1.setFont(new java.awt.Font("Devanagari MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Order Summary");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(450, 450, 450)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel4.setFont(new java.awt.Font("Devanagari MT", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Message:");

        txtMessage.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMessage.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMessageFocusGained(evt);
            }
        });

        btnSendForTesting.setBackground(new java.awt.Color(79, 173, 177));
        btnSendForTesting.setFont(new java.awt.Font("Devanagari MT", 1, 14)); // NOI18N
        btnSendForTesting.setForeground(new java.awt.Color(0, 0, 0));
        btnSendForTesting.setText("Send For Testing");
        btnSendForTesting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendForTestingActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Devanagari MT", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Select Hospital:");

        hospitalPicker.setBackground(new java.awt.Color(180, 223, 229));
        hospitalPicker.setFont(new java.awt.Font("Devanagari MT", 0, 13)); // NOI18N
        hospitalPicker.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tblOrders.setBackground(new java.awt.Color(255, 255, 255));
        tblOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Message", "Unit", "Quantity", "Price", "Status"
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
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(538, 538, 538)
                        .addComponent(btnSendForTesting, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(hospitalPicker, 0, 212, Short.MAX_VALUE)
                            .addComponent(txtMessage))))
                .addContainerGap(217, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hospitalPicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSendForTesting, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {hospitalPicker, jLabel4, jLabel5, txtMessage});

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(184, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(197, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1355, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1355, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtMessageFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMessageFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMessageFocusGained

    private void btnSendForTestingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendForTestingActionPerformed
        // TODO add your handling code here:

        int selectedRow = tblOrders.getSelectedRow();
        if (selectedRow < 0){
            Toast toast = new Toast(mainPanel, "Please select a row to send", false);
            return;
        }
        
        ArrayList<WorkRequest> workReq = userAccount.getWorkQueue().getWorkRequestListArray();
        CustomerOrderWorkRequest customerOrderWorkReq = null;
            try {
                customerOrderWorkReq = (CustomerOrderWorkRequest)workReq.get(selectedRow);
            }
            catch(Exception e){

            }

            Order order = customerOrderWorkReq.getOrder();
        if (!customerOrderWorkReq.getStatus().equals("Completed")) {
            Toast toast = new Toast(mainPanel, "Order not delivered to you yet", false);
            return;
        }

        TestRequest request = new TestRequest();
        DefaultTableModel model = (DefaultTableModel) tblOrders.getModel();
        Product product = (Product)model.getValueAt(selectedRow, 0);
        
        Hospital hospital = (Hospital) hospitalPicker.getSelectedItem();
        request.setCustomer(customer);
        System.out.println(customer);
        request.setHospitalName(hospital);
        request.setProduct(product);
        request.setMsg(txtMessage.getText());
        request.setStatus("Sample sent");
        request.setTestResult("");
        
        hospital.getWorkQueue().getWorkRequestListArray2().add(request);
        userAccount.getWorkQueue().getWorkRequestListArray2().add(request);
        
        Toast toast = new Toast(mainPanel, "Sample sent successfully", true);
        
        populateTable();

    }//GEN-LAST:event_btnSendForTestingActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSendForTesting;
    private javax.swing.JComboBox hospitalPicker;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTable tblOrders;
    private javax.swing.JTextField txtMessage;
    // End of variables declaration//GEN-END:variables
}
