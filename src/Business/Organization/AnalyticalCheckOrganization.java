/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import Business.Role.AnalyticalCheckRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author kinnari
 */
public class AnalyticalCheckOrganization extends Organization {
     
    public AnalyticalCheckOrganization() {
        super(Organization.Type.AnalyticalCheck.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AnalyticalCheckRole());
        return roles;
    }
}
