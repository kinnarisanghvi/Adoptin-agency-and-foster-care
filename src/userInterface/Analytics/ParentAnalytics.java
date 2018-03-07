/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.Analytics;

import Business.Enterprise.AdoptionEnterprise;
import Business.Organization.Organization;
import static Business.Organization.Organization.Type.Parent;
import Business.ProspectiveParent.ProspectiveParent;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JPanel;

/**
 *
 * @author CHITRA PARYANI
 */
public class ParentAnalytics extends javax.swing.JPanel {

    /**
     * Creates new form ParentAnalytics
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private AdoptionEnterprise enterprise;
    private Map<String, Integer> hm;
    private Map<String, Integer> hm1;
    private Map<String, Integer> hm2;

    public ParentAnalytics(JPanel userProcessContainer, AdoptionEnterprise enterprise, UserAccount account) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.enterprise = enterprise;
        hm = new HashMap<>();
        hm1 = new HashMap<>();
        hm2 = new HashMap<>();
        ParentAgeAnalytics();
        ParentAdoptionStatus();
        ParentWishesChildAge();
    }

    public void ParentWishesChildAge() {
        int countAge0 = 0; //Child is new born
        int countAge1to5 = 0; //Child age is between 1 to 5
        int countAge6to10 = 0; //Child age is between 6 to 10
        int countAge10 = 0; // Child age greater than 10

        for (ProspectiveParent p2 : enterprise.getProspectiveParentDirectory().getParentList()) {

            String name = p2.getParent1();
            if(p2.getChild() != null){
            int age = p2.getChild().getAge();

            if (age == 0) {
                hm.put(name, age);
                countAge0++;
            }

            if (age >= 1 && age <= 5) {
                hm.put(name, age);
                countAge1to5++;
            }

            if (age >= 6 && age <= 10) {
                hm.put(name, age);
                countAge6to10++;
            }

            if (age > 10) {
                hm.put(name, age);
                countAge10++;
            }

            txtAge0.setText(String.valueOf(age));
            txtAge1to5.setText(String.valueOf(age));
            txtAge6to10.setText(String.valueOf(age));
            txtAge10.setText(String.valueOf(age));
        }

        }
    }

    public void ParentAgeAnalytics() {
        int countrange1 = 0;
        /* parents between 20 to 25 */
        int countrange2 = 0;
        /* parents age range between 26 to 30 */
        int countrange3 = 0;
        /* parents age range between 31 to 35 */
        int countrange4 = 0;
        /* parents age range between 36 to 40 */
        int countrange5 = 0;
        /* parents age range between 41 to 45 */
        int countrange6 = 0;
        /* parents age range between 46 to 50 */

        for (ProspectiveParent p : enterprise.getProspectiveParentDirectory().getParentList()) {

            String name = p.getParent1();
            int age = p.getParent1Age();

            if (age >= 20 && age <= 25) {
                hm.put(name, age);
                countrange1++;
            }

            if (age >= 26 && age <= 30) {
                hm.put(name, age);
                countrange2++;
            }

            if (age >= 31 && age <= 35) {
                hm.put(name, age);
                countrange3++;
            }

            if (age >= 36 && age <= 40) {
                hm.put(name, age);
                countrange4++;
            }

            if (age >= 41 && age <= 45) {
                hm.put(name, age);
                countrange5++;
            }

            if (age >= 45 && age <= 50) {
                hm.put(name, age);
                countrange6++;
            }

        }
        txtRange1.setText(String.valueOf(countrange1));
        txtRange2.setText(String.valueOf(countrange2));
        txtRange3.setText(String.valueOf(countrange3));
        txtRange4.setText(String.valueOf(countrange4));
        txtRange5.setText(String.valueOf(countrange5));
        txtRange6.setText(String.valueOf(countrange6));
    }

    public void ParentAdoptionStatus() {

        int countAdopted = 0;
        int countAwaiting = 0;

        for (ProspectiveParent p1 : enterprise.getProspectiveParentDirectory().getParentList()) {

            //Adopted
            String name = p1.getAdoptionStatus();
            if (p1.getAdoptionStatus().equals("Child Assigned")) {
                hm.put(name,1);
                countAdopted++;
            }

            //waiting
            if (p1.getAdoptionStatus().equals("Waiting")) {
                hm.put(name,1);
                countAwaiting++;
            }

            txtAdopted.setText(String.valueOf(countAdopted));
            txtAwaiting.setText(String.valueOf(countAwaiting));
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtRange1 = new javax.swing.JTextField();
        txtRange2 = new javax.swing.JTextField();
        txtRange3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtRange4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtRange5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtRange6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtAdopted = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtAwaiting = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtAge0 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtAge1to5 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtAge6to10 = new javax.swing.JTextField();
        txtAge10 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setText("Analytics");

        jLabel2.setText("Parent Age Range between 20 to 25 ?");

        jLabel3.setText("Parent Age Range between 26 to 30 ?");

        jLabel4.setText("Parent Age Range between 31 to 35 ?");

        jLabel5.setText("Parent Age Range between 46 to 50 ?");

        jLabel6.setText("Parent Age Range between 36 to 40 ?");

        jLabel7.setText("Parent Age Range between 41 to 45 ?");

        jLabel8.setText("Total Number of Parents who are in waiting list  ");

        jLabel9.setText("Total Number of Parents who has adopted child ");

        jLabel10.setText("No of req for child of age 1 to 5");

        jLabel11.setText("no of  request for new born babies");

        jLabel12.setText("no of req child of age 6 to 10");

        jLabel13.setText("no of req for child of age > 10");

        jButton1.setText("<< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtAdopted)
                                .addGap(3, 3, 3))
                            .addComponent(txtRange1)
                            .addComponent(txtRange2)
                            .addComponent(txtRange3)
                            .addComponent(txtRange4)
                            .addComponent(txtRange5)
                            .addComponent(txtRange6)
                            .addComponent(txtAwaiting)
                            .addComponent(txtAge0)
                            .addComponent(txtAge1to5)
                            .addComponent(txtAge6to10)
                            .addComponent(txtAge10))))
                .addContainerGap(348, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRange1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(txtRange2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(txtRange3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRange4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRange5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(txtRange6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAdopted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAwaiting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAge0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAge1to5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAge6to10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAge10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(16, 16, 16))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAdopted;
    private javax.swing.JTextField txtAge0;
    private javax.swing.JTextField txtAge10;
    private javax.swing.JTextField txtAge1to5;
    private javax.swing.JTextField txtAge6to10;
    private javax.swing.JTextField txtAwaiting;
    private javax.swing.JTextField txtRange1;
    private javax.swing.JTextField txtRange2;
    private javax.swing.JTextField txtRange3;
    private javax.swing.JTextField txtRange4;
    private javax.swing.JTextField txtRange5;
    private javax.swing.JTextField txtRange6;
    // End of variables declaration//GEN-END:variables
}
