/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.FBIRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sneha
 */
public class FBIOrganization extends Organization {
    
    
    public FBIOrganization() {
        super(Type.FBIOffice.getValue());
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new FBIRole());
        return roles;
    }
    
}
