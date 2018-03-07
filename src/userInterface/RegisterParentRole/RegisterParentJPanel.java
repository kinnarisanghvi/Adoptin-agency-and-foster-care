/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.RegisterParentRole;

import Business.EcoSystem;
import Business.Enterprise.AdoptionEnterprise;
import Business.Organization.RegisterParentOrganization;
import Business.ProspectiveParent.ProspectiveParent;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author kinnari
 */
public class RegisterParentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ParentEducationJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private RegisterParentOrganization organization;
    private AdoptionEnterprise enterprise;
    private EcoSystem business;
    
    public RegisterParentJPanel(JPanel userProcessContainer, UserAccount account, RegisterParentOrganization organization, AdoptionEnterprise enterprise, EcoSystem busines) {
        
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.enterprise = enterprise;
        this.organization = organization;
        this.business = busines;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        radioBtnYesMother = new javax.swing.JRadioButton();
        radioBtnNoFather = new javax.swing.JRadioButton();
        radioBtnYesFather = new javax.swing.JRadioButton();
        radioBtnNoMother = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        txtFieldMotherQualifications = new javax.swing.JTextField();
        txtFieldFatherQualifications = new javax.swing.JTextField();
        txtFieldAccomplishments = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtFieldFatherOccupation = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtFieldMotherOccupation = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtFieldCrime = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtParent1 = new javax.swing.JTextField();
        txtParent2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtParent1Age = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtParent2Age = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        radioBtnCarrierYes = new javax.swing.JRadioButton();
        radioBtnCarrierNo = new javax.swing.JRadioButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        radioBtnillnessYes = new javax.swing.JRadioButton();
        radioBtnillnessNo = new javax.swing.JRadioButton();
        radioBtncriminalYes = new javax.swing.JRadioButton();
        radioBtncriminalNo = new javax.swing.JRadioButton();
        radioBtnDiseaseYes = new javax.swing.JRadioButton();
        radioBtnDiseaseNo = new javax.swing.JRadioButton();
        txtFieldTotalIncome1 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 204, 204));
        setPreferredSize(new java.awt.Dimension(1200, 1700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" Education Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 547, 32));

        jLabel2.setText("Mother qualifications :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, 170, 35));

        jLabel3.setText("Father qualifications :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 540, 171, 34));

        jLabel4.setText("Any accomplishments :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 600, 171, 36));

        jLabel5.setText("Has the Father graduated? ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 194, 30));

        radioBtnYesMother.setText("Yes");
        add(radioBtnYesMother, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 440, -1, -1));

        radioBtnNoFather.setText("No");
        add(radioBtnNoFather, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 380, -1, -1));

        radioBtnYesFather.setText("Yes");
        add(radioBtnYesFather, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, -1, -1));

        radioBtnNoMother.setText("No");
        add(radioBtnNoMother, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 440, -1, -1));

        jLabel6.setText("Has the Mother graduated? ");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, 165, 30));
        add(txtFieldMotherQualifications, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 490, 259, 35));
        add(txtFieldFatherQualifications, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 540, 259, 35));
        add(txtFieldAccomplishments, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 590, 259, 40));

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 1530, -1, -1));

        jLabel7.setText("Father occupation :");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 710, 201, 34));
        add(txtFieldFatherOccupation, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 710, 200, 34));

        jLabel8.setText("Mother occupation :");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 760, 201, 28));
        add(txtFieldMotherOccupation, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 760, 200, 36));

        jLabel9.setText("If any one of the parent has been found guilty, please click yes. If you answered yes, please explain :");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 1230, 440, 29));
        add(txtFieldCrime, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 1280, 820, 35));

        btnSubmit.setText("Submit >>");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 1530, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText(" Information for Criminal Check ");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 860, 640, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Personal Details");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 497, -1));

        jLabel12.setText("Prospective Parent1:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 135, 34));

        jLabel13.setText("Prospectve Parent2 :");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 135, 39));

        txtParent1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtParent1ActionPerformed(evt);
            }
        });
        add(txtParent1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 193, 34));

        txtParent2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtParent2ActionPerformed(evt);
            }
        });
        add(txtParent2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 193, 34));

        jLabel14.setText("Parent1 age :");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 135, 26));

        txtParent1Age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtParent1AgeActionPerformed(evt);
            }
        });
        add(txtParent1Age, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 193, 35));

        jLabel15.setText("Parent2 age :");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 135, 33));
        add(txtParent2Age, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 193, 33));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText(" Medical Details");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 1340, 547, -1));

        jLabel17.setText("(1) Have you personally or ");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 930, 190, 20));

        jLabel18.setText("ever pled guilty to or being convicted  or found guilty of misdemeanor in any U.S. or non-U.S. or military court which involves : ");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 1020, 640, 20));

        jLabel19.setText("(2) has any entity of which you were a  principal at the time of activities ocurred");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 980, 460, 20));

        jLabel20.setText("• embezzlement, theft, extortion, fraud, fraudulent conversion, forgery, counterfeiting, false pretenses, ");
        add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 1060, 630, 20));

        jLabel21.setText(" bribery, gambling, racketeering or misappropriation of funds, securities or property;");
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 1080, 530, -1));

        jLabel22.setText("• violation of sections 7203, 7204, 7205 or 7207 of the Internal Revenue Code of 1986;or ");
        add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 1110, 590, -1));

        jLabel23.setText("• violation of sections 152. 1341, 1342, or 1343 or chapters 25. 4 7, 95 or 96 of the U.S. Criminal Code; or ");
        add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 1140, 620, -1));

        jLabel24.setText("• any transaction in or advice concerning futures, options, leverage transactions or securities? ");
        add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 1170, 540, -1));

        radioBtnCarrierYes.setText("Yes");
        add(radioBtnCarrierYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 1440, -1, -1));

        radioBtnCarrierNo.setText("No");
        add(radioBtnCarrierNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 1440, -1, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText(" Financial Details");
        add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 640, 547, 40));

        jLabel26.setText("Have you ever been told that you are a carrier of a genetic/inherited disease? ");
        add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 1440, 450, 20));

        jLabel27.setText("Have you had any major illness? ");
        add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 1410, 220, 20));

        jLabel28.setText("Have you ever been told that you have a genetic/inherited disease? ");
        add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 1480, 390, 20));

        radioBtnillnessYes.setText("Yes");
        radioBtnillnessYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnillnessYesActionPerformed(evt);
            }
        });
        add(radioBtnillnessYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 1400, -1, -1));

        radioBtnillnessNo.setText("No");
        add(radioBtnillnessNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 1400, -1, -1));

        radioBtncriminalYes.setText("Yes");
        radioBtncriminalYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtncriminalYesActionPerformed(evt);
            }
        });
        add(radioBtncriminalYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 1210, -1, -1));

        radioBtncriminalNo.setText("No");
        add(radioBtncriminalNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 1210, -1, -1));

        radioBtnDiseaseYes.setText("Yes");
        add(radioBtnDiseaseYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 1480, -1, -1));

        radioBtnDiseaseNo.setText("No");
        add(radioBtnDiseaseNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 1480, -1, -1));
        add(txtFieldTotalIncome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 820, 200, 35));

        jLabel29.setText("Total income from all the sources :");
        add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 810, -1, 29));

        jLabel30.setText("If you answered yes to any of the above questions, please submit medical reports at the nearest department ");
        add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 1510, 630, -1));

        jLabel31.setText("SSN");
        add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 90, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 80, 150, -1));

        jLabel32.setText("SSN");
        add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 140, -1, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 130, 150, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtParent1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtParent1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtParent1ActionPerformed

    private void txtParent2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtParent2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtParent2ActionPerformed

    private void txtParent1AgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtParent1AgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtParent1AgeActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
         
         String parent1 = txtParent1.getText();
         String parent2 = txtParent2.getText();
         int age1 = Integer.parseInt(txtParent1Age.getText());
         int age2 = Integer.parseInt(txtParent2Age.getText());
         String motherQualification = txtFieldMotherQualifications.getText();
         String fatherQualification = txtFieldFatherQualifications.getText();
         String accomplishments = txtFieldAccomplishments.getText();
         String fatherOccupation = txtFieldFatherOccupation.getText();
         String motherOccupation = txtFieldMotherOccupation.getText();
         Double totalIncome = Double.parseDouble(txtFieldCrime.getText());
         
         ProspectiveParent parent = enterprise.getProspectiveParentDirectory().addParent();
         parent.setParent1(parent1);
         parent.setParent2(parent2);
         parent.setParent1Age(age1);
         parent.setParent2Age(age2);
         parent.setMotherQualification(motherQualification);
         parent.setFatherQualification(fatherQualification);
         parent.setAccomplishments(accomplishments);
         parent.setFatherOccupation(fatherOccupation);
         parent.setMotherOccupation(motherOccupation);
         parent.setTotalIncome(totalIncome);
         
           if(radioBtnYesFather.isSelected())
        {
            boolean fatherGraduated = true;
            parent.setFather_graduated(fatherGraduated);
            radioBtnNoFather.setSelected(false);
        }
        else if (radioBtnNoFather.isSelected())
        {
            boolean fatherGraduated = false;
            parent.setFather_graduated(fatherGraduated);
            radioBtnYesFather.setSelected(false);
        }
        else{
               JOptionPane.showMessageDialog(null, "Please select yes or no");
               return;
        }
               
           
           if(radioBtnYesMother.isSelected())
        {
            boolean motherGraduated = true;
            parent.setMother_graduated(motherGraduated);
            radioBtnNoMother.setSelected(false);
        }
        else if (radioBtnNoMother.isSelected())
        {
            boolean motherGraduated = false;
            parent.setMother_graduated(motherGraduated);
            radioBtnYesMother.setSelected(false);
        }
        else{
               JOptionPane.showMessageDialog(null, "Please select yes or no");
               return;
        }
           
              
           if(radioBtncriminalYes.isSelected())
        {
            boolean crime1 = true;
            parent.setCrime(crime1);
            radioBtncriminalNo.setSelected(false);
            
            String crime = txtFieldCrime.getText();
            
        }
        else if (radioBtncriminalNo.isSelected())
        {
            boolean crime1 = false;
            parent.setCrime(crime1);
            radioBtncriminalYes.setSelected(false);
        }
        else{
               JOptionPane.showMessageDialog(null, "Please select yes or no");
               return;
        }
           
             if(radioBtnillnessYes.isSelected())
        {
            boolean illness = true;
            parent.setIllness(illness);
            radioBtnillnessNo.setSelected(false);
        }
        else if (radioBtnillnessNo.isSelected())
        {
            boolean illness = false;
            parent.setIllness(illness);
            radioBtnillnessYes.setSelected(false);
        }
        else{
               JOptionPane.showMessageDialog(null, "Please select yes or no");
               return;
        }
             
             
            if(radioBtnCarrierYes.isSelected())
        {
            boolean carrier = true;
            parent.setCarrierGenetic(carrier);
            radioBtnCarrierNo.setSelected(false);
        }
        else if (radioBtnCarrierNo.isSelected())
        {
            boolean illness = false;
            parent.setIllness(illness);
            radioBtnCarrierYes.setSelected(false);
        }
        else{
               JOptionPane.showMessageDialog(null, "Please select yes or no");
               return;
        }
           
                     
            if(radioBtnDiseaseYes.isSelected())
        {
            boolean genetic = true;
            parent.setGenetic(genetic);
            radioBtnDiseaseNo.setSelected(false);
        }
        else if (radioBtnDiseaseNo.isSelected())
        {
            boolean illness = false;
            parent.setIllness(illness);
            radioBtnDiseaseYes.setSelected(false);
        }
        else{
               JOptionPane.showMessageDialog(null, "Please select yes or no");
               return;
        }
              
            JOptionPane.showMessageDialog(null, "parent created");
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void radioBtnillnessYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnillnessYesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBtnillnessYesActionPerformed

    private void radioBtncriminalYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtncriminalYesActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_radioBtncriminalYesActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JRadioButton radioBtnCarrierNo;
    private javax.swing.JRadioButton radioBtnCarrierYes;
    private javax.swing.JRadioButton radioBtnDiseaseNo;
    private javax.swing.JRadioButton radioBtnDiseaseYes;
    private javax.swing.JRadioButton radioBtnNoFather;
    private javax.swing.JRadioButton radioBtnNoMother;
    private javax.swing.JRadioButton radioBtnYesFather;
    private javax.swing.JRadioButton radioBtnYesMother;
    private javax.swing.JRadioButton radioBtncriminalNo;
    private javax.swing.JRadioButton radioBtncriminalYes;
    private javax.swing.JRadioButton radioBtnillnessNo;
    private javax.swing.JRadioButton radioBtnillnessYes;
    private javax.swing.JTextField txtFieldAccomplishments;
    private javax.swing.JTextField txtFieldCrime;
    private javax.swing.JTextField txtFieldFatherOccupation;
    private javax.swing.JTextField txtFieldFatherQualifications;
    private javax.swing.JTextField txtFieldMotherOccupation;
    private javax.swing.JTextField txtFieldMotherQualifications;
    private javax.swing.JTextField txtFieldTotalIncome1;
    private javax.swing.JTextField txtParent1;
    private javax.swing.JTextField txtParent1Age;
    private javax.swing.JTextField txtParent2;
    private javax.swing.JTextField txtParent2Age;
    // End of variables declaration//GEN-END:variables
}
