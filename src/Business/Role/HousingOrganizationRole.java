/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.ChildCareEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.FosterCareEnterprise;
import Business.Organization.HousingOrganization;
import Business.Organization.Organization;
import Business.Organization.SchoolOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.HosuingForChildren.HousingManagementWorkAreaJPanel;
import userInterface.SchoolForChildren.SchoolManagementWorkAreaJPanel;

/**
 *
 * @author CHITRA PARYANI
 */
public class HousingOrganizationRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
       return new HousingManagementWorkAreaJPanel(userProcessContainer, account, (HousingOrganization) organization, (FosterCareEnterprise) enterprise, business);
    }
    
    
}
