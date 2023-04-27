/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.DeliveryPartner;

import Business.Distribution.Distribution;
import Business.EcoSystem;
import Business.Products.Product;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CustomerOrderWorkRequest;
import Business.WorkQueue.WorkRequest;
import UI.Toast;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rutuja
 */
public class ManagerDeliveryPartnerJPanel extends javax.swing.JPanel {

    private Distribution distribution;
    private UserAccount userAccount;
    CustomerOrderWorkRequest request;

    /**
     * Creates new form ManagerDeliveryPartnerJPanel
     */
    public ManagerDeliveryPartnerJPanel(UserAccount userAccount, Distribution distribution) {
        initComponents();
        this.userAccount = userAccount;
        this.distribution = distribution;
        panelProcessOrder.setVisible(false);
        populateTable();
        
        DefaultTableModel model = (DefaultTableModel) tblOrders.getModel();
        model.setRowCount(0);
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
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblWorkRequest = new javax.swing.JTable();
        btnProcess = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        Enterprises1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrders = new javax.swing.JTable();
        panelProcessOrder = new javax.swing.JPanel();
        btnSubmit = new javax.swing.JButton();
        lblName1 = new javax.swing.JLabel();
        txtMessage = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(79, 173, 177));

        jPanel2.setBackground(new java.awt.Color(79, 173, 177));
        jPanel2.setPreferredSize(new java.awt.Dimension(997, 800));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel1.setFont(new java.awt.Font("Devanagari MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Home Delivery Summary");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(jLabel1)
                .addContainerGap(413, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        tblWorkRequest.setBackground(new java.awt.Color(255, 255, 255));
        tblWorkRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Messenger", "Sender", "Receiver", "Order Status", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblWorkRequest);
        if (tblWorkRequest.getColumnModel().getColumnCount() > 0) {
            tblWorkRequest.getColumnModel().getColumn(0).setResizable(false);
            tblWorkRequest.getColumnModel().getColumn(1).setResizable(false);
            tblWorkRequest.getColumnModel().getColumn(2).setResizable(false);
            tblWorkRequest.getColumnModel().getColumn(3).setResizable(false);
            tblWorkRequest.getColumnModel().getColumn(4).setResizable(false);
        }

        btnProcess.setBackground(new java.awt.Color(79, 173, 177));
        btnProcess.setFont(new java.awt.Font("Devanagari MT", 1, 14)); // NOI18N
        btnProcess.setForeground(new java.awt.Color(0, 0, 0));
        btnProcess.setText("Process Order");
        btnProcess.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnProcess.setBorderPainted(false);
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        btnView.setBackground(new java.awt.Color(79, 173, 177));
        btnView.setFont(new java.awt.Font("Devanagari MT", 1, 14)); // NOI18N
        btnView.setForeground(new java.awt.Color(0, 0, 0));
        btnView.setText("View Order");
        btnView.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnView.setBorderPainted(false);
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProcess, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(261, 261, 261))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 56, Short.MAX_VALUE)
                        .addComponent(btnProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        Enterprises1.setFont(new java.awt.Font("Devanagari MT", 1, 24)); // NOI18N
        Enterprises1.setForeground(new java.awt.Color(0, 0, 0));
        Enterprises1.setText("View Table");
        Enterprises1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Enterprises1.setIconTextGap(0);

        tblOrders.setBackground(new java.awt.Color(255, 255, 255));
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
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblOrders.setRowSelectionAllowed(false);
        jScrollPane2.setViewportView(tblOrders);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Enterprises1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Enterprises1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
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
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelProcessOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelProcessOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(359, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelProcessOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1530, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1530, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1530, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1530, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:

        int selectedRow = tblWorkRequest.getSelectedRow();

        if (selectedRow < 0) {
            Toast toast = new Toast(mainPanel, "Please select an order first", false);
            return;
        }
        
        panelProcessOrder.setVisible(true);

        CustomerOrderWorkRequest request = (CustomerOrderWorkRequest)tblWorkRequest.getValueAt(selectedRow, 0);

        if (!request.getStatus().equals("On the way")) {
            if (request.getStatus().equals("Processing")) {

            } else {
                Toast toast = new Toast(mainPanel, "This order has been processed before", false);
                return;
            }
        }
        request.setStatus("Processing");
        this.request = request;
    }//GEN-LAST:event_btnProcessActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed

        int selectedRowIndex = tblWorkRequest.getSelectedRow();
        if(selectedRowIndex<0){
            Toast toast = new Toast(mainPanel, "Please select an order first", false);
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblOrders.getModel();
        model.setRowCount(0);

        CustomerOrderWorkRequest req = (CustomerOrderWorkRequest)tblWorkRequest.getValueAt(selectedRowIndex, 0);

        model.setRowCount(0);
        for(Product product: req.getOrder().getItems()){
            Object[] row = new Object[3];
            row[0] = product;
            row[1] = req.getOrder().getPrice();
            row[2] = req.getOrder().getQuantity();
            model.addRow(row);
        }
    }//GEN-LAST:event_btnViewActionPerformed

    private void txtMessageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMessageKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMessageKeyTyped

    private void txtMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMessageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMessageActionPerformed

    private void txtMessageFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMessageFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMessageFocusGained

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        request.setMsg(txtMessage.getText());
        request.setStatus("Completed");
        panelProcessOrder.setVisible(false);
        populateTable();
        Toast toast = new Toast(mainPanel, "The order is processed successfully", true);
        DefaultTableModel model = (DefaultTableModel) tblOrders.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblWorkRequest.getModel();
        model.setRowCount(0);

        ArrayList<WorkRequest> workRequest = distribution.getWorkQueue().getWorkRequestListArray();

        for (int i = workRequest.size() - 1; i >= 0; i--) {
            CustomerOrderWorkRequest req = (CustomerOrderWorkRequest) workRequest.get(i);

            if (req.getReceiver() != userAccount) {
                continue;
            }
            if (req.getStatus().equals("Completed")) {
                continue;
            }
            Object[] row = new Object[5];
            row[0] = req;
            row[1] = req.getSender().getEmployee().getName();
            row[2] = req.getReceiver() == null ? null : req.getReceiver().getEmployee().getName();
            row[3] = req.getStatus();
            row[4] = req.getCustomer().getAddress();
            model.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Enterprises1;
    private javax.swing.JButton btnProcess;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
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
