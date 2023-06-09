/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Shipping;

import Business.Products.Product;
import Business.UserAccount.UserAccount;
import Business.Warehouse.Warehouse;
import Business.WorkQueue.CustomerOrderWorkRequest;
import Business.WorkQueue.ShippingOrderWorkRequest;
import Business.WorkQueue.WorkRequest;
import UI.Toast;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rutuja
 */
public class ManageShippingPartnerJPanel extends javax.swing.JPanel {

    private UserAccount userAccount;
    private Warehouse warehouse;
    ShippingOrderWorkRequest request;

    /**
     * Creates new form ManageShippingManJPanel
     */
    public ManageShippingPartnerJPanel(UserAccount userAccount, Warehouse warehouse) {
        initComponents();
        this.userAccount = userAccount;
        this.warehouse = warehouse;
        panelProcessOrder.setVisible(false);

        populateTable();
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblWorkRequest.getModel();
        model.setRowCount(0);

        ArrayList<WorkRequest> wr = warehouse.getWorkQueue().getWorkRequestListArray();

        for (int i = wr.size() - 1; i >= 0; i--) {
            ShippingOrderWorkRequest req = (ShippingOrderWorkRequest) wr.get(i);

            if (req.getReceiver() != userAccount) {
                continue;
            }
            if (req.getStatus().equals("Completed")) {
                continue;
            }
            Object[] row = new Object[4];
            row[0] = req;
            row[1] = req.getSender().getEmployee().getName();
            row[2] = req.getReceiver() == null ? null : req.getReceiver().getEmployee().getName();
            row[3] = req.getStatus();
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
        jPanel4 = new javax.swing.JPanel();
        Enterprises = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblWorkRequest = new javax.swing.JTable();
        btnViewOrders = new javax.swing.JButton();
        btnProcessOrder = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrders = new javax.swing.JTable();
        panelProcessOrder = new javax.swing.JPanel();
        btnSubmit = new javax.swing.JButton();
        lblName1 = new javax.swing.JLabel();
        txtMessage = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(79, 173, 177));

        mainPanel.setBackground(new java.awt.Color(79, 173, 177));
        mainPanel.setPreferredSize(new java.awt.Dimension(997, 800));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.setPreferredSize(new java.awt.Dimension(1165, 106));

        jLabel1.setFont(new java.awt.Font("Devanagari MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Manage Shipping Partner Orders");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(300, 300, 300)
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
        jPanel4.setPreferredSize(new java.awt.Dimension(1165, 246));

        Enterprises.setFont(new java.awt.Font("Devanagari MT", 1, 24)); // NOI18N
        Enterprises.setForeground(new java.awt.Color(0, 0, 0));
        Enterprises.setText("Shipping Partner Orders");
        Enterprises.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Enterprises.setIconTextGap(0);

        tblWorkRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Massage", "Sender", "Receiver", "Order Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblWorkRequest);

        btnViewOrders.setBackground(new java.awt.Color(79, 173, 177));
        btnViewOrders.setFont(new java.awt.Font("Devanagari MT", 1, 14)); // NOI18N
        btnViewOrders.setForeground(new java.awt.Color(0, 0, 0));
        btnViewOrders.setText("View Order");
        btnViewOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrdersActionPerformed(evt);
            }
        });

        btnProcessOrder.setBackground(new java.awt.Color(79, 173, 177));
        btnProcessOrder.setFont(new java.awt.Font("Devanagari MT", 1, 14)); // NOI18N
        btnProcessOrder.setForeground(new java.awt.Color(0, 0, 0));
        btnProcessOrder.setText("Process Order");
        btnProcessOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Enterprises, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(219, 219, 219))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 824, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnProcessOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnViewOrders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(208, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(Enterprises, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnProcessOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnViewOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        tblOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Product", "Price", "Quantity"
            }
        ));
        tblOrders.setRowSelectionAllowed(false);
        jScrollPane2.setViewportView(tblOrders);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelProcessOrder.setBackground(new java.awt.Color(255, 255, 255));
        panelProcessOrder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        btnSubmit.setBackground(new java.awt.Color(79, 173, 177));
        btnSubmit.setFont(new java.awt.Font("Devanagari MT", 1, 14)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(0, 0, 0));
        btnSubmit.setText("Submit");
        btnSubmit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSubmit.setBorderPainted(false);
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        lblName1.setFont(new java.awt.Font("Devanagari MT", 0, 14)); // NOI18N
        lblName1.setForeground(new java.awt.Color(0, 0, 0));
        lblName1.setText("Message:");

        txtMessage.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        txtMessage.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMessageFocusGained(evt);
            }
        });
        txtMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMessageActionPerformed(evt);
            }
        });
        txtMessage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMessageKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Devanagari MT", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Process Order");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setIconTextGap(0);

        javax.swing.GroupLayout panelProcessOrderLayout = new javax.swing.GroupLayout(panelProcessOrder);
        panelProcessOrder.setLayout(panelProcessOrderLayout);
        panelProcessOrderLayout.setHorizontalGroup(
            panelProcessOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProcessOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelProcessOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                    .addGroup(panelProcessOrderLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelProcessOrderLayout.createSequentialGroup()
                        .addComponent(lblName1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMessage)))
                .addContainerGap())
        );
        panelProcessOrderLayout.setVerticalGroup(
            panelProcessOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProcessOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(panelProcessOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelProcessOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelProcessOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1327, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1327, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 674, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrdersActionPerformed
        // TODO add your handling code here:

        int selectedRowIndex = tblWorkRequest.getSelectedRow();
        if (selectedRowIndex < 0) {
            Toast toast = new Toast(mainPanel, "Please select a row to view", false);
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblOrders.getModel();
        model.setRowCount(0);

        ShippingOrderWorkRequest req = (ShippingOrderWorkRequest) tblWorkRequest.getValueAt(selectedRowIndex, 0);

        model.setRowCount(0);
        for (Product product : req.getOrders().getItems()) {
            Object[] row = new Object[3];
            row[0] = product;
            row[1] = product.getPrice();
            row[2] = req.getOrders().getQuantity();
            model.addRow(row);
        }
    }//GEN-LAST:event_btnViewOrdersActionPerformed

    private void btnProcessOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessOrderActionPerformed
        // TODO add your handling code here:

        int selectedRow = tblWorkRequest.getSelectedRow();

        if (selectedRow < 0) {
            Toast toast = new Toast(mainPanel, "Please select a row to process", false);
            return;
        }

        panelProcessOrder.setVisible(true);

        ShippingOrderWorkRequest request = (ShippingOrderWorkRequest) tblWorkRequest.getValueAt(selectedRow, 0);

        if (!request.getStatus().equals("On the way")) {
            if (request.getStatus().equals("Processing")) {

            } else {
                Toast toast = new Toast(mainPanel, "This order has been processed before", false);
                return;
            }
        }
        request.setStatus("Processing");
        this.request = request;
    }//GEN-LAST:event_btnProcessOrderActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        request.setMsg(txtMessage.getText());
        request.setStatus("Completed");
        panelProcessOrder.setVisible(false);
        for (Product product : request.getOrders().getItems()) {
            Product pro = request.getDistribution().getProductDirectory().newProduct(product.getProductName(), product.getPrice(), request.getOrders().getQuantity());
            pro.setDistribution(request.getDistribution());
        }

        populateTable();
        txtMessage.setText("");
        Toast toast = new Toast(mainPanel, "Order processed successfully", true);
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void txtMessageFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMessageFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMessageFocusGained

    private void txtMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMessageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMessageActionPerformed

    private void txtMessageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMessageKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMessageKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Enterprises;
    private javax.swing.JButton btnProcessOrder;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnViewOrders;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblName1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel panelProcessOrder;
    private javax.swing.JTable tblOrders;
    private javax.swing.JTable tblWorkRequest;
    private javax.swing.JTextField txtMessage;
    // End of variables declaration//GEN-END:variables
}
