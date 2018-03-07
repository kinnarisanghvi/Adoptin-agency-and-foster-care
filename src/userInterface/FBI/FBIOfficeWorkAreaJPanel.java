/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.FBI;

import Business.CriminalRecord.CriminalRecord;
import Business.EcoSystem;
import Business.Enterprise.FBIEnterprise;
import Business.Organization.FBIOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CriminalCheckWorkRequest;
import Business.WorkQueue.FBIWorkRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sneha
 */
public class FBIOfficeWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FBIOfficeWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private FBIOrganization fbiOrganization;
    private FBIEnterprise fbiEnterprise;
    private EcoSystem business;
    public FBIOfficeWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, FBIOrganization fbiOrganization, FBIEnterprise fbiEnterprise, EcoSystem business) {
        initComponents();
        this.account = account;
        this.userProcessContainer = userProcessContainer;
        this.fbiOrganization = fbiOrganization;
        this.fbiEnterprise = fbiEnterprise;
        this.business = business;
        populateRequestTable();
    }

    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable1.getModel();

        model.setRowCount(0);

        for (WorkRequest request : fbiOrganization.getWorkQueue().getWorkRequestList()) {
            if(request.getReceiver() == null){
            Object[] row = new Object[6];
            row[0] = request;
            row[1] = request.getParent().getParent1();
            row[2] = request.getParent().getParent1SSN();
            row[3] = request.getParent().getParent2();;
            row[4] = request.getParent().getParent2SSN();
        
           row[5] = request.getStatus();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        crimeSearchJTable = new javax.swing.JTable();
        btnCheckCriminalRecord = new javax.swing.JButton();
        btnAddCriminalRecord = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtSSN = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        workRequestJTable1 = new javax.swing.JTable();
        btnApprove = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnReject = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));

        crimeSearchJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SSN", "Desciption"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        crimeSearchJTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(crimeSearchJTable);

        btnCheckCriminalRecord.setText("Check Criminal Record");
        btnCheckCriminalRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckCriminalRecordActionPerformed(evt);
            }
        });

        btnAddCriminalRecord.setText("Add Criminal Record");
        btnAddCriminalRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCriminalRecordActionPerformed(evt);
            }
        });

        jLabel1.setText("Enter SSN Number:");

        workRequestJTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sender", "Applicant1 Name", "SSN", "Applicant 2 Name", "SSN-App 2", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        workRequestJTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(workRequestJTable1);

        btnApprove.setText("Send Approval");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("FBI Work Area JPanel");

        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnApprove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnReject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAddCriminalRecord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCheckCriminalRecord))))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCheckCriminalRecord)
                            .addComponent(jLabel1)
                            .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnAddCriminalRecord)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(btnApprove)
                        .addGap(18, 18, 18)
                        .addComponent(btnReject)))
                .addGap(46, 46, 46))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddCriminalRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCriminalRecordActionPerformed
        // TODO add your handling code here:
        
        AddCriminalRecordJPanel panel = new AddCriminalRecordJPanel(userProcessContainer,account,business,fbiEnterprise);
        JOptionPane jop = new JOptionPane();
        JDialog dialog = jop.createDialog("Add Crime Record");
        dialog.setSize(400, 450);
        dialog.setContentPane(panel);
        dialog.setVisible(true);
    }//GEN-LAST:event_btnAddCriminalRecordActionPerformed

    private void btnCheckCriminalRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckCriminalRecordActionPerformed
        // TODO add your handling code here:
        String ssn = txtSSN.getText();
        for(CriminalRecord c: fbiEnterprise.getCrimeRecordDir().getCriminalRecordList()){
            DefaultTableModel model = (DefaultTableModel) crimeSearchJTable.getModel();

        model.setRowCount(0);
            if(c.getSSN().equalsIgnoreCase(ssn)){
                
              //  JOptionPane.showMessageDialog(null, "Crime Record Present");
        

            for (CriminalRecord record : fbiEnterprise.getCrimeRecordDir().getCriminalRecordList()) {
            
                Object[] row = new Object[2];
                row[0] = record;
                row[1] = record.getCrimeDescription();

                model.addRow(row);
            }
        
            }else{
                model.setRowCount(0);
            }
        }
    }//GEN-LAST:event_btnCheckCriminalRecordActionPerformed

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable1.getSelectedRow();

        if (selectedRow < 0){
            return;
        }
        FBIWorkRequest request_FBI = (FBIWorkRequest)workRequestJTable1.getValueAt(selectedRow, 0);
        
        request_FBI.setStatus("Approved");
        request_FBI.getCriminalWorkRequest().setFBIStatus(CriminalCheckWorkRequest.FBIAPPROVED);
        JOptionPane.showMessageDialog(null, "FBI Check Complete");
        populateRequestTable();
        
    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable1.getSelectedRow();

        if (selectedRow < 0){
            return;
        }
        FBIWorkRequest request_FBI = (FBIWorkRequest)workRequestJTable1.getValueAt(selectedRow, 0);
        
        request_FBI.setStatus("Rejected");
        request_FBI.getCriminalWorkRequest().setFBIStatus(CriminalCheckWorkRequest.FBIREJECTED);
       // JOptionPane.showMessageDialog(null, "FBI Check Complete");
        populateRequestTable();
    }//GEN-LAST:event_btnRejectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCriminalRecord;
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnCheckCriminalRecord;
    private javax.swing.JButton btnReject;
    private javax.swing.JTable crimeSearchJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTable workRequestJTable1;
    // End of variables declaration//GEN-END:variables
}