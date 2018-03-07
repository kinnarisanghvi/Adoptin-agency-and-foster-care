/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.ParentRole;

import Business.EcoSystem;
import Business.Enterprise.AdoptionEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.TrainingEnterprise;
import Business.Network.Network;
import Business.Organization.ManagementOrganization;
import Business.Organization.Organization;
import Business.Organization.ParentOrganization;
import Business.Organization.TrainingManagementOrganization;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.FinancialCheckWorkRequest;
import Business.WorkQueue.MedicalCheckWorkRequest;
import Business.WorkQueue.ParentWorkRequest;
import Business.WorkQueue.TrainingWorkRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sneha
 */
public class ParentWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ParentWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private ParentOrganization parentOrganization;
    private AdoptionEnterprise adoptionEnterprise;
    private EcoSystem business;
    private TrainingEnterprise trainingEnterprise;
    public ParentWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, ParentOrganization parentOrganization, AdoptionEnterprise adoptionEnterprise, EcoSystem business) {
        initComponents();
        this.account = account;
        this.userProcessContainer = userProcessContainer;
        this.parentOrganization = parentOrganization;
        this.adoptionEnterprise = adoptionEnterprise;
        this.business = business;
        populateRequestTable();
        
        Organization orgManagement = null;
        for (Organization organization : adoptionEnterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof ManagementOrganization){
                orgManagement = organization;
                break;
            }
        }
        
        if(orgManagement != null){
            for(WorkRequest req : orgManagement.getWorkQueue().getWorkRequestList()){
                if(req.getParent().toString().equals(account.getEmployee().toString())){
                    String status =req.getStatus();
                    String training = req.getMessage();
                    statusLabel.setText(status);
                    lblTraining.setText(training);
                    
                }
            }
        }
        
    }

    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) parentRequestJTable.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : account.getWorkQueue().getWorkRequestList()){
            ParentWorkRequest parentReq = (ParentWorkRequest) request;
            Object[] row = new Object[5];
            row[0] = request;
            row[1] = request.getSender();
            row[2] = request.getStatus();
            row[3] = parentReq.getDescription();
           //String result = ((ManagementWorkRequest) request).getMessage();
          // String result = ((ManagementWorkRequest) request).getStatus();
            //row[3] = result == null ? "Waiting" : result;
            
            row[4] = parentReq.getTraining_level();
            
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        parentRequestJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        btnLevel1 = new javax.swing.JButton();
        btnLevel2 = new javax.swing.JButton();
        btnLevel3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnUploadDocs = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblTraining = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Work Area - Parent Role");

        parentRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Parent", "Sender", "Status", "Desciption", "Training Level"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(parentRequestJTable);

        jLabel2.setText("My Status:");

        statusLabel.setText("jLabel3");

        btnLevel1.setText("Level 1");
        btnLevel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLevel1ActionPerformed(evt);
            }
        });

        btnLevel2.setText("Level 2");
        btnLevel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLevel2ActionPerformed(evt);
            }
        });

        btnLevel3.setText("Level 3");
        btnLevel3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLevel3ActionPerformed(evt);
            }
        });

        jLabel3.setText("Register for trainings:");

        btnUploadDocs.setText("Upload Documents");
        btnUploadDocs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadDocsActionPerformed(evt);
            }
        });

        jButton1.setText("Upload Reports");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Training Status");

        lblTraining.setText("jLabel5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnUploadDocs)
                                    .addComponent(jButton1))
                                .addGap(109, 109, 109)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnLevel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnLevel2)
                                            .addComponent(btnLevel3))
                                        .addGap(35, 35, 35)))))
                        .addGap(328, 328, 328))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(statusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                    .addComponent(lblTraining, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(210, 210, 210))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(statusLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblTraining))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUploadDocs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLevel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLevel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLevel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLevel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLevel1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = parentRequestJTable.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        ParentWorkRequest parentReq = (ParentWorkRequest)parentRequestJTable.getValueAt(selectedRow, 0);
        parentReq.setStatus("Waiting for level1 registration approval");
        TrainingWorkRequest tReq = new TrainingWorkRequest();
        tReq.setParent(parentReq.getParent());
        tReq.setStatus("Waiting for level1 registration approval");
        tReq.setLevel1Complete(false);
        tReq.setSender(account);
       // parentReq.setStatus("Waiting for level1 registration approval");
      //  parentReq.setRegisteredFor(ParentWorkRequest.REGLEVEL_1);
        tReq.setParentReq(parentReq);
        tReq.setRegisteredFor(TrainingWorkRequest.REGLEVEL_1);
        
         Organization trainingOrg = null;
         Enterprise trainingEnt =  null;
       
    for (Network network : business.getNetworkList()) {
         for (Enterprise enterprise1 : network.getEnterpriseDirectory().getEnterpriseList())
         if(enterprise1 instanceof TrainingEnterprise)
         {
            for (Organization organization1 : enterprise1.getOrganizationDirectory().getOrganizationList())             
            {
            if (organization1 instanceof TrainingManagementOrganization){
                trainingOrg = organization1;
                trainingEnt=enterprise1;
                break;
               }
            }
         }
    }
        
        if (trainingOrg!=null){
        
            trainingOrg.getWorkQueue().getWorkRequestList().add(tReq);
            //account.getWorkQueue().getWorkRequestList().add(request);
        }
        JOptionPane.showMessageDialog(null, "Registration Request raised For Level1 training");
        populateRequestTable();
    }//GEN-LAST:event_btnLevel1ActionPerformed

    private void btnLevel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLevel2ActionPerformed
        // TODO add your handling code here:
        int selectedRow = parentRequestJTable.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        ParentWorkRequest parentReq = (ParentWorkRequest)parentRequestJTable.getValueAt(selectedRow, 0);
        parentReq.setStatus("Waiting for level2 registration approval");
        TrainingWorkRequest tReq = new TrainingWorkRequest();
        tReq.setParent(parentReq.getParent());
        tReq.setStatus("Waiting for level2 registration approval");
        tReq.setLevel1Complete(false);
        tReq.setSender(account);
       // parentReq.setStatus("Waiting for level1 registration approval");
      //  parentReq.setRegisteredFor(ParentWorkRequest.REGLEVEL_1);
        tReq.setParentReq(parentReq);
        tReq.setRegisteredFor(TrainingWorkRequest.REGLEVEL_2);
        
         Organization trainingOrg = null;
         Enterprise trainingEnt =  null;
       
    for (Network network : business.getNetworkList()) {
         for (Enterprise enterprise1 : network.getEnterpriseDirectory().getEnterpriseList())
         if(enterprise1 instanceof TrainingEnterprise)
         {
            for (Organization organization1 : enterprise1.getOrganizationDirectory().getOrganizationList())             
            {
            if (organization1 instanceof TrainingManagementOrganization){
                trainingOrg = organization1;
                trainingEnt=enterprise1;
                break;
               }
            }
         }
    }
        
        if (trainingOrg!=null){
        
            trainingOrg.getWorkQueue().getWorkRequestList().add(tReq);
            //account.getWorkQueue().getWorkRequestList().add(request);
        }
        JOptionPane.showMessageDialog(null, "Registration Request raised For Level2 training");
        populateRequestTable();
    }//GEN-LAST:event_btnLevel2ActionPerformed

    private void btnLevel3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLevel3ActionPerformed
        // TODO add your handling code here:
        int selectedRow = parentRequestJTable.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        ParentWorkRequest parentReq = (ParentWorkRequest)parentRequestJTable.getValueAt(selectedRow, 0);
        parentReq.setStatus("Waiting for level3 registration approval");
        TrainingWorkRequest tReq = new TrainingWorkRequest();
        tReq.setParent(parentReq.getParent());
        tReq.setStatus("Waiting for level3 registration approval");
       // tReq.setLevel1Complete(false);
        tReq.setSender(account);
       // parentReq.setStatus("Waiting for level1 registration approval");
      //  parentReq.setRegisteredFor(ParentWorkRequest.REGLEVEL_1);
        tReq.setParentReq(parentReq);
        tReq.setRegisteredFor(TrainingWorkRequest.REGLEVEL_3);
        
         Organization trainingOrg = null;
         Enterprise trainingEnt =  null;
       
    for (Network network : business.getNetworkList()) {
         for (Enterprise enterprise1 : network.getEnterpriseDirectory().getEnterpriseList())
         if(enterprise1 instanceof TrainingEnterprise)
         {
            for (Organization organization1 : enterprise1.getOrganizationDirectory().getOrganizationList())             
            {
            if (organization1 instanceof TrainingManagementOrganization){
                trainingOrg = organization1;
                trainingEnt=enterprise1;
                break;
               }
            }
         }
    }
        
        if (trainingOrg!=null){
        
            trainingOrg.getWorkQueue().getWorkRequestList().add(tReq);
            //account.getWorkQueue().getWorkRequestList().add(request);
        }
        JOptionPane.showMessageDialog(null, "Registration Request raised For Level3 training");
        populateRequestTable();
    }//GEN-LAST:event_btnLevel3ActionPerformed

    private void btnUploadDocsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadDocsActionPerformed
        
        int selectedRow = parentRequestJTable.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        ParentWorkRequest parentReq = (ParentWorkRequest)parentRequestJTable.getValueAt(selectedRow, 0);
        parentReq.setStatus(FinancialCheckWorkRequest.DOCSTATUS_UPLOADED);
        FinancialCheckWorkRequest freq = parentReq.getfWorkRequest();
        freq.setDocUploadStatus(FinancialCheckWorkRequest.DOCSTATUS_UPLOADED);
        populateRequestTable();
        
    }//GEN-LAST:event_btnUploadDocsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        int selectedRow = parentRequestJTable.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        ParentWorkRequest parentReq = (ParentWorkRequest)parentRequestJTable.getValueAt(selectedRow, 0);
        parentReq.setStatus(MedicalCheckWorkRequest.DOCSTATUS_UPLOADED);
        parentReq.getmWorkRequest().setDocUploadStatus(MedicalCheckWorkRequest.DOCSTATUS_UPLOADED);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLevel1;
    private javax.swing.JButton btnLevel2;
    private javax.swing.JButton btnLevel3;
    private javax.swing.JButton btnUploadDocs;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTraining;
    private javax.swing.JTable parentRequestJTable;
    private javax.swing.JLabel statusLabel;
    // End of variables declaration//GEN-END:variables
}
