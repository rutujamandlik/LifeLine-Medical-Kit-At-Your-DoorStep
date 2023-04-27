/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Pharmacy;

import Business.Distribution.Distribution;
import Business.Enterprise.Enterprise;
import Business.Order.Order;
import Business.Pharmacy.Pharmacy;
import Business.Products.Product;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PharmacyAdminOrderWorkRequest;
import UI.Toast;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author divya
 */
public class PlaceOrderPharmacyJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PlaceOrderPharmacyJPanel
     */
    private UserAccount userAccount;
    private ArrayList<Enterprise> enterpriseArray;
    private Pharmacy pharmacy;

    public PlaceOrderPharmacyJPanel(UserAccount userAccount, ArrayList<Enterprise> enterpriseArray, Pharmacy pharmacy) {
        initComponents();

        this.userAccount = userAccount;
        this.enterpriseArray = enterpriseArray;
        this.pharmacy = pharmacy;
        lblQuantityValidation.setVisible(false);
        populateEnterprisePicker();
        
        txtQuantity.setText("1");
        txtTotalPrice.setText("0");
        
        DefaultTableModel model = (DefaultTableModel) tblOrder.getModel();
        model.setRowCount(0);

    }

    private void populateEnterprisePicker() {
        enterprisePicker.removeAllItems();
        int i = 0;
        for (Enterprise enterprise : enterpriseArray) {
            if (i == 0) {
                populateDistPicker(enterprise.getDistributionDirectory().getDistributionsArray());
                i++;
            }
            enterprisePicker.addItem(enterprise);
        }
    }

    private void populateDistPicker(ArrayList<Distribution> ds) {
        distributionPicker.removeAllItems();
        int i = 0;
        for (Distribution d : ds) {
            if (i == 0) {
                populateTableProducts(d);
                i++;
            }
            distributionPicker.addItem(d);
        }
    }

    private void populateTableProducts(Distribution d) {
        DefaultTableModel model = (DefaultTableModel) tblProducts.getModel();
        model.setRowCount(0);

        System.out.println("dddd" + d.getProductDirectory().getProducts());
        for (Product product : d.getProductDirectory().getProducts()) {
            Object[] row = new Object[3];
            row[0] = product;
            row[1] = product.getQuantity();
            row[2] = product.getPrice();
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
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Enterprises = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        btnAddCart = new javax.swing.JButton();
        lblQuantity = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        lblSelectDistribution = new javax.swing.JLabel();
        distributionPicker = new javax.swing.JComboBox();
        lblSelectEnterprise = new javax.swing.JLabel();
        enterprisePicker = new javax.swing.JComboBox();
        lblQuantityValidation = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        Enterprises1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        lblTotal = new javax.swing.JLabel();
        txtMessage = new javax.swing.JTextField();
        btnPlaceOrder = new javax.swing.JButton();
        lblMessage = new javax.swing.JLabel();
        txtTotalPrice = new javax.swing.JTextField();

        jPanel2.setBackground(new java.awt.Color(79, 173, 177));

        jPanel3.setBackground(new java.awt.Color(79, 173, 177));
        jPanel3.setPreferredSize(new java.awt.Dimension(997, 800));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel1.setFont(new java.awt.Font("Devanagari MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Pharmacy Place Order");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        Enterprises.setFont(new java.awt.Font("Devanagari MT", 1, 24)); // NOI18N
        Enterprises.setForeground(new java.awt.Color(0, 0, 0));
        Enterprises.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Enterprises.setIconTextGap(0);

        tblProducts.setBackground(new java.awt.Color(255, 255, 255));
        tblProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Test Kit", "Available Quantity", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProducts);

        btnAddCart.setBackground(new java.awt.Color(79, 173, 177));
        btnAddCart.setFont(new java.awt.Font("Devanagari MT", 1, 14)); // NOI18N
        btnAddCart.setForeground(new java.awt.Color(0, 0, 0));
        btnAddCart.setText("Add to Cart");
        btnAddCart.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddCart.setBorderPainted(false);
        btnAddCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCartActionPerformed(evt);
            }
        });

        lblQuantity.setFont(new java.awt.Font("Devanagari MT", 0, 14)); // NOI18N
        lblQuantity.setForeground(new java.awt.Color(0, 0, 0));
        lblQuantity.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblQuantity.setText("Quantity:");

        txtQuantity.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        txtQuantity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtQuantityFocusGained(evt);
            }
        });
        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });
        txtQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQuantityKeyTyped(evt);
            }
        });

        lblSelectDistribution.setFont(new java.awt.Font("Devanagari MT", 0, 14)); // NOI18N
        lblSelectDistribution.setForeground(new java.awt.Color(0, 0, 0));
        lblSelectDistribution.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSelectDistribution.setText("Select Distribution:");

        distributionPicker.setBackground(new java.awt.Color(79, 173, 177));
        distributionPicker.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        distributionPicker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                distributionPickerActionPerformed(evt);
            }
        });

        lblSelectEnterprise.setFont(new java.awt.Font("Devanagari MT", 0, 14)); // NOI18N
        lblSelectEnterprise.setForeground(new java.awt.Color(0, 0, 0));
        lblSelectEnterprise.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSelectEnterprise.setText("Select Enterprise:");

        enterprisePicker.setBackground(new java.awt.Color(79, 173, 177));
        enterprisePicker.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        enterprisePicker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterprisePickerActionPerformed(evt);
            }
        });

        lblQuantityValidation.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        lblQuantityValidation.setForeground(new java.awt.Color(255, 0, 51));
        lblQuantityValidation.setText("jLabel2");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(lblSelectEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(enterprisePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(lblSelectDistribution, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(distributionPicker, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Enterprises, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAddCart, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(lblQuantity)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblQuantityValidation)
                                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 223, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Enterprises, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSelectDistribution, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(distributionPicker, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSelectEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enterprisePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(9, 9, 9)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addComponent(lblQuantityValidation)
                        .addGap(6, 6, 6)
                        .addComponent(btnAddCart, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 28, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        Enterprises1.setFont(new java.awt.Font("Devanagari MT", 1, 24)); // NOI18N
        Enterprises1.setForeground(new java.awt.Color(0, 0, 0));
        Enterprises1.setText("Your Cart Items");
        Enterprises1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Enterprises1.setIconTextGap(0);

        tblOrder.setBackground(new java.awt.Color(255, 255, 255));
        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Test Kit", "Selected Quantity", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblOrder.setRowSelectionAllowed(false);
        jScrollPane2.setViewportView(tblOrder);
        if (tblOrder.getColumnModel().getColumnCount() > 0) {
            tblOrder.getColumnModel().getColumn(1).setResizable(false);
        }

        lblTotal.setFont(new java.awt.Font("Devanagari MT", 0, 14)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(0, 0, 0));
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTotal.setText("Total Price:");

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

        btnPlaceOrder.setBackground(new java.awt.Color(79, 173, 177));
        btnPlaceOrder.setFont(new java.awt.Font("Devanagari MT", 1, 14)); // NOI18N
        btnPlaceOrder.setForeground(new java.awt.Color(0, 0, 0));
        btnPlaceOrder.setText("Place Order");
        btnPlaceOrder.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPlaceOrder.setBorderPainted(false);
        btnPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderActionPerformed(evt);
            }
        });

        lblMessage.setFont(new java.awt.Font("Devanagari MT", 0, 14)); // NOI18N
        lblMessage.setForeground(new java.awt.Color(0, 0, 0));
        lblMessage.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMessage.setText("Message:");

        txtTotalPrice.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        txtTotalPrice.setEnabled(false);
        txtTotalPrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTotalPriceFocusGained(evt);
            }
        });
        txtTotalPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalPriceActionPerformed(evt);
            }
        });
        txtTotalPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTotalPriceKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Enterprises1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                                    .addComponent(txtTotalPrice)))
                            .addComponent(btnPlaceOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Enterprises1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(btnPlaceOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(799, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(204, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1417, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1970, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 807, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1970, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 807, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainPanelLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1970, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 807, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCartActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblProducts.getSelectedRow();
        if (selectedRowIndex < 0) {
            Toast toast = new Toast(mainPanel, "Please select a row to add", false);
            return;
        }

        if (checkQuantityValidation()) {
            DefaultTableModel model = (DefaultTableModel) tblProducts.getModel();
            Product product = (Product) model.getValueAt(selectedRowIndex, 0);
            DefaultTableModel model1 = (DefaultTableModel) tblOrder.getModel();

            if (product.getQuantity() < Integer.parseInt(txtQuantity.getText())) {
                Toast toast = new Toast(mainPanel, "Product not available in adequate quantity", false);
                return;
            }

            
            Object[] row = new Object[3];
            row[0] = product;
            row[1] = Integer.parseInt(txtQuantity.getText());
            row[2] = Integer.parseInt(txtQuantity.getText()) * product.getPrice();
            model1.addRow(row);

            double total = Double.parseDouble(txtTotalPrice.getText()) + Integer.parseInt(txtQuantity.getText()) * product.getPrice();
            txtTotalPrice.setText(String.valueOf(total));
            txtQuantity.setText("1");
                
            Toast toast = new Toast(mainPanel, "Product added to cart successfully", true);
        }


    }//GEN-LAST:event_btnAddCartActionPerformed

    private void distributionPickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_distributionPickerActionPerformed

        Distribution distribution = (Distribution) distributionPicker.getSelectedItem();
        if (distribution != null) {
            populateTableProducts(distribution);
        }
    }//GEN-LAST:event_distributionPickerActionPerformed

    private void enterprisePickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterprisePickerActionPerformed
        // TODO add your handling code here:
        Enterprise enterprise = (Enterprise) enterprisePicker.getSelectedItem();
        if (enterprise != null) {
            populateDistPicker(enterprise.getDistributionDirectory().getDistributionsArray());
        }
    }//GEN-LAST:event_enterprisePickerActionPerformed

    private void txtQuantityFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQuantityFocusGained
        // TODO add your handling code here:
        lblQuantityValidation.setVisible(false);
    }//GEN-LAST:event_txtQuantityFocusGained

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityActionPerformed

    private void txtQuantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantityKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityKeyTyped

    private void txtMessageFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMessageFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMessageFocusGained

    private void txtMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMessageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMessageActionPerformed

    private void txtMessageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMessageKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMessageKeyTyped

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed
        // TODO add your handling code here:
        String message = txtMessage.getText();
        Distribution distribution = (Distribution) distributionPicker.getSelectedItem();
        Order order = new Order();

        DefaultTableModel model = (DefaultTableModel) tblOrder.getModel();
        int noOfRows = model.getRowCount();
        
        if (noOfRows == 0 ) {
            Toast toast = new Toast(mainPanel, "Your cart is empty! Please add products first", false);
            return;
        }
        
        for (int i = 0; i < noOfRows; i++) {
            Product product = (Product) model.getValueAt(i, 0);
            Integer quant = (Integer) model.getValueAt(i, 1);
            order.addItem(product, quant);
            product.setQuantity(product.getQuantity() - quant);
        }
        order.setMsg(message);
        order.setPrice(Double.parseDouble(txtTotalPrice.getText()));

        PharmacyAdminOrderWorkRequest request = new PharmacyAdminOrderWorkRequest();
        request.setMsg(message);
        request.setDistribution(distribution);
        request.setSender(userAccount);
        request.setStatus("Retail Order placed");
        request.setOrder(order);
        request.setDistribution(distribution);

        distribution.addOrder(order);
        Toast toast = new Toast(mainPanel, "Order placed successfully", true);
        if (distribution == null) {

        } else {
            distribution.getWorkQueue().getWorkRequestListArray2().add(request);
            userAccount.getWorkQueue().getWorkRequestListArray2().add(request);
        }
        model.setRowCount(0);
        txtTotalPrice.setText("0");
        txtMessage.setText("");
        populateEnterprisePicker();
    }//GEN-LAST:event_btnPlaceOrderActionPerformed

    private void txtTotalPriceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTotalPriceFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalPriceFocusGained

    private void txtTotalPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalPriceActionPerformed

    private void txtTotalPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalPriceKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalPriceKeyTyped

    private boolean checkQuantityValidation() {
        boolean isValid = true;

        if (txtQuantity.getText().isEmpty()) {
            isValid = false;
            hideShowValidation(lblQuantityValidation, "Please enter quantity");

        }

        return isValid;
    }

    // Common function to hide show validation labels
    private void hideShowValidation(JLabel lbl, String errorMessage) {
        if (errorMessage.isEmpty()) {
            lbl.setVisible(false);
        } else {
            lbl.setText(errorMessage);
            lbl.setVisible(true);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Enterprises;
    private javax.swing.JLabel Enterprises1;
    private javax.swing.JButton btnAddCart;
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JComboBox distributionPicker;
    private javax.swing.JComboBox enterprisePicker;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblQuantityValidation;
    private javax.swing.JLabel lblSelectDistribution;
    private javax.swing.JLabel lblSelectEnterprise;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTable tblOrder;
    private javax.swing.JTable tblProducts;
    private javax.swing.JTextField txtMessage;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtTotalPrice;
    // End of variables declaration//GEN-END:variables
}
