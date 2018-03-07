/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Child;

import Business.Government.GovernmentDirectory;
import Business.Hospital.HospitalDirectory;
import Business.SingleParent.SingleParentDirectory;
import java.util.ArrayList;

/**
 *
 * @author CHITRA PARYANI
 */
public class ChildDirectory {
    
    private ArrayList<Child> childList;
    private SingleParentDirectory singleParentDirectory;
    private GovernmentDirectory governmentDirectory;
    private HospitalDirectory hospitalDirectory;

public ChildDirectory()
{
    childList = new ArrayList<Child>();
//    this.singleParentDirectory =  singleParentDirectory;
//    governmentDirectory = new GovernmentDirectory();
//    hospitalDirectory = new HospitalDirectory();
}
    public ArrayList<Child> getChildList() {
        return childList;
    }

    public void setChildList(ArrayList<Child> childList) {
        this.childList = childList;
    }

    public SingleParentDirectory getSingleParentDirectory() {
        return singleParentDirectory;
    }

    public void setSingleParentDirectory(SingleParentDirectory singleParentDirectory) {
        this.singleParentDirectory = singleParentDirectory;
    }

    public GovernmentDirectory getGovernmentDirectory() {
        return governmentDirectory;
    }

    public void setGovernmentDirectory(GovernmentDirectory governmentDirectory) {
        this.governmentDirectory = governmentDirectory;
    }

    public HospitalDirectory getHospitalDirectory() {
        return hospitalDirectory;
    }

    public void setHospitalDirectory(HospitalDirectory hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }    
    
    //Add children
    public Child addChild(){
        Child child = new Child();
        childList.add(child);
        return child;        
    }
    
    public void removeChild(Child c){
        
        childList.remove(c);
    }
    
    public Child searchChild(String name){
    
       for(Child c: childList)
       {
       
           if(c.getChildName().equals(name)){
           return c;
           }
          
       } 
           
       return null;  
        
        
    }
}
