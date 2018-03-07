/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.CriminalRecord.CriminalRecordDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sneha
 */
public class FBIEnterprise extends Enterprise{
    
    private CriminalRecordDirectory crimeRecordDir;
     public FBIEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.FBI);
        crimeRecordDir = new CriminalRecordDirectory();
    }

    public CriminalRecordDirectory getCrimeRecordDir() {
        return crimeRecordDir;
    }

    public void setCrimeRecordDir(CriminalRecordDirectory crimeRecordDir) {
        this.crimeRecordDir = crimeRecordDir;
    }
    
    
    @Override
    public ArrayList<Type> getSupportedOrganizationType() {
        ArrayList<Type>types = new ArrayList<>();
         
         types.add(Type.FBIOffice);
         return types;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
