/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.ProspectiveParent.ProspectiveParentDirectory;
import Business.Child.ChildDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author sneha
 */
public abstract class Enterprise extends Organization{

    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
  
     private WorkQueue workQueue;
      private ProspectiveParentDirectory prospectiveParentDirectory;
     private ChildDirectory  childDirectory;
    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
        workQueue = new WorkQueue();
        prospectiveParentDirectory = new ProspectiveParentDirectory();
        childDirectory = new ChildDirectory();
       
    }
    
    public enum EnterpriseType{
       Adoption("Adoption"),HomeStudy("HomeStudy"),Training("Training"),ChildCare("ChildCare"),FBI("FBI"),FosterCare("FosterCare");
        
        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public ProspectiveParentDirectory getProspectiveParentDirectory() {
        return prospectiveParentDirectory;
    }

    public void setProspectiveParentDirectory(ProspectiveParentDirectory prospectiveParentDirectory) {
        this.prospectiveParentDirectory = prospectiveParentDirectory;
    }

    public ChildDirectory getChildDirectory() {
        return childDirectory;
    }

    public void setChildDirectory(ChildDirectory childDirectory) {
        this.childDirectory = childDirectory;
    }
    
    
 public abstract ArrayList<Type> getSupportedOrganizationType();
    
    

}
