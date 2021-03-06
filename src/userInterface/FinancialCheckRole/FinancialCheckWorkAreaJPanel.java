/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.FinancialCheckRole;

import Business.EcoSystem;
import Business.Enterprise.AdoptionEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HomeStudyEnterprise;
import Business.Network.Network;
import Business.Organization.EducationalCheckOrganization;
import Business.Organization.FinancialCheckOrganization;
import Business.Organization.ManagementOrganization;
import Business.Organization.Organization;
import Business.Organization.ParentOrganization;
import Business.ProspectiveParent.ProspectiveParent;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.EducationalCheckWorkRequest;
import Business.WorkQueue.FinancialCheckWorkRequest;
import Business.WorkQueue.ParentWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import static userInterface.RegisterParentRole.RegisterParent1JPanel.sendEmail;

/**
 *
 * @author kinnari
 */
public class FinancialCheckWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FinancialCheckWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private FinancialCheckOrganization organization;
    private HomeStudyEnterprise enterprise;
    private EcoSystem business;
  
    public FinancialCheckWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, FinancialCheckOrganization financialCheckOrganization, HomeStudyEnterprise homeStudyEnterprise, EcoSystem business) {
       
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.enterprise = homeStudyEnterprise;
        this.organization = financialCheckOrganization;
        this.business = business;
        //refreshData();
        populateRequestTable();
        populateRequestAssignedToMeJTable();
        
    
    }
    
       public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
            if(request.getReceiver()== null){
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
        DefaultTableModel model = (DefaultTableModel) workRequestAssignedToMeTable2.getModel();

        model.setRowCount(0);

        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
            FinancialCheckWorkRequest frequest = ((FinancialCheckWorkRequest)request);
            if( request.getReceiver() != null){   //request.isProcessedFlag() == false &&
            Object[] row = new Object[6];
            row[0] = frequest;
            row[1] = frequest.getSender().getEmployee().getName();
            row[2] = frequest.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[3] = frequest.getStatus();
            row[4] = frequest.getDocUploadStatus();
            
           // String result = ((FinancialCheckWorkRequest) request).getStatus();
           //row[3] = result == null ? "Waiting" : result;
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

        processJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        assignJButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        workRequestAssignedToMeTable2 = new javax.swing.JTable();
        btnReqToApplicant = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnVerifyDocs = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));

        processJButton.setText("Mark this stage as complete");
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
                "Applicant", "Sender", "Receiver", "Status"
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

        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        workRequestAssignedToMeTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Applicant", "Sender", "Receiver", "Status", "Document Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(workRequestAssignedToMeTable2);

        btnReqToApplicant.setText("Request to Applicant");
        btnReqToApplicant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReqToApplicantActionPerformed(evt);
            }
        });

        jLabel1.setText("Click here to request financial documents from applicant>>");

        jLabel2.setText("Requests for Financial check:");

        jLabel3.setText("Requests assigned to me :");

        btnVerifyDocs.setText("Verify Documents");
        btnVerifyDocs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerifyDocsActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Financial Check Work Area JPanel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(82, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(assignJButton)
                                    .addComponent(refreshJButton)))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnReqToApplicant)
                                    .addComponent(processJButton)
                                    .addComponent(btnVerifyDocs))))))
                .addGap(94, 94, 94))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel4)
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(refreshJButton)
                        .addGap(26, 26, 26)
                        .addComponent(assignJButton)))
                .addGap(58, 58, 58)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReqToApplicant)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVerifyDocs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(processJButton)
                .addGap(91, 91, 91))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = workRequestAssignedToMeTable2.getSelectedRow();

        if (selectedRow < 0){

            JOptionPane.showMessageDialog(null, "Please select a request message to process.");
            
        }
        else{

            FinancialCheckWorkRequest request = (FinancialCheckWorkRequest)workRequestAssignedToMeTable2.getValueAt(selectedRow, 0);
                         
            ProspectiveParent p1 = request.getParent();
            
            if(p1.getTotalIncome()<2000000 || request.getDocUploadStatus().equals(FinancialCheckWorkRequest.DOCSTATUS_FAILED)){
                request.setStatus("Parent is not eligible for adoption"); 
                JOptionPane.showMessageDialog(null,"Parent is not eligible for adoption ");
                sendEmail("parent2202@gmail.com", "Parent@2202", request.getParent().getEmailId().toString(), "Status Update || Financial Check Request Rejected", "Dear " + request.getParent().toString() + "," + "Sorry, Your Application has been rejected by Financial Check Organization and you are not eligible for adoption.");
                return;
            }
                
            //request.setStatus(" Educational Check Processing");
            if(request.getDocUploadStatus().equals(FinancialCheckWorkRequest.DOCSTATUS_VERIFIED)){
                EducationalCheckWorkRequest req = new EducationalCheckWorkRequest();

                request.setStatus(FinancialCheckWorkRequest.FINALSTATUS);
                //request.setSender(account);
               // request.setParent(request.getParent());
                req.setSender(account);
                req.setParent(request.getParent());
                req.setStatus(EducationalCheckWorkRequest.INITIATE);
                String email =req.getParent().getEmailId();
                //req.setProcessedFlag(true);
           // request.setProcessedFlag(true);
                changeStatusOncompletion(request);
                Organization org = null;
                for (Organization organiz : enterprise.getOrganizationDirectory().getOrganizationList()){
                    if (organiz instanceof EducationalCheckOrganization){
                        org = organiz;
                        break;
                    }

                }
                if (org!=null){

                    org.getWorkQueue().getWorkRequestList().add(req);
                    account.getWorkQueue().getWorkRequestList().add(req);
                    JOptionPane.showMessageDialog(null, "Request sent to Educational check Organization");
                    sendEmail("parent2202@gmail.com", "Parent@2202", email, "Status Update || Financial Check Request Approved", "Dear " + request.getParent().toString() + "," + "Congrats, Your Application has been Approved by Financial Check Organization and now, it is with Education Check Organization");
                    populateRequestTable();
                }
            }

        }

