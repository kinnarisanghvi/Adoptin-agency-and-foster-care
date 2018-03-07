/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.FBIEnterprise;
import Business.Enterprise.HomeStudyEnterprise;
import Business.Organization.FBIOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.FBI.FBIOfficeWorkAreaJPanel;

/**
 *
 * @author sneha
 */
public class FBIRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new FBIOfficeWorkAreaJPanel(userProcessContainer, account, (FBIOrganization) organization, (FBIEnterprise) enterprise, business);
    }
    
}
