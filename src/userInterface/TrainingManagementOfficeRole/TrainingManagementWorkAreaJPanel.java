/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.TrainingManagementOfficeRole;

import Business.EcoSystem;
import Business.Enterprise.AdoptionEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.TrainingEnterprise;
import Business.Network.Network;
import Business.Organization.ManagementOrganization;
import Business.Organization.Organization;
import Business.Organization.TrainingManagementOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FinancialCheckWorkRequest;
import Business.WorkQueue.ManagementWorkRequest;
import Business.WorkQueue.TrainingWorkRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kinnari
 */
public class TrainingManagementWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TrainingManagementWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private TrainingManagementOrganization trainingManagementOrganization;
    private TrainingEnterprise trainingEnterprise;
    private EcoSystem business;
    public TrainingManagementWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, TrainingManagementOrganization trainingManagementOrganization, TrainingEnterprise trainingEnterprise, EcoSystem business) {
        initComponents();
        this.business = business;
        this.userProcessContainer=  userProcessContainer;
        this.account = account;
        this.trainingEnterprise = trainingEnterprise;
        this.trainingManagementOrganization = trainingManagementOrganization;
        populateRequestLevel1Table();
        populateRequestLevel2Table();
        populateRequestLevel3Table();
        
    }

    public void populateRequestLevel1Table(){
        DefaultTableModel model = (DefaultTableModel) training1RequestJTable.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : trainingManagementOrganization.getWorkQueue().getWorkRequestList()){
            TrainingWorkRequest trainingReq = (TrainingWorkRequest) request;
           // if(trainingReq.isLevel1Complete() == false){
           if(trainingReq.getRegisteredFor().equalsIgnoreCase("Level1")){
            Object[] row = new Object[2];
            row[0] = trainingReq;
            row[1] = trainingReq.getStatus();
          //  row[2] = ((ParentWorkRequest)request).getDescription();
           //String result = ((ManagementWorkRequest) request).getMessage();
          // String result = ((ManagementWorkRequest) request).getStatus();
            //row[3] = result == null ? "Waiting" : result;
            
           // row[3] = null;
            
            model.addRow(row);
           }
           // }
        }
        
    }
    
    public void populateRequestLevel2Table(){
        DefaultTableModel model = (DefaultTableModel) training2RequestJTable.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : trainingManagementOrganization.getWorkQueue().getWorkRequestList()){
            TrainingWorkRequest trainingReq = (TrainingWorkRequest) request;
           // if(trainingReq.isLevel1Complete() == false){
           if(trainingReq.getRegisteredFor().equalsIgnoreCase("Level2")){
            Object[] row = new Object[2];
            row[0] = trainingReq;
            row[1] = trainingReq.getStatus();
          //  row[2] = ((ParentWorkRequest)request).getDescription();
           //String result = ((ManagementWorkRequest) request).getMessage();
          // String result = ((ManagementWorkRequest) request).getStatus();
            //row[3] = result == null ? "Waiting" : result;
            
           // row[3] = null;
            
            model.addRow(row);
           }
           // }
        }
        
    }
    
    public void populateRequestLevel3Table(){
        DefaultTableModel model = (DefaultTableModel) training3RequestJTable.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : trainingManagementOrganization.getWorkQueue().getWorkRequestList()){
            TrainingWorkRequest trainingReq = (TrainingWorkRequest) request;
           // if(trainingReq.isLevel1Complete() == false){
           if(trainingReq.getRegisteredFor().equalsIgnoreCase("Level3")){
            Object[] row = new Object[2];
            row[0] = trainingReq;
            row[1] = trainingReq.getStatus();
          //  row[2] = ((ParentWorkRequest)request).getDescription();
           //String result = ((ManagementWorkRequest) request).getMessage();
          // String result = ((ManagementWorkRequest) request).getStatus();
            //row[3] = result == null ? "Waiting" : result;
            
           // row[3] = null;
            
            model.addRow(row);
           }
           // }
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
        training1RequestJTable = new javax.swing.JTable();
        btnApprove = new javax.swing.JButton();
        btnMarkComplete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        training2RequestJTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        training3RequestJTable = new javax.swing.JTable();
        btnApprove2 = new javax.swing.JButton();
        btnMarkComplete2 = new javax.swing.JButton();
        btnApprove3 = new javax.swing.JButton();
        btnMarkComplete3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Work Area - Parent Role");

        training1RequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sender(Parent)", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(training1RequestJTable);

        btnApprove.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnApprove.setText(" Approve Training Request");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });

        btnMarkComplete.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnMarkComplete.setText("Mark Complete");
        btnMarkComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarkCompleteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("Parent Level 1 Training Status:");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setText("Parent Level 2 Training Status:");

        training2RequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sender(Parent)", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(training2RequestJTable);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel4.setText("Parent Level 3 Training Status:");

        training3RequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sender(Parent)", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(training3RequestJTable);

        btnApprove2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnApprove2.setText(" Approve Training Request");
        btnApprove2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApprove2ActionPerformed(evt);
            }
        });

        btnMarkComplete2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnMarkComplete2.setText("Mark Complete");
        btnMarkComplete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarkComplete2ActionPerformed(evt);
            }
        });

        btnApprove3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnApprove3.setText(" Approve Training Request");
        btnApprove3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApprove3ActionPerformed(evt);
            }
        });

        btnMarkComplete3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnMarkComplete3.setText("Mark Complete");
        btnMarkComplete3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarkComplete3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnApprove)
                            .addComponent(btnMarkComplete)
                            .addComponent(btnApprove2)
                            .addComponent(btnMarkComplete2)
                            .addComponent(btnApprove3)
                            .addComponent(btnMarkComplete3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jLabel1)))
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)
                        .addGap(71, 71, 71)
                        .addComponent(btnApprove)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMarkComplete)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnApprove2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMarkComplete2)))
                .addGap(34, 34, 34)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnApprove3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMarkComplete3)))
                .addGap(47, 47, 47))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:
        int selectedRow = training1RequestJTable.getSelectedRow();
        
        
        if (selectedRow < 0){
            return;
        }
        
        TrainingWorkRequest training1Req = (TrainingWorkRequest)training1RequestJTable.getValueAt(selectedRow, 0);
        training1Req.setStatus("Registration Approved");
        training1Req.getParentReq().setStatus("Registration Approved");
        
        
        
    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnMarkCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarkCompleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = training1RequestJTable.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        TrainingWorkRequest trainingReq = (TrainingWorkRequest)training1RequestJTable.getValueAt(selectedRow, 0);
       // trainingReq.setStatus(TrainingWorkRequest.LEVEL1_STATUS);
       /* if(trainingReq.getStatus().equals(TrainingWorkRequest.LEVEL1_STATUS)){
            trainingReq.setStatus(TrainingWorkRequest.LEVEL2_STATUS);
            trainingReq.setLevel2Complete(true);
            trainingReq.getParentReq().setTraining_level(TrainingWorkRequest.LEVEL2_STATUS);
            trainingReq.getParentReq().setStatus("Register For Level3");
            
        }else if(trainingReq.getStatus().equals(TrainingWorkRequest.LEVEL2_STATUS)){
            trainingReq.setLevel3Complete(true);
            trainingReq.setStatus(TrainingWorkRequest.LEVEL3_STATUS);
            trainingReq.getParentReq().setTraining_level(TrainingWorkRequest.LEVEL3_STATUS);
            trainingReq.getParentReq().setStatus("Training Completed");
        }else {*/
          trainingReq.setStatus(TrainingWorkRequest.LEVEL1_STATUS);  
          //trainingReq.setLevel1Complete(true);
          trainingReq.getParentReq().setTraining_level(TrainingWorkRequest.LEVEL1_STATUS);
          trainingReq.getParentReq().setStatus("Register For Level2");
       // }
        
        populateRequestLevel1Table();
        //populateRequestLevel2Table();
       // populateRequestLevel3Table();
    }//GEN-LAST:event_btnMarkCompleteActionPerformed

    private void btnApprove2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApprove2ActionPerformed
        // TODO add your handling code here:
        int selectedRow = training2RequestJTable.getSelectedRow();
        
        
        if (selectedRow < 0){
            return;
        }
        
        TrainingWorkRequest training1Req = (TrainingWorkRequest)training2RequestJTable.getValueAt(selectedRow, 0);
        training1Req.setStatus("Registration Approved");
        training1Req.getParentReq().setStatus("Registration Approved");
        populateRequestLevel2Table();
        
    }//GEN-LAST:event_btnApprove2ActionPerformed

    private void btnMarkComplete2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarkComplete2ActionPerformed
        // TODO add your handling code here:
        int selectedRow = training2RequestJTable.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        TrainingWorkRequest trainingReq = (TrainingWorkRequest)training2RequestJTable.getValueAt(selectedRow, 0);
        trainingReq.setStatus(TrainingWorkRequest.LEVEL2_STATUS);
            //trainingReq.setLevel2Complete(true);
            trainingReq.getParentReq().setTraining_level(TrainingWorkRequest.LEVEL2_STATUS);
            trainingReq.getParentReq().setStatus("Register For Level3");
            populateRequestLevel2Table();
    }//GEN-LAST:event_btnMarkComplete2ActionPerformed

    private void btnApprove3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApprove3ActionPerformed
        // TODO add your handling code here:
        int selectedRow = training3RequestJTable.getSelectedRow();
        
        
        if (selectedRow < 0){
            return;
        }
        
        TrainingWorkRequest training1Req = (TrainingWorkRequest)training3RequestJTable.getValueAt(selectedRow, 0);
        training1Req.setStatus("Registration Approved");
        training1Req.getParentReq().setStatus("Registration Approved");
        populateRequestLevel3Table();
    }//GEN-LAST:event_btnApprove3ActionPerformed

    private void btnMarkComplete3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarkComplete3ActionPerformed
        // TODO add your handling code here:
        int selectedRow = training3RequestJTable.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        TrainingWorkRequest trainingReq = (TrainingWorkRequest)training3RequestJTable.getValueAt(selectedRow, 0);
        trainingReq.setStatus(TrainingWorkRequest.LEVEL3_STATUS);
            //trainingReq.setLevel2Complete(true);
            trainingReq.getParentReq().setTraining_level(TrainingWorkRequest.LEVEL3_STATUS);
            trainingReq.getParentReq().setStatus("Training Completed");
            populateRequestLevel3Table();
            changeStatusOncompletion(trainingReq);
    }//GEN-LAST:event_btnMarkComplete3ActionPerformed
    
    public void changeStatusOncompletion(WorkRequest request){
        
        for(Network n: business.getNetworkList()){
              for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
                  
                  if(e instanceof AdoptionEnterprise){
                      
                      for(Organization o: e.getOrganizationDirectory().getOrganizationList()){
                          
                          if(o instanceof ManagementOrganization){
                              
                              for(WorkRequest w:o.getWorkQueue().getWorkRequestList()){
                                  if(request.getParent().equals(w.getParent()))
                                      //w.setStatus("Financial check complete");
                                      w.setMessage(ManagementWorkRequest.TRAINING);
                                      //w.setMessage("Educational check intiated");
                              }
                          }
                      }
                  }
              }
              
          }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnApprove2;
    private javax.swing.JButton btnApprove3;
    private javax.swing.JButton btnMarkComplete;
    private javax.swing.JButton btnMarkComplete2;
    private javax.swing.JButton btnMarkComplete3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable training1RequestJTable;
    private javax.swing.JTable training2RequestJTable;
    private javax.swing.JTable training3RequestJTable;
    // End of variables declaration//GEN-END:variables
}
