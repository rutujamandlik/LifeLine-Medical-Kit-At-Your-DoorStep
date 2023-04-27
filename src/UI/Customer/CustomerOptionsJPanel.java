/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Customer;

import Business.Customer.Customer;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import static UI.Admin.AdminManageOptionsJPanel.system;
import UI.Admin.ManageEnterpriseJPanel;
import UI.MainJFrame;
import java.awt.CardLayout;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author milindsharma
 */
public class CustomerOptionsJPanel extends javax.swing.JPanel {

    private EcoSystem system;
    private UserAccount account;

    /**
     * Creates new form CustomerOptionsJPanel
     */
    public CustomerOptionsJPanel(UserAccount account, EcoSystem system) {
        this.account = account;
        this.system = system;
        initComponents();
        
        setLogo();
        setBackground();
    }

    private void setLogo() {
        Image image = null;
        try {
            image = ImageIO.read(getClass().getResource("/UI/logo.png"));
        } catch (IOException ex) {
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        Image scaledImg = image.getScaledInstance(120, 200, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(scaledImg);
        imgLogo.setIcon(icon);
    }
    
    private void setBackground() {
        
        URL url = this.getClass().getResource("/UI/Customer/testkitbg.gif");        
        Icon icon = new ImageIcon(url);
        bgImage.setIcon(icon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel = new javax.swing.JPanel();
        jSplitPane = new javax.swing.JSplitPane();
        OptionsJPanel = new javax.swing.JPanel();
        btnBuyTestKit = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        imgLogo = new javax.swing.JLabel();
        btnSearchStores = new javax.swing.JButton();
        btnConsultDoctor = new javax.swing.JButton();
        btnViewResults = new javax.swing.JButton();
        btnViewOrders = new javax.swing.JButton();
        ActivityJPanel = new javax.swing.JPanel();
        bgImage = new javax.swing.JLabel();

        jPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 173, 177), 5));
        jPanel.setPreferredSize(new java.awt.Dimension(1440, 800));

        jSplitPane.setPreferredSize(new java.awt.Dimension(1153, 800));

        OptionsJPanel.setBackground(new java.awt.Color(0, 0, 0));
        OptionsJPanel.setPreferredSize(new java.awt.Dimension(250, 925));

        btnBuyTestKit.setBackground(new java.awt.Color(79, 173, 177));
        btnBuyTestKit.setText("Buy a Test Kit");
        btnBuyTestKit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyTestKitActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(79, 173, 177));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        imgLogo.setText("jLabel2");
        imgLogo.setMaximumSize(new java.awt.Dimension(60, 60));
        imgLogo.setMinimumSize(new java.awt.Dimension(60, 60));

