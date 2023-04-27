/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.FDAEnterpriseAdmin;

import Business.DB4OUtil.DB4OUtil;
import Business.Distribution.Distribution;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.FDA.FDA;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import static UI.Admin.ManageNetworkJPanel.system;
import UI.MainJFrame;
import java.awt.CardLayout;
import java.awt.Image;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author rutuja
 */
public class FDAEnterpriseManageOptionsJPanel extends javax.swing.JPanel {

    public static EcoSystem system;
    Enterprise enterprise;
    /**
     * Creates new form FDAEnterpriseManageOptionsJPanel
     */
    public FDAEnterpriseManageOptionsJPanel(EcoSystem system, Enterprise enterprise) { 
        this.enterprise = enterprise;
        this.system = system;
        initComponents();
        
        setLogo();
        setBackground();
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
        jPanel = new javax.swing.JPanel();
        jSplitPane = new javax.swing.JSplitPane();
        OptionsJPanel = new javax.swing.JPanel();
        btnFDAUnit = new javax.swing.JButton();
        btnFDAAdmin = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        imgLogo = new javax.swing.JLabel();
        ActivityJPanel = new javax.swing.JPanel();
        bgImage = new javax.swing.JLabel();

        jPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 173, 177), 5));
        jPanel.setPreferredSize(new java.awt.Dimension(1440, 800));

        jSplitPane.setPreferredSize(new java.awt.Dimension(1153, 800));

        OptionsJPanel.setBackground(new java.awt.Color(0, 0, 0));
        OptionsJPanel.setPreferredSize(new java.awt.Dimension(250, 925));

        btnFDAUnit.setBackground(new java.awt.Color(79, 173, 177));
        btnFDAUnit.setText("FDA Unit");
        btnFDAUnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFDAUnitActionPerformed(evt);
            }
        });

        btnFDAAdmin.setBackground(new java.awt.Color(79, 173, 177));
        btnFDAAdmin.setText("FDA Admin");
        btnFDAAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFDAAdminActionPerformed(evt);
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
                            .addComponent(btnFDAUnit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnFDAAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(OptionsJPanelLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        OptionsJPanelLayout.setVerticalGroup(
            OptionsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OptionsJPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnFDAUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFDAAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addComponent(jSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 909, Short.MAX_VALUE)
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 919, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 919, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 689, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnFDAUnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFDAUnitActionPerformed
        // TODO add your handling code here:
        
        FDAUnitCreate fdaunit = new FDAUnitCreate(enterprise);
        ActivityJPanel.add("FDAUnitCreate", fdaunit);
        CardLayout layout = (CardLayout)ActivityJPanel.getLayout();
        layout.next(ActivityJPanel);
    }//GEN-LAST:event_btnFDAUnitActionPerformed

    private void btnFDAAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFDAAdminActionPerformed
        // TODO add your handling code here:
        FDAAdminCreate fdaAdminunit = new FDAAdminCreate(enterprise);
        ActivityJPanel.add("FDAAdminCreate", fdaAdminunit);
        CardLayout layout = (CardLayout)ActivityJPanel.getLayout();
        layout.next(ActivityJPanel);

       

    }//GEN-LAST:event_btnFDAAdminActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:

        DB4OUtil.getInstance().storeSystem(system);
        MainJFrame.mainPanel.remove(this);
        CardLayout layout = (CardLayout) MainJFrame.mainPanel.getLayout();
        layout.first(MainJFrame.mainPanel);
    }//GEN-LAST:event_btnLogoutActionPerformed

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
        
        Image image = null;
        try {
                image = ImageIO.read(getClass().getResource("/UI/FDA/fdabg.jpeg"));
        } catch (IOException ex) {
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        Image scaledImg = image.getScaledInstance(1180, 930, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(scaledImg);
        System.out.println(icon);
        bgImage.setIcon(icon);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ActivityJPanel;
    private javax.swing.JPanel OptionsJPanel;
    private javax.swing.JLabel bgImage;
    private javax.swing.JButton btnFDAAdmin;
    private javax.swing.JButton btnFDAUnit;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane;
    // End of variables declaration//GEN-END:variables
}