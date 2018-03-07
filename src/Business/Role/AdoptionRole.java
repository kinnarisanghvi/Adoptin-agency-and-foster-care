/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.AdoptionEnterprise;
import Business.Enterprise.Enterprise;
import Business.Organization.AdoptionOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.AdoptionRole.AdoptionWorkAreaJPanel;

/**
 *
 * @author sneha
 */
public class AdoptionRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new AdoptionWorkAreaJPanel(userProcessContainer, account, (AdoptionOrganization) organization, (AdoptionEnterprise) enterprise, business);
    }
    
}