populateRequestAssignedToMeJTable();
     
    }//GEN-LAST:event_processJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateRequestTable();
        
        populateRequestAssignedToMeJTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

       

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        FinancialCheckWorkRequest request = (FinancialCheckWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        request.setReceiver(account);
        request.setStatus(FinancialCheckWorkRequest.INPROGRESS);
       // request.setProcessedFlag(false);
        populateRequestTable();
        populateRequestAssignedToMeJTable();
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void btnReqToApplicantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReqToApplicantActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = workRequestAssignedToMeTable2.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        FinancialCheckWorkRequest fReq = (FinancialCheckWorkRequest)workRequestAssignedToMeTable2.getValueAt(selectedRow, 0);
        
        ParentWorkRequest parentReq = new ParentWorkRequest();
        parentReq.setSender(account);
        parentReq.setStatus(ParentWorkRequest.FINANCIALDOCS_REQUEST);
        parentReq.setDescription("Please upload financial documents");
        parentReq.setParent(fReq.getParent());
        parentReq.setfWorkRequest(fReq);
        fReq.setDocUploadStatus(FinancialCheckWorkRequest.DOCSTATUS_WAITING);
        
        Organization orgParent = null;
        for (Network network : business.getNetworkList()) {
         for (Enterprise enterprise1 : network.getEnterpriseDirectory().getEnterpriseList())
         if(enterprise1 instanceof AdoptionEnterprise)
         {
            for (Organization organization1 : enterprise1.getOrganizationDirectory().getOrganizationList())             
            {
            if (organization1 instanceof ParentOrganization){
                orgParent = organization1;
                //ent=enterprise1;
                break;
               }
            }
         }
    }
        if (orgParent!=null){
            //orgParent.getWorkQueue().getWorkRequestList().add(request);
           // account.getWorkQueue().getWorkRequestList().add(request);
            for(UserAccount acc: orgParent.getUserAccountDirectory().getUserAccountList()){
                
                if(acc.getEmployee().toString().equals(fReq.getParent().toString())){
                    acc.getWorkQueue().getWorkRequestList().add(parentReq);
                    JOptionPane.showMessageDialog(null, "Financial Documents requested from applicant");
                }
            }
        }
       populateRequestAssignedToMeJTable();
    }//GEN-LAST:event_btnReqToApplicantActionPerformed

    private void btnVerifyDocsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerifyDocsActionPerformed
       
        
        int selectedRow = workRequestAssignedToMeTable2.getSelectedRow();

        if (selectedRow < 0){

            JOptionPane.showMessageDialog(null, "Please select a request message to process.");
            
        }
        else{

            FinancialCheckWorkRequest request = (FinancialCheckWorkRequest)workRequestAssignedToMeTable2.getValueAt(selectedRow, 0);
            if(request.getDocUploadStatus().equals(FinancialCheckWorkRequest.DOCSTATUS_UPLOADED)){
                
                VerifyDocumentsJPanel verifyDocumentsJPanel = new VerifyDocumentsJPanel( userProcessContainer, request );
                userProcessContainer.add("verifyDocumentsJPanel", verifyDocumentsJPanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
            else{
                
                JOptionPane.showMessageDialog(null, "Documents not yet recieved from the applicant");
            }
        }
        populateRequestAssignedToMeJTable();
    }//GEN-LAST:event_btnVerifyDocsActionPerformed
public void refreshData(){
        
        for(Organization o:enterprise.getOrganizationDirectory().getOrganizationList()){
            if(o.getWorkQueue().getWorkRequestList() != null){
            for(WorkRequest w:o.getWorkQueue().getWorkRequestList()){
                if(w.getReceiver() != null && account.getWorkQueue().getWorkRequestList() != null){
                for(WorkRequest Req:account.getWorkQueue().getWorkRequestList()){
                //w.setStatus(c);
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
public void changeStatusOncompletion(WorkRequest request){
        
        for(Network n: business.getNetworkList()){
              for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
                  
                  if(e instanceof AdoptionEnterprise){
                      
                      for(Organization o: e.getOrganizationDirectory().getOrganizationList()){
                          
                          if(o instanceof ManagementOrganization){
                              
                              for(WorkRequest w:o.getWorkQueue().getWorkRequestList()){
                                  if(request.getParent().equals(w.getParent()))
                                      //w.setStatus("Financial check complete");
                                      w.setStatus(FinancialCheckWorkRequest.FINALSTATUS);
                                     // w.setMessage("Educational check intiated");
                              }
                          }
                      }
                  }
              }
              
          }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton btnReqToApplicant;
    private javax.swing.JButton btnVerifyDocs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable workRequestAssignedToMeTable2;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
