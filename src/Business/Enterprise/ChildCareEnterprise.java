/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author CHITRA PARYANI
 */
public class ChildCareEnterprise extends Enterprise {

    public ChildCareEnterprise(String name) {
        super(name, EnterpriseType.ChildCare);
    }

    @Override
    public ArrayList<Type> getSupportedOrganizationType() {
        ArrayList<Type> types = new ArrayList<>();
        
        types.add(Type.Schooling);
        types.add(Type.Housing);
        types.add(Type.MedicalCheckUP);
        
        return types;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
