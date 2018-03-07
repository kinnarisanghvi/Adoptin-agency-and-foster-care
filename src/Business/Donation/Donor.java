/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Donation;

import java.util.Date;

/**
 *
 * @author kinnari
 */
public class Donor {
    
    private String organization;
    private Double amount;
    
   public Donor(){
        
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

   
     @Override
    public String toString() {
        return this.organization;
    }
    
    
}
