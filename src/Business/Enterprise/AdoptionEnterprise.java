/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Child.ChildDirectory;
import Business.Donation.SponsorDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sneha
 */
public class AdoptionEnterprise extends Enterprise{
    
    private SponsorDirectory sponsorDirectory;
    public AdoptionEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Adoption);
        sponsorDirectory = new SponsorDirectory();
    }

    public SponsorDirectory getSponsorDirectory() {
        return sponsorDirectory;
    }

    public void setSponsorDirectory(SponsorDirectory sponsorDirectory) {
        this.sponsorDirectory = sponsorDirectory;
    }
    
   
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
     @Override
    public ArrayList<Type> getSupportedOrganizationType() {
        
         ArrayList<Type>types = new ArrayList<>();
         types.add(Type.Adoption);
         types.add(Type.RegisterParent);
         types.add(Type.RegisterChild);
         types.add(Type.ManagementOffice);
         types.add(Type.ManageChildren);
         types.add(Type.FosterAdoption);
         types.add(Type.Parent);
         return types;
       }
    
}
