/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.AdoptionEnterprise;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.ParentOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.ParentRole.ParentWorkAreaJPanel;

/**
 *
 * @author sneha
 */
public class ParentRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new ParentWorkAreaJPanel(userProcessContainer, account, (ParentOrganization) organization, (AdoptionEnterprise) enterprise, business);
    }
    
}