        btnSearchStores.setBackground(new java.awt.Color(79, 173, 177));
        btnSearchStores.setText("Search Stores");
        btnSearchStores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchStoresActionPerformed(evt);
            }
        });

        btnConsultDoctor.setBackground(new java.awt.Color(79, 173, 177));
        btnConsultDoctor.setText("Consult Doctor");
        btnConsultDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultDoctorActionPerformed(evt);
            }
        });

        btnViewResults.setBackground(new java.awt.Color(79, 173, 177));
        btnViewResults.setText("View Results");
        btnViewResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewResultsActionPerformed(evt);
            }
        });

        btnViewOrders.setBackground(new java.awt.Color(79, 173, 177));
        btnViewOrders.setText("View Orders");
        btnViewOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrdersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OptionsJPanelLayout = new javax.swing.GroupLayout(OptionsJPanel);
        OptionsJPanel.setLayout(OptionsJPanelLayout);
        OptionsJPanelLayout.setHorizontalGroup(
            OptionsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OptionsJPanelLayout.createSequentialGroup()
                .addGroup(OptionsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OptionsJPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(OptionsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuyTestKit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(OptionsJPanelLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(OptionsJPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSearchStores, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
                    .addGroup(OptionsJPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(OptionsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnConsultDoctor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnViewResults, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                            .addComponent(btnViewOrders, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))))
                .addContainerGap())
        );
        OptionsJPanelLayout.setVerticalGroup(
            OptionsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OptionsJPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnBuyTestKit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btnSearchStores, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConsultDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnViewResults, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnViewOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 406, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180))
        );

        jSplitPane.setLeftComponent(OptionsJPanel);

        ActivityJPanel.setBackground(new java.awt.Color(255, 255, 255));
        ActivityJPanel.setPreferredSize(new java.awt.Dimension(997, 800));
        ActivityJPanel.setLayout(new java.awt.CardLayout());
        ActivityJPanel.add(bgImage, "card2");

        jSplitPane.setRightComponent(ActivityJPanel);

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1440, Short.MAX_VALUE)
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 925, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 925, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1440, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 925, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1440, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 925, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuyTestKitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyTestKitActionPerformed
        // TODO add your handling code here:

        Customer customer=null;
        for (Customer c: system.getCustomerDirectory().getCustomers()) {
            if (c.getEmployee().getName().equals(account.getEmployee().getName())) {
                customer = c;
            }
        }
            
        BuyTestKitJPanel buyTestKitJPanel = new BuyTestKitJPanel(account, system, customer);
        ActivityJPanel.add("BuyTestKitJPanel", buyTestKitJPanel);
        CardLayout layout = (CardLayout)ActivityJPanel.getLayout();
        layout.next(ActivityJPanel);
    }//GEN-LAST:event_btnBuyTestKitActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        DB4OUtil.getInstance().storeSystem(system);
        MainJFrame.mainPanel.remove(this);
        CardLayout layout = (CardLayout) MainJFrame.mainPanel.getLayout();
        layout.previous(MainJFrame.mainPanel);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnSearchStoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchStoresActionPerformed
        // TODO add your handling code here:

        Customer customer=null;
        for(Customer c: system.getCustomerDirectory().getCustomers()){
            if(c.getEmployee().getName().equals(account.getEmployee().getName())){
                customer = c;
            }
        }
        SearchStoresJPanel searchStoresJPanel = new SearchStoresJPanel(account, system, customer);
        ActivityJPanel.add("SearchStoresJPanel", searchStoresJPanel);
        CardLayout layout = (CardLayout)ActivityJPanel.getLayout();
        layout.next(ActivityJPanel);
    }//GEN-LAST:event_btnSearchStoresActionPerformed

    private void btnConsultDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultDoctorActionPerformed
        // TODO add your handling code here:
        Customer customer=null;
        for(Customer c: system.getCustomerDirectory().getCustomers()){
            if(c.getEmployee().getName().equals(account.getEmployee().getName())){
                customer = c;
            }
        }
        
        ConsultDoctorJPanel consultDoctorJPanel = new ConsultDoctorJPanel(account, system, customer);
        ActivityJPanel.add("ConsultDoctorJPanel", consultDoctorJPanel);
        CardLayout layout = (CardLayout)ActivityJPanel.getLayout();
        layout.next(ActivityJPanel);
    }//GEN-LAST:event_btnConsultDoctorActionPerformed

    private void btnViewResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewResultsActionPerformed
        // TODO add your handling code here:
        Customer customer=null;
        for(Customer c: system.getCustomerDirectory().getCustomers()){
            if(c.getEmployee() == account.getEmployee()){
                customer = c;
            }
        }
        
        ViewTestResultsJPanel viewTestResultsJPanel = new ViewTestResultsJPanel(account, system, customer);
        ActivityJPanel.add("ViewTestResultsJPanel", viewTestResultsJPanel);
        CardLayout layout = (CardLayout)ActivityJPanel.getLayout();
        layout.next(ActivityJPanel);
    }//GEN-LAST:event_btnViewResultsActionPerformed

    private void btnViewOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrdersActionPerformed
        // TODO add your handling code here:
        
        Customer customer=null;
        for(Customer c: system.getCustomerDirectory().getCustomers()){
            if(c.getEmployee().equals(account.getEmployee())){
                customer = c;
            }
        }
        ViewOrdersJPanel viewOrdersJPanel = new ViewOrdersJPanel(account, system, customer);
        ActivityJPanel.add("ViewOrdersJPanel", viewOrdersJPanel);
        CardLayout layout = (CardLayout)ActivityJPanel.getLayout();
        layout.next(ActivityJPanel);
        
    }//GEN-LAST:event_btnViewOrdersActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ActivityJPanel;
    private javax.swing.JPanel OptionsJPanel;
    private javax.swing.JLabel bgImage;
    private javax.swing.JButton btnBuyTestKit;
    private javax.swing.JButton btnConsultDoctor;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSearchStores;
    private javax.swing.JButton btnViewOrders;
    private javax.swing.JButton btnViewResults;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane;
    // End of variables declaration//GEN-END:variables
}
