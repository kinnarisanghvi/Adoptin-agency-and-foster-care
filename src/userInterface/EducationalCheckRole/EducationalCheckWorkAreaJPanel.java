/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.EducationalCheckRole;

import Business.EcoSystem;
import Business.Enterprise.AdoptionEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HomeStudyEnterprise;
import Business.Network.Network;
import Business.Organization.EducationalCheckOrganization;
import Business.Organization.ManagementOrganization;
import Business.Organization.MedicalCheckOrganization;
import Business.Organization.Organization;
import Business.ProspectiveParent.ProspectiveParent;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.EducationalCheckWorkRequest;
import Business.WorkQueue.MedicalCheckWorkRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import static userInterface.RegisterParentRole.RegisterParent1JPanel.sendEmail;

/**
 *
 * @author kinnari
 */
public class EducationalCheckWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EducationalCheckWorkAreaJPanel
     */
    
    private JPanel userProcessContainer;
    private UserAccount account;
    private EducationalCheckOrganization organization;
    private HomeStudyEnterprise enterprise;
    private EcoSystem business;
    
    public EducationalCheckWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EducationalCheckOrganization educationalCheckOrganization, HomeStudyEnterprise homeStudyEnterprise, EcoSystem business) {
      
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.enterprise = homeStudyEnterprise;
        this.organization = educationalCheckOrganization;
        this.business = business;
        
        populateRequestTable();
        populateRequestAssignedToMeJTable();
        
    }
public void refreshData(){
        
        for(Organization o:enterprise.getOrganizationDirectory().getOrganizationList()){
            if(o.getWorkQueue().getWorkRequestList() != null){
            for(WorkRequest w:o.getWorkQueue().getWorkRequestList()){
                if(w.getReceiver() != null && account.getWorkQueue().getWorkRequestList() != null){
                for(WorkRequest Req:account.getWorkQueue().getWorkRequestList()){
              
                if(w.getParent().equals(Req.getParent())){
                String status = Req.getStatus();
                w.setStatus(status);
                        }
                     }
                }
                
            }
        }
        }
    }
       public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
            if(request.getReceiver() == null){
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getSender().getEmployee().getName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[3] = request.getStatus();

            model.addRow(row);
            }
        }

     }
       public void populateRequestAssignedToMeJTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestAssignedToMeJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
            if(request.getReceiver() != null){   //request.isProcessedFlag() == false && 
            Object[] row = new Object[5];
            row[0] = request;
            row[1] = request.getSender().getEmployee().getName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[3] = request.getStatus();
            row[4] = request.isProcessedFlag();
           
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

        assignJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        workRequestAssignedToMeJTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));

        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Parent", "Sender", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        workRequestAssignedToMeJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Parent", "Sender", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(workRequestAssignedToMeJTable);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Educational Check Work Area JPanel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(452, 452, 452)
                .addComponent(refreshJButton)
                .addGap(439, 439, 439))
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(processJButton)
                            .addComponent(assignJButton))))
                .addGap(231, 231, 231))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(refreshJButton)
                        .addGap(32, 32, 32)
                        .addComponent(assignJButton)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(processJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(389, 389, 389))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed


        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        request.setReceiver(account);
        request.setStatus(EducationalCheckWorkRequest.INPROGRESS);
        request.setProcessedFlag(false);
        populateRequestTable();
        populateRequestAssignedToMeJTable();
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = workRequestAssignedToMeJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a request message to process.");
        }
        else{

            EducationalCheckWorkRequest request = (EducationalCheckWorkRequest)workRequestAssignedToMeJTable.getValueAt(selectedRow, 0);
            
            ProspectiveParent p1 = request.getParent();
              String email = request.getParent().getEmailId();          
            if(p1.isFather_graduated()==false && p1.isMother_graduated()==false){
                request.setStatus("Parent is not eligible for adoption");
                JOptionPane.showMessageDialog(null,"Parent is not eligible for adoption ");
                sendEmail("parent2202@gmail.com", "Parent@2202", email, "Status Update || Education Check Request Rejected", "Dear " + request.getParent().toString() + "," + "Sorry, Your Application has been rejected by Education Check Organization and you are not eligible for adoption.");
                return;
            }
            
           

            MedicalCheckWorkRequest req = new MedicalCheckWorkRequest();
     
            
            req.setSender(account);
            req.setParent(request.getParent());
            req.setStatus("Initiate Medical check");
            request.setProcessedFlag(true);
            req.setProcessedFlag(true);
            request.setStatus(EducationalCheckWorkRequest.FINALSTATUS);
            changeStatusOncompletion(request);
            Organization org = null;
            for (Organization organiz : enterprise.getOrganizationDirectory().getOrganizationList()){
                if (organiz instanceof MedicalCheckOrganization){
                    org = organiz;
                    break;
                }

            }
            if (org!=null){

                org.getWorkQueue().getWorkRequestList().add(req);
                account.getWorkQueue().getWorkRequestList().add(req);
                JOptionPane.showMessageDialog(null, "Request message sent to Medical check Organization");
                sendEmail("parent2202@gmail.com", "Parent@2202", email, "Status Update || Education Check Request Approved", "Dear " + request.getParent().toString() + "," + "Congrats, Your Application has been Approved by Education Check Organization and now, it is with medical check organization.");
                populateRequestTable();
            }

        }
       
        populateRequestAssignedToMeJTable();
     
    }//GEN-LAST:event_processJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateRequestTable();
        populateRequestAssignedToMeJTable();
        
    }//GEN-LAST:event_refreshJButtonActionPerformed
public void changeStatusOncompletion(WorkRequest request){
        
        for(Network n: business.getNetworkList()){
              for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
                  
                  if(e instanceof AdoptionEnterprise){
                      
                      for(Organization o: e.getOrganizationDirectory().getOrganizationList()){
                          
                          if(o instanceof ManagementOrganization){
                              
                              for(WorkRequest w:o.getWorkQueue().getWorkRequestList()){
                                  if(request.getParent().equals(w.getParent()))
                                      w.setStatus(EducationalCheckWorkRequest.FINALSTATUS);
                                     
                              }
                          }
                      }
                  }
              }
              
          }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable workRequestAssignedToMeJTable;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
