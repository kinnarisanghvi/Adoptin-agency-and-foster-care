/*
 * AdminWorkAreaJPanel.java
 *
 * Created on October 10, 2008, 8:50 AM
 */

package userInterface.AdministrativeRole;

import Business.Enterprise.AdoptionEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Enterprise.EnterpriseType;
import Business.Enterprise.FosterCareEnterprise;
import Business.Organization.Organization.Type;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import userInterface.Analytics.ChildAnalytics;
import userInterface.Analytics.ParentAnalytics;
import userInterface.Donations.ManageDonationJPanel;

/**
 *
 * @author  raunak
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    Enterprise enterprise;
    UserAccount account;
    /** Creates new form AdminWorkAreaJPanel */
    public AdminWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise,UserAccount account) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account = account;
        valueLabel.setText(enterprise.getName());
        EnterpriseType type = Enterprise.EnterpriseType.FosterCare;
        EnterpriseType adoptionType = Enterprise.EnterpriseType.Adoption;
        if(enterprise.getEnterpriseType().equals(type)){
            
            btnManageChildren.setVisible(true);
        }else{
            btnManageChildren.setVisible(false);
        }
        if(enterprise.getEnterpriseType().equals(adoptionType)){
            
            btnManageSponsors.setVisible(true);
            btnAnalysis.setVisible(true);
            btnChildAn.setVisible(true);
        }else{
            btnManageSponsors.setVisible(false);
            btnAnalysis.setVisible(false);
             btnChildAn.setVisible(false);
        }
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */

    public AdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, AdoptionEnterprise enterprise) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        userJButton = new javax.swing.JButton();
        manageEmployeeJButton = new javax.swing.JButton();
        manageOrganizationJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        btnManageChildren = new javax.swing.JButton();
        btnManageSponsors = new javax.swing.JButton();
        btnAnalysis = new javax.swing.JButton();
        btnChildAn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Work Area -Aminstrative Role");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        userJButton.setText("Manage User");
        userJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userJButtonActionPerformed(evt);
            }
        });
        add(userJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 150, -1));

        manageEmployeeJButton.setText("Manage Employee");
        manageEmployeeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeJButtonActionPerformed(evt);
            }
        });
        add(manageEmployeeJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 150, -1));

        manageOrganizationJButton.setText("Manage Organization");
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });
        add(manageOrganizationJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 120, 30));

        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 130, -1));

        btnManageChildren.setText("Manage Children");
        btnManageChildren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageChildrenActionPerformed(evt);
            }
        });
        add(btnManageChildren, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, -1, -1));

        btnManageSponsors.setText("ManageSponsors");
        btnManageSponsors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageSponsorsActionPerformed(evt);
            }
        });
        add(btnManageSponsors, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, -1, -1));

        btnAnalysis.setText("Parent Analytics");
        btnAnalysis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalysisActionPerformed(evt);
            }
        });
        add(btnAnalysis, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 150, -1));

        btnChildAn.setText("Child Analytics");
        btnChildAn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChildAnActionPerformed(evt);
            }
        });
        add(btnChildAn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void userJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userJButtonActionPerformed
        // TODO add your handling code here:
        ManageUserAccountJPanel muajp = new ManageUserAccountJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("ManageUserAccountJPanel", muajp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_userJButtonActionPerformed

    private void manageEmployeeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeJButtonActionPerformed

        ManageEmployeeJPanel manageEmployeeJPanel = new ManageEmployeeJPanel(userProcessContainer, enterprise.getOrganizationDirectory(),enterprise);
        userProcessContainer.add("manageEmployeeJPanel", manageEmployeeJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_manageEmployeeJButtonActionPerformed

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed

        ManageOrganizationJPanel manageOrganizationJPanel = new ManageOrganizationJPanel(userProcessContainer, enterprise.getOrganizationDirectory(),enterprise);
        userProcessContainer.add("manageOrganizationJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed

    private void btnManageChildrenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageChildrenActionPerformed
        // TODO add your handling code here:
        ManageChildJPanel manageParentsJPanel = new ManageChildJPanel( userProcessContainer, (FosterCareEnterprise) enterprise, account);
        userProcessContainer.add("manageParentsJPanel", manageParentsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageChildrenActionPerformed

    private void btnManageSponsorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageSponsorsActionPerformed
        // TODO add your handling code here:
        ManageDonationJPanel manageDonorJPanel = new ManageDonationJPanel(userProcessContainer, (AdoptionEnterprise) enterprise, account);
        userProcessContainer.add("ManageDonorJPanel",manageDonorJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageSponsorsActionPerformed

    private void btnAnalysisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalysisActionPerformed
        // TODO add your handling code here:
        ParentAnalytics parent = new ParentAnalytics(userProcessContainer, (AdoptionEnterprise)enterprise, account);
        userProcessContainer.add("ParentAnalytics", parent);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAnalysisActionPerformed

    private void btnChildAnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChildAnActionPerformed
        // TODO add your handling code here:
        ChildAnalytics parent = new ChildAnalytics(userProcessContainer, (AdoptionEnterprise)enterprise, account);
        userProcessContainer.add("ParentAnalytics", parent);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnChildAnActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalysis;
    private javax.swing.JButton btnChildAn;
    private javax.swing.JButton btnManageChildren;
    private javax.swing.JButton btnManageSponsors;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageEmployeeJButton;
    private javax.swing.JButton manageOrganizationJButton;
    private javax.swing.JButton userJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
    
}