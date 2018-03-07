/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ProspectiveParent;

import java.util.ArrayList;

/**
 *
 * @author sneha
 */
public class ProspectiveParentDirectory {
    
    private ArrayList<ProspectiveParent> parentList;

    public ProspectiveParentDirectory() {
        
        parentList = new ArrayList<ProspectiveParent>();
    }

    public ArrayList<ProspectiveParent> getParentList() {
        return parentList;
    }

    public void setParentList(ArrayList<ProspectiveParent> parentList) {
        this.parentList = parentList;
    }
    
    public ProspectiveParent addParent(){
        
        ProspectiveParent p = new ProspectiveParent();
        parentList.add(p);
        return p;
    }
    
    public void removeParent(ProspectiveParent p){
        
        parentList.remove(p);
    }
    
    public ProspectiveParent searchParent(String name){
    
       for(ProspectiveParent p: parentList)
       {
       
           if(p.getParent1().equals(name)){
           return p;
           }
          
       } 
           
       return null;  
        
        
    }
    
}
